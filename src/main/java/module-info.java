module com.example.seproj1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.seproj1 to javafx.fxml;
    exports com.example.seproj1;
}