package twopointers;

import java.util.Arrays;

public class Closest3Sum {

    static int closest3Sum (int[] arr, int target) {
        int n = arr.length;

        // step1 : Sort Array
        Arrays.sort(arr);

        // Initial Answer
        int res = arr[0] + arr[1] + arr[2];

        int minDiff = Math.abs(res - target);

        // step2 : fix one element

        for (int i = 0; i < n -2; i++) {
            int left = i + 1;
            int right = n - 1;

            // step3 : two pointer

            while (left < right) {

                int currSum = arr[i] + arr[left] + arr[right];
                int diff = Math.abs(currSum - target);

                if (diff < minDiff) {

                    minDiff = diff;
                    res = currSum;

                } else if (diff == minDiff) {

                    res = Math.max(res, currSum);
                }

                // pointer movement
                if (currSum < target) {
                    left++;
                } else if (currSum > target) {
                    right--;
                } else {
                    return currSum;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr1 = {-1, 2, 2, 4};
        int target1 = 4;

        int[] arr2 = {1, 10, 4, 5};
        int target2 = 10;

        System.out.println(closest3Sum(arr1, target1));

        System.out.println(closest3Sum(arr2, target2));
    }
}
