package com.thread.booktickets;

import com.thread.ticketcounter.TicketCounter;

public class BookTickets extends Thread {
  private final TicketCounter ticketCounter;
  private final String passengerName;
  private final int noOfSeatsBook;

  public BookTickets(TicketCounter ticketCounter, String passengerName, int noOfSeatsBook) {
    this.ticketCounter = ticketCounter;
    this.passengerName = passengerName;
    this.noOfSeatsBook = noOfSeatsBook;

  }

  @Override
  public void run() {
    ticketCounter.bookSeats(passengerName, noOfSeatsBook);
  }
}
