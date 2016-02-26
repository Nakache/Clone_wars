/**
 * Created by Zouclar on 26/02/2016.
 */
public abstract class Personages {

    public int hp;
    public int def;
    public int power;
    public int force;
    public int intelligence;
    public int lvl;
    public int xp;

    abstract public void physicalAttack();
    abstract public void forceAttack();
    abstract public void armedAttack();

    public Personages(){
        lvl = 1;
    }
}