package com.mycompany.exam24;

import java.net.UnknownHostException;
import java.net.InetAddress;
import java.util.Random;

/**
 *
 * @author ivahn
 */
public class Node {
    private String name;
    private String subnet;
    private String ipAddress;
    private boolean isActive;
    private boolean isSleepMode = true;
    GeneratorIp generatorIp = new GeneratorIp();

    public Node(String name, String subnet) {
        this.name = name;
        this.subnet = subnet;
        this.ipAddress = generateIpAddress();
        
    }
    
    public void setSleepMode(boolean sleepMode) {
        this.isSleepMode = sleepMode;
    }

    public boolean getIsSleepMode() {
        return isSleepMode;
    }
    
    private String generateIpAddress() {
        try {
            String[] subnetParts = subnet.split("/");
            InetAddress baseIp = InetAddress.getByName(subnetParts[0]);
            int subnetMask = Integer.parseInt(subnetParts[1]);
            int availableIps = (int) Math.pow(2, 32 - subnetMask) - 2;
            int randomIp = new Random().nextInt(availableIps - 1) + 1;
            byte[] ipBytes = generatorIp.incrementIpAddress(baseIp.getAddress(), randomIp);
            return InetAddress.getByAddress(ipBytes).getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getName() {
        return name;
    }

    public String getSubnet() {
        return subnet;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    
}
