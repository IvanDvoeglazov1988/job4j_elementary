package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To5Then10() {
        int left = 10;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To15To20Then20() {
        int one = 10;
        int two = 15;
        int three = 20;
        int result = Max.max(one, two, three);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10To15To20To40Then40() {
        int one = 10;
        int two = 15;
        int three = 20;
        int four = 40;
        int result = Max.max(one, two, three, four);
        int expected = 40;
        assertThat(result).isEqualTo(expected);
    }
}