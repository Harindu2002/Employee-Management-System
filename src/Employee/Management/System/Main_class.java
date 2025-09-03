package Employee.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Main_class extends JFrame {
    Main_class(){

     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
     Image i2 = i1.getImage().getScaledInstance(1120,630, Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel img = new JLabel(i3);
     img.setBounds(0,0,1120,630);
     add(img);

     JLabel heading = new JLabel("Employee Management System");
     heading.setBounds(400,80,400,40);
     heading.setFont(new Font("Raleway",Font.BOLD,25));
     img.add(heading);

     JButton add = new JButton("Add Employee");
     add.setBounds(400,180,150,40);
     add.setForeground(Color.WHITE);
     add.setBackground(Color.black);
     add.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

         }
     });
     img.add(add);

     JButton view = new JButton("View Employee");
     view.setBounds(600,180,150,40);
     view.setForeground(Color.WHITE);
     view.setBackground(Color.black);
     view.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

         }
     });
     img.add(view);

     JButton rem = new JButton("Remove Employee");
     rem.setBounds(480,250,150,40);
     rem.setForeground(Color.WHITE);
     rem.setBackground(Color.black);
     rem.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

         }
     });
     img.add(rem);



     setSize(1120,630);
     setLocation(250,100);
     setLayout(null);
     setVisible(true);
 }

    public static void main(String[] args){
     new Main_class();
    }

}
