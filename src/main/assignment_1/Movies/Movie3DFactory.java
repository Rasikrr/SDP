package Movies;

public class Movie3DFactory extends MovieFactory{
    @Override
    public Movie createMovie(String name) {
        return new Movie3D(name);
    }
}
