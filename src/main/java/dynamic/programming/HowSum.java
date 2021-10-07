package dynamic.programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The function should return an array containing any combination of
 * elements that add up to exactly the targetSum. If there is no combination that adds up
 * to the targetSum, then return null.
 * <p>
 * If there are multiple combinations possible, return any single one.
 */
public class HowSum {

    // m - targetSum; n = numbers.length
    // time: O(n^m); space: O(m*n*n)
    public static List<Integer> howSum(Integer targetSum, int[] numbers) {
        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) return null;

        for (Integer num : numbers) {
            Integer reminder = targetSum - num;
            List<Integer> result = howSum(reminder, numbers);
            if (result != null) {
                result.add(num);
                return result;
            }
        }
        return null;
    }

    // m - targetSum; n = numbers.length
    // time: O(n*m); space: O(m*n*n)
    public static List<Integer> howSumMemo(Integer targetSum, int[] numbers) {
        return howSumMemo(targetSum, numbers, new HashMap<>());
    }

    public static List<Integer> howSumMemo(Integer targetSum, int[] numbers, Map<Integer, List<Integer>> memo) {
        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) return null;
        if (memo.containsKey(targetSum)) return memo.get(targetSum);


        for (Integer num : numbers) {
            Integer reminder = targetSum - num;
            List<Integer> result = howSumMemo(reminder, numbers, memo);
            if (result != null) {
                result.add(num);
                memo.put(targetSum, result);
                return result;
            }
        }
        memo.put(targetSum, null);
        return null;
    }

    public static void main(String[] args) {
        System.out.println(howSumMemo(7, new int[]{2, 3}));  // [3, 2, 2]
        System.out.println(howSumMemo(7, new int[]{5, 3, 4, 7})); // [4, 3]
        System.out.println(howSumMemo(7, new int[]{2, 4})); // null
        System.out.println(howSumMemo(8, new int[]{2, 3, 5})); // [2, 2, 2, 2]
        System.out.println(howSumMemo(400, new int[]{7, 14})); // null
    }
}
