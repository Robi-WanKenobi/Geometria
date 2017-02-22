package Geometria;


import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        Controlador miFiguras = new Controlador();

        Figura f1 = new Rectangle(4,3);
        Figura f2 = new Square(2);
        Figura f3 = new Circle(4);
        Figura f4 = new Triangle(2,6);

        miFiguras.addFigura(f1);
        miFiguras.addFigura(f2);
        miFiguras.addFigura(f3);
        miFiguras.addFigura(f4);

        double sumaDeAreas = miFiguras.sumarAreas();
        System.out.println("La suma total de las áreas es: " +sumaDeAreas);
    }
}
