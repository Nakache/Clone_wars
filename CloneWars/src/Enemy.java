/**
 * Created by Florian on 02/03/2016.
 */
public abstract class Enemy {
    /**
     * Created by Florian on 01/03/2016.
     */

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


        private int hp;
        private int def;
        private int power;
        private int force;
        private int intelligence;
        private int lvl;
        private int xp;

        public void physicalAttack(Personnages ennemy) {
            ennemy.setHp(getHp() - (power - ennemy.getDef()));
        }

        public Enemy(){
            lvl = 1;
        }
    }