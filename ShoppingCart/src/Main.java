import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("Please enter the item name: ");
        item = scanner.nextLine();

        System.out.println("Please enter the item price: ");
        price = scanner.nextDouble();

        System.out.println("Please enter the item quantity: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item +"/s");
        System.out.println("The total price is: " + total);

        scanner.close();

    }
}