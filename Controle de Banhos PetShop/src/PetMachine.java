public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }

        if (this.water < 10) {
            System.out.println("A máquina não possui água suficiente para o banho.");
            return;
        }

        if (this.shampoo < 2) {
            System.out.println("A máquina não possui shampoo suficiente para o banho.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;

        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo.");
    }

    public void addWater() {
        if (this.water == 30) {
            System.out.println("A capacidade de água da máquina está cheia.");
            return;
        }

        water += 2;

        if (water > 30) {
            water = 30;
        }
    }

    public void addShampoo() {
        if (this.shampoo == 30) {
            System.out.println("A capacidade de shampoo da máquina está cheia.");
            return;
        }

        shampoo += 2;

        if (shampoo > 30) {
            shampoo = 30;
        }
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja. Para colocar o pet, é necessário limpá-la.");
            return;
        }

        if (hasPet()) {
            System.out.println("Já existe um pet na máquina neste momento.");
            return;
        }

        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

    public void removePet() {
        if (this.pet == null) {
            System.out.println("Não existe pet na máquina para retirar.");
            return;
        }

        this.clean = this.pet.isClean();

        if (this.pet.isClean()) {
            System.out.println("O pet " + pet.getName() + " foi retirado limpo da máquina.");
        } else {
            System.out.println("O pet " + pet.getName() + " foi retirado sujo da máquina.");
        }

        this.pet = null;
    }

    public void washMachine() {
        if (this.clean) {
            System.out.println("A máquina já está limpa.");
            return;
        }

        if (this.water < 10) {
            System.out.println("A máquina não possui água suficiente para limpeza.");
            return;
        }

        if (this.shampoo < 2) {
            System.out.println("A máquina não possui shampoo suficiente para limpeza.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;

        System.out.println("A máquina está limpa.");
    }
}