import Dao.*;
import model.*;

public class Main {
    public static void main(String[] args) {
        /*
        //Autor a = new Autor(250L, "Megan");
        IDAO dao = new ImpDAO();

        //dao.create(a);
        dao.update(a);
        //dao.delete(a);
        //Autor b = dao.findById(a.getId(), Autor.class);
        //dao.delete(b);
        //dao.create(a);
        System.out.println(dao.findALL(Autor.class, "Autor.all"));
        */

        IDAO dao = new ImpDAO();
        Estudiante a = new Estudiante(null, "Carlos", "Cerda");

        dao.create(a);
        System.out.println(dao.findALL(Estudiante.class, "Estudiante.all"));
    }
}
