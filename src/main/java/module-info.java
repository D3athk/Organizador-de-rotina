module com.example.marcadorderotina {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.marcadorderotina to javafx.fxml;
    exports com.example.marcadorderotina;
}