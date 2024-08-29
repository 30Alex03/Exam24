package com.mycompany.examwork;

/**
 *
 * @author ivahn
 */
public abstract class ConnectingNode {

    public int num;
    public int mask;

    public abstract String toString();

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setMask(int mask) {
        this.mask = mask;
    }

    public int getMask() {
        return mask;
    }

}
