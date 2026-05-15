package twopointers;

public class LongestConsecutiveNumber {

    // Sliding Window

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};

        int k = 3;

        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int max = windowSum;

        for (int end = k; end < arr.length; end++) {

            windowSum += arr[end];
            windowSum -= arr[end - k];

            max = Math.max(max, windowSum);
        }

        System.out.println(max);
    }
}
