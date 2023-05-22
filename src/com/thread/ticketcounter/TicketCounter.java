package com.thread.ticketcounter;

public class TicketCounter {

  private int availableSeats = 10;

  public synchronized void bookSeats(String passengerName, int seats) {

    if (availableSeats >= seats && seats > 0) {
      availableSeats = availableSeats - seats;
      System.out.println("Hello " + passengerName + " your seat booked successfully");
      System.out.println("Seats left after the booking:" + availableSeats);
    } else {
      System.out.println(passengerName + "Please select Available seats only");
      System.out.println("Seats left after the booking:" + availableSeats);
    }

  }
}
