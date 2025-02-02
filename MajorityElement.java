import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }

    static int majorityElement(int[] arr){
        int count = 0;
        int count1 = 0;
        int e = 0;

        for(int i = 0; i < arr.length; i++){
            if(count == 0) {
                count = 1;
                e = arr[i];
            }else if(e == arr[i]){
                count++;
            } else{
                count--;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(e == arr[i]){
                count1++;
            }
            if(count1 > arr.length/2){
                return e;
            }
        }
        return -1;
    }
}
