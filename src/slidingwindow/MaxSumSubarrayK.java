package slidingwindow;

/*
Problem: Maximum Sum Subarray of Size K
---------------------------------------

Maximum Average Subarray
 -----------------------I

Why This Problem?
----------------

This is the foundation of sliding window
If you understand this → whole pattern becomes easy

Problem Understanding

Given:

Array

Window size k

Find maximum sum (or average) of subarray of size k

Brute Force

Check all subarrays

Time = O(n²)

Sliding Window Idea

Instead of recalculating:

Window 1 → sum

Window 2 → reuse previous sum

 */


public class MaxSumSubarrayK {

    public static int maxSum(int[] nums, int k) {

        int n = nums.length;

        // Step 1: first window
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Step 2: slide window
        for (int i = k; i < n; i++) {

            windowSum += nums[i];       // add next element
            windowSum -= nums[i - k];   // remove previous element

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println("Max Sum: " + maxSum(nums, k)); // Output: 9
    }
}

/*
Dry Run

Input:

[2, 1, 5, 1, 3, 2], k = 3

Windows:

[2,1,5] = 8
[1,5,1] = 7
[5,1,3] = 9  ← max
[1,3,2] = 6


 */