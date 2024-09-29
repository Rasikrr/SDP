import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CinemaConfig {
    private static CinemaConfig cfg;

    private String name;
    private int screens;
    private String workHours;

    private CinemaConfig(){}

    public static CinemaConfig getInstance(){
        if(cfg == null){
            cfg = new CinemaConfig();
        }
        return cfg;
    }
}
