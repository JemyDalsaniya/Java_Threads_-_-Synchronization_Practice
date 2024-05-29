package com.spring.java_string_exmple.synchronization;

public class BookTheaterSeat {
    int total_seats = 10;

    void bookSeat(int seats, String name) {
        if (total_seats >= seats) {
            System.out.println(seats+" Seat books successfully for " + name);
            total_seats = total_seats - seats;
            System.out.println("Seats left:" + total_seats);
        } else {
            System.out.println("Sorry" + name + "Seats cannot be booked because left seats are:" + total_seats);
        }
    }
}
