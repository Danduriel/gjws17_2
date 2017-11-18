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
		JPanel gamePanel = new JPanel();
		gamePanel.setBackground(Color.red);
		gamePanel.add(new JButton("Foo"));
		gamePanel.add(new JButton("Foo2"));
		gamePanel.add(new JLabel("Tempel Fortschritt: "));
		gamePanel.add(new JLabel("Eifer: "));
		gamePanel.add(new JLabel("Dynamit: "));
		gamePanel.add(new JLabel("Bier: "));
		gamePanel.add(new JLabel("Banen-Dollar: "));
		gamePanel.add(new JLabel("Dynamit Effizienz: " + gamesim.player.dynamiteEfficiency));
      
      
		gamePanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	    String red = "Game Panel";
	    cardContainer.add(gamePanel, red);
	    cardCombo.addItem(red);

      
	    // SHOP Panel
      
	    JPanel bluePanel = new JPanel();
	    bluePanel.setBackground(Color.blue);
	    JLabel label = new JLabel("Blue Panel", SwingConstants.CENTER);
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

   private static void createAndShowUI() {
      MainWindow simplecardDemo = new MainWindow();

      JFrame frame = new JFrame("Simple CardLayout Demo");
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
