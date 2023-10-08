package homework2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public Vehicle(String company, String model, int yearRelease, int numWheels, int speed) {
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
        this.numWheels = numWheels;
        this.speed = speed;
    }

    public abstract void testDrive();

    public abstract void park();
}
