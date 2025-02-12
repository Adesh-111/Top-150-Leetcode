import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String str = "LVIII";
        System.out.println(RomanToInteger(str));
    }

    public static int RomanToInteger(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(i + 1 < str.length()  && map.get(str.charAt(i)) < map.get(str.charAt(i+1))){
                sum -= map.get(str.charAt(i));
            }
            sum += map.get(str.charAt(i));
        }
        return sum;
    }
}
