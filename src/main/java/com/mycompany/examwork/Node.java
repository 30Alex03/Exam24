package com.mycompany.examwork;

/**
 *
 * @author ivahn
 */
public class Node extends ConnectingNode {

    public int num;
    public int ip;
    public int x;
    public boolean isSleepMode;
     

    public Node(int num, int x, int ip, boolean isSleepMode) {
        this.num = num;
        this.ip = ip;
        this.isSleepMode = isSleepMode;
        this.x = x;
    }

    public void setSleepMode(boolean sleepMode) {
        this.isSleepMode = sleepMode;
    }

    public boolean getIsSleepMode() {
        return isSleepMode;
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
    public void setMask(int ip) {
        this.ip = ip;
    }

    @Override
    public int getMask() {
        return ip;
    }

    @Override
    public String toString() {
        return "Компьютер " + num + ": " + "192.168." + x + "." + ip;
    }
}
