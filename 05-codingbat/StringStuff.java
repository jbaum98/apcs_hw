public class StringStuff {
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
    public static boolean nearHundred(int n){
        return Math.abs(n-100)<=10 || Math.abs(n-200)<=10;
    }
    public static boolean mixStart(String str) {
        return str.substring(1,3).equals("ix");
    }
    public static int teaParty(int tea, int candy) {
        if (tea >= 5 && candy >= 5) {
            if (tea >= 2 * candy || candy >= 2 * tea)
                return 2;
            else
                return 1;
        } else
            return 0;
    }
    public boolean lastDigit(int a, int b, int c) {
        return (a%10==b%10)||(a%10==c%10)||(b%10==c%10);
    }
}
