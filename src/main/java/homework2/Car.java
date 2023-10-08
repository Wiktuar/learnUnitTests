package homework2;

public class Car extends Vehicle {

    public Car(String company, String model, int yearRelease) {
        super(company, model, yearRelease, 4, 0);
    }

    @Override
    public void testDrive() {
        this.setSpeed(60);
    }

    @Override
    public void park() {
        this.setSpeed(0);
    }

    public String toString() {
        return String.format("This car from %s, model %s and produced in %s.", this.getCompany(), this.getModel(), this.getYearRelease());
    }
}
