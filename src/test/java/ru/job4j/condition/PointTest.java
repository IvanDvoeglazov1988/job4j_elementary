package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point pointOne = new Point(0, 0);
        Point pointTwo = new Point(2, 0);
        double expected = 2;
        double out = pointOne.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to11then1() {
        Point pointOne = new Point(1, 0);
        Point pointTwo = new Point(1, 1);
        double expected = 1;
        double out = pointOne.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to22then2() {
        Point pointOne = new Point(2, 0);
        Point pointTwo = new Point(2, 2);
        double expected = 2;
        double out = pointOne.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05to34then2() {
        Point pointOne = new Point(0, 2);
        Point pointTwo = new Point(2, 2);
        double expected = 2;
        double out = pointOne.distance(pointTwo);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3D05to34then2() {
        Point pointOne = new Point(0, 2, 2);
        Point pointThree = new Point(2, 2, 2);
        double expected = 2;
        double out = pointOne.distance3d(pointThree);
        Assert.assertEquals(expected, out, 0.01);
    }

}