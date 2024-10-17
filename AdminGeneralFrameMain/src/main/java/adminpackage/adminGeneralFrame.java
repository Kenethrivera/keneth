package adminpackage;   

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class adminGeneralFrame extends JFrame implements ActionListener {

    JButton btnAdd, btnUpdate, btnDelete, btnSearchEvents;
    JLabel lblBackgroundImage;

    adminGeneralFrame() {
        setSize(1000, 800);
        setTitle("name of business");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        ImageIcon bg = new ImageIcon("eventventurebg.jpg");
        Image image = bg.getImage();
        Image image1 = image.getScaledInstance(1000, 800, Image.SCALE_SMOOTH);
        bg = new ImageIcon(image1);

        lblBackgroundImage = new JLabel();
        lblBackgroundImage.setIcon(bg);
        lblBackgroundImage.setBounds(0, 0, 1000, 800);
        add(lblBackgroundImage);

        btnAdd = new JButton("ADD");
        btnAdd.setFont(new Font("Serif", Font.BOLD, 20));
        btnAdd.setBounds(90, 500, 180, 40);
        btnAdd.setForeground(Color.LIGHT_GRAY);
        btnAdd.setFocusable(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setOpaque(false);
        btnAdd.setBorderPainted(false);
        btnAdd.setFocusPainted(false);
        btnAdd.addActionListener(this);
        lblBackgroundImage.add(btnAdd);

        btnUpdate = new JButton("UPDATE");
        btnUpdate.setFont(new Font("Serif", Font.BOLD, 20));
        btnUpdate.setBounds(290, 500, 180, 40);
        btnUpdate.setForeground(Color.LIGHT_GRAY);
        btnUpdate.setFocusable(false);
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.setOpaque(false);
        btnUpdate.setBorderPainted(false);
        btnUpdate.setFocusPainted(false);
        btnUpdate.addActionListener(this);
        lblBackgroundImage.add(btnUpdate);

        btnDelete = new JButton("DELETE");
        btnDelete.setFont(new Font("Serif", Font.BOLD, 20));
        btnDelete.setBounds(490, 500, 180, 40);
        btnDelete.setForeground(Color.LIGHT_GRAY);
        btnDelete.setFocusable(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.setOpaque(false);
        btnDelete.setBorderPainted(false);
        btnDelete.setFocusPainted(false);
        btnDelete.addActionListener(e -> {
            // Delete event logic
        });
        lblBackgroundImage.add(btnDelete);

        btnSearchEvents = new JButton("SEARCH");
        btnSearchEvents.setFont(new Font("Serif", Font.BOLD, 20));
        btnSearchEvents.setBounds(690, 500, 180, 40);
        btnSearchEvents.setForeground(Color.LIGHT_GRAY);
        btnSearchEvents.setFocusable(false);
        btnSearchEvents.setContentAreaFilled(false);
        btnSearchEvents.setOpaque(false);
        btnSearchEvents.setBorderPainted(false);
        btnSearchEvents.setFocusPainted(false);
        btnSearchEvents.addActionListener(e -> {
            // Search event logic
        });
        lblBackgroundImage.add(btnSearchEvents);

        setVisible(true);
    }

    @Override
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btnAdd) {
        this.dispose();
        new adminAddEvent();
    } else if (e.getSource() == btnUpdate) {
        this.dispose();
        new adminAddEvent();
    } else if (e.getSource() == btnDelete){
        this.dispose();
        
    } else if (e.getSource() == btnSearchEvents){
        this.dispose();
    }
}
}
