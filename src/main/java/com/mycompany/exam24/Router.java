package com.mycompany.exam24;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.net.InetAddress;

/**
 *
 * @author ivahn
 */
public class Router {
    private String name;
    private int subnetMask;
    private List<String> subnets;
    GeneratorIp generatorIp = new GeneratorIp();
    
    public Router(String name, int subnetMask) {
        this.name = name;
        this.subnetMask = subnetMask;
        this.subnets = createSubnets();
    }
    
    private List<String> createSubnets() {
        List<String> subnets = new ArrayList<>();
        try {
            InetAddress baseIp = InetAddress.getByName("192.168.0.0");
            for (int i = 0; i < Math.pow(2, 32 - subnetMask); i++) {
                String subnet = InetAddress.getByAddress(baseIp.getAddress()).getHostAddress() + "/" + subnetMask;
                subnets.add(subnet);
                baseIp = InetAddress.getByAddress(generatorIp.incrementIpAddress(baseIp.getAddress(), 2 << (32 - subnetMask)));
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return subnets;
    }
    
    public String getName() {
        return name;
    }

    public int getSubnetMask() {
        return subnetMask;
    }

    public List<String> getSubnets() {
        return subnets;
    }
}
