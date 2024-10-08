import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter a string to analyze:");
        String input = scanner.nextLine();

        CharacterFrequencyCounter counter = new CharacterFrequencyCounter(input);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Get frequency of a character");
            System.out.println("2. Get relative percentage of a character");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            // Exit command
            if (choice == 3) {
                break; 
            }

            System.out.println("Enter the character to query:");
            char queryChar = scanner.next().charAt(0); // Read a single character from input

            switch (choice) {
                // Frequency command
                case 1:
                    System.out.println("Frequency of '" + queryChar + "': " + counter.getFrequency(queryChar));
                    break;

                // Relative percentage command
                case 2:
                    double percentage = counter.getRelativePercentage(queryChar);
                    // Prints rounded to two decimals
                    System.out.printf("Relative percentage of '%c': %.2f%%\n", queryChar, percentage);
                    break;
                    
                // Invalid command
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}
