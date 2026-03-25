package twopointers_theory;

/*
Remove Duplicates from Sorted Array
🧩 Logic (Very Important)

👉 Slow pointer = unique index
👉 Fast pointer = scan array

 */

// Problem: Remove Duplicates from Sorted Array
// Approach: Two Pointer (Slow & Fast)
// Time: O(n), Space: O(1)

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {
            slow++;
            nums[slow] = nums[fast];
        }

        return slow + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};

        int length = removeDuplicates(nums);

        System.out.println("Length: " + length);
    }
}
