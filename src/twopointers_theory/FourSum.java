package twopointers_theory;

/*
🚀 DAY 4 — Two Pointer (Final + Advanced Thinking)

Today is about:

👉 Pattern Mastery + Variations + Interview Confidence

🧠 What You’ll Learn Today
Generalize Two Pointer
Solve variation problem (4Sum concept)
Think like interviewer
🔥 Problem: 4Sum (Concept Level)

👉 Don’t panic
👉 This is just 3Sum extended

💡 Idea

Instead of:

1 fixed + 2 pointer

Now:

2 fixed + 2 pointer
🧠 Pattern Thinking
Fix i
  Fix j
    Two pointer (left, right)

👉 Time = O(n³)
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {

                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = fourSum(nums, target);

        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }
}

/*
🧠 KEY LEARNING (MOST IMPORTANT)

Munna, THIS is the real lesson:

👉 Two Pointer is NOT a problem
👉 It is a tool

🔥 Pattern Evolution
2Sum → Basic
3Sum → 1 loop + 2 pointer
4Sum → 2 loop + 2 pointer

👉 Same thinking, different layer
 */