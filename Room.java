/**
 * Created by Florian on 02/03/2016.
 */
public class Room {

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    private int lvl;
    private int ennemisList;

    public Room() {

    }


    public void setEnnemisList(int ennemisList) {
        this.ennemisList = ennemisList;
    }


    public void getEnnemisList() {
        this.ennemisList = ennemisList;
    }
}
