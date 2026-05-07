public non-sealed abstract class TicketFamily extends Ticket {

    protected int familyMembers;

    public TicketFamily(String name, int price, boolean dubbing, int familyMembers) {
        super(name, price, dubbing);
        this.familyMembers = familyMembers;
    }

    public double getRealPrice() {
        double total = getPrice() * familyMembers;

        if (familyMembers > 3) {
            total -= total * 0.05;
        }

        return total;
    }

    public int getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(int familyMembers) {
        this.familyMembers = familyMembers;
    }
}
