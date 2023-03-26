public class Cleric extends Healer {
    
    public Cleric(String n) {
        super(n, 9, 7, 12, 11);
    }
    
    public int heal() {
        return (int) (getHeal() * getPiety() * getLevel() * 1.2);
    }
    
    public int attack() {
        return (int)(getStr() * getLevel() * 0.67);
    }
    
    public String toString() {
        return ("Cleric " + getName() + " currently has " + getCurrHealth() + " health of a max " + getMaxHealth());
    }
}