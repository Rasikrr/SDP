package assignment_2.Facade;

public class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(Light light, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem) {
        this.light = light;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void leaveHome() {
        System.out.println("Leaving home...");
        light.turnOff();
        thermostat.setTemperature(18);
        securitySystem.arm();
    }

    public void arriveHome() {
        System.out.println("Arriving home...");
        light.turnOn();
        thermostat.setTemperature(22);
        securitySystem.disarm();
    }

    public void movieMode() {
        System.out.println("Movie mode activated...");
        light.turnOff();
        thermostat.setTemperature(20);
        entertainmentSystem.playMovie();
    }
}
