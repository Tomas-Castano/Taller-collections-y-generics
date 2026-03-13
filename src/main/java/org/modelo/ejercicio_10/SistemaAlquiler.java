package org.modelo.ejercicio_10;

import java.util.List;

public class SistemaAlquiler {
    public static void alquilarVehiculo(List<? extends Vehiculo> vehiculos) {
        if (vehiculos == null || vehiculos.isEmpty()) {
            System.out.println("  (Sin vehículos disponibles en esta lista)");
            return;
        }

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.alquilar();
        }

    }
    
}
