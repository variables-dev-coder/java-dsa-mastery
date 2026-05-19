package twopointers;

import java.util.Arrays;

public class TripLetSum {

    static boolean hasTripletSum(int[] arr, int target) {

        Arrays.sort(arr);

        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        TripLetSum sm = new TripLetSum();

        System.out.println(sm.hasTripletSum(new int[]{1, 4, 45, 6, 10, 8,}, 13));  // true

        System.out.println(sm.hasTripletSum(new int[]{40, 20, 10, 3, 6, 7,}, 24));  // false
    }
}
