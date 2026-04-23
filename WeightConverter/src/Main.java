import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Welcome to the weight converter!");
        System.out.println("1: convert lbs to kgs");
        System.out.println("2: convert kgs to lbs");

        System.out.print("Choose your choice: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Please enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Your weight is: %.2f", newWeight);
        } else if (choice == 2) {
            System.out.print("Please enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Your weight is: %.2f", newWeight);
        }else  {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}