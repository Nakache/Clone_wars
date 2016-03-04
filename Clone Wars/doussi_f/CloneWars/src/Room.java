/**
 * Created by Zouclar on 04/03/2016.
 */
public class Room {

    private int lvl;
    private int ennemisList;

    public Room(int lvl, int ennemisList) {

        setLvl(lvl);
        setEnnemisList(ennemisList);
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setEnnemisList(int ennemisList) {
        this.ennemisList = ennemisList;
    }

    public void getLvl() {
        this.lvl = lvl;
    }

    public void getEnnemisList() {
        this.ennemisList = ennemisList;
    }
}
