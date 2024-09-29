package TicketBooking;

import lombok.Getter;

@Getter
public class Ticket {
    private String movieName;
    private String seatNumber;
    private String snackCombo;

    public Ticket(String movieName, String seatNumber, String snackCombo){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.snackCombo = snackCombo;
    }
}
