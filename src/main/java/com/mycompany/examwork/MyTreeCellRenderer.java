package com.mycompany.examwork;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 *
 * @author ivahn
 */
public class MyTreeCellRenderer extends DefaultTreeCellRenderer {

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value,
            boolean sel, boolean exp, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, sel, exp, leaf, row, hasFocus);

        // Assuming you have a tree of Strings
        Object node = (Object) ((DefaultMutableTreeNode) value).getUserObject();

        // If the node is a leaf and ends with "xxx"
        if (node instanceof Node) {
            Node n = (Node) node;
            if (n.getIsSleepMode()) {
                // Paint the node in blue
                setForeground(Color.gray);
            } else {
                setForeground(new Color(0, 100, 0 ));
            }
        }

        return this;
    }
}
