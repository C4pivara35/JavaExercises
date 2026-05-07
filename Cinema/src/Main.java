public class Main {
    public static void main(String[] args) {

        Ticket normalTicket = new TicketNormal("Cars", 50, true);

        Ticket halfTicket = new TicketHalf("Cars", 50, true) {
        };

        Ticket familyTicket = new TicketFamily("Avatar", 50, false, 4) {
        };

        printTicket(normalTicket);
        printTicket(halfTicket);
        printTicket(familyTicket);
    }

    public static void printTicket(Ticket ticket) {
        String className = ticket.getClass().getSimpleName();

        if (className.isEmpty()) {
            className = ticket.getClass().getSuperclass().getSimpleName();
        }

        System.out.printf("============%s============\n", className);
        ticket.showInfo();
        System.out.println("====================================");
    }
}