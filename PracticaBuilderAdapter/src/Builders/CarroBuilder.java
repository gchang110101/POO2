package Builders;

import Vehiculos.Carro;

public class CarroBuilder implements IBuilderVehiculo {
    private int id;
    private String marca;
    private String modelo;
    private String color;
    private String tipoGas;
    private int numeroLlantas;

    public IBuilderVehiculo id(int id) {
        this.id = id;
        return this;
    }

    public IBuilderVehiculo marca(String marca) {
        this.marca = marca;
        return this;
    }

    public IBuilderVehiculo modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public IBuilderVehiculo color(String color) {
        this.color = color;
        return this;
    }

    public IBuilderVehiculo tipoGas(String tipoGas) {
        this.tipoGas = tipoGas;
        return this;
    }

    public IBuilderVehiculo numeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
        return this;
    }

    public Carro build() {
        return new Carro(id, marca, modelo, color, tipoGas, numeroLlantas);
    }
}
