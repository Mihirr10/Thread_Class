import com.thread.booktickets.BookTickets;
import com.thread.ticketcounter.TicketCounter;

public class Main {
  public static void main(String[] args) {
    TicketCounter ticketCounter = new TicketCounter();
    BookTickets bookTickets1 = new BookTickets(ticketCounter, "Mihir", 2);
    BookTickets bookTickets2 = new BookTickets(ticketCounter, "Hardeek", 5);


    bookTickets1.start();
    bookTickets2.start();
  }
}