package easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class L414 {

/*    public int thirdMax(int[] nums) {

        Set<Integer> max = new HashSet<>();
        for (int num : nums) {
            max.add(num);
            while (max.size() > 3) max.remove(Collections.min(max));
        }

        return max.size() < 3 ? Collections.max(max) : Collections.min(max);
    }*/

    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for (int n : nums) {
            if (set.contains(n)) continue;
            if (n > max) {
                max3 = max2;
                max2 = max;
                max = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }
            set.add(n);
        }

        if (set.size() >= 3) return max3;
        else return max;
    }

}
