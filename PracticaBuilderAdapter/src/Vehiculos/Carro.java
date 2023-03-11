package Vehiculos;

public class Carro {
    private int id;
    private String marca;
    private String modelo;
    private String color;
    private String tipoGas;
    private int numeroLlantas;

    public Carro(int id, String marca, String modelo, String color, String tipoGas, int numeroLlantas) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoGas = tipoGas;
        this.numeroLlantas = numeroLlantas;
    }

    public void mostrarDatos() {
        System.out.println("--------------------------------------");
        System.out.println("Datos Carro");
        System.out.println("--------------------------------------");
        System.out.println("id: " + id);
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("color: " + color);
        System.out.println("tipo combustible: " + tipoGas);
        System.out.println("cantidad de llantas: " + numeroLlantas);
        System.out.println("--------------------------------------\n");
    }
}
