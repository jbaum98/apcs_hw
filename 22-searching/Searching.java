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
        while (last - first > 1) {
            System.out.println("first is " + first);
            System.out.println("last is " + last);
            int mid = (first + last) / 2;
            if (equal(a[mid], item)) {
                return mid;
            } if (a[mid].compareTo(item) > 0) {
                last = mid; // go to the smaller half
            } else {
                first = mid; // go to the bigger half
            }
        }
        if (equal(a[first], item)) {
            return first;
        } else {
            return null;
        }
    }

    public Comparable rbSearch(Comparable item) {
        return rbSearch(item, 0, a.length);
    }

    private Comparable rbSearch (Comparable item, int first, int last) {
        System.out.println("first is " + first);
        System.out.println("last is " + last);
        if (last-first <= 1) { // base case: 1 element list
            if (equal(a[first], item)) {
                return first;
            } else {
                return null;
            }
        } else { // recursive call depending on greater or less
            int mid = (first + last) / 2;
            if (equal(a[mid], item)) {
                return mid;
            } if (a[mid].compareTo(item) > 0) {
                return rbSearch(item, first, mid);
            } else {
                return rbSearch(item, mid, last);
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
        System.out.println(s.iSearch(1));
        s.sort();
        System.out.println(s);
        System.out.println("sorted");
        System.out.println(s.bSearch(1));
        System.out.println(s.rbSearch(1));
    }
}
