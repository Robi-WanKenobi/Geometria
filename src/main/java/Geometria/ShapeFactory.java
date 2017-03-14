package Geometria;

/**
 * Created by Roberto on 14/03/2017.
 */
public class ShapeFactory {

    public Figura getFigura(String figuraType){

        if (figuraType == null){
            return null;
        }
        else if (figuraType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if (figuraType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if (figuraType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        else if (figuraType.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }
        else if (figuraType.equalsIgnoreCase("TRAPEZE")){
            return new Trapeze();
        }
        else if (figuraType.equalsIgnoreCase("PENTAGON")){
            return new Pentagon();
        }
        return null;
    }
}
