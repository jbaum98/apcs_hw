import java.io.*;
import java.util.*;

public class Rogue extends BaseChar implements Comparable {

    public Rogue() {
        super();
    }

    public Rogue(String s) {
        super(s);
    }

    protected void boostAttributes() {
        defense *= 1.5;
        speed *= 1.5;
    }

    //methods
    public void boost(){
        removeMana(30);
        speedMod += 20;
        defenseMod += 30;
    }

    public void special(BaseChar other) {
        removeMana(80);
        int damage = (int) (attack / 8 * (Math.random() + 1));
        other.removeHealth(damage);
        addHealth(damage);
    }

    public static void main(String[] args) {
        Rogue r1 = new Rogue("Alex");
        Rogue r2 = new Rogue("Barry");
        Rogue r3 = new Rogue("Charlie");
        Rogue[] rs = {r2, r3, r1};
        System.out.println(Arrays.toString(rs));
        Arrays.sort(rs);
        System.out.println(Arrays.toString(rs));
    }
}
