import java.util.Scanner;

/**
 * Created by Zouclar on 26/02/2016.
 */
public class main {
    public static void main(String[] args) {
        System.out.println("Veuillez Choisir une classe Pamis:");
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
        System.out.println("Votre personnage s'apelle: " + name +" Il est de classe: " + classe);
    }
}