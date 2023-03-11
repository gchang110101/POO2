package Mantenimiento;

public class MantenimientoTallerToyota implements IMantenimiento {

    public void darMantenimiento(String marca, int id) {
        if(marca.equalsIgnoreCase("Toyota")) {
            System.out.println("Dándole mantenimiento al carro: " + id + ", marca: " + marca);
        }
    }
}
