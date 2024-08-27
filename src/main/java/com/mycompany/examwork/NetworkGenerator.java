package com.mycompany.examwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author ivahn
 */
public class NetworkGenerator {
    public int MIN_NODES_PER_SUBNET = 1;
    public int MAX_NODES_PER_SUBNET = 29;
    public String BASE_IP_ADDRESS = "192.168.0.";
    public int PORT_OFFSET = 1;
    
    public Subnet createSubnet(int num, int maskLength){
        return new Subnet(num, maskLength);
    }
    
    public Router createRouter(int number) {
        // Создание маршрутизатора с IP-адресом 192.168.0.1
        return new Router(number);
    }
    
    public Commutator createCommutator(int num) {
        // Создание коммутатора с 30 портами
        return new Commutator(num);
    }

    public Node createNode(int num, int mask, boolean isSleepMode) {
        // Создание узла с IP-адресом в диапазоне 192.168.0.1 - 192.168.0.254
        
        return new Node(num, mask, isSleepMode);
    }
    
    
    public int getRandomNodesPerSubnet(int min, int max) {        
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    

    

    

    

    
    
}
