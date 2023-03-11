import Singleton.Robot;
public class Main {
    public static void main(String[] args) {

        //se usan los métodos getters de las instancias individuales, al igual que presentarCodigoTipo()
        Robot.getRobotN1().saludoInstancia();
        Robot.getRobotN1().presentarCodigoTipo();

        Robot.getRobotN2().saludoInstancia();
        Robot.getRobotN2().presentarCodigoTipo();

        Robot.getRobotN3().saludoInstancia();
        Robot.getRobotN3().presentarCodigoTipo();

    }
}