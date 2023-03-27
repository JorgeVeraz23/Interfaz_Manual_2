/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplicacion7;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author USER
 */
public class BotonColores extends JFrame implements ActionListener{
    
    private JLabel label1;
    private JButton btnverde,btnrojo;
    
    public BotonColores(){
        super("Botones de Colores");
        setLayout(null);
        label1 = new JLabel("Botones de colores");
        btnverde = new JButton("Boton verde");
        //en el siguiente establecemos la pocision x, y, ancho, largo respectivamente
        btnverde.setBounds(50,200,120,40);
        btnverde.setBackground(Color.green);
        btnrojo = new JButton("Boton rojo");
        btnrojo.setBounds(250,200,120,40);
        btnrojo.setBackground(Color.red);
        label1.setBounds(150,20,150,40);
        add(btnverde);
        add(btnrojo);
        add(label1);
        btnverde.addActionListener(this);
        btnrojo.addActionListener(this);
    }
    
    
    public static void main(String[] args) {
        BotonColores bc = new BotonColores();
        bc.setBounds(0,0,400,400);
        bc.setResizable(false);
        bc.setLocationRelativeTo(null);
        bc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bc.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnverde){
            JOptionPane.showMessageDialog(null, "Presionaste el boton verde");            
        }
        if(e.getSource()==btnrojo){
            JOptionPane.showMessageDialog(null, "Presionaste el boton rojo");
            System.exit(0);
        }
    }
}
