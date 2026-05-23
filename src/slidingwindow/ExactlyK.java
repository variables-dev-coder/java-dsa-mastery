package slidingwindow;

import java.util.HashMap;

public class ExactlyK {

    static int exactlyK(int arr[], int k) {

        return countAtMostK(arr, k)
                - countAtMostK(arr, k - 1);
    }

    // helper function
    static int countAtMostK(int[] arr, int k) {

        HashMap<Integer, Integer> map =
                new HashMap<>();

        int left = 0;

        int count = 0;

        for (int right = 0;
             right < arr.length;
             right++) {

            // add current element
            map.put(arr[right],
                    map.getOrDefault(arr[right], 0) + 1);

            // shrink window
            while (map.size() > k) {

                map.put(arr[left],
                        map.get(arr[left]) - 1);

                if (map.get(arr[left]) == 0) {

                    map.remove(arr[left]);
                }

                left++;
            }

            // count valid subarrays
            count += (right - left + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(exactlyK(new int[]{1,2,2,3}, 2)); // 4

        System.out.println(exactlyK(new int[]{3,1,2,2,3}, 3)); // 4
    }
}
