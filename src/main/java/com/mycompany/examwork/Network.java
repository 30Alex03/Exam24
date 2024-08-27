package com.mycompany.examwork;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ivahn
 */
public class Network {
        private final Subnet subnet;
        private final List<Commutator> commutators;
        private final List<Node> nodes;
        private final List<Router> routers;

        public Network(Subnet subnet, List<Commutator> commutators, List<Node> nodes, List<Router> routers) {
            this.subnet = subnet;
            this.commutators = commutators;
            this.nodes = nodes;
            this.routers = routers;
        }

        public Subnet getSubnet() {
            return subnet;
        }

        public List<Commutator> getCommutators() {
            return commutators;
        }

        public List<Node> getNodes() {
            return nodes;
        }

        public List<Router> getRouters() {
            return routers;
        }
    
}
