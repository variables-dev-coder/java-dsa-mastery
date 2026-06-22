package twopointers_theory;

import java.util.Arrays;

public class SortParityDemo {

    public static int[] sortParity(int[] nums) {
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] % 2 == 0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;

                slow++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4, 6};

        System.out.println(Arrays.toString(sortParity(nums))); // 2, 4, 6, 1, 3
    }
}

/*

 */