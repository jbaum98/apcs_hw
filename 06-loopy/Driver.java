public class Driver {
    public static void main(String[] args) {
        CodingBat c = new CodingBat();
        System.out.println(c.frontTimes("Chocolate", 2) );
        System.out.println(c.frontTimes("Chocolate", 3) );
        System.out.println(c.frontTimes("Abc", 2) );
        System.out.println(c.frontTimes("Ab", 2) );

        System.out.println( c.stringBits("Hello") );
        System.out.println( c.stringBits("Hi") );
        System.out.println( c.stringBits("Heeololeo") );

        System.out.println( c.stringYak("yakpak") );
        System.out.println( c.stringYak("pakyak") );
        System.out.println( c.stringYak("123ya") );

        System.out.println( c.stringMatch("xxcaazz", "xxbaaz") );
        System.out.println( c.stringMatch("abc", "abc") );
        System.out.println( c.stringMatch("abc", "axc") );
    }
}
