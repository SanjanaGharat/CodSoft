package Codsoft;
import java.util.Scanner;
public class Task2 {

	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String userName = scanner.nextLine();

	        System.out.print("Enter the number of subjects: ");
	        int numberOfSubjects = scanner.nextInt();

	        int[] marks = new int[numberOfSubjects];

	        for (int i = 0; i < numberOfSubjects; i++) {
	            System.out.print("Enter marks for subject " + (i + 1) + ": ");
	            marks[i] = scanner.nextInt();
	        }

	        int totalMarks = 0;
	        for (int mark : marks) {
	            totalMarks += mark;
	        }

	        double averagePercentage = (double) totalMarks / numberOfSubjects;

	       
	        String grade;
	        if (averagePercentage >= 90) {
	            grade = "A+";
	        } else if (averagePercentage >= 80) {
	            grade = "A";
	        } else if (averagePercentage >= 70) {
	            grade = "B+";
	        } else if (averagePercentage >= 60) {
	            grade = "B";
	        } else if (averagePercentage >= 50) {
	            grade = "C+";
	        } else if (averagePercentage >= 40) {
	            grade = "C";
	        } else {
	            grade = "F";
	        }

	        
	        System.out.println("\n-----------------------------");
	        System.out.println("| Name: " + userName);
	        System.out.println("-----------------------------");
	        System.out.println("| Subject | Marks           |");
	        System.out.println("-----------------------------");
	        for (int i = 0; i < numberOfSubjects; i++) {
	            System.out.printf("| Subject %-2d | %-15d |\n", (i + 1), marks[i]);
	        }
	        System.out.println("-----------------------------");
	        System.out.printf("| Total   | %-15d |\n", totalMarks);
	        System.out.printf("| Average | %-15.2f |\n", averagePercentage);
	        System.out.printf("| Grade   | %-15s |\n", grade);
	        System.out.println("-----------------------------");

	        scanner.close();
	    }
	}

