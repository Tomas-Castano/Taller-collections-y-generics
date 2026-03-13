package org.modelo.ejercicio_10;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String marca, String modelo, double precioPorDia, double capacidadCarga) {
        super(marca, modelo, precioPorDia);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void alquilar() {
        System.out.println("Alquilando Camión: " + infoBase());
        cargar();
    }

    public void cargar() {
        System.out.println("Cargando el camión con una capacidad de: " + capacidadCarga + " toneladas");
    }
    
}
