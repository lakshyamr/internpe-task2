import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        int win = 0;
        int loss = 0;
        Scanner s1 = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            int num;
            String userChoice = "";
            String computerChoice = "";

            System.out.println("Welcome to Rock, Paper, and Scissors!");
            OUTER: while (true) {
                System.out.print("Please choose r)ock, p)aper, or s)cissors > ");
                userChoice = s1.nextLine();
                switch (userChoice) {
                    case "r":
                        System.out.println("User: rock");
                        break OUTER;
                    case "p":
                        System.out.println("User: paper");
                        break OUTER;
                    case "s":
                        System.out.println("User: scissor");
                        break OUTER;
                    default:
                        System.out.println(userChoice + " is not a Valid Input");
                        break;
                }
            }
            // Getting the Computer choice
            num = rand.nextInt(3);
            switch (num) {
                case 0:
                    computerChoice = "r";
                case 1:
                    computerChoice = "p";
                case 2:
                    computerChoice = "s";
                default: {
                }
            }

            // Displaying the computer's choice
            switch (computerChoice) {
                case "s" -> System.out.println("Computer: scissors");
                case "r" -> System.out.println("Computer: rock");
                case "p" -> System.out.println("Computer: paper");
                default -> {
                }
            }

            // Evaluate the winner of each round
            if (userChoice.equals("r") && computerChoice.equals("s")) {
                System.out.println("You have won!");
                win++;
            } else if (userChoice.equals("p") && computerChoice.equals("r")) {
                System.out.println("You have won!");
                win++;
            } else if (userChoice.equals("s") && computerChoice.equals("p")) {
                System.out.println("You have won!");
                win++;
            } else if (userChoice.equals("s") && computerChoice.equals("r")) {
                System.out.println("The computer won!");
                loss++;
            } else if (userChoice.equals("r") && computerChoice.equals("p")) {
                System.out.println("The computer won!");
                loss++;
            } else if (userChoice.equals("p") && computerChoice.equals("s")) {
                System.out.println("The computer won!");
                loss++;
            } else if (userChoice.equals(computerChoice)) {
                System.out.println("Tie!");
            } // Asking if the user wants to keep on playing the game
            System.out.println("Do You want to Play Again! (y/n)");
            String Again = s1.nextLine();

            // Displaying final results
            if (!Again.equals("y")) {
                System.out.println("You won " + win + " times and lost " + loss + " times");
                System.out.println("Thanks for playing! See you again");
                break;
            }
        }
        s1.close();
    }
}