package twopointers;

public class TwoSum2 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 13, 14};
        int target = 12;

       // int target = 50;  // Suppose no pair

        int left = 0;
        int right = arr.length - 1;

        boolean found = false;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {

                System.out.println(arr[left] + " " + arr[right]);
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // if no pair found
        if(!found) {
            System.out.println("No Pair Found");
        }
    }
}
