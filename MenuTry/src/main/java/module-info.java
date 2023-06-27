module com.example.menutry {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.menutry to javafx.fxml;
    exports com.example.menutry;
}