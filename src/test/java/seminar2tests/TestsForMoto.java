package seminar2tests;

import homework2.Motorcycle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TestsForMoto {
    private static Motorcycle motorcycle;

    @BeforeAll
    static void createMoto(){
        motorcycle = new Motorcycle("Yamaha", "Speed Rapid", 2012);
    }

    @Test
    void quantityWheelsTest(){
        assertThat(motorcycle.getNumWheels(), equalTo(2));
    }

    @Test
    void testDriveSpeed(){
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed(), equalTo(75));
    }

    @Test
    void testParkSpeed(){
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed(), equalTo(0));
    }

}
