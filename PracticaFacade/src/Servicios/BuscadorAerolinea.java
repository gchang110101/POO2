package Servicios;

public class BuscadorAerolinea {
    public void buscarAerolineas(int presupuestoVuelo, String horario, String fecha) {
        System.out.println("----------------------------------------");
        System.out.println("Recomendacines de Aerolínea: ");
        System.out.println("----------------------------------------");


        System.out.println("\nDatos:" + "\nPresupuesto Vuelo: $" + presupuestoVuelo
                + "\nHorario: " + horario
        + "\nFecha: " + fecha);

        System.out.println("\nOpción 1: Copa Airlines");
        System.out.println("Opción 2: Grupo Taca");
        System.out.println("Opción 3: Delta Airlines\n");
    }
}
