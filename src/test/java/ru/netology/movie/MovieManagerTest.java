package ru.netology.movie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class  MovieManagerTest {
    @Test
    void testAddAndFindAll() {
        MovieManager manager = new MovieManager();
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");

        String[] expected = {"Movie 1", "Movie 2", "Movie 3"};
        assertArrayEquals(expected, manager.findAll());
    }

    @Test
    void testFindLastDefaultLimit() {
        MovieManager manager = new MovieManager();
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");
        manager.add("Movie 6");

        String[] expected = {"Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2"};
        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    void testFindLastCustomLimit() {
        MovieManager manager = new MovieManager(3);
        manager.add("Movie 1");
        manager.add("Movie 2");
        manager.add("Movie 3");
        manager.add("Movie 4");
        manager.add("Movie 5");

        String[] expected = {"Movie 5", "Movie 4", "Movie 3"};
        assertArrayEquals(expected, manager.findLast());
    }
}

