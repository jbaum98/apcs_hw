public class Driver {
    public static void main(String[] args) {
        System.out.println(mixStart("pis")); // should be false
        System.out.println(mixStart("pix")); // should be true
        System.out.println(makeOutWord("(())","funtimes")); // should be ((funtimes))
        System.out.println(firstHalf("WooHoo"));
    }
    public static boolean mixStart(String str) {
        return str.substring(1,3).equals("ix");
    }
    public static String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2);
    }
    public static String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }
}
