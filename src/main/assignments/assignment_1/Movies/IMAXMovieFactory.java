package assignment_1.Movies;

public class IMAXMovieFactory extends MovieFactory{
    @Override
    public Movie createMovie(String name) {
        return new IMAXMovie(name);
    }
}
