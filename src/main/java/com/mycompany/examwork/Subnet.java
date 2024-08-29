package com.mycompany.examwork;

/**
 *
 * @author ivahn
 */
public class Subnet {

    public int maskLength;
    public int num;

    public Subnet(int num, int maskLength) {
        this.maskLength = maskLength;
        this.num = num;
    }

    public void setmaskLength(int maskLength) {
        this.maskLength = maskLength;
    }

    public int getmaskLength() {
        return maskLength;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Подсеть " + num + ": " + "192.168.0." + maskLength;
    }
}
