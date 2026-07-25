module com.example.quickfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.quickfx to javafx.fxml;
    exports com.example.quickfx;
}