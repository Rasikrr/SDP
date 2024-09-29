package TicketBooking;

public interface TicketBuilder {
    void setMovieName(String name);
    void setSeatNumber(String seatNumber);
    void setSnackCombo(String snackCombo);
    Ticket build();
}
