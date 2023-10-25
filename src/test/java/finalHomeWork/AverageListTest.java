package finalHomeWork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageListTest {

    private AverageList averageList;

    @BeforeEach
    void create(){
        Integer[] array = {3, 7, 15};
        averageList = new AverageList(Arrays.asList(array));
    }

    @Test
    void  getAverageTest(){
        assertEquals(averageList.getAverage(), 8.33);
    }

}
