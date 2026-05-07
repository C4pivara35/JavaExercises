public sealed abstract class Ticket permits TicketHalf, TicketFamily, TicketNormal {

    protected String name;
    protected int price;
    protected boolean dubbing;

    public Ticket(String name, int price, boolean dubbing) {
        this.name = name;
        this.price = price;
        this.dubbing = dubbing;
    }

    public double getRealPrice() {
        return price;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Dubbing: " + (dubbing ? "yes" : "no"));
        System.out.println("Final Price: " + getRealPrice());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isDubbing() {
        return dubbing;
    }

    public void setDubbing(boolean dubbing) {
        this.dubbing = dubbing;
    }
}
