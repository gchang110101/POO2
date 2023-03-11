package Servicios;

public class BuscadorRestaurante {
    public void buscarRestaurantes(int presupuestoComida, String preferenciaComida) {
        System.out.println("----------------------------------------");
        System.out.println("Recomendacines de Restaurantes: ");
        System.out.println("----------------------------------------");

        System.out.println("\nDatos:" + "\nPresupuesto Comida: $" + presupuestoComida +
                "\nPreferencia: " + preferenciaComida);

        System.out.println("\nOpción 1: McDonald's");
        System.out.println("Opción 2: Carl's Jr");
        System.out.println("Opción 3: Art Burgers\n");
    }
}
