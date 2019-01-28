package com.w.core.tools;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class ScreenCapture2 extends JFrame implements ActionListener {

    private JPanel jPanel;
    private JTabbedPane jTabbedPane;
    private JButton jButton;
    private JRadioButton jRadioButton;
    private BufferedImage bufferedImage;
    private int index;

    public ScreenCapture2() {
        super("Screen Capture");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        jButton = new JButton("BEGIN");
        jButton.addActionListener(this);
        this.setSize(500,400);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ScreenCapture2();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
