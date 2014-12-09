import java.io.*;
import java.util.*;

class Sorts {
    int[] data;
    int[] copy;
    Random r;

    public Sorts(int[] init){
        data = init;
        copy = init;
    }

    public Sorts(int n){
        r = new Random();
        data = new int[n];
        copy = new int[n];
        fill();
    }

    public Sorts() {
        this(20);
    }

    public void fill(){
        for (int i = 0; i < data.length; i++) {
            data[i]=r.nextInt(100);
        }
    }

    public void backup() {
        for (int i = 0; i < data.length; i++) {
            copy[i] = data[i];
        }
    }
    public void restore() {
        for (int i = 0; i < data.length; i++) {
            data[i] = copy[i];
        }
    }


    public void isort() {
        int i,j;
        for (i = 1; i < data.length; i++) {
            int tmp=data[i];
            for (j=i-1 ; j >= 0 && tmp < data[j];j--) {
                data[j+1]=data[j];
            }
            data[j+1]=tmp;
        }
    }


    public void ssort() {
        int i,j;
        int mi;
        for ( i = 0; i < data.length-1; i++) {
            mi = i;
            for (j=i+1;j<data.length;j++) {
                if (data[j]<data[mi]){
                    mi=j;
                }
            }
            int tmp=data[mi];
            data[mi]=data[i];
            data[i]=tmp;

        }

    }

    public void builtin() {
        /* This assumes the array is full (no null elements) If you
           want to sort only part of the array use:
           Arrays.sort(data,start,stop) which will sort from start
           (inclusive) to stop (exclusive).

           Also, ArrayLists have Collections.sort(list)

*/
        Arrays.sort(data);
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < data.length; i++) {
            s = s+data[i]+" ";
        }
        return s;
    }
    public static void main(String[] args) {
        int[] foo;

        Sorts s = new Sorts(foo);
        System.out.println(s);
        s.isort();
        System.out.println(s);
    }
}
