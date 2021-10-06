package dynamic.programming;

import java.util.HashMap;
import java.util.Map;

// How man ways you can travel to the goal on grid with dimension m * n
// start at top left corner
// target bottom right corner
// only down or right moves
public class GridTraveler {

    // time: O(2^(m+n))
    // space: O(m+n)
    public static long gridTraveler(int m, int n) {
        if (m == 1 && n == 1) return 1;
        if (m < 1 || n < 1) return 0;
        return gridTraveler(m - 1, n) + gridTraveler(m, n - 1);
    }

    // time: O(m+n)
    // space: O(m+n)
    public static Long gridTravelerMemo(int m, int n) {
        return gridTraveler(m, n, new HashMap<>());
    }

    public static Long gridTraveler(int m, int n, Map<String, Long> memo) {
        if (m == 1 && n == 1) return 1L;
        if (m < 1 || n < 1) return 0L;
        String key = m + "," + n;
        if (memo.containsKey(key)) return memo.get(key);
        Long result = gridTraveler(m - 1, n, memo) + gridTraveler(m, n - 1, memo);
        memo.put(key, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(gridTraveler(1, 1)); // 1
        System.out.println(gridTraveler(2, 3)); // 3
        System.out.println(gridTraveler(3, 2)); // 3
        System.out.println(gridTraveler(3, 3)); // 6
        System.out.println(gridTravelerMemo(18, 18)); // 2333606220
    }
}
