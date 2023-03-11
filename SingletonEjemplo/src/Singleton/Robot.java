package Singleton;

import Interfaces.ISaludoInstancia;

public class Robot implements ISaludoInstancia {
    //esta variable se cambiará según la instancia (respecto al parámetro del constructor)
    private int numInstancia = 0;

    //ahora creo tres instancias de la clase predeterminadas
    private static Robot robotN1 = null;
    private static Robot robotN2 = null;
    private static Robot robotN3 = null;

    //se define el método saludoInstancia implementado de la interfaz (numInstancia cambiará)
    public void saludoInstancia() {
        System.out.println("Hola, soy el robot número: " + numInstancia);
    }

    //se define el método presentarCodigoTipo imlpementado de la interfaz (variable tipo final)
    public void presentarCodigoTipo() { System.out.println("Mi código de tipo de robot es: " + codigoTipo); }

    //constructor privado para restringir la creación de objetos de la clase Robot, numInstancia cambia según número de instancia
    private Robot(int x) {
        if (x == 1)
            numInstancia = 1;
        else if (x == 2)
            numInstancia = 2;
        else if (x == 3)
            numInstancia = 3;
    }

    //metodo getter para la instancia 1
    public static Robot getRobotN1() {
        if (robotN1 == null)
            robotN1 = new Robot(1);
        return robotN1;
    }

    //metodo getter para la instancia 2
    public static Robot getRobotN2() {
        if (robotN2 == null)
            robotN2 = new Robot(2);
        return robotN2;
    }

    //metodo getter para la instancia 3
    public static Robot getRobotN3() {
        if (robotN3 == null)
            robotN3 = new Robot(3);
        return robotN3;
    }
}
