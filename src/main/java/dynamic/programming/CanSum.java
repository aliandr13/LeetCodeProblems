package dynamic.programming;

import java.util.HashMap;
import java.util.Map;

/*
 * Write a function that return boolean indicating whether it is possible
 * to generate the targetSum using numbers from the array.
 *
 * Element of the array may be used as many times as needed.
 * All input numbers are non-negative.
 */
public class CanSum {

    // m = targetSum; n=numbers.length
    // time: O(n^m)
    // space: O(m)
    public static boolean canSum(Integer targetSum, int[] numbers) {
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;

        for (Integer number : numbers) {
            Integer newTargetSum = targetSum - number;
            if (canSum(newTargetSum, numbers)) return true;
        }
        return false;
    }

    // m = targetSum; n=numbers.length
    // time: O(n*m)
    // space: O(m)
    public static boolean canSumMemo(Integer targetSum, int[] numbers) {
        return canSumMemo(targetSum, numbers, new HashMap<>());
    }

    public static boolean canSumMemo(Integer targetSum, int[] numbers, Map<Integer, Boolean> memo) {
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;
        if (memo.containsKey(targetSum)) return memo.get(targetSum);

        for (Integer number : numbers) {
            Integer newTargetSum = targetSum - number;
            if (canSumMemo(newTargetSum, numbers, memo)) {
                memo.put(targetSum, true);
                return true;
            }
        }
        memo.put(targetSum, false);
        return false;
    }


    public static void main(String[] args) {
        System.out.println(canSum(7, new int[]{2, 3}));  // true
        System.out.println(canSum(7, new int[]{5, 3, 4, 7})); // true
        System.out.println(canSum(7, new int[]{2, 4})); // false
        System.out.println(canSum(8, new int[]{2, 3, 5})); // true
        System.out.println(canSumMemo(300, new int[]{7, 14})); // false
    }
}
