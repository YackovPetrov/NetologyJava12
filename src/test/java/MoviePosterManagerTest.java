import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoviePosterManagerTest {

    MoviePosterManager manager = new MoviePosterManager();
    MoviePosterManager manager2 = new MoviePosterManager(3);

    MoviePoster movie1 = new MoviePoster(1, "Бладшот", "боевик");
    MoviePoster movie2 = new MoviePoster(2, "Вперёд", "мультфильм");
    MoviePoster movie3 = new MoviePoster(3, "Отель \"Белград\"", "комедия");
    MoviePoster movie4 = new MoviePoster(4, "Джентельмены", "боевик");
    MoviePoster movie5 = new MoviePoster(5, "Человек-невидимка", "ужасы");
    MoviePoster movie6 = new MoviePoster(6, "Тролли. Мировой тур", "мультфильм");
    MoviePoster movie7 = new MoviePoster(7, "Номер один", "комедия");

    @BeforeEach
    public void setup() {
        manager.addNewMovie(movie1);
        manager.addNewMovie(movie2);
        manager.addNewMovie(movie3);
        manager.addNewMovie(movie4);
        manager.addNewMovie(movie5);
        manager.addNewMovie(movie6);
        manager.addNewMovie(movie7);
    }

    @BeforeEach
    public void setup2() {
        manager2.addNewMovie(movie1);
        manager2.addNewMovie(movie2);
        manager2.addNewMovie(movie3);
        manager2.addNewMovie(movie4);
        manager2.addNewMovie(movie5);
        manager2.addNewMovie(movie6);
        manager2.addNewMovie(movie7);
    }

    @Test
    public void testLimitManager() {

        Assertions.assertEquals(5, manager.getLimitManager());
    }

    @Test
    public void testLimitManagerIf3() {

        Assertions.assertEquals(3, manager2.getLimitManager());
    }

    @Test
    public void addNewMovie() {

        MoviePoster[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        MoviePoster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {

        MoviePoster[] expected = {movie7, movie6, movie5, movie4, movie3};
        MoviePoster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastIf3() {

        MoviePoster[] expected = {movie7, movie6, movie5};
        MoviePoster[] actual = manager2.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}