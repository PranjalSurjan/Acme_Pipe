module ca.senecacollege.application.acme_pipe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.acme_pipe to javafx.fxml;
    exports com.acme_pipe;
}