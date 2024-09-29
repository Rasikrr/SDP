package TicketBooking;

public class TicketBookingBuilder implements TicketBuilder {

    private String name;
    private String seatNumber;
    private String snackCombo;

    @Override
    public void setMovieName(String name) {
        this.name = name;
    }

    @Override
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public void setSnackCombo(String snackCombo) {
        this.snackCombo = snackCombo;
    }

    @Override
    public Ticket build() {
        return new Ticket(name, seatNumber, snackCombo);
    }


}
