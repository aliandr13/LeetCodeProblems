package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */
public class L1 {

    public int[] twoSumHashMap(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> mapValueIndex = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            mapValueIndex.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            Integer second = target - nums[i];
            Integer secondIndex = mapValueIndex.get(second);
            if (secondIndex != null && secondIndex.intValue() != i) {
                result[0] = i;
                result[1] = secondIndex;
                break;
            }
        }

        return result;
    }

    // [2,7,11,15], target = 9
    public static int[] twoSumHashOneLoop(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            if (map.containsKey(currentNum)) return new int[]{map.get(currentNum), i};
            int remains = target - currentNum;
            map.put(remains, i);
        }
        return new int[0];
    }

    public int[] twoSumBruteForce(int[] nums, int target) {

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if ((nums[i] + nums[j] - target) == 0) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }


}
