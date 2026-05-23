package twopointers;

public class RemoveDuplicatesLC26 {

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4,4, 5, 5, 6};

        int k = removeDuplicates(nums);

        System.out.println("Unique Count: " + k);

        System.out.print("Modified Array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {

        // edge case
        if (nums.length == 0) {
            return 0;
        }

        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {

            // Found unique element
            if (nums[slow] != nums[fast]) {

                slow++;
                nums[slow] = nums[fast];
            }
        }

        return slow + 1;
    }
}
