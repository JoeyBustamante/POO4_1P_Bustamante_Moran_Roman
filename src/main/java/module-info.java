module joeybustamante.proyectosegundoparcial {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens joeybustamante.proyectosegundoparcial to javafx.fxml;
    exports modelo;
}
