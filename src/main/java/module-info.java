module com.example.samplegame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.samplegame to javafx.fxml;
    exports com.example.samplegame;
}