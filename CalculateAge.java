import java.util.Scanner;
import java.time.LocalDate;

public class CalculateAge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Get the current year
        int currentYear = LocalDate.now().getYear();

        System.out.println("Your Age in " + currentYear);
        
        // Ask for the birth year  
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Calculate age
        int age = currentYear - birthYear;

        // Display result
        System.out.println("You are " + age + " years old!");

        scanner.close();
    }
}
