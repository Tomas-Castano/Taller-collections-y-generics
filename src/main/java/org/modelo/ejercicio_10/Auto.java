package org.modelo.ejercicio_10;

public class Auto extends Vehiculo{
    private int numeroPasajeros;

    public Auto(String marca, String modelo, double precioPorDia, int numeroPasajeros) {
        super(marca, modelo, precioPorDia);
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public void alquilar() {
        System.out.println("Alquilando Auto: " + infoBase());
        ajustarAsientos();
    }
    
    public void ajustarAsientos() {
        System.out.println("Ajustando " + numeroPasajeros + " asientos para los pasajeros.");
    }

}
