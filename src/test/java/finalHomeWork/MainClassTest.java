package finalHomeWork;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainClassTest {

    @ParameterizedTest
    @CsvSource({
            "15.25, 15.25, Средние значения списков равны",
            "17.38, 16.38, Первый список имеет большее среднее значение",
            "9.54, 10.34, Второй список имеет большее среднее значение"
    })
    void compareAverageTest(double d1, double d2, String result){ ;
        assertEquals(MainClass.compareAverage(d1, d2), result);
    }
}
