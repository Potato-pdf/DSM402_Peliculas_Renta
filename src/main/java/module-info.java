module utl_dsm402.dsm402_peliculas_renta {
    requires javafx.controls;
    requires javafx.fxml;


    opens utl_dsm402.dsm402_peliculas_renta to javafx.fxml;
    exports utl_dsm402.dsm402_peliculas_renta;
}