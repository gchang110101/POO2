package Director;

import Builders.IBuilderVehiculo;

public class Director {

    public void construirToyota(IBuilderVehiculo builderVehiculo) {
        builderVehiculo.id(3356)
                .marca("Toyota")
                .modelo("Supra")
                .color("Blanco")
                .tipoGas("Super")
                .numeroLlantas(4);
    }

    public void construirHyundai(IBuilderVehiculo builderVehiculo) {
        builderVehiculo.id(5561)
                .marca("Hyundai")
                .modelo("Accent Blue")
                .color("Verde Oscuro")
                .tipoGas("Diesel")
                .numeroLlantas(4);
    }
}
