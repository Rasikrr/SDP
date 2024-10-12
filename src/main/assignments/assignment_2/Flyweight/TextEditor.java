package assignment_2.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<Character> characters = new ArrayList<>();
    private CharacterFactory characterFactory;

    public TextEditor(CharacterFactory factory) {
        this.characterFactory = factory;
    }

    public void insert(char symbol, String font, int size, int posX, int posY) {
        Character character = characterFactory.getCharacter(symbol, font, size);
        character.display(posX, posY);
        characters.add(character);
    }

    public void render() {
        // ну тут типо рендер
    }
}
