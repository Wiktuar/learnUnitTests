package seminar3tests;

import homework3.MainHW;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class MainHWTests {

    private MainHW mainHW;

    @BeforeEach
    void create(){
        mainHW = new MainHW();
    }

    @ParameterizedTest
    @CsvSource({
            "2, true",
            "3, false"
    })
    void testIsOdd(int n, boolean result){
        assertThat(mainHW.isOdd(n), is(result));
    }

    @ParameterizedTest
    @CsvSource({
            "88, true",
            "13, false"
    })
    void isInterval(int n, boolean result){
        assertThat(mainHW.isOdd(n), is(result));
    }
}
