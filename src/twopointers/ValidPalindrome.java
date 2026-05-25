package twopointers;

public class ValidPalindrome {

    static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // skip special chars
            while (left < right &&
                    !Character.isLetterOrDigit(
                            s.charAt(left))) {

                left++;
            }

            while (left < right &&
                    !Character.isLetterOrDigit(
                            s.charAt(right))) {

                right--;
            }

            // compare lowercase chars
            char l =
                    Character.toLowerCase(
                            s.charAt(left));

            char r =
                    Character.toLowerCase(
                            s.charAt(right));

            if (l != r) {

                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 =
                "A man, a plan, a canal: Panama";

        String s2 =
                "race a car";

        System.out.println(isPalindrome(s1));

        System.out.println(isPalindrome(s2));
    }
}
