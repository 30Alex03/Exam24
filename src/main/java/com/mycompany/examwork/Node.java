package com.mycompany.examwork;

/**
 *
 * @author ivahn
 */
public class Node {
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
        public String toString() {
            if (getIsSleepMode() == true){
                return "Узел " + num + ": " + "192.168.0." + mask + " Спящий";
            } else return "Узел " + num + ": " + "192.168.0." + mask + " Не спящий";
        }
}
