package dynamic.connectivity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuickUnionTest {

    @Test
    public void test_1() {
        QuickUnion qu = new QuickUnion(10);
        qu.union(4, 3);
        int[] expected = {0, 1, 2, 3, 3, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, qu.id);
    }

    @Test
    public void test_2() {
        QuickUnion qu = new QuickUnion(10);
        qu.union(4, 3);
        qu.union(3, 8);
        int[] expected = {0, 1, 2, 8, 3, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, qu.id);
    }

    @Test
    public void test_3() {
        QuickUnion qu = new QuickUnion(10);
        qu.union(4, 3);
        qu.union(3, 8);
        qu.union(6, 5);
        qu.union(9, 4);
        qu.union(2, 1);
        int[] expected = {0, 1, 1, 8, 3, 5, 5, 7, 8, 8};
        assertArrayEquals(expected, qu.id);
    }

    @Test
    public void test_4() {
        QuickUnion qu = new QuickUnion(10);
        qu.union(4, 3);
        qu.union(3, 8);
        qu.union(6, 5);
        qu.union(9, 4);
        qu.union(2, 1);
        assertTrue(qu.connected(4, 9));
    }

    @Test
    public void test_5() {
        QuickUnion qu = new QuickUnion(10);
        qu.union(4, 3);
        qu.union(3, 8);
        qu.union(6, 5);
        qu.union(9, 4);
        qu.union(2, 1);
        assertFalse(qu.connected(0, 9));
    }
}