/* superclass for warrior (base class) and Mage */
public class Basechar {
    private int health; 
    private String name;
/*
    public Basechar() {
        this.name = "Destroyer";
        this.health = 20;
    }

    public Basechar(String name) {
        this.name = name;
        this.health = 20;
    }

    public Basechar(String name, int mana) {
        this.name = name;
        this.mana = mana;
    }
*/
    public String toString(){
	return this.getName();
    }
    
    public void attack(Basechar other){
	//System.out.println(this.getName()+" is attacking "+other.getName());
	System.out.println(this+" is attacking "+other);

    }
    
    public void setName(String name){
	this.name = name;
    }
    
    public String getName(){
	return this.name;
    }

    public int getHealth() {
	return this.health;
    }

    
}
