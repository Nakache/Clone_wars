import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by Zouclar on 26/02/2016.
 */
public class main {
    public static void main(String[] args) {
        Factory Factory = new Factory();
        ArrayList<Personnages> list;
        Personnages perso = null;
        System.out.println("Veuillez Choisir une classe parmis:");
        System.out.println("1. Jedi");
        System.out.println("2. Sith"); //BountyHunter, ImperialAgent, Mercenary, Jawa
        System.out.println("3. Bounty Hunter");
        System.out.println("4. Imperial Agent");
        System.out.println("5. Mercenary");
        System.out.println("6. Jawa");

        Scanner scan = new Scanner(System.in);
        String classe = scan.nextLine();
        System.out.println("Veuillez Choisir un nom:");
        String name = scan.nextLine();

        Hashtable<Integer,Personnages> tbl = new Hashtable<Integer,Personnages>();
        tbl.put(1, new Jedi());
        tbl.put(2, new Sith());
        tbl.put(3, new BountyHunter());
        tbl.put(4, new ImperialAgent());
        tbl.put(5, new Mercenary());
        tbl.put(6, new Jawa());

        perso = tbl.get(1);

        System.out.println("Votre personnage s'appelle: " + name + " Il est de classe: " + perso.getClass().getName());

        Factory.generation();
        list = Factory.getList();
        list.get(0);
    }
}