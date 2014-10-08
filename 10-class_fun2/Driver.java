public class Driver {
    public static void main(String[] args){
	Basechar c = new Basechar();
	Warrior w = new Warrior();
	Mage m = new Mage();
	Basechar c2;
	Warrior w2;
	Mage m2;

	// nope w2 = m;
	// nope w2 = c;

	// this works -- note that c2.getHealth() calls getHealth in the
	// warrior subclass
	c2 = w;
        System.out.println(c2.getHealth());

	c2 = m;
        System.out.println(c2.getHealth());
        System.out.println( ((Mage)c2).getManna()   );

	w.setName("Groo");
	m.setName("Mr. Sage");

	w.attack(m);
	m.attack(w);
	w.attack(w);
	System.out.println(w.toString());
	System.out.println(w);
    }
}
