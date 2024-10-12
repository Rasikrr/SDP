package assignment_2.Flyweight;

import java.util.HashMap;

public class CharacterFactory {
    private HashMap<CharacterKey, Character> characterMap = new HashMap<>();

    public Character getCharacter(char symbol, String font, int size) {
        CharacterKey key = new CharacterKey(symbol, font, size);
        Character character = characterMap.get(key);

        if (character == null) {
            character = new Character(symbol, font, size);
            characterMap.put(key, character);
        }

        return character;
    }
}
