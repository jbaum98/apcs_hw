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
        return null;
    }

    public Comparable rbSearch(Comparable item) {
        return null;
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
