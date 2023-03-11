package org.example;

import model.Region;
import service.DataSource;

import java.sql.Connection;
import model.Libro;
import service.IServiceLibro;
import service.ImpServiceLibro;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) throws SQLException {
        List<Libro> libros = new ArrayList<>();

        IServiceLibro service = new ImpServiceLibro();

        libros = service.getAll();

        System.out.println(libros.toString());
    }
}