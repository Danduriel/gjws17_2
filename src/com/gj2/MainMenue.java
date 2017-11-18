package com.gj2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenue extends JFrame implements ActionListener
{
    
    // Grafikelemente
    private JPanel ereignis;
    private JLabel titel;
    private JButton bNew, bLoad, bSave, bCredits, bQuit;
     
     
    public MainMenue() {  //Konstruktor
        super("Everybody loves Bananabeer!"); 
        setLayout(new BorderLayout());
        add(new JLabel("ereignis"), BorderLayout. CENTER);
        setSize(1280,800);
        
        ereignis= new JPanel();
        getContentPane().add("Center", ereignis);
        ereignis.setLayout(new GridLayout (6,1));
        
        //Center
        //Titel mittig anzeigen
        titel = new JLabel("EVERYBODY LOVES BANANABEER!");
        titel.setHorizontalAlignment(JLabel.CENTER);
        titel.setFont(new Font("Arial", Font.BOLD, 50));
        ereignis.add(titel);
        
        //Buttons
        bNew=new JButton("Neues Spiel");
        bNew.setFont(new Font("Arial", Font.BOLD, 35));
        ereignis.add(bNew);
        bNew.addActionListener(this);
        
        bLoad=new JButton ("Spiel laden");
        bLoad.setFont(new Font("Arial", Font.BOLD, 35));
        ereignis.add(bLoad);
        bLoad.addActionListener(this);
        
        bSave=new JButton ("Spiel speichern");
        bSave.setFont(new Font("Arial", Font.BOLD, 35));
        ereignis.add(bSave);
        bSave.addActionListener(this);
        
        bCredits=new JButton ("Credits");
        bCredits.setFont(new Font("Arial", Font.BOLD, 35));
        ereignis.add(bCredits);
        bCredits.addActionListener(this);
        
        bQuit=new JButton ("Beenden");
        bQuit.setFont(new Font("Arial", Font.BOLD, 35));
        ereignis.add(bQuit);
        bQuit.addActionListener(this);
        
        setVisible(true); // Sichtbar machen
    }


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
