package seminar2tests;

import homework2.Car;
import homework2.Vehicle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestsForCar {
    private static Car car;

    @BeforeAll
    static void createCar(){
        car = new Car("BMW", "X5 M50d", 2022);
    }

    @Test
    void trialTest(){
        assertTrue( car instanceof Vehicle);
    }

    @Test
    void quantityWheelsTest(){
        assertThat(car.getNumWheels(), equalTo(4));
    }

    @Test
    void testDriveSpeed(){
        car.testDrive();
        assertThat(car.getSpeed(), equalTo(60));
    }

    @Test
    void testParkSpeed(){
        car.testDrive();
        car.park();
        assertThat(car.getSpeed(), equalTo(0));
    }

}
