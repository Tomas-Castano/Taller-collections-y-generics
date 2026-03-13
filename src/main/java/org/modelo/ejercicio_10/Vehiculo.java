package org.modelo.ejercicio_10;

//Profe en el taller de generics y collections se saltó el ejercicio 9
public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private double precioPorDia;

    public Vehiculo(String marca, String modelo, double precioPorDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioPorDia = precioPorDia;
    }

    public abstract void alquilar();
 
    // Información base reutilizable por las subclases
    protected String infoBase() {
        return marca + " " + modelo + " — $" + precioPorDia + "/día";
    }
 
    @Override
    public String toString() {
        return "[" + getClass().getSimpleName() + "] " + infoBase();
    }
}
