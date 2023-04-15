package Dao;

import java.util.List;

public interface IDAO {
    <T> List<T> findALL(Class<T> clazz, String nameQuery);
    <T> void create(T entity);
    <T> void update(T entity);
    <T> void delete(T entity);

    <T> T findById(Long id, Class<T> clazz);
}
