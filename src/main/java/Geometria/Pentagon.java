package Geometria;

/**
 * Created by Roberto on 24/02/2017.
 */
public class Pentagon extends BasicFigura {

    double l, ap;

    public Pentagon(double l, double ap) {
        this.l = l;
        this.ap = ap;
    }

    public Pentagon() {
    }

    public double area() {
        return ((5*l*ap)/2);
    }
}
