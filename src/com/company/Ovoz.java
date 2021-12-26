package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Scanner;

import static java.lang.System.in;

public class Ovoz extends JFrame implements Hayvon{
    private JList royxat1;
    private JList royxat2;
    private JButton tugma;
    private ScrollPane pane;
    private JTextArea area;
    static String[] massiv=new String[1000];
  private static String[] matn={"1-qism","2-qism","3-qism","4-qism","5-qism","6-qism","7-qism","8-qism","9-qism","10-qism"};
    public Ovoz(){
        super("Jlist bilan ishlash");
        setLayout(new FlowLayout());
        pane=new ScrollPane();
        pane.getVScrollbarWidth();
        Scanner scanner=new Scanner(in);
        area=new JTextArea();
        royxat1=new JList(matn);
        royxat1.setVisibleRowCount(6);
        royxat1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        royxat1.add(area);
        add(royxat1);
        royxat2=new JList();
        royxat2.setFixedCellWidth(40);
        royxat2.setFixedCellHeight(60);
        tugma=new JButton("Otkaz->>");
       tugma.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               royxat2.setListData(royxat1.getSelectedValues());
           }
       });
       royxat2.setVisibleRowCount(5);
       royxat2.setVisible(true);
       add(tugma);
       add(royxat2);
       setDefaultCloseOperation(3);
       setVisible(true);
       setSize(new Dimension(400,400));
       setLocationRelativeTo(null);
    }

    @Override
    public void oziqlan() {
        
    }

    @Override
    public void sayrQil() {

    }
}