package twopointers_theory;

import java.util.*;

public class IntersectionDemo {

    public static int[] intersection(
            int[] nums1,
            int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        Set<Integer> set = new HashSet<>();

        while(i < nums1.length &&
                j < nums2.length) {

            if(nums1[i] < nums2[j]) {

                i++;
            }
            else if(nums1[i] > nums2[j]) {

                j++;
            }
            else {

                set.add(nums1[i]);

                i++;
                j++;
            }
        }

        int[] result =
                new int[set.size()];

        int index = 0;

        for(int num : set) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(
                Arrays.toString(
                        intersection(nums1, nums2)
                )
        );
    }
}
