package ru.netology.poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {

    Film film1 = new Film(1, "Человек-Паук", 1999, "Фантастика");
    Film film2 = new Film(2, "Борат", 2010, "Комедия");
    Film film3 = new Film(3, "Крик", 2005, "Ужасы");
    Film film4 = new Film(4, "Черная смерть", 2010, "Триллер");
    Film film5 = new Film(5, "Кристина", 2021, "Триллер");
    Film film6 = new Film(6, "Телепорт", 2008, "Фантастика");
    Film film7 = new Film(7, "Почка", 2021, "Комедия");
    Film film8 = new Film(8, "Ной", 2014, "Драма");
    Film film9 = new Film(9, "Сорвиголова", 2003, "Боевик");
    Film film10 = new Film(10, "Дракула", 2025, "Ужасы");

    @Test
    public void filmsSaveTest() {
        Poster post = new Poster();
        post.save(film3);
        post.save(film1);
        post.save(film2);
        Film[] expected = {film3, film1, film2};
        Film[] actual = post.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastCountTestDefault() {
        Poster post = new Poster();
        post.save(film1);
        post.save(film2);
        post.save(film3);
        post.save(film4);
        post.save(film5);
        post.save(film6);
        Film[] expected = {film6, film5, film4, film3, film2};
        Film[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastCountTest() {
        Poster post = new Poster(3);
        post.save(film3);
        post.save(film1);
        post.save(film2);
        post.save(film4);
        post.save(film5);
        post.save(film6);
        Film[] expected = {film6, film5, film4};
        Film[] actual = post.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void setFilmTest() {
        Poster post = new Poster();
        Film film11 = new Film();
        film11.setId(11);
        film11.setTitle("Челюсти");
        film11.setYear(2000);
        film11.setGenre("Ужасы");
        post.save(film11);
        Film[] expected = {film11};
        Film[] actual = post.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }
}


