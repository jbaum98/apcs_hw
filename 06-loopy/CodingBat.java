public class CodingBat {
    public String frontTimes(String str, int n) {
        String front;
        if (str.length() >= 3) 
            front = str.substring(0,3);
        else 
            front = str;
        String out = new String();
        while (n > 0) {
            out += front;
            n--;
        }
        return out;
    }

    public String stringBits(String str) {
        int i = 0;
        String out = new String();
        while ( i < str.length() ) {
           if ( i % 2 == 0 )
               out += str.charAt(i);
           i++;
        }
        return out;
    }
    
    public String stringYak(String str) {
        String out = new String(); 
        int i = 0;
        while ( i < str.length() ) {
            if ( str.charAt(i) == 'y' && i + 3 <= str.length() && str.charAt(i+2) == 'k' )
                i += 3; 
            else {
                out += str.charAt(i);
                i++;
            }
        }
        return out;
    }

    public int stringMatch(String a, String b) {
        int length = a.length() <= b.length() ? a.length() : b.length() ;
        int i = 0;
        int count = 0;
        while ( i + 1 < length ) {
            if ( a.substring(i, i+2).equals( b.substring(i, i+2) ) )
                count++;
            i++;
        }
        return count;
    }
}
