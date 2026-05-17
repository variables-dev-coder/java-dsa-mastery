package twopointers;

public class FindSumString {

    public static void main(String[] args) {

        String hayStack = "sadbutsad";
        String needle = "sad";

       int result = strStr(hayStack, needle);

        System.out.println("First Occurrence Index: " + result);
    }

    public static int strStr(String hayStack, String needle) {

        int n = hayStack.length();
        int m = needle.length();

        for (int i = 0; i <= n -m; i++) {

            int j = 0;

            while (j < m && hayStack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == m) {
                return i;
            }
        }

        return -1;
    }

}
