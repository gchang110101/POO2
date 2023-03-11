package Cliente;

import Facade.AgenteViaje;

public class Viajador {

    private static Viajador Gabriel_Chang;
    private AgenteViaje agenteViaje;

    private Viajador() {
        agenteViaje = new AgenteViaje();
    }

    public static Viajador getGabrielChang() {
        Gabriel_Chang = new Viajador();
        return Gabriel_Chang;
    }

    public void planearViaje(int presupuestoHotel, int cantDiasEstadia, int cantPersonas,
                             int presupuestoVuelo, String horario, String fecha,
                             int presupuestoComida, String preferenciaComida) {

        agenteViaje.buscar(presupuestoHotel,cantDiasEstadia, cantPersonas, presupuestoVuelo,
                horario, fecha, presupuestoComida, preferenciaComida);
    }
}
