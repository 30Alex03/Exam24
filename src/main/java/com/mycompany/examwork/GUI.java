package com.mycompany.examwork;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author ivahn
 */
public class GUI extends javax.swing.JFrame {
    
    DefaultTreeModel model;
    DefaultMutableTreeNode routers = new DefaultMutableTreeNode();
    TreePath b1;
    TreePath b2;
    boolean x;
    Node node;
    
    
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        networkTree.setCellRenderer(new MyTreeCellRenderer());
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane = new javax.swing.JOptionPane();
        jDialog = new javax.swing.JDialog();
        changeIPAdressDialog = new javax.swing.JDialog();
        ipAdressTextField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        routerTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        createRoutersButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkTree = new javax.swing.JTree();
        mask = new javax.swing.JTextField();
        addMaskButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        firstTextArea = new javax.swing.JTextArea();
        exitButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        secondTextArea = new javax.swing.JTextArea();
        info1Button = new javax.swing.JButton();
        info2Button = new javax.swing.JButton();
        resultButton = new javax.swing.JButton();
        newStatusButton = new javax.swing.JButton();
        changeIPAdressButton = new javax.swing.JButton();

        javax.swing.GroupLayout jDialogLayout = new javax.swing.GroupLayout(jDialog.getContentPane());
        jDialog.getContentPane().setLayout(jDialogLayout);
        jDialogLayout.setHorizontalGroup(
            jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialogLayout.setVerticalGroup(
            jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        confirmButton.setText("Подтвердить новый IP");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Введите значение от 0 до 256");

        javax.swing.GroupLayout changeIPAdressDialogLayout = new javax.swing.GroupLayout(changeIPAdressDialog.getContentPane());
        changeIPAdressDialog.getContentPane().setLayout(changeIPAdressDialogLayout);
        changeIPAdressDialogLayout.setHorizontalGroup(
            changeIPAdressDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeIPAdressDialogLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(changeIPAdressDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeIPAdressDialogLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(changeIPAdressDialogLayout.createSequentialGroup()
                        .addComponent(ipAdressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(confirmButton)
                        .addGap(65, 65, 65))))
        );
        changeIPAdressDialogLayout.setVerticalGroup(
            changeIPAdressDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeIPAdressDialogLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(changeIPAdressDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ipAdressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        routerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routerTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Количество маршрутизаторов");

        createRoutersButton.setText("Создать маршрутизаторы");
        createRoutersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRoutersButtonActionPerformed(evt);
            }
        });

        networkTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                networkTreeMouseClicked(evt);
            }
        });
        networkTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                networkTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(networkTree);

        mask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maskActionPerformed(evt);
            }
        });

        addMaskButton.setText("Добавить маску ");
        addMaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMaskButtonActionPerformed(evt);
            }
        });

        firstTextArea.setColumns(20);
        firstTextArea.setRows(5);
        jScrollPane2.setViewportView(firstTextArea);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        secondTextArea.setColumns(20);
        secondTextArea.setRows(5);
        jScrollPane3.setViewportView(secondTextArea);

        info1Button.setText("отобразить 1 узел");
        info1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info1ButtonActionPerformed(evt);
            }
        });

        info2Button.setText("отобразить 2 узел");
        info2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                info2ButtonActionPerformed(evt);
            }
        });

        resultButton.setText("Отобразить результат");
        resultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButtonActionPerformed(evt);
            }
        });

        newStatusButton.setText("Обновить статус");
        newStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStatusButtonActionPerformed(evt);
            }
        });

        changeIPAdressButton.setText("Изменить ip адрес");
        changeIPAdressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeIPAdressButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(routerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mask, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addMaskButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(createRoutersButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(resultButton, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newStatusButton, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(314, 314, 314)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info1Button)
                    .addComponent(info2Button)
                    .addComponent(exitButton)
                    .addComponent(changeIPAdressButton))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(routerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(createRoutersButton))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addMaskButton)
                                    .addComponent(mask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(newStatusButton)
                                    .addComponent(changeIPAdressButton))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(resultButton)
                                    .addComponent(exitButton)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(info1Button)
                        .addGap(58, 58, 58)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(info2Button)
                        .addGap(44, 44, 44))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void routerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routerTextFieldActionPerformed

    private void createRoutersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRoutersButtonActionPerformed
        NetworkGenerator networkGenerator = new NetworkGenerator();
        int numRouters = Integer.parseInt(routerTextField.getText());
        for (int i = 1; i < (numRouters+1); i++) {
            DefaultMutableTreeNode router = new DefaultMutableTreeNode(networkGenerator.createRouter(i));
            routers.add(router);
        }
        
        model = (DefaultTreeModel) networkTree.getModel();
        model.setRoot(routers);
        networkTree.setModel(model);
    }//GEN-LAST:event_createRoutersButtonActionPerformed

    private void networkTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_networkTreeMouseClicked
        
//DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) networkTree.getCellRenderer();
        //renderer.setTextSelectionColor(Color.red);
        //renderer.setBackgroundSelectionColor(Color.blue);
        //renderer.setBorderSelectionColor(Color.red);
        //renderer.setForeground();
        /*
        networkTree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                TreePath path = e.getNewLeadSelectionPath();
                if (path != null) {
                    // Получаем информацию о первом узле
                    DefaultMutableTreeNode firstNode = (DefaultMutableTreeNode) path.getPathComponent(0);
                    String firstNodeInfo = firstNode.toString();

                    // Выводим информацию о двух узлах в текстовые области
                    // Предполагается, что у вас есть две текстовые области, которые вы хотите заполнить
                    // Например, JTextArea firstTextArea и JTextArea secondTextArea
                    firstTextArea.setText(firstNodeInfo);
                    
                }
            }
        });*/
    }//GEN-LAST:event_networkTreeMouseClicked

    private void maskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maskActionPerformed

    private void addMaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMaskButtonActionPerformed
        NetworkGenerator networkGenerator = new NetworkGenerator();
        int num = Integer.parseInt(mask.getText());
        int np = getRandomPrinter();
        int p = num-23;
        int t = getRandomPort();
        int u = t/28 + 1;
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) networkTree.getSelectionPath().getLastPathComponent();
        for (int i = 1; i < (p+1); i++) {
            DefaultMutableTreeNode newSubnet = new DefaultMutableTreeNode(networkGenerator.createSubnet(i, num));
                for (int j = 1; j < (u + 1); j++) {
                    DefaultMutableTreeNode newCommutator = new DefaultMutableTreeNode(networkGenerator.createCommutator(j));
                        for (int k = 1; k < 29; k++) {
                            boolean v = getisSleepMode();
                            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(networkGenerator.createNode(k, t, v));
                            if (np != 0){
                                DefaultMutableTreeNode newNetworkPrinter = new DefaultMutableTreeNode(networkGenerator.createNetworkPrinter(np));
                                newCommutator.add(newNetworkPrinter);
                                np--;
                                k++;
                            }
                            newCommutator.add(newNode);
                            t--;
                            if (t == 0) break;
                    }
                    newSubnet.add(newCommutator);
            }
            selectedNode.add(newSubnet);
        }
        DefaultTreeModel model = (DefaultTreeModel) networkTree.getModel();
        model.reload();
    }//GEN-LAST:event_addMaskButtonActionPerformed

    
    private void networkTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_networkTreeValueChanged
        
    }//GEN-LAST:event_networkTreeValueChanged

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void info1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info1ButtonActionPerformed
        /*if (node.isSleepMode() == true){
            
        }*/
        Object[] array = networkTree.getSelectionPath().getPath();
        
        
        String p = "";
        for (int i = 1; i < array.length; i++) {
            p += array[i].toString() + " ";
        }
        //Object node = (Object) ((DefaultMutableTreeNode) value).getUserObject();
        Object object = ((DefaultMutableTreeNode) networkTree.getSelectionPath().getLastPathComponent()).getUserObject();
        if (object instanceof Node){
            Node node = (Node) object;
            if(node.getIsSleepMode()){
                p = "Is sleeping";
            }
        } 
        firstTextArea.setText(p);
        if (array.length == 5){
            b1 = networkTree.getSelectionPath();
            
        } else x = true;
        
    }//GEN-LAST:event_info1ButtonActionPerformed

    private void info2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_info2ButtonActionPerformed
        Object[] array = networkTree.getSelectionPath().getPath();
        String p = "";
        for (int i = 1; i < array.length; i++) {
            p += array[i].toString() + " ";
        }
        Object object = ((DefaultMutableTreeNode) networkTree.getSelectionPath().getLastPathComponent()).getUserObject();
        if (object instanceof Node){
            Node node = (Node) object;
            if(node.getIsSleepMode()){
                p = "Is sleeping";
            }
        } 
        secondTextArea.setText(p);
        if (array.length == 5){
            b2 = networkTree.getSelectionPath();
        }  else x = true;
    }//GEN-LAST:event_info2ButtonActionPerformed

    private void resultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultButtonActionPerformed
        if (b1 == null || b2 == null) {
            showMessageDialog("Выберите что-то из дерева", "Ошибка");
        } else if (x) {
            showMessageDialog("Выбран не узел", "Ошибка");
            x = false;
        } else if (b1.getPathComponent(3) == b2.getPathComponent(3)) {
            showMessageDialog("Связаны", "Информация");
        } else {
            showMessageDialog("Не связаны", "Информация");
        }
    }//GEN-LAST:event_resultButtonActionPerformed

    private void newStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStatusButtonActionPerformed
        Object object = ((DefaultMutableTreeNode) networkTree.getSelectionPath().getLastPathComponent()).getUserObject();
        if (object instanceof Node){
            Node node = (Node) object;
            if(node.getIsSleepMode()){
                node.setSleepMode(false);
            } else {node.setSleepMode(true);}
        } 
    }//GEN-LAST:event_newStatusButtonActionPerformed

    private void changeIPAdressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeIPAdressButtonActionPerformed
        Object object = ((DefaultMutableTreeNode) networkTree.getSelectionPath().getLastPathComponent()).getUserObject();
        Node node = (Node) object;
        if(node.isSleepMode){
            showMessageDialog("Невозможно изменить ip-адрес", "Ошибка");
        } else{
            changeIPAdressDialog.setTitle("Изменение IP-адреса");
            changeIPAdressDialog.setModal(true);
            changeIPAdressDialog.setSize(600, 300); 
            changeIPAdressDialog.setLocationRelativeTo(null);
            changeIPAdressDialog.setVisible(true);
        }
    }//GEN-LAST:event_changeIPAdressButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        Object object = ((DefaultMutableTreeNode) networkTree.getSelectionPath().getLastPathComponent()).getUserObject();
        Node node = (Node) object;
        int num = Integer.parseInt(ipAdressTextField.getText());
            if(num < 257){
                node.setMask(num);
                // Здесь вы должны обновить текущий IP-адрес узла
                showMessageDialog(node.toString(), "Новый IP-адрес:");
                //System.out.println("Новый IP-адрес: " + node.toString());
            } else {
                showMessageDialog("Неверный IP-адрес", "Ошибка");
            }
    }//GEN-LAST:event_confirmButtonActionPerformed
    
    
    public int getRandomNodes(int min, int max) {        
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public int getRandomPort() {
        Random random = new Random();
        return 1 + random.nextInt(255);
    }
    
    public boolean getisSleepMode() {        
        Random random = new Random();
        boolean isSleepMode = random.nextBoolean();
        return isSleepMode;
    } 
    
    public int getRandomPrinter() {
        Random random = new Random();
        return 1 + random.nextInt(3);
    }
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
    private javax.swing.JButton addMaskButton;
    private javax.swing.JButton changeIPAdressButton;
    private javax.swing.JDialog changeIPAdressDialog;
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton createRoutersButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextArea firstTextArea;
    private javax.swing.JButton info1Button;
    private javax.swing.JButton info2Button;
    private javax.swing.JTextField ipAdressTextField;
    private javax.swing.JDialog jDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JOptionPane jOptionPane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField mask;
    private javax.swing.JTree networkTree;
    private javax.swing.JButton newStatusButton;
    private javax.swing.JButton resultButton;
    private javax.swing.JTextField routerTextField;
    private javax.swing.JTextArea secondTextArea;
    // End of variables declaration//GEN-END:variables

    private void showMessageDialog(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
