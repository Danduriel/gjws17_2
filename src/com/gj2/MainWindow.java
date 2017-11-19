package com.gj2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MainWindow {
	
	
	private CardLayout cardLayout = new CardLayout();

   // *** JPanel to hold the "cards" and to use the CardLayout:
	private JPanel cardContainer = new JPanel(cardLayout); 
	private JComboBox cardCombo = new JComboBox();
	private JPanel comboPanel = new JPanel();;

	public MainWindow(Gamesim gamesim) {
	   // MAIN MENUE
	   
		JPanel greenPanel = new JPanel(new BorderLayout());
		greenPanel.setBackground(Color.green);
		greenPanel.add(new JScrollPane(new JTextArea(10, 25)), BorderLayout.CENTER);
		greenPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		greenPanel.add(new JButton("Bottom Button"), BorderLayout.PAGE_END);
		String green = "Green Panel";cardContainer.add(greenPanel, green);
		cardCombo.addItem(green);

		

		
		
		//Game panel
		JPanel gamePanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		gamePanel.setBackground(Color.red);

		JButton button;
		JLabel label;
		button = new JButton("Button 1");
		label = new JLabel("Derp");
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		gamePanel.add(button, c);
		
		button = new JButton("Button 2");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 0;
		gamePanel.add(button, c);
		
		
		c.gridx = 1;
		c.gridy = 0;	
		gamePanel.add(new JLabel("Runde: "+ gamesim.turn));
		c.gridx = 1;
		c.gridy = 1;		
		gamePanel.add(new JLabel("Tempel Fortschritt: "+ gamesim.temple.progress),c);
		c.gridy = 2;
		gamePanel.add(new JLabel("Eifer: " + gamesim.temple.zeal),c);
		c.gridy = 3;
		gamePanel.add(new JLabel("Dynamit: " + gamesim.player.dynamite),c);
		c.gridy = 4;
		gamePanel.add(new JLabel("Bier: " + gamesim.player.beer),c);
		c.gridy = 5;
		gamePanel.add(new JLabel("Bananen-Dollar: " + gamesim.player.money),c);
		c.gridy = 6;
		gamePanel.add(new JLabel("Follower: " + gamesim.player.follower),c);   
      
		button = new JButton("Next Turn");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 7;
		gamePanel.add(button, c);
		
		
		//gamePanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	    String red = "Game Panel";
	    cardContainer.add(gamePanel, red);
	    cardCombo.addItem(red);
	    
      
	    // SHOP Panel
      
	    JPanel bluePanel = new JPanel();
	    bluePanel.setBackground(Color.blue);
	    
	    label = new JLabel("Blue Panel", SwingConstants.CENTER);
	    label.setForeground(Color.white);
	    label.setFont(label.getFont().deriveFont(Font.BOLD, 32f));
	    bluePanel.add(label);
	    String blue = "Blue Panel";
	    cardContainer.add(bluePanel, blue);
	    cardCombo.addItem(blue);

	    comboPanel.add(cardCombo);
	    cardCombo.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
            String item = cardCombo.getSelectedItem().toString();

            // *** if combo box changes it tells the CardLayout to
            // *** swap views based on the item selected in the combo box:
            cardLayout.show(cardContainer, item);
         }
      });
   }

   public JPanel getCardContainerPanel() {
      return cardContainer;
   }


   public Component getComboPanel() {
      return comboPanel ;
   }

}
