package ru.netology.billboardmanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    Movie uno = new Movie(1, "Bladshot", "accion");
    Movie dos = new Movie(2, "Adelante", "animado");
    Movie tres = new Movie(3, "Hotel Belgrad", "comedia");
    Movie cuatro = new Movie(4, "Caballeros", "accion");
    Movie cinco = new Movie(5, "Invisible", "horror");
    Movie seis = new Movie(6, "Trollys", "animado");
    Movie siete = new Movie(7, "Numero uno", "comedia");
    Movie ocho = new Movie(8, "Volver", "drama");
    Movie nueve = new Movie(9, "La piel que abito", "drama");
    Movie diez = new Movie(10, "Azul oscuro casi negro", "drama");
    Movie once = new Movie(11, "El Barco", "drama");

    @Test
    public void shouldAddMovie() {
        Manager manager = new Manager(11);
        manager.addMovie(uno);
        manager.addMovie(dos);
        manager.addMovie(tres);
        manager.addMovie(cuatro);
        manager.addMovie(cinco);
        manager.addMovie(seis);
        manager.addMovie(siete);
        manager.addMovie(ocho);
        manager.addMovie(nueve);
        manager.addMovie(diez);
        manager.addMovie(once);

        Movie[] expected = {uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez, once};
        Movie[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddTenMovie() {
        Manager manager = new Manager(10);
        manager.addMovie(uno);
        manager.addMovie(dos);
        manager.addMovie(tres);
        manager.addMovie(cuatro);
        manager.addMovie(cinco);
        manager.addMovie(seis);
        manager.addMovie(siete);
        manager.addMovie(ocho);
        manager.addMovie(nueve);
        manager.addMovie(diez);


        Movie[] expected = {uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez};
        Movie[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMovie() {
        Manager manager = new Manager(1);
        manager.addMovie(uno);

        Movie[] expected = {uno};
        Movie[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test                                                 // недопустимое значение (11)
    public void shouldFindLastTenOverLimitMovie() {
        Manager manager = new Manager(10);
        manager.addMovie(uno);
        manager.addMovie(dos);
        manager.addMovie(tres);
        manager.addMovie(cuatro);
        manager.addMovie(cinco);
        manager.addMovie(seis);
        manager.addMovie(siete);
        manager.addMovie(ocho);
        manager.addMovie(nueve);
        manager.addMovie(diez);
        manager.addMovie(once);

        Movie[] expected = {once, diez, nueve, ocho, siete, seis, cinco, cuatro, tres, dos};
        Movie[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastTenMovie() {
        Manager manager = new Manager(10);
        manager.addMovie(uno);
        manager.addMovie(dos);
        manager.addMovie(tres);
        manager.addMovie(cuatro);
        manager.addMovie(cinco);
        manager.addMovie(seis);
        manager.addMovie(siete);
        manager.addMovie(ocho);
        manager.addMovie(nueve);
        manager.addMovie(diez);

        Movie[] expected = {diez, nueve, ocho, siete, seis, cinco, cuatro, tres, dos, uno};
        Movie[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFiveMovie() {
        Manager manager = new Manager(5);
        manager.addMovie(uno);
        manager.addMovie(dos);
        manager.addMovie(tres);
        manager.addMovie(cuatro);
        manager.addMovie(cinco);

        Movie[] expected = {cinco, cuatro, tres, dos, uno};
        Movie[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test                                   // недопустимое значение (11)
    public void shouldFindLastThreeMovie() {
        Manager manager = new Manager(3);
        manager.addMovie(uno);
        manager.addMovie(dos);
        manager.addMovie(tres);
        manager.addMovie(cuatro);
        manager.addMovie(cinco);
        manager.addMovie(seis);
        manager.addMovie(siete);
        manager.addMovie(ocho);
        manager.addMovie(nueve);
        manager.addMovie(diez);
        manager.addMovie(once);

        Movie[] expected = {once, diez, nueve};
        Movie[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    Movie one = new Movie();     // для пустого конструктора
    Movie two = new Movie();
    Movie three = new Movie();
    Movie four = new Movie();
    Movie five = new Movie();
    Movie six = new Movie();
    Movie seven = new Movie();
    Movie eight = new Movie();
    Movie nine = new Movie();
    Movie ten = new Movie();
    Movie eleven = new Movie();

    @Test
    public void shouldAddMovieNoArgs() {
        Manager manager = new Manager(1);
        manager.addMovie(one);

        Movie[] expected = {one};
        Movie[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowId() {
        Movie movie = new Movie();
        movie.getId();
        int expected = 0;
        int actual = movie.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowName() {
        Movie movie = new Movie();
        movie.getName();
        String expected = null;
        String actual = movie.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowGenre() {
        Movie movie = new Movie();
        movie.getGenre();
        String expected = null;
        String actual = movie.getGenre();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetId() {
        Movie movie = new Movie();
        movie.setId(0);
        int expected = 0;
        int actual = movie.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetName() {
        Movie movie = new Movie();
        movie.setName(null);
        String expected = null;
        String actual = movie.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetGenre() {
        Movie movie = new Movie();
        movie.setGenre(null);
        String expected = null;
        String actual = movie.getGenre();
        assertEquals(expected, actual);
    }


}