package lab8p2_victorvalladares_12141026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class hiloTabla extends Thread{
    Random r = new Random();
    
    private ArrayList <Carro> listaCarros = new ArrayList();
    private JTable tabla;
    private int distancia;
    private boolean avanzar;
    private boolean vive;

    public hiloTabla(ArrayList <Carro> listaCarros, JTable tabla, int distancia) {
        this.distancia = distancia;
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
                
                for (Carro c : listaCarros){
                    if (c.getTipo().equalsIgnoreCase("McQueen")){
                        int r1 = r.nextInt(190)+30;
                        c.setDistancia(c.getDistancia() + r1);
                    }else if (c.getTipo().equalsIgnoreCase("Convertible")){
                        int r2 = r.nextInt(200)+20;
                        c.setDistancia(c.getDistancia() + r2);
                    }else if (c.getTipo().equalsIgnoreCase("Nascar")){
                        int r3 = r.nextInt(180)+40;
                        c.setDistancia(c.getDistancia() + r3);
                    }
                }
        
                Collections.sort(listaCarros, new Comparator<Carro>() {
                     @Override
                     public int compare(Carro e1, Carro e2) {
                        return new Integer(e2.getDistancia()).compareTo(new Integer(e1.getDistancia())); 
                     }
                });
                DefaultTableModel modelo
                                = (DefaultTableModel) tabla.getModel();
                modelo.setRowCount(0);
                tabla.setModel(modelo);
                for (Carro carros : listaCarros){
                    Object[] newrow = {
                        carros.getNumero(),
                        carros.getNombre(),
                        carros.getDistancia()
                    };  
                    modelo.addRow(newrow);
                    tabla.setModel(modelo);
                }
                
                for (Carro c : listaCarros){
                    if (c.getDistancia() >= distancia){
                        vive = false;
                        JOptionPane.showMessageDialog(null, "Ha ganado " + c.getNombre());
                        break;
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
