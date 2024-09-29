package Schedule;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StandardSchedule implements MovieSchedule, Cloneable {
    private String movieName;
    private String time;

    public StandardSchedule(String movieTitle, String time) {
        this.movieName = movieTitle;
        this.time = time;
    }

    @Override
    public StandardSchedule clone() {
        try {
            return (StandardSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Failed to clone schedule");
        }
    }

    @Override
    public String toString() {
        return "Movie: " + movieName + ", Time: " + time;
    }

}
