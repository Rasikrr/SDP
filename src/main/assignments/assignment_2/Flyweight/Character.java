package assignment_2.Flyweight;

public class Character {
    private char symbol;
    private String font;
    private int size;

    public Character(char symbol, String font, int size) {
        this.symbol = symbol;
        this.font = font;
        this.size = size;
    }

    public void display(int positionX, int positionY) {
        System.out.println("Displaying '" + symbol + "' at (" + positionX + "," + positionY + ") with font " + font + " and size " + size);
    }
}
