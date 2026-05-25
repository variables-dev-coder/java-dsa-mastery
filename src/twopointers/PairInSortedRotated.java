package twopointers;

public class PairInSortedRotated {

    static boolean pairInSortedRotated(
            int arr[], int target) {

        int n = arr.length;

        int pivot = -1;

        // Step 1: find pivot
        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                pivot = i;
                break;
            }
        }

        // largest element index
        int right = pivot;

        // smallest element index
        int left = (pivot + 1) % n;

        // Step 2: two pointer
        while (left != right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {

                return true;
            }

            // need bigger sum
            if (sum < target) {

                left = (left + 1) % n;
            }

            // need smaller sum
            else {

                right = (right - 1 + n) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(
                pairInSortedRotated(
                        new int[]{7,9,1,3,5}, 6
                )
        ); // true

        System.out.println(
                pairInSortedRotated(
                        new int[]{2,3,4,1}, 3
                )
        ); // true

        System.out.println(
                pairInSortedRotated(
                        new int[]{10,7,4,1}, 9
                )
        ); // false
    }
}
