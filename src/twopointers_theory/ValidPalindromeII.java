package twopointers_theory;



public class ValidPalindromeII {

    public static boolean validPalindrome(String s) {
        return check(s, 0, s.length() - 1, false);
    }

    private static boolean check(String s, int left, int right, boolean deleted) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {

                if (deleted) return false;

                return check(s, left + 1, right, true) ||
                        check(s, left, right - 1, true);
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "abca";

        System.out.println(validPalindrome(s)); // true
    }
}
