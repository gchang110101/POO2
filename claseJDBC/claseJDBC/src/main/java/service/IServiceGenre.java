package service;

import model.Genre;
import java.util.List;

public interface IServiceGenre {
    public List<Genre> getALl() throws Exception;
    public void insertGenre(Genre genre) throws Exception;
    public void borrarGenre(Genre genre) throws Exception;
    public void updateGenre(Genre genre) throws Exception;
}
