package com.company.L024;

import com.company.Animals.Flight;

public class AnonExample {

    public static void run(){
        Flight flight = new Flight() {
            @Override
            public void takeOff() {

            }

            @Override
            public void lending() {

            }
        };

        flight.lending();
        flight.takeOff();
    }
}
