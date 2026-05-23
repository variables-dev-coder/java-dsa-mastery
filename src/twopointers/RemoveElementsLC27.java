package twopointers;

public class RemoveElementsLC27 {

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3, 3, 1};

        int val = 3;

        int k = removeElement(nums, val);

        System.out.println("Remaining Count: " + k);

        System.out.print("Modified Array: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {

            // keep only non-val elements
            if (nums[fast] != val) {

                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }
}
