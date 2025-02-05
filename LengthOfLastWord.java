public class Main {
    public static void main(String[] args) {
        String str = " Hello java I am adesh ";
        System.out.println("The length of the last word is " + lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String s){
        int i = s.length() - 1;
        int j = 0;

        while(s.charAt(i) == ' ') i--;
        while(i > 0 && s.charAt(i) != ' '){
            j++;
            i--;
        }
        return j;
    }
}
