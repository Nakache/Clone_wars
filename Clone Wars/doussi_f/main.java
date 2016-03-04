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
        Room room = new Room();
        System.out.println("Veuillez Choisir une classe parmis:");
        System.out.println("1. Jedi");
        System.out.println("2. Sith");
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

        selectedPerso.setXpey(100);
        selectedPerso.setLvl(1);
        room.setLvl(1);
        System.out.println("Votre personnage s'appelle: " + name + " Il est de classe: " + selectedPerso.getType());
        Factory.generation(room.getLvl());
        list = Factory.getList();

        while (selectedPerso.isAlive()){
            System.out.println("\nÀ vous de jouer !\n");
            System.out.println("Un " + list.get(0).getClass().getName() + " apparaît !");
            System.out.println("Que souhaitez-vous faire ?");

            System.out.println("1. Physical attack");
            System.out.println("2. Special attack");
            System.out.println("3. Armed attack");
            System.out.println("4. Show stats");
            System.out.println("5. Show Enemy stats");
            String attack = scan.nextLine();


            if (selectedPerso.getType().equals("Jedi") || selectedPerso.getType().equals("Sith")){
                switch (attack) {
                    case "1":
                        selectedPerso.physicalAttack(list.get(0));
                        break;
                    case "2":
                        selectedPerso.forceAttack(list.get(0));
                        break;
                    case "3":
                        selectedPerso.armedAttack(list.get(0));
                        break;
                    case "4":
                        System.out.println("\nVoici les stats actuels de votre personnage :");
                        System.out.println(selectedPerso.getHp() + " HP");
                        System.out.println(selectedPerso.getDef() + " Défense");
                        System.out.println(selectedPerso.getPower() + " Puissance");
                        System.out.println(selectedPerso.getForce() + " Force");
                        System.out.println(selectedPerso.getIntelligence() + " Intelligence");
                        System.out.println("Votre personnage est lvl : " + selectedPerso.getLvl());
                        break;
                    case "5":
                        System.out.println("\nVoici les stats de l'ennemi que vous combattez :");
                        System.out.println(list.get(0).getHp() + " HP");
                        System.out.println(list.get(0).getDef() + " Défense");
                        System.out.println(list.get(0).getPower() + " Puissance");
                        System.out.println(list.get(0).getForce() + " Force");
                        System.out.println(list.get(0).getIntelligence() + " Intelligence");
                        break;
                    default:
                        break;
                }
            }
            else {
                switch (attack) {
                    case "1":
                        selectedPerso.physicalAttack(list.get(0));
                        break;
                    case "2":
                        System.out.println("\nVotre classe ne possède pas la force ! #faible\nVous attaquez avec une attaque physique !");
                        selectedPerso.physicalAttack(list.get(0));
                        break;
                    case "3":
                        selectedPerso.armedAttack(list.get(0));
                        break;
                    case "4":
                        System.out.println("\nVoici les stats actuels de votre personnage :");
                        System.out.println(selectedPerso.getHp() + " HP");
                        System.out.println(selectedPerso.getDef() + " Défense");
                        System.out.println(selectedPerso.getPower() + " Puissance");
                        System.out.println(selectedPerso.getForce() + " Force");
                        System.out.println(selectedPerso.getIntelligence() + " Intelligence();");
                        System.out.println("Votre personnage est lvl : " + selectedPerso.getLvl());
                        break;
                    case "5":
                        System.out.println("\nVoici les stats de l'ennemi que vous combattez :");
                        System.out.println(list.get(0).getHp() + " HP");
                        System.out.println(list.get(0).getDef() + " Défense");
                        System.out.println(list.get(0).getPower() + " Puissance");
                        System.out.println(list.get(0).getForce() + " Force");
                        System.out.println(list.get(0).getIntelligence() + " Intelligence");
                        break;
                    default:
                        break;
                }
            }


            if (list.get(0).getHp() <= 0) {
                System.out.println(list.get(0).getClass().getName() + " est mort !");
                list.remove(0);
                list = Factory.getList();
                selectedPerso.setXp(selectedPerso.getXp()+50);
                selectedPerso.lvlUp();
                if (list.size() == 0) {
                    room.setLvl(room.getLvl() + 1);
                    Factory.generation(room.getLvl());
                }
            }
            else {
                System.out.println("Il reste " + list.get(0).getHp() + " HP à l'ennemi");
                list.get(0).physicalAttack(selectedPerso);
                System.out.println(list.get(0).getClass().getName() + " vous a attaqué !\n" + "Il vous reste " + selectedPerso.getHp() + " HP !");
            }
        }
    }
}