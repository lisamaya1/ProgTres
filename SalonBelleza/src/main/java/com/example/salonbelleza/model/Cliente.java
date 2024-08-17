package com.example.salonbelleza.model;

import javafx.scene.control.Button;

import java.util.Date;

public class Cliente {
    private String nombre;
    private Button servicio;
    private String telefono;
    private Date fecha;

    public Cliente(String nombre, Button servicio, String telefono, Date fecha) {
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

    public Button getServicio() {
        return servicio;
    }

    public void setServicio(Button servicio) {
        this.servicio = servicio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
