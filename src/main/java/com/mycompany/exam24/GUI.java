package com.mycompany.exam24;

import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.Random;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

/**
 *
 * @author ivahn
 */
public class GUI extends javax.swing.JFrame {
    
    private List<Router> routers;
    private List<Switch> switches;
    private List<Node> nodes;
    
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        routers = new ArrayList<>();
        switches = new ArrayList<>();
        nodes = new ArrayList<>();
    }
    
    private void generateNetwork() {
        int numRouters = Integer.parseInt(routerTextField.getText());
        int subnetMask = Integer.parseInt(subnetTextField.getText());

        for (int i = 0; i < numRouters; i++) {
            Router router = new Router("Router" + (i + 1), subnetMask);
            routers.add(router);

            for (String subnet : router.getSubnets()) {
                Switch switch_ = new Switch("Switch" + (switches.size() + 1), subnet);
                switches.add(switch_);

                for (int j = 0; j < random(1, 29); j++) {
                    Node node = new Node("Node" + (nodes.size() + 1), switch_.getSubnet());
                    nodes.add(node);
                }
            }
        }

        displayNetwork();
    }

    private void displayNetwork() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Сеть");
        for (Router router : routers) {
            DefaultMutableTreeNode routerNode = new DefaultMutableTreeNode(router.getName());
            root.add(routerNode);
            for (String subnet : router.getSubnets()) {
				DefaultMutableTreeNode subnetNode = new DefaultMutableTreeNode(subnet);
                routerNode.add(subnetNode);
                for (Switch switch_ : switches) {
                    if (switch_.getSubnet().equals(subnet)) {
                        DefaultMutableTreeNode switchNode = new DefaultMutableTreeNode(switch_.getName());
                        subnetNode.add(switchNode);
                        for (Node node : nodes) {
                            if (node.getSubnet().equals(switch_.getSubnet())) {
                                DefaultMutableTreeNode nodeNode = new DefaultMutableTreeNode(node.getName());
                                switchNode.add(nodeNode);
                            }
                        }
                    }
                }
            }
        }
        networkTree.setModel(new DefaultTreeModel(root));
        networkTree.addTreeSelectionListener(e -> showNodeInfo());
    }

    private void showNodeInfo() {
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) networkTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            String nodeName = selectedNode.getUserObject().toString();
            for (Node node : nodes) {
                if (node.getName().equals(nodeName)) {
                    
                    nodeInfoTextArea.setText("Имя: " + node.getName() + "\nIP-адрес: " + node.getIpAddress() + "\nСостояние: " + (node.getIsSleepMode() ? "Активен" : "Спящий"));
                    return;
                }
            }
            for (Switch switch_ : switches) {
                if (switch_.getName().equals(nodeName)) {
                    nodeInfoTextArea.setText("Имя: " + switch_.getName() + "\nПодсеть: " + switch_.getSubnet());
                    return;
                }
            }
            for (Router router : routers) {
                if (router.getName().equals(nodeName)) {
                    nodeInfoTextArea.setText("Имя: " + router.getName() + "\nМаска подсети: /" + router.getSubnetMask());
                    return;
                }
            }
        }
    }
    
    private void showNodeInfo2() {
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) networkTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            String nodeName = selectedNode.getUserObject().toString();
            for (Node node : nodes) {
                if (node.getName().equals(nodeName)) {
                    
                    nodeInfo2TextArea.setText("Имя: " + node.getName() + "\nIP-адрес: " + node.getIpAddress() + "\nСостояние: " + (node.getIsSleepMode() ? "Активен" : "Спящий"));
                    return;
                }
            }
            for (Switch switch_ : switches) {
                if (switch_.getName().equals(nodeName)) {
                    nodeInfo2TextArea.setText("Имя: " + switch_.getName() + "\nПодсеть: " + switch_.getSubnet());
                    return;
                }
            }
            for (Router router : routers) {
                if (router.getName().equals(nodeName)) {
                    nodeInfo2TextArea.setText("Имя: " + router.getName() + "\nМаска подсети: /" + router.getSubnetMask());
                    return;
                }
            }
        }
    }

    private int random(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        networkPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkTree = new javax.swing.JTree();
        infoPanel = new javax.swing.JPanel();
        infoLabel = new javax.swing.JLabel();
        nodeInfoScrollPane = new javax.swing.JScrollPane();
        nodeInfoTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        nodeInfo2TextArea = new javax.swing.JTextArea();
        info2Label = new javax.swing.JLabel();
        setNode2Button = new javax.swing.JButton();
        startPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        routerTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        subnetTextField = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        sleepModeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(networkTree);

        infoLabel.setText("Информация об узле 1: ");

        nodeInfoTextArea.setColumns(20);
        nodeInfoTextArea.setRows(5);
        nodeInfoScrollPane.setViewportView(nodeInfoTextArea);

        nodeInfo2TextArea.setColumns(20);
        nodeInfo2TextArea.setRows(5);
        jScrollPane2.setViewportView(nodeInfo2TextArea);

        info2Label.setText("Информация об узле 2:");

        setNode2Button.setText("Добавить узел");
        setNode2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setNode2ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, infoPanelLayout.createSequentialGroup()
                        .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addComponent(setNode2Button)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(info2Label, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
            .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(infoPanelLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(nodeInfoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(181, Short.MAX_VALUE)))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addComponent(setNode2Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(info2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(infoPanelLayout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(nodeInfoScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout networkPanelLayout = new javax.swing.GroupLayout(networkPanel);
        networkPanel.setLayout(networkPanelLayout);
        networkPanelLayout.setHorizontalGroup(
            networkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(networkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        networkPanelLayout.setVerticalGroup(
            networkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
            .addGroup(networkPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setText("Количество маршрутизаторов:");

        routerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routerTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Маска подсети(24-28): ");

        generateButton.setText("Сгенерировать");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        sleepModeButton.setText("Спящий режим");
        sleepModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sleepModeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(startPanel);
        startPanel.setLayout(startPanelLayout);
        startPanelLayout.setHorizontalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(startPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
                        .addContainerGap(217, Short.MAX_VALUE)
                        .addComponent(sleepModeButton)
                        .addGap(177, 177, 177)))
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generateButton)
                    .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(subnetTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(routerTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
                .addGap(17, 17, 17))
        );
        startPanelLayout.setVerticalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(routerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subnetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(startPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(generateButton)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sleepModeButton)
                        .addGap(18, 18, 18))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(networkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(startPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(networkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        generateNetwork();
    }//GEN-LAST:event_generateButtonActionPerformed

    private void routerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routerTextFieldActionPerformed

    private void sleepModeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sleepModeButtonActionPerformed
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) networkTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            String nodeName = selectedNode.getUserObject().toString();
            for (Node node : nodes) {
                if (node.getName().equals(nodeName)) {
                    node.setSleepMode(false);
                    nodeInfoTextArea.setText("Имя: " + node.getName() + "\nIP-адрес: " + node.getIpAddress() + "\nСостояние: " + (node.getIsSleepMode() ? "Активен" : "Спящий"));
                    return;
                }
            }
        }
    }//GEN-LAST:event_sleepModeButtonActionPerformed

    private void setNode2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setNode2ButtonActionPerformed
        showNodeInfo2();
    }//GEN-LAST:event_setNode2ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel info2Label;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel networkPanel;
    private javax.swing.JTree networkTree;
    private javax.swing.JTextArea nodeInfo2TextArea;
    private javax.swing.JScrollPane nodeInfoScrollPane;
    private javax.swing.JTextArea nodeInfoTextArea;
    private javax.swing.JTextField routerTextField;
    private javax.swing.JButton setNode2Button;
    private javax.swing.JButton sleepModeButton;
    private javax.swing.JPanel startPanel;
    private javax.swing.JTextField subnetTextField;
    // End of variables declaration//GEN-END:variables
}
