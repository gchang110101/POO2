package service;

import model.Genre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ImpServiceGenre implements IServiceGenre {
    @Override
    public List<Genre> getALl() throws Exception {
        Connection con = null;
        String genreSQL = "select * from \"Genre\"";
        List<Genre> generos = new ArrayList<>();

        try {
            con = DataSource.getInstance().openConnection();
            PreparedStatement ps = con.prepareStatement(genreSQL);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Genre genre = new Genre();
                genre.setId(rs.getInt("genre_id"));
                genre.setDescription(rs.getString("genre"));
                generos.add(genre);
            }
            rs.close();
            ps.close();
            return generos;
        } finally {
            DataSource.getInstance().closeConnection(con);
        }
    }

    @Override
    public void insertGenre(Genre genre) throws Exception {
        Connection con = DataSource.getInstance().openConnection();
        con.setAutoCommit(false);

        final String genreSQL = "insert into \"Genre\" (genre_id, genre) values (?,?)";
        PreparedStatement ps = con.prepareStatement(genreSQL);

        ps.setInt(1, genre.getId());
        ps.setString(2, genre.getDescription());

        ps.execute();
        con.commit();
        ps.close();
        con.close();
    }

    @Override
    public void borrarGenre(Genre genre) throws Exception {
        Connection con = DataSource.getInstance().openConnection();
        con.setAutoCommit(false);
        String genreSQL = "Delete from \"Genre\" where genre_id = ?";

        PreparedStatement ps = con.prepareStatement(genreSQL);
        ps.setInt(1, genre.getId());

        ps.execute();
        con.commit();
        ps.close();
        con.close();
    }

    @Override
    public void updateGenre(Genre genre) throws Exception {
        Connection con = DataSource.getInstance().openConnection();
        con.setAutoCommit(false);
        String genreSQL = "update \"Genre\" set genre = ? where genre_id = ?";

        PreparedStatement ps = con.prepareStatement(genreSQL);
        ps.setString(1, genre.getDescription());
        ps.setInt(2, genre.getId());

        ps.execute();
        con.commit();
        ps.close();
        con.close();
    }
}
