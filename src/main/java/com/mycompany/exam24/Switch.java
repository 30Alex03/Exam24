package com.mycompany.exam24;

import java.util.List;

/**
 *
 * @author ivahn
 */
public class Switch {
    private String name;
    private String subnet;
    private Object[] ports;

    public Switch(String name, String subnet) {
        this.name = name;
        this.subnet = subnet;
        this.ports = new Object[29];
    }

    public String getName() {
        return name;
    }

    public String getSubnet() {
        return subnet;
    }
}
