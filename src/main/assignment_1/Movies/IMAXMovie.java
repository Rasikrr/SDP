package Movies;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IMAXMovie implements Movie {
    private String name;

    public IMAXMovie(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.printf("Playing IMAXMovie... | Name: %s\n", name);
    }
}