public class Shapes {
    public String frame(int r, int c) {
        String out = new String();
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                String chr = row == 0 || row == r-1 || col == 0 || col == c-1 ? "*" : " ";
                out += chr;
            }
            out += "\n";
        }
        return out;
    }
    public String stringSplosion(String str) {
        String out = new String();
        for (int i=0; i < str.length();i++) {
            out += str.substring(0,i+1);
        }
        return out;
    }
    public String stringX(String str) {
        String out = new String();
        for (int i=0; i < str.length();i++) {
           if (i==0 || i==str.length()-1 || str.charAt(i)!='x') 
               out += str.charAt(i);
        }
        return out;
    }
}
