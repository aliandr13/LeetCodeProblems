package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in nums.
 */
public class L448 {

    // [1,2,3,4,1] -> [0,0,0,0,0]
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length + 1);
        for (int i = 1; i <= nums.length; i++)
            set.add(i);

        for (Integer i : nums)
            set.remove(i);

        List<Integer> result = new ArrayList<>(set.size());
        result.addAll(set);
        return result;
    }

    // [1,2,3,4,1] -> [0,0,0,0,0]
    public static List<Integer> findDisappearedNumbersArrays(int[] nums) {
        boolean[] arr = new boolean[nums.length];

        for (int k : nums) arr[k - 1] = true;

        List<Integer> result = new ArrayList<>(nums.length);
        for (int i = 0; i < arr.length; i++)
            if (!arr[i]) result.add(i + 1);

        return result;
    }

}
