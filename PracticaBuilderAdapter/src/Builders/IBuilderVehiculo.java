package Builders;

public interface IBuilderVehiculo {
    IBuilderVehiculo id(int id);
    IBuilderVehiculo marca(String marca);
    IBuilderVehiculo modelo(String modelo);
    IBuilderVehiculo color(String color);
    IBuilderVehiculo tipoGas(String tipoGas);
    IBuilderVehiculo numeroLlantas(int numeroLlantas);
}
