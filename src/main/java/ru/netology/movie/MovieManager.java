package ru.netology.movie;
public class MovieManager {
    private String[] movies = new String[0];
    private final int limit;

    public MovieManager() {
        this.limit = 5;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength = Math.min(movies.length, limit);
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}

