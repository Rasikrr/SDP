
# Cinema Management System

## Description
**Cinema Management System** is a cinema management system developed using Java, applying various creational design patterns. The system supports movie management, ticket booking, scheduling, and user interface customization.

This project demonstrates the use of five creational design patterns:

1. **Singleton Pattern** — for managing global system configurations (e.g., cinema name, number of screens).
2. **Factory Method Pattern** — for creating different types of movies (e.g., Regular, 3D, IMAX).
3. **Abstract Factory Pattern** — for generating user interface components with different themes.
4. **Builder Pattern** — for flexible construction of ticket booking objects.
5. **Prototype Pattern** — for managing and cloning movie schedules.

## Features
- **Movie Management**: Create and play different types of movies (regular, 3D, IMAX).
- **Ticket Booking**: Choose movies, seats, snacks, and generate booking tickets.
- **User Interface**: Dynamically generate UI components with different themes (dark and light).
- **Movie Scheduling**: Clone schedules to create new movie showtimes.
- **Cinema Configuration**: Set cinema parameters like name, number of screens, and working hours.

## Installation and Running

### Requirements
- **Java** 8 or above
- **Git** (to clone the repository)
- **Maven** (for dependency management)

### Steps to Install

1. Clone the repository:

    ```bash
    git clone https://github.com/Rasikrr/SDP.git
    ```

2. Navigate to the project directory:

    ```bash
    cd SDP
    ```

3. Build the project using Maven:

    ```bash
    mvn clean install
    ```

4. Run the project:

    ```bash
    mvn exec:java -Dexec.mainClass="Main"
    ```

## Example Usage

### Configuring the Cinema
```java
CinemaConfig cfg = CinemaConfig.getInstance();
cfg.setName("Festival Cinema");
cfg.setScreens(10);
cfg.setWorkHours("10 AM - 11 PM");
```

### Creating Movies
```java
MovieFactory movie3dFactory = new Movie3DFactory();
Movie joker2 = movie3dFactory.createMovie("Joker 2");
joker2.play();
```

### Creating UI Components
```java
UIFactory uiFactory = new DarkThemeFactory();
Button btn = uiFactory.createButton();
TextField txtField = uiFactory.createTextField();

btn.display();       // Displays dark theme button
txtField.display();  // Displays dark theme text field
```

### Booking a Ticket
```java
TicketBookingBuilder ticketBookingBuilder = new TicketBookingBuilder();

ticketBookingBuilder.setMovieName("Joker 2");
ticketBookingBuilder.setSeatNumber("2");
ticketBookingBuilder.setSnackCombo("Chips, Coca-cola");
Ticket ticket = ticketBookingBuilder.getResult();

System.out.println(ticket.getMovieName());
System.out.println(ticket.getSeatNumber());
System.out.println(ticket.getSnackCombo());
```

### Managing Movie Schedules
```java
StandardSchedule schedule = new StandardSchedule("Joker 2", "3 AM - 5 AM");
StandardSchedule scheduleClone = schedule.clone();
scheduleClone.setMovieName("Blade");

System.out.println(schedule);  // Original schedule
System.out.println(scheduleClone);  // Cloned schedule with new movie
```

## Technologies
- **Java** — Primary programming language
- **Maven** — For dependency management and project build
- **Lombok** — For code generation (getters, setters) and simplification

## Design Patterns
This project implements the following design patterns:
- **Singleton** — For managing global cinema configurations.
- **Factory Method** — For creating different types of movies.
- **Abstract Factory** — For generating user interface components with different themes.
- **Builder** — For flexible ticket booking creation.
- **Prototype** — For cloning and modifying movie schedules.

## Contribution
If you'd like to contribute to the project, feel free to fork the repository, make changes, and submit a pull request.

## License
This project is licensed under the MIT License. See the `LICENSE` file for more details.