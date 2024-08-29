package com.mycompany.examwork;

/**
 *
 * @author ivahn
 */
public class Node extends ConnectingNode {

    public int num;
    public int mask;
    public boolean isSleepMode;

    public Node(int num, int mask, boolean isSleepMode) {
        this.num = num;
        this.mask = mask;
        this.isSleepMode = isSleepMode;
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
    public void setMask(int mask) {
        this.mask = mask;
    }

    @Override
    public int getMask() {
        return mask;
    }

    @Override
    public String toString() {
        return "Компьютер " + num + ": " + "192.168.0." + mask;
    }
}
