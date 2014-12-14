import java.util.*;
import java.io.*;

public class Searching {
    private Comparable[] a;

    public Searching(int n) {
        a = new Comparable[n];
    }

    public String toString() {
        return Arrays.toString(a);
    }

    public void additem(Comparable c, int index) {
        a[index] = c;
    }

    // public additem(Comparable c) {
    // }

    public void sort() {
        Arrays.sort(a);
    }

    private boolean equal(Comparable a, Comparable b) {
        return a.compareTo(b) == 0;
    }

    public Comparable iSearch(Comparable item) {
        for (int i = 0; i < a.length; i++) {
            if (equal(item, a[i])) {
                return i;
            }
        }
        return null;
    }
    
    public Comparable bSearch(Comparable item) {
      int first = 0;
      int last = a.length;
      while (first != last) {
        int mid = (first + last) / 2;
        if (a[mid].compareTo(item) > 0) {
          first = mid;
        } else {
          last = mid;
        }
      }
      if (equal(a[first], item)) {
        return null;
      } else {
        return first;
      }
    }

    public Comparable rbSearch(Comparable item) {
      return rbSearch(item, 0, a.length);
    }
    
    private Comparable rbSearch (item, first, last) {
      if (first == last) { // base case: 1 element list
        if (equal(a[first], item)) {
          return null;
        } else {
          return first;
        }
      } else { // recursive call depending on greater or less
        int mid = (first + last) / 2;
        if (a[mid].compareTo(item) > 0) {
          return rbSearch(item, mid, last);
        } else {
          return rbSearch(item, first, mid);
        }
      }
    }

    public static void main(String[] args) {
        int length = 100;
        Searching s = new Searching(length);
        for (int i = 0; i < length; i++) {
             s.additem((int)(Math.random() * length), i);
        }
        System.out.println(s);
    }
}
