//Jordan Arrington
//4-9-25
//TableTop DND Characters
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//Creates a new wizard character
public class Main {
    public static void main(String[] args){
        Character c1 = new Wizard("ROBERT BAEZZZ", 2);
        System.out.println(c1);
    }
}

//Sets all character class stats
class Character{
    protected String name;
    protected int level;
    protected int HP;
    protected int STR;
    protected int DEX;
    protected int INT;
    protected int CON;
    protected int armor_class;
    protected int wizzdom;
    protected int charizz;
    protected ArrayList<String> features;

    //Character within the character class, which sets this as the default
    public Character(){
        features = new ArrayList<>();
        this.name = "Jordan";
        this.level = 1;
        this.STR = 10;
        this.DEX = 10;
        this.INT = 10;
        this.CON = 10;
        this.armor_class = 10;
        this.wizzdom = 10;
        this.charizz = 10;
        hpCALC();
        armorClassCALC();
        }

    //Sets the character stats to randomize at a bound between 3 and 18, calls the name of the character and level as well. Takes HP calc function and armor calc function into account.
    public Character(String name, int level){
        Random rand = new Random();
        features = new ArrayList<>();
        STR = rand.nextInt(3, 18);
        DEX = rand.nextInt(3, 18);
        INT = rand.nextInt(3, 18);
        CON = rand.nextInt(3, 18);
        wizzdom = rand.nextInt(3, 18);
        charizz = rand.nextInt(3, 18);
        this.name = name;
        this.level = level;
        hpCALC();
        armorClassCALC();
    }

    //Calculates the HP of the character, adding 10 + its constitution if it is level 1, else normal HP calculations
    public void hpCALC(){
        if(level == 1){
            HP = 10 + CON;
        }
        else{
            HP = HP + (level - 1) * (6 + CON);
        }
    }

    //armor class determined with 10 + its dexterity
    public void armorClassCALC(){
        armor_class = 10 + DEX;
    }

    //ability modifier takes its ability score - 10 divided by 2
    public int abilityMOD(int score){
        return (score - 10) / 2;
    }

    //When character levels up, its level adds by 1 and HP + armor class is recalculated
    public void levelUP(){
        level++;
        hpCALC();
        armorClassCALC();
    }


    //function to add features to character
    public void ADDfeatures(String feature) {
        features.add(feature);
    }

    //What is printed to display character and its stats
    public String toString(){
        return "\nCharacter: " + this.name + "\nLVL: " + this.level + "\nSTR: " + this.STR + "\nDEX: " + this.DEX + "\nINT: " + this.INT + "\nConstipation: " + this.CON + "\nArmor: " + this.armor_class + "\nWizzdom: " + this.wizzdom + "\nCharizz: " + this.charizz;
    }
}

//Wizard class, which is a character type. Has special attributes as stated in function
class Wizard extends Character{

    public Wizard(){
        super();
        INT = INT + 2;
        CON = CON + 1;
        ADDfeatures("Arcane Recovery");
        ADDfeatures("Spell Mastery");
    }
    public Wizard(String name, int level) {
        super(name, level);
        INT = INT + 2;
        CON = CON + 1;
        ADDfeatures("Arcane Recovery");
        ADDfeatures("Spell Mastery");

    }
}

