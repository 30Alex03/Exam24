package com.mycompany.examwork;

/**
 *
 * @author ivahn
 */
public class Router {

    public int number;

    public Router(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Маршрутизатор " + number;
    }
}
