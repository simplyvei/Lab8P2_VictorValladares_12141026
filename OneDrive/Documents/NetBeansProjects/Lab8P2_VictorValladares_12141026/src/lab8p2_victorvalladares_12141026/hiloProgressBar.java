package lab8p2_victorvalladares_12141026;

import javax.swing.JProgressBar;

public class hiloProgressBar extends Thread{
    private JProgressBar progressbar;
    private Carro carro;
    private boolean avanzar;
    private boolean vive;

    public hiloProgressBar(JProgressBar progress_bar, Carro carro) {
        this.progressbar = progress_bar;
        this.carro = carro;
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
        while (vive) {
            if (avanzar) {
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
