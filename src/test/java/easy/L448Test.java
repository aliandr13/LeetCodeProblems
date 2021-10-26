package easy;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class L448Test {

    @ParameterizedTest
    @MethodSource("argumentProvider")
    void test(int[] nums, List<Integer> expected) {
        List<Integer> disappearedNumbers = L448.findDisappearedNumbersArrays(nums);
        Assertions.assertThat(disappearedNumbers).isEqualTo(expected);
    }

    private static Stream<Arguments> argumentProvider() {
        return Stream.of(
                Arguments.of(new int[]{4, 3, 2, 7, 8, 2, 3, 1}, List.of(5, 6)),
                Arguments.of(new int[]{1, 1}, List.of(2)),
                Arguments.of(new int[]{1, 2, 3}, List.of()),
                Arguments.of(randomArray(200000), List.of())
        );
    }



    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(size);
        }
        return a;
    }
}