public class Healer extends PlayerCharacter {
    
    private int heal;
    
    public Healer(String n) {
        super(n, 8, 8, 12);
        heal = 10;
    }
    
    public Healer(String n, int s, int i, int p, int h) {
        super(n, s, i, p);
        heal = h;
    }
    
    public int heal() {
        return (heal * getPiety() * getLevel());
    }
    
    public int attack() {
        return (getStr() * getLevel());
    }
    
    public void levelUp() {
        super.levelUp();
        if(getLevel() % 2 == 0) {
            updateStr(1);
        }
        updatePiety(2);
        heal += 1;
    }
    
    public int getHeal() {
        return heal;
    }
    
    public String toString() {
        return ("Healer " + super.toString());
    }
}