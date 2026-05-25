package twopointers;

public class MinimumSizeSubarray {

    static int minSubArrayLen(
            int target,
            int[] arr) {

        int left = 0;

        int sum = 0;

        int minLen = Integer.MAX_VALUE;

        for (int right = 0;
             right < arr.length;
             right++) {

            sum += arr[right];

            // shrink window
            while (sum >= target) {

                minLen = Math.min(
                        minLen,
                        right - left + 1
                );

                sum -= arr[left];

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? 0
                : minLen;
    }

    public static void main(String[] args) {

        int[] arr = {2,3,1,2,4,3};

        int target = 7;

        System.out.println(
                minSubArrayLen(target, arr)
        );
    }
}
