package com.example.salonbelleza.controller;

import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
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


    @FXML
    void initialize() {

        final DatePicker datePicker = new DatePicker();
        datePicker.setOnAction(new EventHandler() {
            public void handle(Event t) {
                LocalDate date = datePicker.getValue();
            }
        });


        ObservableList<String> options =
                FXCollections.observableArrayList(
                        "Acrílicas",
                        "Press on",
                        "Semipermanente"
                );
        btnServicio.getItems().addAll(options);
    }

    public void onAgendar(ActionEvent actionEvent) {
        Cliente cliente = new Cliente();
        cliente.setNombre(txtNombre.getText());
        cliente.setTelefono(txtTelefono.getText());
        cliente.setServicio((Button) btnServicio.getItems());
        cliente.setFecha((Date) btnfecha.getDayCellFactory());

    }

    public void onServicio(ActionEvent actionEvent) {

    }

    public void onfecha(ActionEvent actionEvent) {
    }
}

