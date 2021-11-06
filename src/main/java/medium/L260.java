package medium;

import java.util.Arrays;

public class L260 {

    public static int[] singleNumber(int[] nums) {
        int r = 0;
        for (int num : nums) {
            r = r ^ num;
            System.out.println(r);
        }

        int rightSetBit = r & -r;
        System.out.println(rightSetBit);
        int a = 0;
        for (int n : nums) {
            if ((n & rightSetBit) != 0) {
                a ^= n;
            }
            System.out.println(r);
        }
        return new int[]{a, r ^ a};
    }

    public int maxArea(int[] nums) {
        int area = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int current = Math.min(nums[i], nums[j]) * (j - i);
                area = Math.max(current, area);
            }
        }
        return area;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleNumber(new int[]{1, 2, 3, 1, 3, 4})));
    }
}
