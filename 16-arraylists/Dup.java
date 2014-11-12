import java.util.*;

public class Dup {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Random r = new Random();
        while (a.size() < 20)
            a.add(r.nextInt(5));
        System.out.println(a);
        for (int i = 0; i + 1 < a.size(); i++) {
            if (a.get(i) == a.get(i+1))
                a.remove(i+1); // i + 1 because fewer shifts
        }
        System.out.println(a);
    }
}
