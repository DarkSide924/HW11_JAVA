package ru.netology.poster;

public class Poster {
    private Film[] films = new Film[0];
    private int lastCount = 5;

    public Poster(int lastCount) {
        this.lastCount = lastCount;
    }

    public Poster() {
    }

    public void save(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Film[] findAll() {
        return films;
    }

    public Film[] findLast() {
        Film[] all = findAll();
        Film[] reversed = new Film[lastCount];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;

    }
}