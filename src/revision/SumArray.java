package revision;

public class SumArray {
    public static int findSum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {4, 7, 1, 9, 3};
        System.out.println(findSum(arr));
    }
}
