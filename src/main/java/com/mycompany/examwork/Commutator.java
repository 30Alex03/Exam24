package com.mycompany.examwork;

/**
 *
 * @author ivahno
 */
public class Commutator {
    public int num;

    public Commutator(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Коммутатор  " + num;
    }
}
