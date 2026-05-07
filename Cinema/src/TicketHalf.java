public non-sealed abstract class TicketHalf extends Ticket {

    public TicketHalf(String name, int price, boolean dubbing) {
        super(name, price, dubbing);
    }

    @Override
    public double getRealPrice() {
        return (double) getPrice() / 2;
    }

}
