package ru.netology.billboardmanager;

public class Movie {
    private int id;
    private String name;
    private String genre;

    public Movie() {                    // констуктор no args
    }

    public Movie(int id, String name, String genre) {   // констуктор all args
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public int getId() {     // получаем id
        return id;
    }

    public String getName() {    // получаем название
        return name;
    }

    public String getGenre() {     // получаем жанр
        return genre;
    }

    public void setId(int id) {     // устанавливаем id
        this.id = id;
    }


    public void setName(String name) {   // устанавливаем название
        this.name = name;
    }


    public void setGenre(String genre) {   // устанавливаем жанр
        this.genre = genre;
    }
}
