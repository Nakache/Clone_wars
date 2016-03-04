/**
 * Created by Zouclar on 01/03/2016.
 */
public class Droid extends Enemy {

    public Droid(int lvl) {
        setHp(50 * lvl);
        setDef(100 * lvl);
        setPower(25 * lvl);
        setForce(0);
        setIntelligence(200 * lvl);
    }

    public void physicalAttack(Personnages personnages){

    }
}