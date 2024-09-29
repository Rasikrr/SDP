package Movies;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegularMovie implements Movie {

    private String name;

    public RegularMovie(String name){
        this.name = name;
    }

    public void play(){
        System.out.printf("Playing movie... | Name: %s\n", name);
    }

}
