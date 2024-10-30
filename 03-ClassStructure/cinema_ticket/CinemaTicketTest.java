package cinema_ticket;

public class CinemaTicketTest {
    public static void main(String[] args) {
        CinemaTicket first_ticket = new CinemaTicket(2,4);
        CinemaTicket second_ticket = new CinemaTicket(7,5);

        System.out.println(first_ticket.display());
        System.out.println(second_ticket.display());
    }
}
