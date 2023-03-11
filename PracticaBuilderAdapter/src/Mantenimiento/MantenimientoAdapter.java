package Mantenimiento;

public class MantenimientoAdapter implements IMantenimiento {
    IMantenimientoMarcasOtras mantenimientoMarcasOtras;

    public MantenimientoAdapter(String marca, int id) {
        if (marca.equalsIgnoreCase("Hyundai"))
            mantenimientoMarcasOtras = new MantenimientoMarcasOtras();

        else if (marca.equalsIgnoreCase("Susuki"))
            mantenimientoMarcasOtras = new MantenimientoMarcasOtras();

        else if (marca.equalsIgnoreCase("Mitsubishi")) {
            mantenimientoMarcasOtras = new MantenimientoMarcasOtras();
        }
    }

    public void darMantenimiento(String marca, int id) {
        if (marca.equalsIgnoreCase("Hyundai"))
            mantenimientoMarcasOtras.darMantenimientoHyundai(id);

        else if (marca.equalsIgnoreCase("Susuki"))
            mantenimientoMarcasOtras.darMantenimientoSusuki(id);

        else if (marca.equalsIgnoreCase("Mitsubishi"))
            mantenimientoMarcasOtras.darMantenimientoMitsubishi(id);
    }
}
