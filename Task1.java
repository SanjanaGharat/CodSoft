package Codsoft;
import java.util.Random;
import java.util.Scanner;
public class Task1 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter your name: ");
	        String userName = scanner.nextLine();

	        boolean playAgain = true;
	        int totalRounds = 0;
	        int totalScore = 0;
	        
	        while (playAgain) {
	            totalRounds++;
	            System.out.println("\nRound " + totalRounds);
	            int attempts = playRound(scanner, userName);
	            totalScore += attempts;
	            
	            System.out.print("Do you want to play another round, " + userName + "? (yes/no): ");
	            String response = scanner.nextLine().toLowerCase();
	            playAgain = response.equals("yes");
	        }
	        
	        System.out.println("\nGame Over, " + userName + "!");
	        System.out.println("Total Rounds Played: " + totalRounds);
	        System.out.println("Total Score: " + totalScore + " (lower score is better)");
	        
	        scanner.close();
	    }
	    
	    public static int playRound(Scanner scanner, String userName) {
	        Random random = new Random();
	        int correctNumber = random.nextInt(100) + 1; 
	        int attempts = 0;
	        final int maxAttempts = 10;

	        while (attempts < maxAttempts) {
	            System.out.print("Enter your guess (1-100), " + userName + ": ");
	            int guess = scanner.nextInt();
	            scanner.nextLine();  
	            attempts++;
	            
	            if (guess < correctNumber) {
	                System.out.println("Your guess is too low. Try again.");
	            } else if (guess > correctNumber) {
	                System.out.println("Your guess is too high. Try again.");
	            } else {
	                System.out.println("Congratulations, " + userName + "! You guessed the correct number in " + attempts + " attempts.");
	                return attempts;
	            }
	        }
	        
	        System.out.println("Sorry, " + userName + ", you've used all " + maxAttempts + " attempts. The correct number was " + correctNumber + ".");
	        return maxAttempts;
	    }
	}


