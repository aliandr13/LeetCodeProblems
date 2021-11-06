package medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class L15Test {

    @Test
    void test() {
        L15 l = new L15();
        List<List<Integer>> lists = l.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        Assertions.assertThat(lists).containsExactlyInAnyOrder(List.of(-1, -1, 2), List.of(-1, 0, 1));
    }

    @Test
    void testEmptyList() {
        L15 l = new L15();
        List<List<Integer>> lists = l.threeSum(new int[]{});
        Assertions.assertThat(lists).isEmpty();
    }

    @Test
    void testNoResult() {
        L15 l = new L15();
        List<List<Integer>> lists = l.threeSum(new int[]{0});
        Assertions.assertThat(lists).isEmpty();
    }

    @Test
    void test3ZeroResult() {
        L15 l = new L15();
        List<List<Integer>> lists = l.threeSum(new int[]{0, 0, 0});
        Assertions.assertThat(lists).containsExactlyInAnyOrder(List.of(0, 0, 0));
    }

    @Test
    void copy() {
        L15 l = new L15();
        int[] ints = l.removeElement(new int[]{1, 2, 3, 4}, 3);
        System.out.println(Arrays.toString(ints));
    }

}