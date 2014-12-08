public class BoxMake {
    public String box(int r, int c) {
        String out = new String();
        int store = c;
        while (r > 0) {
            while (c > 0) {
                out += "*";
                c--;
            }
            out += "\n";
            c = store;
            r--;
        }
        return out;
    }
}
