package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private int id;
    private String title;
    private String length;
    private int ratingID;
    private int genreID;
    private Date releaseDate;
    private String lmdbID;
}
