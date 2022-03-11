package lab8p2_victorvalladares_12141026;

import java.awt.Color;
import java.io.Serializable;

public class Carro implements Serializable{
    private String nombre;
    private int numero;
    private Color color;
    private int distancia;
    private String tipo;

    private static final long SerialVersionUID=777L;
    
    public Carro() {
    }

    public Carro(String nombre, int numero, Color color, String tipo) {
        this.nombre = nombre;
        this.numero = numero;
        this.color = color;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "No. "+ numero+ " "+nombre;
    }
    
}
