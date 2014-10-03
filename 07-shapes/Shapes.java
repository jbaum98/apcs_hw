public class Shapes {
    public String line(String chr, int n) {
        String out = new String();
        for (int i=0; i<n;i++) {
            out += chr;
        }
        return out;
    }
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

    public String tri3(int h) {
        //6 minutes
        String out = new String();
        int row, cursor; 
        for (row = 0; row < h; row++) {
            int length = h + row;
            int first_star = h - row;
            for (cursor = 1; cursor <= length; cursor++) {
                String chr = cursor < first_star ? " " : "*";
                out += chr;
            }
            out += "\n";
        }
        return out;
    }

    public String diamond(int h) {
        //15 minutes
        String out = new String();
        int y, cursor;
        int middle = h % 2 == 0 ? h - 1 : h;
        int max = h % 2 == 0 ? h/2-1 : (h-1)/2;
        for (y = max; y >= -1*max; y--) {
            String line = new String();
            // first_star = |y|
            int length = (middle+1)/2+max-Math.abs(y);
            for (cursor = 0; cursor < length; cursor++) {
                String chr = cursor < Math.abs(y) ? " " : "*";
                line += chr;
            }
            if (y == 0 && h % 2 == 0)
                out+= line + "\n";
            out += line + "\n";
        }
        return out;
    }

    public String tri4(int h) {
        //10 minutes
        String out = new String();
        int row, cursor;
        for (row = 0; row < h; row++) {
            // first_star = row;
            for (cursor = 0; cursor < h; cursor++) {
                String chr = cursor < row ? " " : "*";
                out += chr;
            }
            out += "\n";
        }
        return out;
    }
}
