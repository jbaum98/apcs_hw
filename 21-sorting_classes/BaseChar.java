import java.util.*;

public abstract class BaseChar {

    //Attributes
    protected String name = "";
    protected int level = 1;
    protected int health = 100;
    protected int mana = 100;

    //Tools
    protected static int randomFromTo(int bottom, int top) {
        Random r = new Random();
        return r.nextInt(top-bottom) + bottom;
    }

    //Battle Attributes
    protected int attack = randomFromTo(10,30);
    protected int defense = randomFromTo(10,30);
    protected int accuracy = randomFromTo(60,80);
    protected int speed = randomFromTo(40,60);

    //Attributes Modifiers
    protected int attackMod = 0;
    protected int defenseMod = 0;
    protected int accuracyMod = 0;
    protected int speedMod = 0;


    //Constructors

    // boosts attributes in constructor
    protected abstract void boostAttributes();

    public BaseChar() {
        name = "DEFAULT";
        boostAttributes();
    }

    public BaseChar(String n) {
        name = n;
        boostAttributes();
    }

    public String toString() {
        return name;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    //Formulas in case this later depends on other stuff
    private static int getMaxHealth() {
        return 100;
    }

    private static int getMaxMana() {
        return 100;
    }

    //Setters
    public void setName(String n) {
        name = n;
    }

    public void addHealth(int h) {
        health += h;
        if ( health > getMaxHealth() )
            health = getMaxHealth();
    }

    public void removeHealth(int h) {
        addHealth(-h);
    }

    public void addMana(int m) {
        mana += m;
        if ( mana > getMaxMana() )
            mana = getMaxMana();
    }

    public void removeMana(int m) {
        addMana(-m);
    }

    //Attacks
    public void rest() {
        addHealth(randomFromTo(0,50));
        addMana(randomFromTo(0,50));
    }

    public void baseAttack(BaseChar other) {
        double blocked = other.defense / 16 * (Math.random() + 1);
        double damage = attack / 8 * (Math.random() + 1);
        int net = (int)(damage - blocked);
        other.removeHealth(net);
    }

    public abstract void boost();

    public void stun(BaseChar other){
        removeMana(50);
        other.speedMod -= 20;
        other.accuracyMod -= 20;
    }

    public void sneak(BaseChar other){
        removeMana(40);
        other.defenseMod -= other.defense; // makes total defense 0
        baseAttack(other);
        other.defenseMod += other.defense; // restore defenseMod
    }

    public void doubleAttack(BaseChar other) {
        removeMana(20);
        baseAttack(other);
        baseAttack(other);
    }

    public void superAttack(BaseChar other) {
        removeMana(60);
        attackMod += attack; // doubles attack
        baseAttack(other);
        baseAttack(other);
        attackMod -= attack; // restores attackMod
    }

    public abstract void special(BaseChar other);

    public int compareTo(Object other) {
        BaseChar o = (BaseChar) other;
        return this.toString().compareTo(o.toString());
    }

}
