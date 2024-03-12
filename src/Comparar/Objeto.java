package apuntes;

import java.time.LocalDate;

public class Objeto {
    private String nombre;
    private int numero;
    private LocalDate fecha;
    private String ciudadDeOrigen;

    public Objeto(String nombre, int numero, LocalDate fecha, String ciudadDeOrigen) {
        this.nombre = nombre;
        this.numero = numero;
        this.fecha = fecha;
        this.ciudadDeOrigen = ciudadDeOrigen;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCiudadDeOrigen() {
        return ciudadDeOrigen;
    }

    public void setCiudadDeOrigen(String ciudadDeOrigen) {
        this.ciudadDeOrigen = ciudadDeOrigen;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", fecha=" + fecha +
                ", ciudadDeOrigen='" + ciudadDeOrigen + '\'' +
                '}';
    }
}