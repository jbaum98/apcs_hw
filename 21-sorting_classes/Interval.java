import java.util.Random;
import java.util.Arrays;
import java.io.BufferedReader;

class Interval {

    private int lo,hi;
    private static Random r = new Random();

    private void setup(int lo, int hi){
        this.lo = lo;
        this.hi = hi;
    }

    public Interval(int lo, int hi) {
        setup(lo, hi);
    }

    public Interval(int max) {
        int hi = r.nextInt(max);
        int lo = r.nextInt(hi) - 1;
        setup(lo, hi);
    }

    public Interval() {
        this(100);
    }

    public String toString() {
        return "["+lo+","+hi+"]";
    }

    public int compareTo(Interval other) {
        int diff = this.lo - other.lo;
        if (diff == 0) {
            return this.hi - other.hi;
        } else {
            return diff;
        }
    }

    public static void main(String[] args) {

        Interval[] a = new Interval[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Interval();
        }
        System.out.println(Arrays.toString(a));
        System.out.println(
                a[0] + " is " +
                (a[0].compareTo(a[1]) > 0 ? "greater" : "less") +
                " than " + a[1]
                );
    }
}
