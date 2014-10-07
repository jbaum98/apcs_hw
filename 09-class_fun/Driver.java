public class Driver {
    public static void main(String[] args){
        Basechar b1,b2;
        Warrior w1,w2;
        Mage m1,m2;

        b1 = new Basechar();
        w1 = new Warrior();
        m1 = new Mage();

        m2 = m1; // Mage can hold Mage (duh)
        // m2 = b1; // incompatible types Mage can't hold Basechar
        // m2 = w1; // incompatible types Mage can't hold Warrior

        b2 = m1; // Basechar can hold Mage, because it is superclass 
        b2 = m2; // ditto
        // System.out.println(b1.getManna()); // no good because getManna isn't in BaseChar
        b2 = new Warrior(); // ditto for Warriors
        System.out.println(b2.getHealth()); // calls Warrior's method
        /*
         * Conclusions
         * ============
         * - variables of type Base Class can reference 
         *   instances of both its own class, and any subclasses
         *
         * - variables of type Sub Classes cannot reference
         *   instances of sibling classes or super classes, only itself
         *   (or its own sub classes I if there were 2 layers I imagine)
         *
         * - if the sub class has a method that the super class doesn't
         *   it can't be called from a super class variable holding a sub class
         *   instance, I guess because there isn't space in the memory to store it
         *
         * - if the sub class overrides the super class's method, the sub class's
         *   method is called, I guess because there's space in the memory for it already.
         */
    }

}
