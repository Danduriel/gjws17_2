package com.gj2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
	
	public static Gamesim gamesim = new Gamesim(0);

	public static void createAndShowUI() {
		MainWindow simplecardDemo = new MainWindow(gamesim);
		
		JFrame frame = new JFrame("Some Monkeys Building a temple");
		frame.getContentPane().add(simplecardDemo.getCardContainerPanel(), BorderLayout.CENTER);
		frame.getContentPane().add(simplecardDemo.getComboPanel(), BorderLayout.PAGE_END);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

   // to run Swing in a thread-safe way
   public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            createAndShowUI();
         }
      });
   }
}
