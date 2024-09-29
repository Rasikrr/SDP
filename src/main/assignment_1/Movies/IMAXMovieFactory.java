package Movies;

public class IMAXMovieFactory extends MovieFactory{
    @Override
    public Movie createMovie(String name) {
        return new IMAXMovie(name);
    }
}
