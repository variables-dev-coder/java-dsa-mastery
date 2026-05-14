package twopointers;

import java.util.*;

public class TwoPointerExample {

    public static int removeDuplicates(int[] arr) {

        // edge case
        if (arr.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[j] != arr[i]) {

                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,4,4};

        int len = removeDuplicates(arr);

        System.out.println("Unique Length: " + len);

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
