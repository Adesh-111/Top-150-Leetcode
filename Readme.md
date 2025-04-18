## Merge Sorted Arrays

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {1,5,6};
        int m = 3;
        int n = nums2.length;
        merge(nums1, m , nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;

        while (m > 0 && n > 0) {
            if (nums1[m - 1] < nums2[n - 1]) {
                nums1[last] = nums2[n - 1];
                n--;
            } else {
                nums1[last] = nums1[m - 1];
                m--;
            }
            last--;
        }
        while (n > 0) {
            nums1[last] = nums2[n - 1];
            n--;
            last--;
        }
    }
}
```

## Remove Element

```java
public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = removeElement(nums, val);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
            int j = 0;
            for (int i = 0; i < nums.length; i++){
                if (nums[i] != val){
                    nums[j] = nums[i];
                    j++;
                }
            }
            return j;
    }
}
```

## Majority Element

```java
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
```

## Remove Duplicates from Array

```java
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
```

## Index Of First Occurance of SubString

```java
public class Main {
    public static void main(String[] args) {
        String str = "sadandsad";
        String subStr = "and";
        System.out.println(indexOfFirstOccurance(str,subStr));
    }

    public static int indexOfFirstOccurance(String str, String subStr){
        int strlen = str.length();
        int subStrLen = subStr.length();
        if (subStrLen == 0) return 0;
        if (subStrLen > strlen) return -1;

        for(int i = 0; i< strlen - subStrLen; i++) {
            if (str.charAt(i) == subStr.charAt(0)) {
                int j = 1;
                while (j < subStrLen && str.charAt(i + j) == subStr.charAt(j)){
                    j++;
                    if(j == subStrLen){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
```

## Length of the last word

```java
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
```

## Best Time to Buy and Sell Stock

```java
\public class Main {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] arr){
        int cost =0;
        int max = 0;
        int min = arr[0];
        int profit = 0;
        for(int i =1; i< arr.length; i++){
            cost = arr[i] - min;
            profit = Math.max(cost, profit);
            min = Math.min(arr[i], min);
        }
        return profit;
    }
}
```

## Roman To Integer

```java
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
```
## Rotate Array

```java
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
```
