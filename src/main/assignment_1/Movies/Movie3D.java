package Movies;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie3D implements Movie {
    private String name;

    public Movie3D(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.printf("Playing 3D movie... | Name: %s\n", name);
    }
}