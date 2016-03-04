/**
 * Created by Zouclar on 01/03/2016.
 */
public class Clone extends Enemy {

    @Override
    public void physicalAttack(Personnages personnages) {

    }

    public Clone(int lvl){
        setHp(100 * lvl);
        setDef(100 * lvl);
        setPower(100 * lvl);
        setForce(0);
        setIntelligence(100 * lvl);
    }

}