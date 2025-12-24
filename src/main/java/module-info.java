module ca.senecacollege.application.acme_pipe {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.acme_pipe to javafx.fxml;
    exports com.acme_pipe;
    exports com.acme_pipe.app;
    opens com.acme_pipe.app to javafx.fxml;
    exports com.acme_pipe.controllers;
    opens com.acme_pipe.controllers to javafx.fxml;
}