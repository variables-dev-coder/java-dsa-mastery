package twopointers;

import java.util.HashSet;

public class LongestSubstring {

    static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set =
                new HashSet<>();

        int left = 0;

        int maxLen = 0;

        for (int right = 0;
             right < s.length();
             right++) {

            char ch = s.charAt(right);

            // remove duplicates
            while (set.contains(ch)) {

                set.remove(s.charAt(left));

                left++;
            }

            set.add(ch);

            maxLen = Math.max(
                    maxLen,
                    right - left + 1
            );
        }

        return maxLen;
    }

    public static void main(String[] args) {

        String s1 = "abcabcbb";

        String s2 = "bbbbb";

        String s3 = "pwwkew";

        System.out.println(
                lengthOfLongestSubstring(s1));

        System.out.println(
                lengthOfLongestSubstring(s2));

        System.out.println(
                lengthOfLongestSubstring(s3));
    }
}
