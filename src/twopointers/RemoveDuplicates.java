package twopointers;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        int k = removeDuplicates(nums);

        System.out.println("Unique Count : " + k);

        System.out.print("Unique Element : ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {

        int slow = 0;

        for (int fast = 1; fast < nums.length; fast++) {

            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }

        return slow + 1;
    }
}
