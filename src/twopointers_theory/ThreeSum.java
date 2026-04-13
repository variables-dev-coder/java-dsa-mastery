package twopointers_theory;

/*
🧠 STEP 1: Core Idea (VERY IMPORTANT)

👉 3Sum is NOT new
👉 It’s a combination of:

Sorting
Two Pointer
💡 Thought Process

Instead of 3 loops (O(n³)) ❌

We do:

Fix 1 element
Use Two Pointer for remaining

👉 Time becomes O(n²) ✅

🔥 STEP 2: Algorithm (Think Like Interviewer)
Sort array
Loop i from 0 to n-1
Fix nums[i]
Use:
left = i + 1
right = n - 1
Find pairs such that:
nums[i] + nums[left] + nums[right] == 0

 */


import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums); // Step 1

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSum(nums);

        System.out.println(result);
    }
}

/*
DRY RUN (MUST UNDERSTAND)

Input:

[-1, 0, 1, 2, -1, -4]

After sort:

[-4, -1, -1, 0, 1, 2]

Output:

[-1, -1, 2]
[-1, 0, 1]

KEY LEARNINGS (Interview Gold)

remember this:

👉 Sorting is often first step
👉 Reduce problem dimension
👉 Combine patterns

 */