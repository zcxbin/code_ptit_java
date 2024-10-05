package Cinema;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Movie implements Comparable<Movie> {
    private String id;
    private Date date;
    private String name;
    private String episodes;
    private Category category;

    public Movie(int id, String date, String name, String episodes, Category category) throws ParseException {
        this.id = String.format("P%03d", id);
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.name = name;
        this.episodes = episodes;
        this.category = category;
    }

    @Override
    public String toString() {
        return id + " " + category.toString() + " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " + name + " " + episodes;
    }

    @Override
    public int compareTo(Movie other) {
        return this.date.compareTo(other.date);
    }

}
