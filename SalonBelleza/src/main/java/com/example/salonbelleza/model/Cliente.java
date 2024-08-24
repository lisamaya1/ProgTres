package com.example.salonbelleza.model;

import java.time.LocalDate;

public class Cliente {
    private String nombre;
    private String servicio;
    private String telefono;
    private LocalDate fecha;

    public Cliente(String nombre, String servicio, String telefono, LocalDate fecha) {
        this.nombre = nombre;
        this.servicio = servicio;
        this.telefono = telefono;
        this.fecha = fecha;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
