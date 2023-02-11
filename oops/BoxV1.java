package oops;

public class BoxV1 {
    public double w, h, d; 

    public double volumn() {
        return w * h * d;
    }

    public double surfaceArea() {
        return (2.0 * w * h) + (2.0 * w * h) + (2.0 * d * h);
    }
}
