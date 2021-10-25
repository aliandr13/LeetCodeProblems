package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 */
public class L349 {

    // Time: O(n+m)
    // Space: O(n+m)
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i1 : nums1) {
            set.add(i1);
        }
        int[] r = new int[Math.min(nums1.length, nums2.length)];
        int i = 0;
        for (int j : nums2)
            if (set.contains(j)) {
                r[i++] = j;
                set.remove(j);
            }
        return Arrays.copyOf(r, i);
    }

/*    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i1 : nums1) {
            set.add(i1);
        }
        Set<Integer> rs = new HashSet<>();
        for (int n2 : nums2) {
            if (set.contains(n2)) rs.add(n2);
        }
        int[] r = new int[rs.size()];
        int i =0;
        for (Integer j : rs){
            r[i++] = j;
        }
        return r;
    }*/

}
