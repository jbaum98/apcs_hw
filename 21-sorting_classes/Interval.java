import java.io.*;
import java.util.*;

class Interval {

		private int low,high;
		private Random r = new Random();				
		private static int numIntervals = 0;
		
		public Interval(int l, int h){
				low = l;
				high = h;
				numIntervals = numIntervals + 1;
		}
		
		public Interval() {
				int l = r.nextInt(100);
				int h = l + 1 + r.nextInt(100);
				low = l;
				high = h;
				numIntervals = numIntervals + 1;
		}

		public String toString() {
				//String s = "Inteval: "+numIntervals+": "+ "["+low+","+high+"]";
				String s = "["+low+","+high+"]";

				return s;
		}

		public static void printstuff() {
				System.out.println("Stuff");
		}
		public static void main(String[] args) {

				Interval ival = new Interval();
				ival.printstuff(); // normal calling off of an instance
				printstuff(); // since printStuff is static we can call it without an instance
				Interval.printstuff(); // we can also call it right off a class

				Interval[] a = new Interval[10];
				for (int i = 0; i < a.length; i++) {
						a[i] = new Interval();
				}
				System.out.println(Arrays.toString(a));
		}
}
