package com.gj2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
	
	public static Gamesim gamesim = new Gamesim(0);
/*
	public static void createAndShowUI() {
		MainWindow mainWindow = new MainWindow(gamesim);
		
		JFrame frame = new JFrame("Some Monkeys Building a temple");
		frame.getContentPane().add(mainWindow.getCardContainerPanel(), BorderLayout.CENTER);
		frame.getContentPane().add(mainWindow.getComboPanel(), BorderLayout.PAGE_END);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280,800);
		//frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
*/
   // to run Swing in a thread-safe way
   public static void main(String[] args) {
	    //new testGui(gamesim);

	    
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                myGui GUI = new myGui();
                GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GUI.setVisible(true);
            }
        });
	    
	    
	   
/*
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            createAndShowUI();
         }
      });
  */    
      
   }
}
