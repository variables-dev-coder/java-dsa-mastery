package revision2;

import java.util.HashMap;

public class ZeroSumSubmat {

    public int largestZeroSumSubmatrix(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int maxArea = 0;

        // left column
        for (int left = 0;
             left < cols;
             left++) {

            int[] temp = new int[rows];

            // right column
            for (int right = left;
                 right < cols;
                 right++) {

                // compress rows
                for (int i = 0;
                     i < rows;
                     i++) {

                    temp[i] += mat[i][right];
                }

                // largest zero sum subarray
                int len =
                        largestZeroSumSubarray(temp);

                int area =
                        len * (right - left + 1);

                maxArea =
                        Math.max(maxArea, area);
            }
        }

        return maxArea;
    }

    // helper function
    private int largestZeroSumSubarray(
            int[] arr) {

        HashMap<Integer, Integer> map =
                new HashMap<>();

        int prefixSum = 0;

        int maxLen = 0;

        map.put(0, -1);

        for (int i = 0;
             i < arr.length;
             i++) {

            prefixSum += arr[i];

            if (map.containsKey(prefixSum)) {

                maxLen = Math.max(
                        maxLen,
                        i - map.get(prefixSum)
                );

            } else {

                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        ZeroSumSubmat sol = new ZeroSumSubmat();

        int[][] mat = {
                {1, -1},
                {-1, 1}
        };

        System.out.println(
                sol.largestZeroSumSubmatrix(mat)
        );
    }
}
