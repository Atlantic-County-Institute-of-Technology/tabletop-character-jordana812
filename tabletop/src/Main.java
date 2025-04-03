
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){

    }

}

class characterTraits{
    protected String name;
    protected int level;
    protected int HP;
    protected int STR;
    protected int DEX;
    protected int INT;
    protected int CON;
    protected int amour_class;
    protected int wizzdom;
    protected int charizz;
    protected ArrayList<String> features;

    public void Character(){
        this.name = "Jordan Arrington";
        this.level = 1;
        this.HP = 10;
        this.STR = 10;
        this.DEX = 10;
        this.INT = 10;
        this.CON = 10;
        this.amour_class = 10;
        this.wizzdom = 10;
        this.charizz = 10;

        }

    public characterTraits(String name, int level){
        Random rand = new Random();
        int[] diceRolls = new int[6];
        for(int i = 0; i < 6; i++){
            diceRolls[i] = rand.nextInt(6) + 1;
        }

        Arrays.sort();
        System.out.println(Arrays.toString(diceRolls));

    }
}

