package com.gj2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainMenue extends JFrame implements ActionListener
{
	
    // Variablen
    String eingabex, eingabey;
    int eingabeX, eingabeY;
    int punkte;
    int schatzX, schatzY;
    int peterx, petery;
    int peterX, peterY;  
    
    // Grafikelemente
    private JPanel daten, ausgabe, ereignis;
    private JLabel lPunkte;
    private JTextField tPunkte;
    private JTextArea taAusgabefeld;
    private JButton bNeu, bFeld, bHilfe, bTipps;
     
     
    public MainMenue() {  //Konstruktor
        super("Schatzsuche"); 
        setLayout(new BorderLayout());
        add(new JLabel("daten"), BorderLayout.NORTH);
        add(new JLabel("ausgabe"), BorderLayout.CENTER);
        add(new JLabel("ereignis"), BorderLayout. SOUTH);
        setSize(1280,800);
        
        daten= new JPanel();
        ausgabe= new JPanel();
        ereignis= new JPanel();
        getContentPane().add("North",daten);
        getContentPane().add("Center",ausgabe);
        getContentPane().add("South", ereignis);
        daten.setLayout(new GridLayout (4,2));
           
        //North
        lPunkte=new JLabel("Punkte:  ");
        daten.add(lPunkte);        
        tPunkte=new JTextField(10);
        daten.add(tPunkte);

        //Center
        taAusgabefeld=new JTextArea(15, 31);
        taAusgabefeld.setLineWrap(true);
        ausgabe.add(taAusgabefeld);

        
        //South
        bNeu=new JButton("Neu");
        ereignis.add(bNeu);
        bNeu.addActionListener(this);
        
        bFeld=new JButton ("Feld anzeigen");
        ereignis.add(bFeld);
        bFeld.addActionListener(this);
        
        bHilfe=new JButton ("Hilfe");
        ereignis.add(bHilfe);
        bHilfe.addActionListener(this);
        
        bTipps=new JButton ("Tipp");
        ereignis.add(bTipps);
        bTipps.addActionListener(this);
        
        
        
        setVisible(true); // Sichtbar machen
    }


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
