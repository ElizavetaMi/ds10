package ru.netology.movie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {

    @Test
    public void shouldAddMovies() {
        MovieManager manager = new MovieManager();
        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");

        String[] expected = {"Movie1", "Movie2", "Movie3"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnAllMovies() {
        MovieManager manager = new MovieManager();
        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");
        manager.add("Movie6");

        String[] expected = {"Movie1", "Movie2", "Movie3", "Movie4", "Movie5", "Movie6"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastMoviesWhenLessThanLimit() {
        MovieManager manager = new MovieManager(5);
        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");

        String[] expected = {"Movie3", "Movie2", "Movie1"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastMoviesWhenEqualToLimit() {
        MovieManager manager = new MovieManager(3);
        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");

        String[] expected = {"Movie3", "Movie2", "Movie1"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastMoviesWhenMoreThanLimit() {
        MovieManager manager = new MovieManager(3);
        manager.add("Movie1");
        manager.add("Movie2");
        manager.add("Movie3");
        manager.add("Movie4");
        manager.add("Movie5");

        String[] expected = {"Movie5", "Movie4", "Movie3"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}

