module lk.acpt.memorymanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.acpt.memorymanagement to javafx.fxml;
    exports lk.acpt.memorymanagement;
    exports lk.acpt.memorymanagement.Controller;
    opens lk.acpt.memorymanagement.Controller to javafx.fxml;
}