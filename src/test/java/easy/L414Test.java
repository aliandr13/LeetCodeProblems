package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class L414Test {

    @Test
    void test() {
        L414 l414 = new L414();
        Assertions.assertThat(l414.thirdMax(new int[]{2, 2, 3, 1})).isEqualTo(1);
        Assertions.assertThat(l414.thirdMax(new int[]{3,2,1,-4,5})).isEqualTo(2);
        Assertions.assertThat(l414.thirdMax(new int[]{2,2,3,3,1,1,4,4,4,5,5,5,5})).isEqualTo(3);
        Assertions.assertThat(l414.thirdMax(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0})).isEqualTo(0);
    }
}