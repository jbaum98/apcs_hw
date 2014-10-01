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
            s = s + "\n";
            r--;
        }

        return s;
    }

    public String tri1(int h) {
        // 1 minute
        String out = new String();
        int row = 1;
        while (row <= h) {
            int i = 0;
            while (i < row)  {
                out += "*";
                i++;
            }
            out += "\n";
            row++;
        }
        return out;
    }

    public String tri2(int h) {
        // 5 minutes
        String out = new String();
        int row = 1;
        while (row <= h) {
            int i = 0;
            int spaces = h - row;
            while (i < spaces) {
                out += " ";
                i++;
            }
            while (i < h)  {
                out += "*";
                i++;
            }
            out += "\n";
            row++;
        }
        return out;
    }
}
