module com.example.projectg {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projectg to javafx.fxml;
    exports com.example.projectg;
}