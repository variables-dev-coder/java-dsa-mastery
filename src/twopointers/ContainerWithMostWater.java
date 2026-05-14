package twopointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxWater = 0;

        while (left < right) {

            int width = right - left;

            int h = Math.min(height[left], height[right]);

            int area = width * h;

            maxWater = Math.max(maxWater, area);

            // move smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {

        ContainerWithMostWater sol = new ContainerWithMostWater();

        int[] arr = {1,8,6,2,5,4,8,3,7};

        System.out.println(sol.maxArea(arr)); // 49
    }
}
