package medium;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class L130Test {

    @Test
    void test() {
        L130 l = new L130();
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        l.solve(board);

        Assertions.assertThat(board).isDeepEqualTo(new char[][]{{'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'O', 'X', 'X'}});
    }

    public int[] twosum(int[] nums, int target) {
        if (nums == null || nums.length < 2) return null;
        for (int i = 0; i < nums.length - 1; i++) {
            int remains = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (remains == nums[j]) return new int[]{i, j};
            }
        }
        return null;
    }




    /*

    [["O","X","X","O","X"],
     ["X","O","O","X","O"],
     ["X","O","X","O","X"],
     ["O","X","O","O","O"],
     ["X","X","O","X","O"]]
*/

    /*
    [["O","X","X","O","X"],
     ["X","X","X","X","O"],
     ["X","X","X","O","X"],
     ["O","X","O","O","O"],
     ["X","X","O","X","O"]]
     */
}