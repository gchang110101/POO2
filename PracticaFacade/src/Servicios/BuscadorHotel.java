package Servicios;

public class BuscadorHotel {
    public void buscarHoteles(int presupuestoHotel, int cantDiasEstadia, int cantPersonas) {
        System.out.println("----------------------------------------");
        System.out.println("Recomendacines de Hoteles: ");
        System.out.println("----------------------------------------");

        System.out.println("\nDatos:" + "\nPresupuesto: $" + presupuestoHotel +
                "\nEstadía: " + cantDiasEstadia + " días " + "\nPersonas: " + cantPersonas);

        System.out.println("\nOpción 1: Hotel El Ángel");
        System.out.println("Opción 2: Hotel Ciudadela");
        System.out.println("Opción 3: Hotelito Don Paco\n");
    }
}
