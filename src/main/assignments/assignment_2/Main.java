package assignment_2;

import assignment_2.Adapter.AudioAdapter;
import assignment_2.Adapter.AudioPlayer;
import assignment_2.Adapter.MP3Player;
import assignment_2.Bridge.*;
import assignment_2.Composite.Menu;
import assignment_2.Composite.MenuComponent;
import assignment_2.Composite.MenuItem;
import assignment_2.Decorator.*;
import assignment_2.Facade.*;
import assignment_2.Flyweight.CharacterFactory;
import assignment_2.Flyweight.TextEditor;

public class Main{
    public static void main(String[] args) {
        // Adapter
        AudioPlayer audioPlayer = new MP3Player();

        audioPlayer.play("mp3", "song1.mp3");
        audioPlayer.play("wav", "song2.wav");

        AudioPlayer audioAdapter = new AudioAdapter("wav");
        audioAdapter.play("wav", "song2.wav");

        AudioPlayer audioAdapter2 = new AudioAdapter("aac");
        audioAdapter2.play("aac", "song3.aac");

        // Bridge

        Device tv = new TVDevice();
        Device dvd = new DVDDevice();

        RemoteControl basicRemote = new BasicRemote(tv);
        basicRemote.powerButton();
        basicRemote.setChannel(5);
        basicRemote.setVolume(20);

        RemoteControl advancedRemote = new AdvancedRemote(dvd);
        advancedRemote.powerButton();
        advancedRemote.setVolume(15);
        ((AdvancedRemote) advancedRemote).mute();

        // Composite
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Morning delights");
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Afternoon meals");
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Evening meals");

        MenuComponent allMenus = new Menu("All Menus", "All available menus");
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);

        breakfastMenu.add(new MenuItem("Pancakes", "Fluffy pancakes with syrup", 5.99));
        lunchMenu.add(new MenuItem("Burger", "Cheeseburger with fries", 9.99));
        dinnerMenu.add(new MenuItem("Steak", "Grilled steak with vegetables", 19.99));

        allMenus.print();

        // Decorator
        Pizza pizza = new MargheritaPizza();
        System.out.println(pizza.getDescription() + " $" + pizza.getCost());

        Pizza cheesePizza = new CheeseTopping(pizza);
        System.out.println(cheesePizza.getDescription() + " $" + cheesePizza.getCost());

        Pizza fullyLoadedPizza = new PepperoniTopping(new MushroomTopping(new CheeseTopping(new VegetarianPizza())));
        System.out.println(fullyLoadedPizza.getDescription() + " $" + fullyLoadedPizza.getCost());

        // Facade
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        SecuritySystem securitySystem = new SecuritySystem();
        EntertainmentSystem entertainmentSystem = new EntertainmentSystem();

        SmartHomeFacade smartHome = new SmartHomeFacade(light, thermostat, securitySystem, entertainmentSystem);

        smartHome.arriveHome();
        smartHome.movieMode();
        smartHome.leaveHome();

        // Flyweight
        CharacterFactory factory = new CharacterFactory();
        TextEditor editor = new TextEditor(factory);

        editor.insert('H', "Arial", 12, 0, 0);
        editor.insert('e', "Arial", 12, 1, 0);
        editor.insert('l', "Arial", 12, 2, 0);
        editor.insert('l', "Arial", 12, 3, 0);
        editor.insert('o', "Arial", 12, 4, 0);

        editor.render();
    }
}
