module com.example.salonbelleza {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;


    opens com.example.salonbelleza to javafx.fxml;
    exports com.example.salonbelleza;
    opens com.example.salonbelleza.controller;
    exports com.example.salonbelleza.controller;

}