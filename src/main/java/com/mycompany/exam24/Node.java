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

    public Node(String name, String subnet) {
        this.name = name;
        this.subnet = subnet;
        this.ipAddress = generateIpAddress();
        this.isActive = true;
    }

    private String generateIpAddress() {
        try {
            String[] subnetParts = subnet.split("/");
            InetAddress baseIp = InetAddress.getByName(subnetParts[0]);
            int subnetMask = Integer.parseInt(subnetParts[1]);
            int availableIps = (int) Math.pow(2, 32 - subnetMask) - 2;
            int randomIp = new Random().nextInt(availableIps - 1) + 1;
            byte[] ipBytes = incrementIpAddress(baseIp.getAddress(), randomIp);
            return InetAddress.getByAddress(ipBytes).getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static byte[] incrementIpAddress(byte[] ip, int increment) {
        int intIp = (ip[0] & 0xFF) << 24 | (ip[1] & 0xFF) << 16 | (ip[2] & 0xFF) << 8 | (ip[3] & 0xFF);
        intIp += increment;
        return new byte[] {
                (byte) (intIp >>> 24),
                (byte) (intIp >>> 16),
                (byte) (intIp >>> 8),
                (byte) intIp
        };
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

    public boolean isActive() {
        return isActive;
    }
}
