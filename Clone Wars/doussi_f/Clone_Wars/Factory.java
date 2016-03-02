import java.util.ArrayList;

/**
 * Created by Zouclar on 01/03/2016.
 */
public class Factory {
    private ArrayList<Personnages> list;

    public void generation() {
        int nbEnemy = (int) (Math.random() * 12 + 1);

        list = new ArrayList<Personnages>();

        for (int i = 0; i <= nbEnemy; i++) {
            int rand = (int) (Math.random() * 100 + 1);
            if (rand >= 30)
            list.add(new Clone());
            else if (rand >= 10)
                list.add(new Soldat());
            else
                list.add(new Droid());
        }
    }
    public ArrayList<Personnages> getList() {
        return list;
    }

    public void setList(ArrayList<Personnages> list) {
        this.list = list;
    }

    public Factory() {}
}
