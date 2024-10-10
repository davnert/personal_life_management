module com.example.your_life {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.your_life to javafx.fxml;
    exports com.example.your_life;
}