package Geometria;

/**
 * Created by Roberto on 23/02/2017.
 */
public class Trapeze extends BasicFigura{

    double a, b, h;

    public Trapeze(double a, double b, double h){
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public Trapeze() {
    }

    public double area() {
        return (((a+b)*h)/2);
    }
}
