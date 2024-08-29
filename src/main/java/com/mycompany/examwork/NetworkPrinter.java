package com.mycompany.examwork;

/**
 *
 * @author ivahn
 */
public class NetworkPrinter extends ConnectingNode {

    public int num;

    public NetworkPrinter(int num) {
        this.num = num;
    }

    @Override
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Сетевой принтер " + num;
    }
}
