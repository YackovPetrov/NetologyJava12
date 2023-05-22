public class MoviePosterManager {
    private int limitManager = 5;

    public MoviePoster[] movies = new MoviePoster[0];

    public MoviePosterManager() {
    }

    public MoviePosterManager(int limitManager) {
        this.limitManager = limitManager;
    }

    public int getLimitManager() {
        return limitManager;
    }


    public void addNewMovie(MoviePoster movie) {
        MoviePoster[] tmp = new MoviePoster[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public MoviePoster[] findAll() {
        return movies;
    }


    public MoviePoster[] findLast() {
        int resultLenght;
        if (limitManager == movies.length) {
            resultLenght = movies.length;
        } else {
            resultLenght = limitManager;
        }
        MoviePoster[] result = new MoviePoster[resultLenght];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
