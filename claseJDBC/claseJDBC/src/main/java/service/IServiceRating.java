package service;

import model.Rating;

import java.util.List;

public interface IServiceRating {
    public List<Rating> getAll() throws Exception;
    public void insertRating(Rating rating) throws Exception;
    public void borrarRating(Rating rating) throws Exception;
    public void updateRating(Rating rating) throws Exception;
}
