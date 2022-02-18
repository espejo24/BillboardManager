package ru.netology.billboardmanager;

public class Manager {
    private final int limit;
    private Movie[] items = new Movie[0];


    public void addMovie(Movie item) {             // добавляем новый фильм
        Movie[] tmp = new Movie[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;

    }

    public Movie[] findAll() {           // выводим в порядке добавления
        return items;
    }

    public Manager(int limit) {
        this.limit = limit;
    }

    public Movie[] findLast() {      // выводим в обратном порядке лимит (10)
        int resultLength;
        //int limit = 10;
        if (items.length <= limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = items[items.length - i - 1];
        }
        return result;
    }

}
