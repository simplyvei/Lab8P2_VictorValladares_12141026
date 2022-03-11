package lab8p2_victorvalladares_12141026;

import java.awt.Color;

public class Convertible extends Carro{

    public Convertible() {
        super();
    }

    public Convertible(String nombre, int numero, Color color) {
        super(nombre, numero, color);
    }

    public Convertible(String nombre, int numero, Color color, int distancia) {
        super(nombre, numero, color, distancia);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
