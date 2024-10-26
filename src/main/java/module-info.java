module com.kausar.imagin_calc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kausar.imagin_calc to javafx.fxml;
    exports com.kausar.imagin_calc;
}