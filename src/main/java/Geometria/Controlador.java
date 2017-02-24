package Geometria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


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

    public List<Figura> getList() {
        return figuras;
    }

    public List<Figura> getListSorted(){
        Collections.sort(this.figuras, Collections.reverseOrder());
        return figuras;
    }

}
