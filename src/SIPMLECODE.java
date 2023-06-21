import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class SIPMLECODE {
    public static void main(String[] args) {
        Date startDate = new Date();
        Date endDate = new Date(System.currentTimeMillis() + 86400000); // Adding one day to the start date
        Reservation reservation = new Reservation("R001", startDate, endDate, 2);

        System.out.println("Reservation ID: " + reservation.getReservationId());
        System.out.println("Start Date: " + reservation.getStartDate());
        System.out.println("End Date: " + reservation.getEndDate());
        System.out.println("Number of Guests: " + reservation.getNumberOfGuests());
        System.out.println("Reservation Confirmed? " + reservation.isConfirmed());

        reservation.confirmReservation();

        System.out.println("Reservation Confirmed? " + reservation.isConfirmed());

        reservation.cancelReservation();

        System.out.println("Reservation Confirmed? " + reservation.isConfirmed());
    }
}
class Reservation {
     String reservationId;
     Date startDate;
     Date endDate;
     int numberOfGuests;
     boolean isConfirmed;

    public Reservation(String reservationId, Date startDate, Date endDate, int numberOfGuests) {
        this.reservationId = reservationId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.numberOfGuests = numberOfGuests;
        this.isConfirmed = false;
    }

    public String getReservationId() {
        return reservationId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void confirmReservation() {
        isConfirmed = true;
        System.out.println("Reservation confirmed.");
    }

    public void cancelReservation() {
        isConfirmed = false;
        System.out.println("Reservation cancelled.");
    }

    // Additional methods and behaviors
}



