package twopointers;

import java.util.HashMap;

public class SubarraySumEqualsK {

    static int subarraySum(int[] arr, int k) {

        HashMap<Integer, Integer> map =
                new HashMap<>();

        // important
        map.put(0, 1);

        int prefixSum = 0;

        int count = 0;

        for (int num : arr) {

            prefixSum += num;

            // need previous sum
            int needed = prefixSum - k;

            count += map.getOrDefault(
                    needed,
                    0
            );

            // store current prefix
            map.put(
                    prefixSum,
                    map.getOrDefault(prefixSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,1,1};

        int[] arr2 = {1,2,3};

        System.out.println(
                subarraySum(arr1, 2)
        );

        System.out.println(
                subarraySum(arr2, 3)
        );
    }
}
