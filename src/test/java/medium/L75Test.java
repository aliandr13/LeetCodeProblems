package medium;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class L75Test {

    @Test
    void test() {
        L75 l = new L75();
        int[] nums = {2, 0, 2, 1, 1, 0};
        l.sortColors(nums);
        Assertions.assertThat(nums).containsExactly(0, 0, 1, 1, 2, 2);
    }

    @Test
    void test1() {
        L75 l = new L75();
        int[] nums = {0};
        l.sortColors(nums);
        Assertions.assertThat(nums).containsExactly(0);
    }
    @Test
    void test2() {
        L75 l = new L75();
        int[] nums = {2};
        l.sortColors(nums);
        Assertions.assertThat(nums).containsExactly(2);
    }

}