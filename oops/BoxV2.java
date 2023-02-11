package oops;
public class BoxV2 {
    // fields
    private double w, h, d;

    // Constructor
    public BoxV2(double w, double h, double d) {
        setW(w);
        this.h = h;
        this.d = d;
    }

    // Default constructor
    public BoxV2() {
        
    }

    // getter setter
    public void setW(double w) {
        if (w > 0.0d) {
            this.w = w;
        } else {
            throw new IllegalArgumentException("w dould more than h");
        }
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double volumn() {
        return w * h * d;
    }

    public double surfaceArea() {
        return (2.0 * w * h) + (2.0 * w * h) + (2.0 * d * h);
    }
}
