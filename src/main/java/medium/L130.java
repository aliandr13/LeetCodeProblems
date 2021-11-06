package medium;

/**
 * Given an m x n matrix board containing 'X' and 'O', capture all regions that are 4-directionally surrounded by 'X'.
 * <p>
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 */
public class L130 {
    public void solve(char[][] board) {
        for (int i = 1; i < board.length - 1; i++) {
            for (int j = 1; j < board[i].length - 1; j++) {
                boolean left = false;
                boolean right = false;
                boolean top = false;
                boolean bottom = false;


                int xIndex = i;
                if (board[0][j] == 'X') {
                    while (--xIndex >= 0) {
                        if (board[xIndex][j] == 'X') {
                            top = true;
                            break;
                        }
                    }
                }

                xIndex = i;
                if (board[board.length - 1][j] == 'X') {
                    while (++xIndex < board.length) {
                        if (board[xIndex][j] == 'X') {
                            bottom = true;
                            break;
                        }
                    }
                }

                int yIndex = j;
                if (board[i][0] == 'X') {
                    while (--yIndex >= 0) {
                        if (board[i][yIndex] == 'X') {
                            left = true;
                            break;
                        }
                    }
                }
                yIndex = j;
                if (board[i][board[i].length - 1] == 'X') {
                    while (++yIndex < board[i].length) {
                        if (board[i][yIndex] == 'X') {
                            right = true;
                            break;
                        }
                    }
                }

                if (top && bottom && left && right) board[i][j] = 'X';
            }
        }
    }

}
