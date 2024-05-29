package com.spring.java_string_exmple.synchronization;

public class MovieBookApp extends Thread {

    static BookTheaterSeat bookSeat;
    int seats;
    String name;

    public void run() {
        bookSeat.bookSeat(seats, name);
    }

    public static void main(String[] args) {

        bookSeat = new BookTheaterSeat();

        MovieBookApp niva = new MovieBookApp();
        niva.seats = 6;
        niva.name = "Niva";
        niva.start();

        MovieBookApp jemy = new MovieBookApp();
        jemy.seats = 7;
        jemy.name = "Jemy";
        jemy.start();

    }

}
