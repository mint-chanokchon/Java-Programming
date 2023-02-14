package oops;

public class Circle {
    // properties
    public double radius;

    // behavior
    public double area() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    public double parameter() {
        return 2 * Math.PI * radius;
    }

    public double circleFerence() {
        return parameter();
    }
}
