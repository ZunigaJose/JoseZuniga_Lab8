package josezuniga_lab8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Llamadas {
    private String duracion,emisor, receptor, fecha;

    public Llamadas() {
    }

    public Llamadas(String duracion, String emisor, String receptor) {
        this.duracion = duracion;
        this.emisor = emisor;
        this.receptor = receptor;
        setFecha();
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha() {
        SimpleDateFormat sr  = new SimpleDateFormat("MM/dd/yyyy");
        this.fecha = sr.format(new Date());
    }
}
