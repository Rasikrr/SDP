
# Design Patterns in Java

This project demonstrates the implementation of 10 design patterns in Java. Each pattern is placed in its own package, and all the main classes and interfaces are separated into individual files for better structure. 

## Design Patterns Implemented:
1. **Strategy Pattern**: A flexible payment processing system that can switch between different payment methods (e.g., CreditCard, PayPal, Crypto).
   - **Package**: `StrategyPattern`
   - **Classes**: `PaymentStrategy`, `CreditCardPayment`, `PayPalPayment`, `CryptoPayment`, `ShoppingCart`

2. **Observer Pattern**: A weather monitoring system that notifies display units when weather data changes.
   - **Package**: `ObserverPattern`
   - **Classes**: `Observer`, `WeatherStation`, `CurrentConditionsDisplay`

3. **Command Pattern**: A remote control system that sends commands to various devices (e.g., lights).
   - **Package**: `CommandPattern`
   - **Classes**: `Command`, `Light`, `LightOnCommand`, `RemoteControl`

4. **State Pattern**: An order processing system where each order changes its state (e.g., New, Paid, Shipped).
   - **Package**: `StatePattern`
   - **Classes**: `OrderState`, `NewOrder`, `PaidOrder`, `ShippedOrder`, `DeliveredOrder`, `Order`

5. **Chain of Responsibility Pattern**: An expense approval system where requests pass through a chain of approvers (e.g., TeamLead, Manager, Director).
   - **Package**: `ChainOfResponsibilityPattern`
   - **Classes**: `Approver`, `TeamLead`, `Manager`, `Director`

6. **Mediator Pattern**: A chat room system where users communicate through a mediator.
   - **Package**: `MediatorPattern`
   - **Classes**: `ChatMediator`, `ChatRoom`, `User`, `RegularUser`

7. **Memento Pattern**: A document version control system that allows users to save and restore document versions.
   - **Package**: `MementoPattern`
   - **Classes**: `Document`, `DocumentMemento`, `VersionControl`

8. **Visitor Pattern**: A system to calculate the area of various shapes using the visitor pattern.
   - **Package**: `VisitorPattern`
   - **Classes**: `Shape`, `Circle`, `Rectangle`, `Visitor`, `AreaCalculator`

9. **Template Method Pattern**: A report generation system that allows different formats (e.g., PDF, HTML) using a template method.
   - **Package**: `TemplateMethodPattern`
   - **Classes**: `ReportGenerator`, `PDFReportGenerator`

10. **Iterator Pattern**: A playlist system that allows traversal of songs using different iterators.
   - **Package**: `IteratorPattern`
   - **Classes**: `Playlist`, `Song`

## How to Run:
- All pattern implementations are demonstrated in the `Main.java` file, located in the root directory.
- Simply compile and run the `Main.java` file to see examples of all 10 design patterns in action.

## Project Structure:
- Each design pattern is placed in its own package.
- The classes and interfaces related to each pattern are split into separate files for modularity.
- Example usage for each pattern is provided in `Main.java`.

## Example Usage:
```java
public class Main {
    public static void main(String[] args) {
        // Strategy Pattern Example
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100);

        // More examples for other patterns...
    }
}
```

## Requirements:
- JDK 8 or above

## License:
This project is provided under the MIT License.
