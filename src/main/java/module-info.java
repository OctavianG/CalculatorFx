module calculator.calculatorfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens calculator.calculatorfx to javafx.fxml;
    exports calculator.calculatorfx;
}