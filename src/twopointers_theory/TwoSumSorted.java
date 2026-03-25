package twopointers_theory;

/*
✅ Problem: Two Sum (Sorted Array)
🧩 Logic
Start:
    left = 0
    right = n-1
If sum < target → move left
If sum > target → move right
If equal → answer found

 */

public class TwoSumSorted {

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);

        System.out.println(result[0]+ " " + result[1]);
    }
}
