import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(rotateArray(arr, 3)));
    }

    static int[] rotateArray(int[] arr, int k){
        reverse(arr, 0, arr.length -1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        return arr;
    }

    public static void reverse(int[] arr,int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
