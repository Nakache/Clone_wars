/**
 * Created by Florian on 01/03/2016.
 */
public abstract class Personnages {

    public int hp;
    public int def;
    public int power;
    public int force;
    public int intelligence;
    public int lvl;
    public int xp;

    abstract public void physicalAttack();
    abstract public void armedAttack();
    abstract public void lvlUp();

    public Personnages(){
        lvl = 1;
    }
}