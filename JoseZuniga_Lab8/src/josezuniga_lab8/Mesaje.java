package josezuniga_lab8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Mesaje {
    private String emisor, receptor, contenido,fecha;

    public Mesaje() {
    }

    public Mesaje(String emisor, String receptor, String contenido) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.contenido = contenido;
        setFecha();
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

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha() {
        SimpleDateFormat sr  = new SimpleDateFormat("MM/dd/yyyy");
        this.fecha = sr.format(new Date());
    }
}
