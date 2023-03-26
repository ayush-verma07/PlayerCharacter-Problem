public class Warrior extends PlayerCharacter {
    
    private int attack;
    
    public Warrior(String n) {
        super(n, 12, 6, 8);
        attack = 10;
    }
    
    public int attack() {
        return (attack * getStr() * getLevel());
    }
    
    public void bandAid() {
        super.heal(4);
    }
    
    public void levelUp() {
        super.levelUp();
        updateStr(3);
        attack += 1;
    }
    
    public String toString() {
        return ("Warrior " + super.toString());
    }
}