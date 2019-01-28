package com.w.core.tools;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Abstract Window Toolkit and String
 *
 */

public class AWTSwing {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("JFrame"); // 框架
        jFrame.setVisible(true);
        jFrame.setSize(400, 400);

        JPanel jPanel = new JPanel(); // 面板

        JButton jButton = new JButton("JButton"); // 按钮
        jButton.addActionListener(new ActionListener() { // 监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jFrame, "图片不能为空!!", "错误", JOptionPane.ERROR_MESSAGE);
            }
        });

        jPanel.add(jButton);

        jFrame.add(jPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭

    }


}
