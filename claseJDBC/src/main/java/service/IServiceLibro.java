package service;
import model.*;

import java.sql.SQLException;
import java.util.List;

public interface IServiceLibro {
    public List<Libro> getAll() throws SQLException;
    public void insertLibro(Libro libro);
    public void borrarLibro(Libro libro);

}
