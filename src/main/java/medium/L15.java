package medium;

import java.util.*;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 */
public class L15 {

    // Input: nums = [-1,0,1,2,-1,-4]
    // Output: [[-1,-1,2],[-1,0,1]]

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int N = nums.length;
        Arrays.sort(nums);

        // If we have less than 3 element there is no valid subset
        // If we have min value greater than 0, it's not possible to produce subset where count is zero
        // If we have max value less than 0, it's not possible to produce subset where count is zero
        if(N < 3 || nums[0] > 0 || nums[N-1] < 0)
            return result;

        for(int i = 0; i < N - 2; i++) {
            // current i is same as previous, it will create duplicate result
            if(i > 0 && nums[i] == nums[i-1])
                continue;

            int left = i + 1, right = N - 1;
            while(left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // if we have duplicate elements, we need get rid of it so we are moving left and right pointer to a position
                    // where there's no duplicate elements.
                    while(left < right && nums[left] == nums[left + 1])
                        left++;
                    while(left < right && nums[right] == nums[right - 1])
                        right--;
                    left++;
                    right--;
                }
                else if(sum > 0)
                    right--;
                else
                    left++;
            }
        }

        return result;
    }

    private List<Integer> sum(int[] nums, int currentSum, int n) {
        if (n > 3) return null;
        if (currentSum == 0 && n == 3) return new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int newSum = currentSum + nums[i];
            List<Integer> sum = sum(removeElement(nums, i), newSum, n + 1);
            if (sum != null) {
                sum.add(nums[i]);
                return sum;
            }
        }
        return null;
    }

    int[] removeElement(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(arr, index + 1, newArr, index, arr.length - index - 1);
        return newArr;
    }
}
