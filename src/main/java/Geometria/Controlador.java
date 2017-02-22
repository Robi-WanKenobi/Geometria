package Geometria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roberto on 22/02/2017.
 */
public class Controlador {

    private List<Figura> figuras;

    public Controlador(){

        figuras = new ArrayList<Figura>();
    }

    public void addFigura(Figura f){
        figuras.add(f);
    }

    public double sumarAreas(){
        double result = 0;
        for (Figura f : figuras){

            result += f.area();
        }
        return result;
    }
}
