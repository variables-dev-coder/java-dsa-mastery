package twopointers_theory;

public class ReverseOnlyLettersDemo {

    public static String reverseOnlyLetters(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            while(left < right &&
                    !Character.isLetter(arr[left])) {
                left++;
            }

            while(left < right &&
                    !Character.isLetter(arr[right])) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String s = "ab-cd";

        System.out.println(
                reverseOnlyLetters(s)
        );
    }
}
