# Increasing Triplet Subsequence

Problem no: 53

## Problem Statement

Given an integer array `nums`, find the subarray with the largest sum, and return *its sum*.

## Examples

### Example 1:

```java
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
```

### Example 2:

```java
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
```

### Example 3:

```java
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
```

## Constraints

- `1 <= nums.length <= 105`
- `-104 <= nums[i] <= 104`

## Problem Link:

[Maximum Subarray - LeetCode](https://leetcode.com/problems/maximum-subarray)

## Code:

```java
class Solution {
    int maxSubarraySum(int[] nums) {
        int max = nums[0], curr_max = nums[0];
        for(int i = 1; i < nums.length; i++){
            cur_max = Math.max(cur_max + nums[i], nums[i]);
            max = Math.max(curr_max, max);
        }
        return max;
    }
}
```

## **Algorithm (Kadane's Algorithm)**

1. **Initialize** two variables:
    ◦ `max = nums[0]`: to store the overall maximum sum.
    ◦ `curr_max = nums[0]`: to store the current subarray sum.
2. **Iterate** through the array:
    ◦ At each element, choose between:
        ▪ Starting a new subarray at current element.
        ▪ Continuing the previous subarray.
    ◦ `curr_max = max(nums[i], curr_max + nums[i])`
3. **Update** `max` with the larger of itself or `curr_max`.
4. **Return** `max` after the loop ends.

## **Step-by-Step Walkthrough**

**(Example: [-2,1,-3,4,-1,2,1,-5,4])**

Initial:

- `max = -2`, `curr_max = -2`

Loop from index 1:

- `1`: `curr_max = max(1, -2+1) = 1`, `max = max(-2, 1) = 1`
- `3`: `curr_max = max(-3, 1+(-3)) = -2`, `max = max(1, -2) = 1`
- `4`: `curr_max = max(4, -2+4) = 4`, `max = max(1, 4) = 4`
- `1`: `curr_max = max(-1, 4+(-1)) = 3`, `max = max(4, 3) = 4`
- `2`: `curr_max = max(2, 3+2) = 5`, `max = max(4, 5) = 5`
- `1`: `curr_max = max(1, 5+1) = 6`, `max = max(5, 6) = 6`
- `5`: `curr_max = max(-5, 6+(-5)) = 1`, `max = max(6, 1) = 6`
- `4`: `curr_max = max(4, 1+4) = 5`, `max = max(6, 5) = 6`

Final `max = 6`

## Complexity Analysis:

- **Time Complexity: O(n)**
- Space Complexity: O(1)

## Reference:

[Maximum Sub-Array Sum (LeetCode 53) | Kadane's Algorithm | Study Algorithms](https://www.youtube.com/watch?v=GrNSGC8Z2T0)

[Kadane's Algorithm | Maximum Subarray Sum | Finding and Printing](https://youtu.be/AHZpyENo7k4?si=25BbsTuMDYXKe1Ja)

### Python reference:

[Maximum Subarray - Amazon Coding Interview Question - Leetcode 53 - Python](https://youtu.be/5WZl3MMT0Eg?si=kTiEHXB9rZE2Vo8j)

### Tamil:

[53. Maximum Subarray | Java | MANG Question | Leetcode | Tamil | code io](https://youtu.be/DilfDyCueAY?si=LokxtoZw0RjP_NXV)

## Visualization:

[](https://pythontutor.com/render.html#code=public%20class%20Main%20%7B%0A%20%20%20%20int%20maxSubarraySum%28int%5B%5D%20nums%29%20%7B%0A%20%20%20%20%20%20%20%20int%20max%20%3D%20nums%5B0%5D,%20curr_max%20%3D%20nums%5B0%5D%3B%0A%20%20%20%20%20%20%20%20for%20%28int%20i%20%3D%201%3B%20i%20%3C%20nums.length%3B%20i%2B%2B%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20curr_max%20%3D%20Math.max%28curr_max%20%2B%20nums%5Bi%5D,%20nums%5Bi%5D%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20max%20%3D%20Math.max%28curr_max,%20max%29%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20return%20max%3B%0A%20%20%20%20%7D%0A%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%20%20Main%20sol%20%3D%20new%20Main%28%29%3B%0A%20%20%20%20%20%20%20%20int%5B%5D%20nums%20%3D%20%7B-2,%201,%20-3,%204,%20-1,%202,%201,%20-5,%204%7D%3B%20%20%0A%20%20%20%20%20%20%20%20int%20result%20%3D%20sol.maxSubarraySum%28nums%29%3B%0A%20%20%20%20%20%20%20%20System.out.println%28%22Maximum%20subarray%20sum%20is%3A%20%22%20%2B%20result%29%3B%0A%20%20%20%20%7D%0A%7D%0A&cumulative=false&curInstr=0&heapPrimitives=nevernest&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false)

https://pythontutor.com/render.html#code=public%20class%20Main%20%7B%0A%20%20%20%20int%20maxSubarraySum%28int%5B%5D%20nums%29%20%7B%0A%20%20%20%20%20%20%20%20int%20max%20%3D%20nums%5B0%5D,%20curr_max%20%3D%20nums%5B0%5D%3B%0A%20%20%20%20%20%20%20%20for%20%28int%20i%20%3D%201%3B%20i%20%3C%20nums.length%3B%20i%2B%2B%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20curr_max%20%3D%20Math.max%28curr_max%20%2B%20nums%5Bi%5D,%20nums%5Bi%5D%29%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20max%20%3D%20Math.max%28curr_max,%20max%29%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20return%20max%3B%0A%20%20%20%20%7D%0A%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%20%20Main%20sol%20%3D%20new%20Main%28%29%3B%0A%20%20%20%20%20%20%20%20int%5B%5D%20nums%20%3D%20%7B-2,%201,%20-3,%204,%20-1,%202,%201,%20-5,%204%7D%3B%20%20%0A%20%20%20%20%20%20%20%20int%20result%20%3D%20sol.maxSubarraySum%28nums%29%3B%0A%20%20%20%20%20%20%20%20System.out.println%28%22Maximum%20subarray%20sum%20is%3A%20%22%20%2B%20result%29%3B%0A%20%20%20%20%7D%0A%7D%0A&cumulative=false&curInstr=0&heapPrimitives=nevernest&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false

## Leetcode Excuetion:
![Screenshot 2025-05-09 204702](https://github.com/user-attachments/assets/95f35620-e46e-474f-8b26-cab1c6b80ae2)

