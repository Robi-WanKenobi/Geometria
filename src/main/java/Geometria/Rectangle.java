package Geometria;

/**
 * Created by Roberto on 22/02/2017.
 */
public class Rectangle implements Figura{

    private double l1,l2;

    public Rectangle (double l1, double l2){

        this.l1 = l1;
        this.l2 = l2;
    }

    public double area(){
        return (this.l1*this.l2);
    }
}
