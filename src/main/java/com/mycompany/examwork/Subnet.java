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

    public String getSubnetMask(int maskLength) {
        int mask = 0xFFFFFFFF << (32 - maskLength);
        return ((mask >> 24) & 0xFF) + "." +
               ((mask >> 16) & 0xFF) + "." +
               ((mask >> 8) & 0xFF) + "." +
               (mask & 0xFF);
    }
    
    @Override
    public String toString() {
        return "Подсеть " + num + ": " + getSubnetMask(maskLength);
    }
}
