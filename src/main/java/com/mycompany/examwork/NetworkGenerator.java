package com.mycompany.examwork;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author ivahn
 */
public class NetworkGenerator {

    public Subnet createSubnet(int num, int maskLength) {
        return new Subnet(num, maskLength);
    }

    public Router createRouter(int number) {
        
        return new Router(number);
    }

    public Commutator createCommutator(int num) {
        
        return new Commutator(num);
    }

    public Node createNode(int num, int x, int ip, boolean isSleepMode) {
        

        return new Node(num, x, ip, isSleepMode);
    }

    public NetworkPrinter createNetworkPrinter(int num) {
        

        return new NetworkPrinter(num);
    }

    public int getRandomNodesPerSubnet(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    
    
    
    
        
    
}
