package olena.webtesting.planetakino;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.stream.Collectors;

public class SortingMoviesByTitle extends BasePage {
    @FindBy(xpath = "//div[@class='movie-block__title-inner']")
    private List<WebElement> movieTitle;
    @FindBy(xpath = "//div[@class='movie-block']")
    private List<WebElement> genresInTheMovie;

    public SortingMoviesByTitle takingTheNamesOfTheFilmsIntoAList() {
        List<String> text = movieTitle.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        text.forEach(System.out::println);

        return this;
    }
    public SortingMoviesByTitle genresInTheMovieSection(){
        List<String> genres = genresInTheMovie.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        genres.forEach(System.out::println);

        return this;
    }

}
