package org.example;

import java.sql.Connection;
import model.*;
import service.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws Exception {
        //servicios
        IServiceGenre serviceGenre = new ImpServiceGenre();
        IServiceRating serviceRating = new ImpServiceRating();
        IServiceMovie serviceMovie = new ImpServiceMovie();

        //listas
        List<Genre> generos = new ArrayList<>();
        List<Rating> ratings = new ArrayList<>();
        List<Movie> movies = new ArrayList<>();

        //llenar listas
        generos = serviceGenre.getALl();
        ratings = serviceRating.getAll();
        movies = serviceMovie.getAll();

        /*
        System.out.println(generos);
        System.out.println(ratings);
         */

        /*
        Rating rat1 = new Rating(5, "R");
        Genre gen1 = new Genre(100, "Horror");
         */

        /*
        Date rn = new Date();
        rn.getTime();
        Movie mov1 = new Movie(1, "Terror_Movie", "2h 00m", 0, 0, rn, "AL_00");
         */


        //System.out.println(mov1);
        //serviceMovie.insertMovie(mov1);

        /* inserts funcionando
        serviceGenre.insertGenre(gen1);
        serviceRating.insertRating(rat1);
         */

        /*borrar funcionales
        serviceGenre.borrarGenre(gen1);
        serviceRating.borrarRating(rat1);
        serviceMovie.borrarMovie(mov1);
         */

        /*updates funcionales
        serviceRating.updateRating(rat1);
        serviceGenre.updateGenre(gen1);
        serviceMovie.updateMovie(mov1);
         */

        //get alls post operaciones
        generos = serviceGenre.getALl();
        ratings = serviceRating.getAll();
        movies = serviceMovie.getAll();

        System.out.println(generos);
        System.out.println(ratings);
        System.out.println(movies);


    }
}