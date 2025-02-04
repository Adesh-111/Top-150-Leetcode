import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5,5,5,5,5,5,5,5,5,5,5,5,5,};
        System.out.println("Original Array: " + Arrays.toString(arr));
        int newLength = removeDuplicates(arr);
        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNew Length: " + newLength);
    }


    public static int removeDuplicates(int[] arr){
        int j =1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[j++] =arr[i];
            }
        }
        return j;
    }
}
