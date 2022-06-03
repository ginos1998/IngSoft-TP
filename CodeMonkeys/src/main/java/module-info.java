module com.example.codemonkeys {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codemonkeys to javafx.fxml;
    exports com.example.codemonkeys;
}