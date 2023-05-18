package com.thread.ticketcounter;

public class TicketCounter {

  private int availableSeats = 10;

  public synchronized void bookSeats(String pname, int seats) {

    if (availableSeats >= seats && seats > 0) {
      availableSeats = availableSeats - seats;
      System.out.println("Hello " + pname + " your seat booked successfully");
      System.out.println("Seats left:" + availableSeats);
    } else {
      System.out.println(pname + "Please select Available seats only");
      System.out.println("Seats left:" + availableSeats);
    }

  }
}
