public class WordSearch {

    private char[][] board;

    public WordSearch(int r, int c){
        board = new char[r][c];
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

    private void error(String err) {
        System.out.println("Error: " + err);
    }

    private void checkStart(int row, int col) {
        if ( !(row >= 0 && row < board.length) ) {
            error("row doesn't exist");
        } else if ( !(col >= 0 && col < board[0].length) ) {
            error("column doesn't exist");
        }
    }

    private String reverse(String s) {
        String rev = "";
        for (int i = s.length() ; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    public void addWordH(String word, int row, int col) {
        // check it fits
        checkStart(row, col);
        if (col + word.length() >= board[0].length) {
            error("word is too long");
        }

        int c = col;
        for (int i = 0; i < word.length(); i++) {
            if (! (board[row][c] == '.' || board[row][c] == word.charAt(i)) ) {
                error("Illegal overlap");
            }
            c++;
        }
        for (int i = 0; i < word.length(); i++) {
            board[row][c] = word.charAt(i);
            c++;
        }
    }

    public void addWordHR(String word, int row, int col) {
        addWordH(reverse(word), row, col-word.length());
    };

    public void addWordV(String word, int row, int col) {
        // check it fits
        checkStart(row, col);
        if (row + word.length() >= board.length) {
            error("word is too long");
        }

        int r = row;
        for (int i = 0; i < word.length(); i++) {
            if (! (board[r][col] == '.' || board[r][col] == word.charAt(i)) ) {
                error("Illegal overlap");
            }
            r++;
        }
        for (int i = 0; i < word.length(); i++) {
            board[r][col] = word.charAt(i);
            r++;
        }
    }

    public void addWordVR(String word, int row, int col) {
        addWordV(reverse(word), row-word.length(), col);
    };


    public static void main(String[] args) {
        WordSearch w= new WordSearch();
        System.out.println(w);

        // check it fits on board
        w.addWordH("hello", 3, 15); //this should work
        w.addWordH("hello", 56, 7); //this row doesn't exist
        w.addWordH("hello", 7, 56); //this column doesn't exist
        w.addWordH("hello", 7, 39); //doesn't fit
        w.addWordV("hello", 3, 15); //this should work
        w.addWordV("hello", 56, 7); //this row doesn't exist
        w.addWordV("hello", 7, 56); //this column doesn't exist
        w.addWordV("hello", 19, 9); //doesn't fit

        // check overlapping
        w.addWordH("hello", 3, 15); //this should work
        w.addWordH("hello", 3, 16); //this overlaps wrong
        w.addWordV("hello", 3, 15); //this works, using v
        w.addWordH("hello", 4, 15); //this overlaps wrong

        System.out.println(w);
    }
}

