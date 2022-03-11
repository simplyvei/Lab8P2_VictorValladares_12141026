package lab8p2_victorvalladares_12141026;

import java.awt.Color;

public class Carro {
    private String nombre;
    private int numero;
    private Color color;
    private int distancia;

    public Carro() {
    }

    public Carro(String nombre, int numero, Color color, int distancia) {
        this.nombre = nombre;
        this.numero = numero;
        this.color = color;
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
