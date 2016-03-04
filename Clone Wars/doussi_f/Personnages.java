/**
 * Created by Florian on 01/03/2016.
 */
public abstract class Personnages {

    //Setters
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    // Getters
    public int getHp() {
        return hp;
    }

    public int getDef() {
        return def;
    }

    public int getPower() {
        return power;
    }

    public int getForce() {
        return force;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getLvl() {
        return lvl;
    }

    public int getXp() {
        return xp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private int hp;
    private int def;

    public int getXpey() {
        return xpey;
    }

    public void setXpey(int xpey) {
        this.xpey = xpey;
    }

    private int power;
    private int force;
    private int intelligence;
    private int lvl;
    private int xp;
    private int xpey;
    private String type;

    public int physicalAttack(Enemy ennemy) {
        if ((power - ennemy.getDef()) > 0) {
            System.out.println("Vous faite une attaque physique !");
            ennemy.setHp(ennemy.getHp() - (power - ennemy.getDef()));
            System.out.println("L'ennemi a " + (power - ennemy.getDef()) + "/"+ ennemy.getDef() +" HP");
        }

        else
            System.out.println("Vous ne faite aucun dégât, vous tapez " + power + " alors que l'ennemi à " + ennemy.getDef() +" de défence");
        System.out.println("");
        return (0);
    }

    public int forceAttack(Enemy ennemy) {
        System.out.println("Votre personnage fait une attaque force au " + ennemy.getClass().getName());
        ennemy.setHp(ennemy.getHp() - (force/2)*2);
        System.out.println("L'ennemi a " + (power - ennemy.getDef()) + "/"+ ennemy.getDef() +" HP");
        return (0);
    }

    public int armedAttack(Enemy ennemy) {
        System.out.println("Vous faite une attaque avec une arme !");
        ennemy.setHp(ennemy.getHp() - (intelligence - ennemy.getDef()));
        System.out.println("L'ennemi a " + (power - ennemy.getDef()) + "/"+ ennemy.getDef() +" HP");
        return (0);
    }
    public void lvlUp() {
        if (xp > xpey ){
            System.out.println("Vous avez monté d'un niveau !");
            System.out.println("Vous etes maintenant niveau: " + lvl);
            lvl += 1;
            power = power/2 + power;
            intelligence = intelligence/2 + intelligence;
            hp = hp/2 + hp;
            def = def/2 + def;
            force = force/2 + force;

            xpey = (xpey) * 2;
        }
    }

    public Personnages(){
        lvl = 1;
    }

    public boolean isAlive() {
        return (getHp() > 0);
    }
}