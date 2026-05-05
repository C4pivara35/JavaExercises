import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        var option = -1;

        do {
            System.out.println("============================");
            System.out.println("== Escolha uma das opções ==");
            System.out.println("============================");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar shampoo da máquina");
            System.out.println("6 - Verificar pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");
            System.out.println("============================");
            System.out.print("Opção: ");

            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1 -> takeAShower();
                case 2 -> addWater();
                case 3 -> addShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> removePetFromMachine();
                case 9 -> washMachine();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (option != 0);
    }

    public static void takeAShower() {
        petMachine.takeAShower();
    }

    public static void addWater() {
        petMachine.addWater();
        System.out.println("Água atual da máquina: " + petMachine.getWater());
    }

    public static void addShampoo() {
        petMachine.addShampoo();
        System.out.println("Shampoo atual da máquina: " + petMachine.getShampoo());
    }

    public static void verifyWater() {
        System.out.println("Quantidade de água na máquina: " + petMachine.getWater());
    }

    public static void verifyShampoo() {
        System.out.println("Quantidade de shampoo na máquina: " + petMachine.getShampoo());
    }

    public static void checkPetInMachine() {
        if (petMachine.hasPet()) {
            System.out.println("Existe um pet na máquina.");
        } else {
            System.out.println("Não existe pet na máquina.");
        }
    }

    public static void setPetInPetMachine() {
        var name = "";

        while (name == null || name.isEmpty()) {
            System.out.print("Digite o nome do pet: ");
            name = scanner.nextLine();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
    }

    public static void removePetFromMachine() {
        petMachine.removePet();
    }

    public static void washMachine() {
        petMachine.washMachine();
    }
}