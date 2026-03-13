package org.modelo.ejercicio_1;

import java.util.Date;

// T representa datos extra que puede llevar la tarea (adjunto, responsable)
public class Tarea<T> {
    private String descripcion;
    private int prioridad;
    private Date fechaVencimiento;
    private T datos;

    public Tarea(String descripcion, int prioridad, Date fechaVencimiento, T datos) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
        this.datos = datos;
    }

    public String getDescripcion()      { return descripcion; }
    public int getPrioridad()           { return prioridad; }
    public Date getFechaVencimiento()   { return fechaVencimiento; }
    public T getDatos()                 { return datos; }

    @Override
    public String toString() {
        return String.format("Tarea[%s | Prioridad: %d | Vence: %tF | Datos: %s]",
                descripcion, prioridad, fechaVencimiento, datos);
    }
}