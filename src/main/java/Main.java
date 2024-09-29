import Movies.Movie;
import Movies.Movie3DFactory;
import Movies.MovieFactory;
import Schedule.StandardSchedule;
import TicketBooking.Ticket;
import TicketBooking.TicketBookingBuilder;
import UserInterface.*;

public class Main {
    public static void main(String[] args) {
        CinemaConfig cfg = CinemaConfig.getInstance();
        cfg.setName("Festival cinema");
        cfg.setScreens(10);
        cfg.setWorkHours("10 AM - 11 PM");

        MovieFactory movie3dFactory = new Movie3DFactory();
        Movie joker2 = movie3dFactory.createMovie("Joker 2");
        joker2.play();

        UIFactory uiFactory = new DarkThemeFactory();
        Button btn = uiFactory.createButton();
        TextField txtField = uiFactory.createTextField();

        btn.display();
        txtField.display();

        TicketBookingBuilder ticketBookingBuilder = new TicketBookingBuilder();

        ticketBookingBuilder.setMovieName("Joker 2");
        ticketBookingBuilder.setSeatNumber("2");
        ticketBookingBuilder.setSnackCombo("Chips, Coca-cola");
        Ticket ticket = ticketBookingBuilder.getResult();

        System.out.println(ticket.getMovieName());
        System.out.println(ticket.getSeatNumber());
        System.out.println(ticket.getSnackCombo());

        StandardSchedule standardSchedule = new StandardSchedule("Joker 2", "3 AM - 5 AM");
        StandardSchedule standardSchedule2 = standardSchedule.clone();

        standardSchedule2.setMovieName("Blade");
        System.out.println(standardSchedule);
        System.out.println(standardSchedule2);


    }
}
