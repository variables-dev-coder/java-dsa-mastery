package slidingwindow;



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
