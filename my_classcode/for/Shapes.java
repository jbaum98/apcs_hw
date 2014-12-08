public class Shapes {
    public String box(int r, int c) {
        // 3 minutes
        String s = "";

        while (r>0){
            int cc = 0;
            while (cc < c){
                s += "*";
                cc += 1;
            }
            s = s + "\n"; r--;
        }

        return s;
    }

    public String tri1(int h) {
        // 1 minute
        String out = new String();
        int row, i;
        for (row = 1; row <= h; row++) {
            for (i = 0; i < row; i++)
                out += "*";
            out += "\n";
        }
        return out;
    }

    public String tri2(int h) {
        // 5 minutes
        String out = new String();
        int row, i;
        String c;
        for (row = 1; row <= h; row++) {
            int spaces = h - row;
            for (i = 0; i <= h; i++) {
                c = i <= spaces ? " " : "*";
                out += c;
            }
            out += "\n";
        }
        return out;
    }
}
