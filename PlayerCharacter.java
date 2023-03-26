public class PlayerCharacter {
    
    private String name;
    private int strength, intelligence, piety, level, maxHealth, currHealth;
    
    public PlayerCharacter(String n, int s, int i, int p) {
        name = n;
        strength = s;
        intelligence = i;
        piety = p;
        level = 1;
        maxHealth = 50;
        currHealth = 50;
    }
    
    public void levelUp() {
        maxHealth += 50;
        currHealth = maxHealth;
        level++;
    }
    
    public void takeDamage(int dmg) {
        currHealth -= dmg;
        
        if(currHealth <= 0) {
            System.out.println("Uh oh, you are unconscious");
        }
    }
    
    public void heal(int h) {
        currHealth += h;
        if(currHealth > maxHealth) {
            currHealth = maxHealth;
        }
    }
    
    public int getLevel() {
        return level;
    }
    
    public int getStr() {
        return strength;
    }
    
    public int getInt() {
        return intelligence;
    }
    
    public int getPiety() {
        return piety;
    }
    
    public String getName() {
        return name;
    }
    
    public int getCurrHealth() {
        return currHealth;
    }
    
    public int getMaxHealth() {
        return maxHealth;
    }
    
    public void updateStr(int n) {
        strength = n;
    }
    
    public void updateInt(int n) {
        intelligence = n;
    }
    
    public void updatePiety(int n) {
        piety = n;
    }
    
    public String toString() {
        return (name + " currently has " + currHealth + " of a max " + maxHealth);
    }
    
}