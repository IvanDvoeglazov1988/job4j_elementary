package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterrTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counterr.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEventNumbersFromSixToThen24() {
        int start = 6;
        int finish = 10;
        int resul = Counterr.sumByEven(start, finish);
        int expected = 24;
        assertThat(resul).isEqualTo(expected);
    }
}