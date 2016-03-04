import java.util.ArrayList;

/**
 * Created by Zouclar on 01/03/2016.
 */
public class Factory {
    private ArrayList<Enemy> list;

    public void generation() {
        int nbEnemy = (int) (Math.random() * 12 + 1);

        list = new ArrayList<Enemy>();

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
    public ArrayList<Enemy> getList() {
        return list;
    }

    public void setList(ArrayList<Enemy> list) {
        this.list = list;
    }

    public Factory() {}
}

