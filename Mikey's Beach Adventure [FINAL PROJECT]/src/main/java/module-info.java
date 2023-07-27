module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media; // Add this line to include the 'javafx.media' module
    requires org.controlsfx.controls;
    requires com.almasb.fxgl.all;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}
