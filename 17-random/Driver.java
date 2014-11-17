import java.util.*;

public class Driver {
    public static void main(String[] args) {
        int n;
            if (args.length > 0)
                n = Integer.parseInt(args[0]);
            else
                n = 20;
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++)
            a.add(i);
        System.out.println(a);
        System.out.println(randomize(a));
    }

    public static ArrayList<Integer> randomize(ArrayList<Integer> a) {
        Random r = new Random();
        ArrayList<Integer> out = new ArrayList<Integer>();
        while (a.size() > 0)
            out.add(a.remove( r.nextInt(a.size()) ));
        return out;
    }
}
