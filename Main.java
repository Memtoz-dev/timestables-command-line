import java.util.Scanner;

public class Main {

    static char timesTable(Scanner userInput) {
        int counter = 1;

        int num1 = userInput.nextInt();

        System.out.println("Timestable for " + num1);

        for (int i = num1; i <= num1 * 12; i = i + num1) {
            System.out.println(num1 + " x " + counter + " = " + i);
            counter = counter + 1;
        }

        System.out.println("Try again? (Y/N):");

        char loop = userInput.next().charAt(0);
        char loopYN = Character.toUpperCase(loop);
        return loopYN;

    }

    public static void main(String[] args) {

        System.out.println("Type a number to see its timestable:");
        Scanner userInput = new Scanner(System.in);

        char loopChoice = timesTable(userInput);

        while (loopChoice == 'Y') {
            System.out.println("Type a number to see its timestable:");
            loopChoice = timesTable(userInput);
        }

        System.out.println("Thanks for playing :D");

    }
}