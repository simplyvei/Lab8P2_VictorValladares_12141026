package lab8p2_victorvalladares_12141026;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JTable;

public class hiloTabla extends Thread{
    Random r = new Random();
    
    private ArrayList <Carro> listaCarros = new ArrayList();
    private JTable tabla;
    private boolean avanzar;
    private boolean vive;

    public hiloTabla(ArrayList <Carro> listaCarros, JTable tabla) {
        this.tabla = tabla;
        this.listaCarros = listaCarros;
        avanzar = true;
        vive = true;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                int r1 = r.nextInt(190)+30;
                int r2 = r.nextInt(200)+20;
                int r3 = r.nextInt(180)+40;
                for (Carro c : listaCarros){
                    if (c.getTipo().equalsIgnoreCase("McQueen")){
                        c.setDistancia(c.getDistancia() + r1);
                    }else if (c.getTipo().equalsIgnoreCase("Convertible")){
                        c.setDistancia(c.getDistancia() + r2);
                    }else if (c.getTipo().equalsIgnoreCase("Nascar")){
                        c.setDistancia(c.getDistancia() + r3);
                    }
                }
                
                
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }
    
}
