import Builders.*;
import Director.Director;
import Mantenimiento.IMantenimiento;
import Mantenimiento.MantenimientoAdapter;
import Mantenimiento.MantenimientoTallerToyota;
import Vehiculos.Carro;

public class Main {
    public static void main(String[] args) {
        IMantenimiento mantenimientoCarro = new MantenimientoTallerToyota();
        mantenimientoCarro.darMantenimiento("Toyota", 3356);

        mantenimientoCarro = new MantenimientoAdapter("Hyundai", 5561);
        mantenimientoCarro.darMantenimiento("Hyundai", 5561);

        mantenimientoCarro = new MantenimientoAdapter("Susuki", 1001);
        mantenimientoCarro.darMantenimiento("Susuki", 1001);

        mantenimientoCarro = new MantenimientoAdapter("Mitsubishi", 6900);
        mantenimientoCarro.darMantenimiento("Mitsubishi", 6900);

        /*
        Director director = new Director();
        CarroBuilder builderCarro = new CarroBuilder();

        director.construirToyota(builderCarro);
        Carro toyotaSupra = builderCarro.build();
        toyotaSupra.mostrarDatos();

        director.construirHyundai(builderCarro);
        Carro hyundaiAccentBlue = builderCarro.build();
        hyundaiAccentBlue.mostrarDatos();
        */
    }
}