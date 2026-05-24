package revision;

public class MinRemovals {

    public int minRemovals(int[] arr, int k) {

        int total = 0;

        for (int num : arr) {
            total += num;
        }

        int target = total - k;

        // impossible
        if (target < 0) {
            return -1;
        }

        // remove all elements
        if (target == 0) {
            return arr.length;
        }

        int left = 0;

        int sum = 0;

        int maxLen = -1;

        for (int right = 0;
             right < arr.length;
             right++) {

            sum += arr[right];

            // shrink window
            while (sum > target) {

                sum -= arr[left];
                left++;
            }

            // valid subarray
            if (sum == target) {

                maxLen = Math.max(
                        maxLen,
                        right - left + 1
                );
            }
        }

        // no valid subarray
        if (maxLen == -1) {
            return -1;
        }

        return arr.length - maxLen;
    }

    public static void main(String[] args) {

        MinRemovals min = new MinRemovals();

        System.out.println(
                min.minRemovals(
                        new int[]{3,4,1,3,2}, 5
                )
        ); // 2

        System.out.println(
                min.minRemovals(
                        new int[]{5,3,4,6,2}, 6
                )
        ); // -1

        System.out.println(
                min.minRemovals(
                        new int[]{1,1,3,1,2}, 4
                )
        ); // 3
    }
}
