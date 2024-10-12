package assignment_1.Movies;

public class RegularMovieFactory extends MovieFactory{

    @Override
    public Movie createMovie(String name) {
        return new RegularMovie(name);
    }
}
