package oops;

public class Ragtangle {
    private double length;
    private double breadth;

    public Ragtangle() {
        this.length = 1;
        this.breadth = 1;
    }

    public Ragtangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        if (breadth >= 0) {
            this.breadth = breadth;
        } else {
            this.breadth = 0;
        }
    }

    public double area() {
        return getLength() * getBreadth();
    }

    public boolean isSquare() {
        return getLength() == getBreadth();
    }

}
