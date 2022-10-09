package questions;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = {1, 1};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int res = 0;

        while (left != right) {
            int actual = (right - left) * Math.min(height[right], height[left]);
            if (actual > res) {
                res = actual;
            }
            if (height[right] > height[left]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}
