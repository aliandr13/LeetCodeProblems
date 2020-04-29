package dynamic.connectivity;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickFindTest {

    @Test
    public void test_1() {
        QuickFind qf = new QuickFind(10);
        qf.union(4, 3);
        int[] expected = {0, 1, 2, 3, 3, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, qf.id);
    }
    @Test
    public void test_2() {
        QuickFind qf = new QuickFind(10);
        qf.union(4, 3);
        qf.union(3, 8);
        int[] expected = {0, 1, 2, 8, 8, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, qf.id);
    }

    @Test
    public void test_3() {
        QuickFind qf = new QuickFind(10);
        qf.union(4, 3);
        qf.union(3, 8);
        assertTrue(qf.connected(4,8));
        assertFalse(qf.connected(0,8));
    }

}