package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class L1971Test {


    @Test
    void validPath() {
        L1971 l = new L1971();
        assertTrue(l.validPath(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2));
        assertFalse(l.validPath(6, new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}}, 0, 5));
    }
}