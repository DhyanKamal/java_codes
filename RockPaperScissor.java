import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] options = {"rock", "paper", "scissors"};
        
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String playerChoice = scanner.next().toLowerCase();
        
        int computerChoiceIndex = random.nextInt(3);
        String computerChoice = options[computerChoiceIndex];
        
        System.out.println("Computer chose: " + computerChoice);
        
        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                   (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
        
        scanner.close();
    }
}
