package com.example.salonbelleza.controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import com.example.salonbelleza.model.Cliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import javax.swing.*;
import javax.swing.text.Element;

public class ClienteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgendarCita;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextArea txtResultado;

    @FXML
    private TextField txtTelefono;


    @FXML
    private ComboBox<String> btnServicio;


    @FXML
    private DatePicker btnfecha;

    private List<Cliente> listaClientes = new ArrayList<>(); // Lista para guardar los clientes



    @FXML
    void initialize() {

        ObservableList<String> options = FXCollections.observableArrayList(
                "Acrílicas",
                "Press on",
                "Semipermanente"
        );
        btnServicio.setItems(options);
    }

    public void onAgendar(ActionEvent actionEvent) {

        String nombre = txtNombre.getText();
        String telefono = txtTelefono.getText();
        String servicio = btnServicio.getValue();
        LocalDate fecha = btnfecha.getValue();

        if (nombre.isEmpty() || telefono.isEmpty() || servicio == null || fecha == null) {
            txtResultado.setText("Por favor, completa todos los campos antes de agendar la cita.");
            return;
        }


        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setTelefono(telefono);
        cliente.setServicio(servicio);
        cliente.setFecha(fecha);

        listaClientes.add(cliente);  // Guardar el cliente en la lista


        StringBuilder resultado = new StringBuilder("Citas agendadas:\n");
        for (Cliente c : listaClientes) {
            resultado.append("Nombre: ").append(c.getNombre())
                    .append("\nTeléfono: ").append(c.getTelefono())
                    .append("\nServicio: ").append(c.getServicio())
                    .append("\nFecha: ").append(c.getFecha())
                    .append("\n-----------------------------\n");
        }
        txtResultado.setText(resultado.toString());

        txtNombre.clear();
        txtTelefono.clear();
        btnServicio.setValue(null);
        btnfecha.setValue(null);
    }

    public void onServicio(ActionEvent actionEvent) {
        String servicioSeleccionado = btnServicio.getValue();
        System.out.println("Servicio seleccionado: " + servicioSeleccionado);
    }



    public void onfecha(ActionEvent actionEvent) {
    }
}

