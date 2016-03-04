import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by Zouclar on 26/02/2016.
 */
public class main {
    public static void main(String[] args) {
        Factory Factory = new Factory();
        ArrayList<Enemy> list;
        //int perso = Integer.parseInt(null);
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
        Personnages selectedPerso;

        switch (classe){
            case "1":
                selectedPerso = new Jedi();
                break;
            case "2":
                selectedPerso = new Sith();
                break;
            case "3":
                selectedPerso = new BountyHunter();
                break;
            case "4":
                selectedPerso = new ImperialAgent();
                break;
            case "5":
                selectedPerso = new Mercenary();
                break;
            case "6":
                selectedPerso = new Jawa();
                break;
            default:
                selectedPerso = new Jedi();
                break;
        }


        System.out.println("Votre personnage s'appelle: " + name + " Il est de classe: " + selectedPerso.getType());

        while (selectedPerso.isAlive()){

        Factory.generation();
        list = Factory.getList();
        System.out.println("Un " + list.get(0).getClass().getName() + " apparaît !");
        System.out.println("Que souhaitez-vous faire ?");

        System.out.println("1. Physical attack");
        System.out.println("2. Special attack");
        System.out.println("3. Armed attack");
        String attack = scan.nextLine();
        System.out.println("votre personnage tape du "+ selectedPerso.getPower());

        if (selectedPerso.getType().equals("Jedi") || selectedPerso.getType().equals("Sith")){
            switch (attack){
                case "1": selectedPerso.physicalAttack(list.get(0));
                    break;
                case "2": selectedPerso.forceAttack(list.get(0));
                    break;
                case "3": selectedPerso.armedAttack(list.get(0));
                    break;
                default:break;
            }
        }


        if (list.get(0).getHp() <= 0) {
            System.out.println(list.get(0).getClass().getName() + " est mort !");
        }
        else
            System.out.println("Il reste " + list.get(0).getHp() + " HP à l'ennemi");
        }
    }
}