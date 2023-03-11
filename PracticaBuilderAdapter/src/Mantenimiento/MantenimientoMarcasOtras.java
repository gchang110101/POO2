package Mantenimiento;

public class MantenimientoMarcasOtras implements IMantenimientoMarcasOtras {

    public void darMantenimientoHyundai(int id) {
        System.out.println("Dándole mantenimiento al carro: " + id + ", marca: Hyundai");
    }

    public void darMantenimientoSusuki(int id) {
        System.out.println("Dándole mantenimiento al carro: " + id + ", marca: Susuki");

    }

    public void darMantenimientoMitsubishi(int id) {
        System.out.println("Dándole mantenimiento al carro: " + id + ", marca: Mitsubishi");

    }
}
