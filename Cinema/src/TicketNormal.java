public final class TicketNormal extends Ticket {

    public TicketNormal(String name, int price, boolean dubbing) {
        super(name, price, dubbing);
    }

    @Override
    public double getRealPrice() {
        return getPrice();
    }
}