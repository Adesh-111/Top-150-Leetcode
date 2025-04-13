class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length -1; i >= 0 ; i--){
            if(digits[i] + 1 < 10) {
              digits[i]++; 
              return digits; 
            }  else{
                digits[i] = 0;
            }
        }
        digits = new int[digits.length +1];
        digits[0] = 1;
        return digits; 
    }
}


//For vector

class Solution {
    Vector<Integer> addOne(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return toVector(arr);
            } else {
                arr[i] = 0;
            }
        }
        Vector<Integer> result = new Vector<>();
        result.add(1);
        for (int i = 1; i <= arr.length; i++) {
            result.add(0);
        }
        return result;
    }
    
    private Vector<Integer> toVector(int[] arr) {
        Vector<Integer> vector = new Vector<>();
        for (int num : arr) {
            vector.add(num);
        }
        return vector;
    }
}
