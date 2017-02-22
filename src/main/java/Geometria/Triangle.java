package Geometria;

/**
 * Created by Roberto on 22/02/2017.
 */
public class Triangle implements Figura {

    private double b, h;

    public Triangle (double b, double h){

        this.b = b;
        this.h = h;
    }

    public double area(){
        return ((this.b*this.h)/2);
    }
}
