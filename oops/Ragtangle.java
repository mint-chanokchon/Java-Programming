package oops;

public class Ragtangle {
    private double length;
    private double breadth;

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
