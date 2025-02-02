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
