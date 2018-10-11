import java.util.Scanner;

public class CanYouDrive {
    public static void main(String[] args){

        // Scooterrijbewijs
        Scanner scanner = new Scanner(System.in);
       System.out.println("Heb jij al een scooterrijbewijs? JA/NEE");
       String rijbewijs = scanner.nextLine();

        // scanner leeftijd
        System.out.println("Hoe oud ben jij?");
        int leeftijd = 1;
        leeftijd = scanner.nextInt();

        if (leeftijd <= 15) {
            System.out.println("Je bent te jong om rijlessen te nemen. Je mag geen auto en scooter besturen.");
        }
        else {
            if (leeftijd == 16) {
                System.out.println("Je mag bijna rijlessen nemen. Je bent wel oud genoeg om scooterrijlessen te nemen. Scooter besturen mag en auto niet.");
            } else if (leeftijd >= 17) {
                System.out.println("Je bent oud genoeg om rijlessen te nemen. Ook mag je auto en scooter besturen.");
            }
        }
        System.out.println("Scooterrijbewijs: " + rijbewijs);
    }
}
