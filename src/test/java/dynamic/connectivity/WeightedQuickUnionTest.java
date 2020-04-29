package dynamic.connectivity;

import org.junit.Test;

import static org.junit.Assert.*;

public class WeightedQuickUnionTest {

    @Test
    public void test_1() {
        WeightedQuickUnion wqu = new WeightedQuickUnion(10);
        wqu.union(4, 3);
        wqu.union(3, 8);
        wqu.union(6, 5);
        wqu.union(9, 4);
        wqu.union(2, 1);
        assertTrue(wqu.connected(4, 9));
    }

    @Test
    public void test_2() {
        WeightedQuickUnion wqu = new WeightedQuickUnion(10);
        wqu.union(4, 3);
        wqu.union(3, 8);
        wqu.union(6, 5);
        wqu.union(9, 4);
        wqu.union(2, 1);
        assertFalse(wqu.connected(0, 9));
    }

}