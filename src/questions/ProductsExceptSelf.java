package questions;

import java.util.Arrays;

public class ProductsExceptSelf {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = nums[0];
        right[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i] * left[i - 1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = nums[i] * right[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            int leftPro = i > 0 ? left[i - 1] : 1;
            int rightPro = i < nums.length - 1 ? right[i + 1] : 1;
            nums[i] = leftPro * rightPro;
        }

        return nums;
    }
}
