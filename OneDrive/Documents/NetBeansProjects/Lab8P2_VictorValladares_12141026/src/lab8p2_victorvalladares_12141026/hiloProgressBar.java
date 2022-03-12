package lab8p2_victorvalladares_12141026;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JTable;

public class hiloProgressBar extends Thread{
    
    Random r = new Random();
    private JProgressBar progressbar;
    private JComboBox lista;
    private int distancia;
    private ArrayList <Carro> carros = new ArrayList();
    private boolean avanzar;
    private boolean vive;

    public hiloProgressBar(JProgressBar progress_bar, JComboBox carro, ArrayList <Carro> carros, int distancia) {
        this.progressbar = progress_bar;
        this.lista = carro;
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
                /*if (carrera.getSelectedRow() > 0){
                    pos = carrera.getSelectedRow() - 1;
                }
                Carro carro = carros.get(pos);*/
                Carro carro = (Carro) lista.getSelectedItem();
                
                progressbar.setBackground(Color.red);
                if (progressbar.getValue() == distancia){
                    vive = false;
                }else{
                    if (carro.getTipo().equalsIgnoreCase("McQueen")){
                        int r1 = r.nextInt(190)+30;
                        progressbar.setValue(progressbar.getValue()+r1);
                    }else if (carro.getTipo().equalsIgnoreCase("Convertible")){
                        int r2 = r.nextInt(200)+20;
                        progressbar.setValue(progressbar.getValue()+r2);
                    }else if (carro.getTipo().equalsIgnoreCase("Nascar")){
                        int r3 = r.nextInt(180)+40;
                        progressbar.setValue(progressbar.getValue()+r3);
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
