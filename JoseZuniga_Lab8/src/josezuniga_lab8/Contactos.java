package josezuniga_lab8;

public class Contactos {
    private String nombre, correo, direccion;
    private int edad, numero;

    public Contactos() {
    }

    public Contactos(String nombre, String correo, String direccion, int edad, int numero) {
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.edad = edad;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return nombre + ": " + numero;
    }
}