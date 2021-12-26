package com.company;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Grafika extends JFrame {

    private JTextField manzil;
    private JEditorPane korsat;
   public Grafika(){
        super("Bizning web brauzer");
       manzil=new JTextField("Web manzilni kiriting");
       manzil.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent hodisa) {
               yuklash(hodisa.getActionCommand());
           }
       });
       add(manzil, BorderLayout.NORTH);
       korsat=new JEditorPane();
       korsat.setEditable(false);
       korsat.addHyperlinkListener(new HyperlinkListener() {
           @Override
           public void hyperlinkUpdate(HyperlinkEvent hodisa) {
               yuklash(hodisa.getURL().toString());

           }
       });
       add(new JScrollPane(korsat),BorderLayout.CENTER);
       setDefaultCloseOperation(3);
       setVisible(true);
       setSize(400,400);
       setLocation(150,250);
    }


    private  void yuklash(String webManzil){
        try {
            korsat.setPage(webManzil);
            manzil.setText(webManzil);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(),this.getTitle(),JOptionPane.ERROR_MESSAGE);
        }
    }
}