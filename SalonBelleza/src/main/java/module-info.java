module com.example.salonbelleza {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.salonbelleza to javafx.fxml;
    exports com.example.salonbelleza;
}