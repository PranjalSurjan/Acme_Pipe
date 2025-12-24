module ca.senecacollege.application.acme_pipe {
    requires javafx.controls;
    requires javafx.fxml;


    opens application.acme_pipe to javafx.fxml;
    exports application.acme_pipe;
}