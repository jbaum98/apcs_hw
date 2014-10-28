import java.util.*;

public class  Arraystuff {

  /*--------------------- Instance Variables --------------------*/ 

  private int[] a;
  Random rnd;
  // By making x final, we can set it once but then never change it
  // private final int x = 123;

  /*--------------------- Constructors --------------------*/ 

  public Arraystuff(int n){
    rnd = new Random();
    a = new int[n];
    for (int i=0; i<a.length;i++){
      a[i] = 75+rnd.nextInt(76);
    }
  }

  public Arraystuff(){
    this(100);
  }


  /*--------------------- Methods --------------------*/ 

  public String toString(){
    String s = "";
    for (int i = 0; i < a.length; i++) {
      s = s + a[i]+", ";
    }
    return s;
  }

  public int find(int n) {
    for (int i = 0; i < a.length; i ++) {
      if (a[i] == n) 
        return i;
    }
    return -1;
  }

  public int maxVal() {
    int king = a[0];
    for (int i = 0; i < a.length; i++) {
      if (a[i] > king) 
        king = a[i];
    }
    return king;
  }

  public int freq(int i) {
    int total = 0;
    int target = a[i];
    for (int j=0; j < a.length; j++) {
      if (a[j] == target)
        total++;
    }
    return total;
  }

  /*--------------------- Main --------------------*/ 

  public static void main(String[] args) {
    Arraystuff as = new Arraystuff();
    System.out.println(as);
    System.out.println(as.find(4));
    System.out.println(as.maxVal());
    System.out.println(as.freq(0));
  }

}
