package josezuniga_lab8;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class HiloLlamada implements Runnable {
    private JLabel label;
    private Llamadas llamada;
    private Date inicio;
    private boolean vive;
    private boolean reset;

    public HiloLlamada(JLabel label, Date inicio) {
        this.label = label;
        this.inicio = inicio;
        vive = true;
        reset = true;
    }

    public Llamadas getLlamada() {
        return llamada;
    }

    public void setLlamada(Llamadas llamada) {
        this.llamada = llamada;
    }
    
    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isReset() {
        return reset;
    }

    public void setReset(boolean reset) {
        this.reset = reset;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }
    
    @Override
    public void run() {
        int horas = 0;
        int minutos = 0;
        int segundos;
        while (vive) {
            long tiempo = new Date().getTime() - inicio.getTime() ;
            segundos = (int)tiempo / 1000;
            if (segundos >= 60) {
                segundos = 0;
                inicio = new Date();
                minutos++;
            }
            if (minutos >= 60) {
                minutos = 0;
                horas++;
            }
            String x = (horas + ":" + minutos + ":" + segundos);
            label.setText(x);
            llamada.setDuracion(x);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

