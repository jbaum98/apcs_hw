import java.util.*; 

public class AS {
  private int[] a; 
  private Random r;

  public AS() {
    r = new Random();
    a = new int[100];

    for (int i = 0; i < a.length; i++) {
      a[i] = 75 + r.nextInt(76);
    }

  }

  public String toString() {
    String out = new String();
    for (int i = 0; i < a.length; i++) {
      out += a[i];
      out += "\n";
    }
    return out;
  }

  public static void main(String[] args) {
    AS as = new AS();
    System.out.println(as);
  }

}
