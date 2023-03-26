public class Wizard extends PlayerCharacter {
    
    private int magic;
    
    public Wizard(String n) {
        super(n, 6, 12, 8);
        magic = 10;
    }
    
    public int cast() {
        return (magic * getInt() * getLevel());
    }
    
    public int attack() {
        return (getStr() * getLevel());
    }
    
    public void levelUp() {
        super.levelUp();
        if(getLevel() % 3 == 0 && getLevel() != 0) {
            updateStr(1);
        }
        updateInt(2);
        magic += 2;
    }
    
    public String toString() {
        return ("Wizard " + super.toString());
    }
}