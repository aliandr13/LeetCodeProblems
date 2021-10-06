package dynamic.programming;

import java.util.HashMap;
import java.util.Map;

public class Fib {

    // time:  O(2^n)
    // space: O(n)
    public static long fib(int n) {
        if (n <= 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    // time:  O(n)
    // space: O(n)
    public static Long fibMemo(int n) {
        return fibMemo(n, new HashMap<>());
    }

    public static Long fibMemo(int n, Map<Integer, Long> memo) {
        if (n <= 2) return 1L;
        if (memo.containsKey(n)) return memo.get(n);
        Long result = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(6)); // 8
        System.out.println(fib(7)); // 13
        System.out.println(fib(8)); // 21
        System.out.println(fibMemo(50)); // 12586269025
    }

}
