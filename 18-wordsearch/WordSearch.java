import java.util.*;

public class WordSearch {

    private char[][] board; //check it out 2D array boom, but only half of it

    public WordSearch(int r, int c){
        board = new char[r][c]; // other half OVER HERE, making a rxc array, or r arrays of length c each
        for (int i = 0; i < board.length; i++) { // lets fill em
            for (int j = 0; j < board[i].length; j++) { // 2 for loops <=> 2D
                board[i][j]='.'; //with good old dots
            }
        }
    }

    public WordSearch() {
        this(20,40); // if no param specified, go default 20x40
    }

    public String toString(){
        String s = ""; // out string
        for (int i = 0; i < board.length; i++) { // that 2 for loop thang again
            for (int j = 0; j < board[i].length; j++) {
                s = s + board[i][j]; // stick on each character
            }
            s = s + "\n"; //and at the end of each nested array, a newline
        }
        return s;
    }

    private boolean check(int length, int row, int col, int d_y, int d_x) { // check if a word with this length and this config fits
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
        } // else nothing base case we done
    }

    public boolean addWord(String word) {
        ArrayList<int[]> valids= new ArrayList<int[]>(); // we're gonna store all valid configurations in here

        for (int row = 0; row < board.length; row++) {          // for all the starting rows
            for (int col = 0; col < board[0].length; col++) {   // and starting columns
                for (int d_y = -1; d_y <= 1; d_y++) {           // and d_x's
                    for (int d_x = -1; d_x <= 1; d_x++) {       // and d_y's
                        if (check(word.length(), row, col, d_y, d_x)) { // check yoself
                            valids.add(new int[] {row, col, d_y, d_x}); // if good add it to the list of goodies
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
            return false; // impossible to ad
        } else {
            Random r = new Random();
            int[] choice = valids.get(        // take an element from
                    r.nextInt(valids.size())  // random index
                    );
            /* //debug
            for (int j = 0; j < 4; j++) {
                System.out.print(choice[j]);
            }
            System.out.print("\n");
            */
            addWord(word, choice[0], choice[1], choice[2], choice[3]); // add using that random config we chose
            return true; // we good
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
