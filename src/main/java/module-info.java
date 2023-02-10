module com.example.memorygame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.memorygame to javafx.fxml;
    exports com.example.memorygame;
}