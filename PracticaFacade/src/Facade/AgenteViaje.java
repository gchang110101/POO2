package Facade;

import Servicios.*;

public class AgenteViaje {
    private BuscadorAerolinea buscadorAerolinea;
    private BuscadorRestaurante buscadorRestaurante;
    private BuscadorHotel buscadorHotel;

    public AgenteViaje() {
        buscadorAerolinea = new BuscadorAerolinea();
        buscadorRestaurante = new BuscadorRestaurante();
        buscadorHotel = new BuscadorHotel();
    }

    public void buscar(int presupuestoHotel, int cantDiasEstadia, int cantPersonas,
                             int presupuestoVuelo, String horario, String fecha,
                             int presupuestoComida, String preferenciaComida) {

        buscadorHotel.buscarHoteles(presupuestoHotel, cantDiasEstadia, cantPersonas);
        buscadorAerolinea.buscarAerolineas(presupuestoVuelo, horario, fecha);
        buscadorRestaurante.buscarRestaurantes(presupuestoComida, preferenciaComida);
    }
}
