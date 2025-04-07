
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Character c1 = new Character();

        System.out.println();
    }
}

class characterStats{
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

    public void Character(){
        this.name = "Jordan Arrington";
        this.level = 1;
        this.STR = 10;
        this.DEX = 10;
        this.INT = 10;
        this.CON = 10;
        this.armor_class = 10;
        this.wizzdom = 10;
        this.charizz = 10;
        hpCALC();
        }

    public void Character(String name, int level){
        Random rand = new Random();
        STR = rand.nextInt(3, 18);
        DEX = rand.nextInt(3, 18);
        INT = rand.nextInt(3, 18);
        CON = rand.nextInt(3, 18);
        wizzdom = rand.nextInt(3, 18);
        charizz = rand.nextInt(3, 18);
    }

    public void hpCALC(){
        if(level == 1){
            HP = 10 + CON;
        }
        else{
            HP = HP + (level - 1) * (6 + CON);
        }
    }

    public void armorClassCALC(){
        armor_class = 10 + DEX;
    }

    public void abilityMOD(){

    }

    public void levelUP(){
        level++;
        hpCALC();
        armorClassCALC();
    }


    public void ADDfeatures(String feature) {
        features.add(feature);
    }

    public String toString(){
        return "\nCharacter: " + this.name + "\nLVL: " + this.level + "\nSTR: " + this.STR + "\nDEX: " + this.DEX + "\nINT: " + this.INT + "\nConstipation: " + this.CON + "\nArmor: " + this.armor_class + "\nWizzdom: " + this.wizzdom + "\nCharizz: " + this.charizz;
    }
}

class Wizard extends Character{
    public void wizard(){
        super();

    }

}

