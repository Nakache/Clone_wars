import java.util.Scanner;

/**
 * Created by Zouclar on 26/02/2016.
 */
public class main {
    public static void main(String[] args) {
        System.out.println("Veuillez Choisir une classe Pamis:");
        System.out.println("- Jedi");
        System.out.println("- Sith"); //BountyHunter, ImperialAgent, Mercenary, Jawa
        System.out.println("- Bounty Hunter");
        System.out.println("- Imperial Agent");
        System.out.println("- Mercenary");
        System.out.println("- Jawa");

        Scanner scan = new Scanner(System.in);
        String classe = scan.nextLine();
        System.out.println("Veuillez Choisir un nom:");
        String name = scan.nextLine();
        System.out.println("Votre personnage s'apelle: " + name +" Il est de classe: " + classe);

        try{
            Personages perso = new Personages() {
            };
        }
        catch(Exception e){
            System.out.println("Veuillez Entrer un nom valide");
        }
    }
}