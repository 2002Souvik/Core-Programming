/*
Rock-Paper-Scissors is a game played between a minimum of two players. Each player can choose either rock, paper, or scissors. Here the game is played between a user and a computer. Based on the rules, either a player or a computer will win. Show the stats of player and computer win in a tabular format across multiple games. Also, show the winning percentage between the player and the computer.
Hint => 
The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
Create a Method to find the Computer Choice using the Math.random
Create a Method to find the winner between the user and the computer
Create a Method to find the average and percentage of wins for the user and the computer and return a String 2D array
Create a Method to display the results of every game and also display the average and percentage wins 
In the main take user input for the number of games and call methods to display results
*/
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of games to play: ");
        int numberOfGames = scanner.nextInt();
        
        String[][] results = new String[numberOfGames][3];
        int userWins = 0;
        int computerWins = 0;
        int draws = 0;
        
        for (int i = 0; i < numberOfGames; i++) {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = scanner.next().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);
            
            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
            
            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                draws++;
            }
        }
        
        String[][] stats = calculateStats(userWins, computerWins, draws, numberOfGames);
        displayResults(results, stats);
        
        scanner.close();
    }
    
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        int index = (int)(Math.random() * 3);
        return choices[index];
    }
    
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }
    
    public static String[][] calculateStats(int userWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[3][2];
        
        stats[0][0] = "User Wins";
        stats[0][1] = String.valueOf(userWins);
        
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);
        
        stats[2][0] = "Draws";
        stats[2][1] = String.valueOf(draws);
        return stats;
    }

    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.printf("%-15s %-15s %-15s\n", "User Choice", "Computer Choice", "Winner");
        for (String[] result : results) {
            System.out.printf("%-15s %-15s %-15s\n", result[0], result[1], result[2]);
        }

        System.out.println("\nStatistics:");
        System.out.printf("%-15s %-15s\n", "Outcome", "Count");
        for (String[] stat : stats) {
            System.out.printf("%-15s %-15s\n", stat[0], stat[1]);
        }
    }
}