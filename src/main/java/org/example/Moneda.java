package org.example;

public class Moneda {
    protected double precio;
    protected double volumen;
    protected String nombre;

    public Moneda() {

    }

    public Moneda(double precio, double volumen, String nombre) {
        this.precio = precio;
        this.volumen = volumen;
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + ": " + precio + " USD, " + volumen + " M.";
    }
}
