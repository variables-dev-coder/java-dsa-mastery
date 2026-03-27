package revision;

public class LinearSearch {

    public static int search(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 3};
        int target = 9;

        System.out.println(search(arr, target));
    }
}
