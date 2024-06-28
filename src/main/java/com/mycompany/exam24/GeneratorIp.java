package com.mycompany.exam24;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;

/**
 *
 * @author ivahn
 */
public class GeneratorIp {
       
    public static byte[] incrementIpAddress(byte[] ip, int increment) {
        int intIp = (ip[0] & 0xFF) << 24 | (ip[1] & 0xFF) << 16 | (ip[2] & 0xFF) << 8 | (ip[3] & 0xFF);
        intIp += increment;
        return new byte[] {
                (byte) (intIp >>> 24),
                (byte) (intIp >>> 16),
                (byte) (intIp >>> 8),
                (byte) intIp
        };
    }
    
}
