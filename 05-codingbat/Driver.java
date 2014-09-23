public class Driver {
    public static void main(String[] args) {
        StringStuff s = new StringStuff();
        System.out.println( s.nonStart("Hello", "There") ); // =>  "ellohere"
        System.out.println( s.nonStart("java", "code") );   // =>  "avaode"
        System.out.println( s.nonStart("shotl", "java") );  // =>  "hotlava"
        System.out.println ( s.makeAbba("Hi", "Bye") ); // =>  "HiByeByeHi"
        System.out.println ( s.makeAbba("Yo", "Alice") ); // =>  "YoAliceAliceYo"
        System.out.println ( s.makeAbba("What", "Up") ); // =>  "WhatUpUpWhat"
        System.out.println ( s.diff21(19) ); // => 2
        System.out.println ( s.diff21(10) ); // => 11
        System.out.println ( s.diff21(21) ); // => 0
    }
}
