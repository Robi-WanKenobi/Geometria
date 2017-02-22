package Geometria;

/**
 * Created by Roberto on 22/02/2017.
 */
public class Circle implements Figura {

    private double r;

    public Circle (double r){

        this.r = r;
    }

    public double area() {

        return ((Math.PI)*(Math.pow(r,2)));
    }
}
