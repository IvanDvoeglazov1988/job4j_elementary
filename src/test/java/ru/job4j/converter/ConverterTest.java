package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert200RblThen3dot3Dlr() {
        float in = 200;
        float expected = 3.3f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.1f;
        Assert.assertEquals(expected, out, eps);
    }
}