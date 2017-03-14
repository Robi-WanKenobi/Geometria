package Geometria;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.*;



public class App
{
    public static void main( String[] args )
    {
        BasicConfigurator.configure();
        final Logger log = Logger.getLogger("Main");
        Controlador miFiguras = new Controlador();
        ShapeFactory figureFactory = new ShapeFactory();

        miFiguras.addFigura(new Rectangle(4,3));
        miFiguras.addFigura(new Square(2));
        miFiguras.addFigura(new Circle(4));
        miFiguras.addFigura(new Triangle(2,6));
        miFiguras.addFigura(new Trapeze(3,4,2));
        miFiguras.addFigura(new Pentagon(2,4));
        Circle fcircle = (Circle) figureFactory.getFigura("circle");
        fcircle.setR(6);
        miFiguras.addFigura(fcircle);

        for (int i = 0; i<miFiguras.getList().size(); i++){
            System.out.println("Figura: " +miFiguras.getList().get(i).getClass().getSimpleName()+ " | Area: " +miFiguras.getList().get(i).area());
        }

        System.out.println("\nLa suma total de las áreas es: " +miFiguras.sumarAreas()+ "\n");

        log.info("Lista ordenada por áreas decrecientes:\n");
        for (int i = 0; i<miFiguras.getListSorted().size(); i++){
            System.out.println("Figura: " +miFiguras.getListSorted().get(i).getClass().getSimpleName()+
                    " | Area: " +miFiguras.getListSorted().get(i).area());
        }
    }
}
