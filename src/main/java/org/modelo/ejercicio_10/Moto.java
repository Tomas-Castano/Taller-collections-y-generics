package org.modelo.ejercicio_10;

public class Moto extends Vehiculo{
    private String tipoMoto;

    public Moto(String marca, String modelo, double precioPorDia, String tipoMoto) {
        super(marca, modelo, precioPorDia);
        this.tipoMoto = tipoMoto;
    }

    @Override
    public void alquilar() {
        System.out.println("Alquilando Moto: " + infoBase());
        conducir();
    }

    public void conducir() {
        System.out.println("Conduciendo la moto de tipo: " + tipoMoto);
    }
}
