# PlayerCharacter-Problem

You will create the foundation for an online roleplaying game.

The main parent class will be the PlayerCharacter.  There will be three subclasses built from PlayerCharacter:  Warrior, Wizard, and Healer.  For now, only the Healer class will have a subclass -- Cleric.

You will find all the details of each class below.

**PlayerCharacter Class**
This class will manage the main attributes of the characters in the game, as well as some of the basic processes of playing the game such as leveling and damage dealing.

Private Instance Variables

String name -- the name of the character.
int strength -- the power of a character's physical attack.
int intelligence -- the ability of a character to cast spells.
int piety -- the divine power used for healing.
int level -- current experience level of the character.
int maxHealth -- the maximum health of the character (50 times the level).
int currHealth -- the current health of the character (cannot exceed maxHealth).

Constructors

public PlayerCharacter(String n, int s, int i, int p) -- initializes name, strength, intelligence and piety with the parameters.  Level is set to 1; maxHealth and currHealth are set to 50.

Methods

public void levelUp()
increases maxHealth by 50;
resets currHealth to maxHealth; and 
adds 1 to level.
public void takeDamage(int dmg)
decreases currHealth by dmg;
checks to see if the player is unconscious (currHealth is less than or equal to 0);
if TRUE -- display message "Uh oh, you are unconscious."
public void heal(int h)
increases currHealth by h;
ensures currHealth does not exceed maxHealth, reduces to maxHealth if TRUE.

"Getters / Setters"

getLevel()
getStr()
getInt()
getPiety()
getName()
getCurrHealth()
getMaxHealth()
updateStr(int n)
updateInt(int n)
updatePiety(int n)

toString()

This method should return a combination of variables and text.  These variables are included: name, currHealth, and maxHealth.  See the example below for format.
"Conan currently has 242 health of a max 300"

**Warrior Class**

This class will manage the main attributes of all the Warrior characters in the game, as well as some class specific processes.

Private Instance Variables

int attack -- the additional power and expertise that a Warrior brings to a physical attack.

Constructors

public Warrior(String n) -- initializes name with the parameter.  The starting values of strength, intelligence, and piety are 12, 6, and 8 respectively and are passed to the superclass constructor.  Attack is set to 10 initially.

Methods

public int attack() -- Warriors do damage to their enemies.
calculated by multiplying attack, strength, and level;
the calculated value is returned. 
public void bandAid() -- Warriors cannot heal themselves.  However, they can purchase bandages and so can bind their own wounds with an herbal poultice.
use the superclass heal() method and pass a value of 4.
public void levelUp() -- All characters can levelUp() but some have specific changes to their own special attributes.
use the superclass levelUp().
strength is increased by 3; use the updateStr() method.
increase attack by 1.

toString()

This method should return a combination of variables and text.  When using the superclass toString(), the only additional piece of text needed is at the beginning "Warrior ".  See the example below for format.
"Warrior Conan currently has 242 health of a max 300"

**Wizard Class**

This class will manage the main attributes of all the Wizard characters in the game, as well as some class specific processes.

Private Instance Variables

int magic -- the additional power and expertise that a Wizard brings to a magical attack.

Constructors

public Wizard(String n) -- initializes name with the parameter.  The starting values of strength, intelligence, and piety are 6, 12, and 8 respectively and are passed to the superclass constructor.  Magic is set to 10 initially.

Methods

public int cast() -- Wizards hang back and cast damaging spells on their enemies.
calculated by multiplying magic, intelligence, and level;
the calculated value is returned. 
public int attack() -- Wizards are not great fighters, but if they run out of spell power, they can use their staff or dagger in a pinch.  Since they are not trained warriors, their attack power is only based on experience and what little strength they do have.
calculated by multiplying strength and level;
the calculated value is returned.
public void levelUp() -- All characters can levelUp() but some have specific changes to their own special attributes.
use the superclass levelUp().
strength is increased by 1, but only every three levels starting at 3rd.  Use the updateStr() method.
intelligence is increased by 2.
increase magic by 2.

toString()

This method should return a combination of variables and text.  When using the superclass toString(), the only additional piece of text needed is at the beginning "Wizard ".  See the example below for format.
"Wizard Gandalf currently has 137 health of a max 300"

**Healer Class**

This class will manage the main attributes of all the Healer characters in the game, as well as some class specific processes.

Private Instance Variables

int heal -- the divine energies and power that a Healer brings to rendering aid and comfort to the party.

Constructors

public Healer(String n) -- initializes name with the parameter.  The starting values of strength, intelligence, and piety are 8, 8, and 12 respectively and are passed to the superclass constructor.  Heal is set to 10 initially.
public Healer(String n, int s, int i, int p, int h) -- This constructor is made for the subclass healers (Cleric, Paladin, Shaman, etc.); those with specific attributes passed via parameters.  The name, strength, intelligence, and piety are passed to the superclass constructor.  Heal is initialized via the "h" parameter.

Methods

public int heal() -- Healers can repair the damage from villains' and monsters' attacks.
calculated by multiplying heal, piety, and level;
the calculated value is returned. 
public int attack() -- Healers are not great fighters, but if they are not healing anyone, they can grab a mace or hammer and wail away at the enemies.  Most healers are not trained warriors, their attack power is only based on experience and the strength they do have.
calculated by multiplying strength and level;
the calculated value is returned.
public void levelUp() -- All characters can levelUp() but some have specific changes to their own special attributes.
use the superclass levelUp().
strength is increased by 1, but only every even-numbered level.  Use the updateStr() method.
piety is increased by 2.
increase heal by 1.

"Getter"

getHeal() -- this is a unique ability of the "Healer" class and the subclasses need access

toString()

This method should return a combination of variables and text.  When using the superclass toString(), the only additional piece of text needed is at the beginning "Healer".  See the example below for format.
"Healer Dr. McCoy currently has 49 health of a max 450"

**Cleric Class**

This class will manage the main attributes of all the Cleric characters in the game, as well as some class specific processes.

Private Instance Variables

NONE -- there are no Cleric specific attributes

Constructors

public Cleric(String n) -- initializes name with the parameter.  The starting values of strength, intelligence, piety, and heal are 9, 7, 12, and 11 respectively and are passed to the Healer superclass constructor.

Methods

public int heal() -- Clerics are better healers than Healers.
calculated by multiplying heal, piety, level and 1.2 (20% better than Healers);
the calculated value is returned as an integer.
public int attack() -- Clerics are not great fighters, but if they are not healing anyone, they can grab a mace or hammer and wail away at the enemies.  Most healers are not trained warriors, their attack power is only based on experience and the strength they do have.
calculated by multiplying strength and level and 0.67;
the calculated value is returned as an integer.

toString()

This method should return a combination of variables and text.  This method cannot use the superclass method.  The name, currHealth, and maxHealth can be retrieved from the PlayerCharacter class by normal getter method calls.  See the example below for format.
"Cleric Father Mike currently has 129 health of a max 350"

The Runner class can be altered, I simply created a basic formatting as an example.
