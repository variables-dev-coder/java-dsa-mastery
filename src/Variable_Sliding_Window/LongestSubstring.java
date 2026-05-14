package Variable_Sliding_Window;

/*
Variable Sliding Window
-----------------------

Core Idea

Window size is NOT fixed

It expands and shrinks based on condition

  [ i .......... j ]

Expand → j++

Shrink → i++

Golden Rule

Expand until condition breaks

Then shrink until valid again

Problem: Longest Substring Without Repeating Characters
-------------------------------------------------------

Longest Substring Without Repeating Characters

Problem Understanding

Given string

Find longest substring with all unique characters

Approach

Use:

HashSet (or Map)

Two pointers (i, j)

Flow
1. Add char → expand (j++)
2. If duplicate:
      remove from left (i++)
3. Track max length


 */


import java.util.HashSet;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s)); // Output: 3
    }
}

/*
Dry Run

Input:

abcabcbb

Window growth:

abc → length 3
repeat → shrink
bca → length 3


Key Learning
 Use set/map to track condition
 Control window using left and right

 */