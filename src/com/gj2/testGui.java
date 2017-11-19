package com.gj2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class testGui extends JFrame implements ActionListener{

	
	 // Grafikelemente
    private JPanel daten, ausgabe, aktionen;

    private JTextArea taAusgabefeld;
    private JButton bnext;
    
    
     

         
        public testGui(Gamesim gamesim) {  //Konstruktor
            super("Monkeys building a temple"); 
            
            setLayout(new BorderLayout());
            add(new JLabel("daten"), BorderLayout.NORTH);
            add(new JLabel("ausgabe"), BorderLayout.CENTER);
            add(new JLabel("ereignis"), BorderLayout. SOUTH);
            setSize(1280,800);
            
            daten= new JPanel();
            ausgabe= new JPanel();
            aktionen= new JPanel();
            
            getContentPane().add("North",daten);
            getContentPane().add("Center",ausgabe);
            getContentPane().add("South", aktionen);
            daten.setLayout(new GridLayout (4,2));
               
            //North
            
    		daten.add(new JLabel("Runde: "+ gamesim.turn));
    		daten.add(new JLabel("Tempel Fortschritt: "+ gamesim.temple.progress));
    		daten.add(new JLabel("Eifer: " + gamesim.temple.zeal));
    		daten.add(new JLabel("Dynamit: " + gamesim.player.dynamite));
    		daten.add(new JLabel("Bier: " + gamesim.player.beer));
    		daten.add(new JLabel("Banen-Dollar: " + gamesim.player.money));
    		daten.add(new JLabel("Follower: " + gamesim.player.follower));   
    		

            //Center
            taAusgabefeld=new JTextArea(500, 500);
            taAusgabefeld.setLineWrap(true);
            ausgabe.add(taAusgabefeld);

            
            //South
            
            bnext=new JButton ("Nächste Runde");
            aktionen.add(bnext);
            bnext.addActionListener(this);
            
            pack();
            setVisible(true); // Sichtbar machen
        }


		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
}
