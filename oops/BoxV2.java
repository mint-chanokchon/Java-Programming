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

    // setter
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

    // getter
    public double getW() {
        return this.w;
    }

    public double volumn() {
        return w * h * d;
    }

    public double surfaceArea() {
        return (2.0 * w * h) + (2.0 * w * h) + (2.0 * d * h);
    }

    // ฬนภาษา Java ทุก ๆ class จะมี method toString ซึ่งอนุญาติให้เขียนทับได้
    @Override // annotation เป็นส่วนที่บอกรายละเอียดเพิ่มเติมให้กับ Complier ของ code ถัดจากนี้
    public String toString() {
        return String.format("width= %.2f, height = %.2f, depth = %.2f", w, h, d);
    }
}
