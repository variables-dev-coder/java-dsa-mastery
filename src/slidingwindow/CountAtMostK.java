package slidingwindow;

import java.util.*;

class CountAtMostK {

    public int countAtMostK(int arr[], int k) {

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

        CountAtMostK count = new CountAtMostK();

        System.out.println(
                count.countAtMostK(
                        new int[]{1,2,2,3}, 2
                )
        ); // 9

        System.out.println(
                count.countAtMostK(
                        new int[]{1,1,1}, 1
                )
        ); // 6
    }
}
