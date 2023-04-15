package service;

import model.Rating;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ImpServiceRating implements IServiceRating {
    @Override
    public List<Rating> getAll() throws Exception {
        Connection con = null;
        String ratingSQL = "select * from \"Rating\"";
        List<Rating> ratings = new ArrayList<>();

        try {
            con = DataSource.getInstance().openConnection();
            PreparedStatement ps = con.prepareStatement(ratingSQL);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Rating rating = new Rating();
                rating.setId(rs.getInt("rating_id"));
                rating.setDescription(rs.getString("rating"));
                ratings.add(rating);
            }
            rs.close();
            ps.close();
            return ratings;
        } finally {
            DataSource.getInstance().closeConnection(con);
        }
    }

    @Override
    public void insertRating(Rating rating) throws Exception {
        Connection con = DataSource.getInstance().openConnection();
        con.setAutoCommit(false);

        final String ratingSQL = "insert into \"Rating\" (rating_id, rating) values (?,?)";
        PreparedStatement ps = con.prepareStatement(ratingSQL);

        ps.setInt(1, rating.getId());
        ps.setString(2, rating.getDescription());

        ps.execute();
        con.commit();
        ps.close();
        con.close();
    }

    @Override
    public void borrarRating(Rating rating) throws Exception {
        Connection con = DataSource.getInstance().openConnection();
        con.setAutoCommit(false);
        String ratingSQL = "Delete from \"Rating\" where rating_id = ?";

        PreparedStatement ps = con.prepareStatement(ratingSQL);
        ps.setInt(1, rating.getId());

        ps.execute();
        con.commit();
        ps.close();
        con.close();
    }

    @Override
    public void updateRating(Rating rating) throws Exception {
        Connection con = DataSource.getInstance().openConnection();
        con.setAutoCommit(false);
        String ratingSQL = "update \"Rating\" set rating = ? where rating_id = ?";

        PreparedStatement ps = con.prepareStatement(ratingSQL);
        ps.setString(1, rating.getDescription());
        ps.setInt(2, rating.getId());

        ps.execute();
        con.commit();
        ps.close();
        con.close();
    }
}
