package service;

import model.Movie;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ImpServiceMovie implements IServiceMovie {
    @Override
    public List<Movie> getAll() throws Exception {
        Connection con = null;
        String movieSQL = "select * from \"Movie\"";
        List<Movie> movies = new ArrayList<>();

        try {
            con = DataSource.getInstance().openConnection();
            PreparedStatement ps = con.prepareStatement(movieSQL);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Movie movie = new Movie();
                movie.setId(rs.getInt("movie_id"));
                movie.setTitle(rs.getString("movie_title"));
                movie.setLength(rs.getString("length"));
                movie.setRatingID(rs.getInt("rating_id"));
                movie.setGenreID(rs.getInt("genre_id"));
                movie.setReleaseDate(rs.getDate("release_date"));
                movie.setLmdbID(rs.getString("lmdb_id"));
                movies.add(movie);
            }
            rs.close();
            ps.close();
            return movies;
        } finally {
            DataSource.getInstance().closeConnection(con);
        }
    }

    @Override
    public void insertMovie(Movie movie) throws Exception {
        Connection con = DataSource.getInstance().openConnection();
        con.setAutoCommit(false);

        final String movieSQL = "insert into \"Movie\" (movie_id, movie_title, length, rating_id," +
                " genre_id, release_date, lmdb_id) values (?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(movieSQL);

        ps.setLong(1, movie.getId());
        ps.setString(2, movie.getTitle());
        ps.setString(3, movie.getLength());
        ps.setInt(4, movie.getRatingID());
        ps.setInt(5, movie.getGenreID());
        ps.setDate(6, new Date(movie.getReleaseDate().getTime()));
        ps.setString(7, movie.getLmdbID());

        ps.execute();
        con.commit();
        ps.close();
        con.close();
    }

    @Override
    public void borrarMovie(Movie movie) throws Exception {
        Connection con = DataSource.getInstance().openConnection();
        con.setAutoCommit(false);
        String movieSQL = "Delete from \"Movie\" where movie_id = ?";

        PreparedStatement ps = con.prepareStatement(movieSQL);
        ps.setLong(1, movie.getId());

        ps.execute();
        con.commit();
        ps.close();
        con.close();
    }

    @Override
    public void updateMovie(Movie movie) throws Exception {
        Connection con = DataSource.getInstance().openConnection();
        con.setAutoCommit(false);
        String movieSQL = "update \"Movie\" set movie_title = ?," +
                " length = ?, release_date = ?, lmdb_id = ? where movie_id = ?";

        PreparedStatement ps = con.prepareStatement(movieSQL);
        ps.setString(1, movie.getTitle());
        ps.setString(2, movie.getLength());
        ps.setDate(3, new Date(movie.getReleaseDate().getTime()));
        ps.setString(4, movie.getLmdbID());
        ps.setInt(5, movie.getId());

        ps.execute();
        con.commit();
        ps.close();
        con.close();
    }
}
