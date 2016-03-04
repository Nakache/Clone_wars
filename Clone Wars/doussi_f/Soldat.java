/**
 * Created by Zouclar on 01/03/2016.
 */
public class Soldat extends Enemy {

    public Soldat(int lvl) {
        setHp(100 * lvl);
        setDef(150 * lvl);
        setPower(125 * lvl);
        setForce(0);
        setIntelligence(125 * lvl);
    }

    public void physicalAttack(Personnages personnages){

    }
}
