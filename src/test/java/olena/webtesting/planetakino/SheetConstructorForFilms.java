package olena.webtesting.planetakino;

public class SheetConstructorForFilms {
    public SheetConstructorForFilms(String title, String genre, String ageLimit, String rating) {
        this.title = title;
        this.genre = genre;
        this.ageLimit = ageLimit;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAgeLimit() {
        return ageLimit;
    }

    public String getRating() {
        return rating;
    }

    private String title;
    private String genre;
    private String ageLimit;
    private String rating;
}
