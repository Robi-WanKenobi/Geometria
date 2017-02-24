package Geometria;

/**
 * Created by Roberto on 24/02/2017.
 */
public abstract class BasicFigura implements Figura, Comparable<Figura>{

    public int compareTo(Figura f) {
        int resultado = 0;
        if (this.area() < f.area()) {resultado = -1;}
        else if (this.area() > f.area()) {resultado = 1;}
        else {resultado = 0;}
        return resultado;
    }
}
