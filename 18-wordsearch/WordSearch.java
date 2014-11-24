import java.util.*;

public class WordSearch {

    private char[][] board;

    public WordSearch(int r, int c){ board = new char[r][c];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j]='.';
            }
        }
    }

    public WordSearch() {
        this(20,40);
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                s = s + board[i][j];
            }
            s = s + "\n";
        }
        return s;
    }

    private boolean check(int length, int row, int col, int d_y, int d_x) {
        int max_row = board.length - 1;
        int max_col = board[0].length - 1;
        int final_row = row + d_y*(length-1);
        int final_col = col + d_x*(length-1);
        return
            !(d_x == 0 && d_y == 0) // wouldn't make sense
            &&
            final_row <= max_row && final_row >= 0 // final row is good
            &&
            final_col <= max_col && final_col >= 0 // final row is good
            &&
            row <= max_row && row >= 0 // initial row is good
            &&
            col <= max_col && col >= 0 // initial col is good
            ;
    }

    public void addWord(String word, int row, int col, int d_y, int d_x) {
        /*
            d_y and d_x are the "slope" of the word
            for example:
                horizontal:0, 1
                vertical: 1, 0
                horizontal backwards: 0, -1
                diagonal to the bottom right: 1,  1
            credit to Max Fishelson for suggestiong d_x d_y instead of seperate functions
            but recursion was my idea :)
        */
        if (word.length() != 0) {
            board[row][col] = word.charAt(0);
            addWord(word.substring(1), row+d_y, col+d_x, d_y, d_x);
        }
    }

    public boolean addWord(String word) {
        ArrayList<int[]> valids= new ArrayList<int[]>();

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                for (int d_y = -1; d_y <= 1; d_y++) {
                    for (int d_x = -1; d_x <= 1; d_x++) {
                        if (check(word.length(), row, col, d_y, d_x)) {
                            valids.add(new int[] {row, col, d_y, d_x});
                        }
                    }
                }
            }
        }
        /* // debug
        for (int i = 0; i < valids.size(); i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(valids.get(i)[j]);
            }
            System.out.print("\n");
        }
        System.out.println(valids.size());
        */
        if (valids.size() == 0) {
            return false;
        } else {
            Random r = new Random();
            int[] choice = valids.get(
                    r.nextInt(valids.size()) // random index
                    );
            /* //debug
            for (int j = 0; j < 4; j++) {
                System.out.print(choice[j]);
            }
            System.out.print("\n");
            */
            addWord(word, choice[0], choice[1], choice[2], choice[3]);
            return true;
        }
    }

    /* //debug
    public static void main(String[] args) {
        WordSearch w= new WordSearch(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        w.addWord(args[2]);
        System.out.println(w);
    }
    */
}
