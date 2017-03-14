package Geometria;

/**
 * Created by Roberto on 22/02/2017.
 */
public class Circle extends BasicFigura {

    private double r;

    public Circle (double r){

        this.r = r;
    }

    public Circle() {
    }

    public double area() {

        return ((Math.PI)*(Math.pow(r,2)));
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
