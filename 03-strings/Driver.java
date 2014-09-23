public class Driver {
    public static void main(String[] args){
        String s="jake waksbaum";
        int space = s.indexOf(' ');
        String first = s.substring(0,space);
        String last = s.substring(space+1);
        // System.out.printf("first is %s, last is %s\n", first, last);
    }
}
