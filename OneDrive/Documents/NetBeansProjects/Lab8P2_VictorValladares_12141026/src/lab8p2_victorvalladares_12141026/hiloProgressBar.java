package lab8p2_victorvalladares_12141026;

import java.util.ArrayList;
import javax.swing.JProgressBar;
import javax.swing.JTable;

public class hiloProgressBar extends Thread{
    private JProgressBar progressbar;
    private JTable carrera;
    private int distancia;
    private ArrayList <Carro> carros = new ArrayList();
    private boolean avanzar;
    private boolean vive;

    public hiloProgressBar(JProgressBar progress_bar, JTable tabla, ArrayList <Carro> carros, int distancia) {
        this.progressbar = progress_bar;
        this.carrera = tabla;
        this.distancia = distancia;
        this.carros = carros;
        avanzar = true;
        vive = true;
    }
    
    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run() {
        int pos = 0;
        progressbar.setMaximum(distancia);
        while (vive) {
            if (avanzar) {
                if (carrera.getSelectedRow() > 0){
                    pos = carrera.getSelectedRow() - 1;
                }
                Carro carro = carros.get(pos);
                progressbar.setBackground(carro.getColor());
                
                progressbar.setValue(progressbar.getValue() + carro.getDistancia());
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }

    }
}
