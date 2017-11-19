
/*
 * Created by JFormDesigner on Sun Nov 19 14:17:25 CET 2017
 */

package com.gj2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Bob Monkey
 */
public class myGui extends JFrame {
	Gamesim gamesim;
	Dialog dialog;
	
	public myGui(Gamesim gamesim) {
		this.gamesim = gamesim;
		initComponents();
	}

	private void btNextTurnMouseClicked(MouseEvent e) {
		// TODO add your code here
		if (radioButton1.isSelected()) {
			gamesim.tempAP = ActionCreator.clickBeerButton();
		}
		else if (radioButton2.isSelected()) {
			gamesim.tempAP = ActionCreator.clickDynamiteButton();
		}
		else if (radioButton3.isSelected()) {
			gamesim.tempAP = ActionCreator.clickBunButton();
		}
		else if (radioButton4.isSelected()) {
			gamesim.tempAP = ActionCreator.clickPommesButton();
		}
		else if (radioButton5.isSelected()) {
			gamesim.tempAP = ActionCreator.clickShoesButton();
		}
		else if (radioButton6.isSelected()) {
			gamesim.tempAP = ActionCreator.clickBusButton();
		}
		else if (radioButton7.isSelected()) {
			gamesim.tempAP = ActionCreator.clickDixiButton();
		}
		
		
		gamesim.update();

		//Label Update
		labelTurnValue.setText(Integer.toString(gamesim.turn));
		labelAPValue.setText(Integer.toString(gamesim.player.ap));
		labelDynamiteValue.setText(Integer.toString(gamesim.player.dynamite));
		labelBeerValue.setText(Integer.toString(gamesim.player.beer));
		labelMoneyValue.setText(Integer.toString(gamesim.player.money));
		labelFollowerValue.setText(Integer.toString(gamesim.player.follower));
		

		
		
		
		
		radioButton1.setSelected(false);
		radioButton2.setSelected(false);
		radioButton3.setSelected(false);
		radioButton4.setSelected(false);
		radioButton5.setSelected(false);
		radioButton6.setSelected(false);
		radioButton7.setSelected(false);
		
		
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
        		dialog = new Dialog();
        		//Updates
        		dialog.setTitle(gamesim.tempEvent.name);
        		dialog.labelEventMessage.setText(gamesim.tempEvent.description);
        		dialog.label1.setText(Integer.toString(gamesim.tempEvent.ap));
        		dialog.label2.setText(Integer.toString(gamesim.tempEvent.dynamite));
        		dialog.label3.setText(Integer.toString(gamesim.tempEvent.beer));
        		dialog.label4.setText(Integer.toString(gamesim.tempEvent.money));
        		dialog.label5.setText(Integer.toString(gamesim.tempEvent.follower));
        		dialog.label6.setText(Double.toString(gamesim.tempEvent.zeal));
        		dialog.label7.setText(Double.toString(gamesim.tempEvent.progress));
        		
        		dialog.setVisible(true);
            }
        });
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Bob Monkey
		labelNextAction = new JLabel();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();
		label6 = new JLabel();
		label7 = new JLabel();
		label8 = new JLabel();
		labelTurn = new JLabel();
		labelTurnValue = new JLabel();
		radioButton1 = new JRadioButton();
		label9 = new JLabel();
		label10 = new JLabel();
		label11 = new JLabel();
		label12 = new JLabel();
		label13 = new JLabel();
		label14 = new JLabel();
		label15 = new JLabel();
		labelAP = new JLabel();
		labelAPValue = new JLabel();
		radioButton2 = new JRadioButton();
		label16 = new JLabel();
		label17 = new JLabel();
		label18 = new JLabel();
		label19 = new JLabel();
		label20 = new JLabel();
		label21 = new JLabel();
		label22 = new JLabel();
		labelDynamite = new JLabel();
		labelDynamiteValue = new JLabel();
		radioButton3 = new JRadioButton();
		label23 = new JLabel();
		label24 = new JLabel();
		label25 = new JLabel();
		label26 = new JLabel();
		label27 = new JLabel();
		label28 = new JLabel();
		label29 = new JLabel();
		labelBeer = new JLabel();
		labelBeerValue = new JLabel();
		radioButton4 = new JRadioButton();
		label30 = new JLabel();
		label31 = new JLabel();
		label32 = new JLabel();
		label33 = new JLabel();
		label34 = new JLabel();
		label35 = new JLabel();
		label36 = new JLabel();
		labelMoney = new JLabel();
		labelMoneyValue = new JLabel();
		radioButton5 = new JRadioButton();
		label37 = new JLabel();
		label38 = new JLabel();
		label39 = new JLabel();
		label40 = new JLabel();
		label41 = new JLabel();
		label42 = new JLabel();
		label43 = new JLabel();
		labelFollower = new JLabel();
		labelFollowerValue = new JLabel();
		radioButton6 = new JRadioButton();
		label44 = new JLabel();
		label45 = new JLabel();
		label46 = new JLabel();
		label47 = new JLabel();
		label48 = new JLabel();
		label49 = new JLabel();
		label50 = new JLabel();
		radioButton7 = new JRadioButton();
		label51 = new JLabel();
		label52 = new JLabel();
		label53 = new JLabel();
		label54 = new JLabel();
		label55 = new JLabel();
		label56 = new JLabel();
		label57 = new JLabel();
		labelZeal = new JLabel();
		labelZealValue = new JLabel();
		labelProgress = new JLabel();
		labelProgressValue = new JLabel();
		btNextTurn = new JButton();

		//======== this ========
		setTitle("MONKEY TEMPLE THINGYS");
		Container contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[81,fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- labelNextAction ----
		labelNextAction.setText("W\u00e4hle die n\u00e4chste Aktion:");
		labelNextAction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelNextAction, "cell 1 0");

		//---- label1 ----
		label1.setText("Kosten:");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label1, "cell 3 0");

		//---- label2 ----
		//Test Alex new ImageIcon(getClass().getResource("images\button.png"

		label2.setIcon(new ImageIcon("assets/icons/kacka_icon.png"));
		contentPane.add(label2, "cell 5 0");

		//---- label3 ----
		label3.setIcon(new ImageIcon("assets/icons/dynamit_icon.png"));
		contentPane.add(label3, "cell 6 0");

		//---- label4 ----
		label4.setIcon(new ImageIcon("assets/icons/flasche_icon.png"));
		contentPane.add(label4, "cell 7 0");

		//---- label5 ----
		label5.setIcon(new ImageIcon("assets/icons/geld_icon.png"));
		contentPane.add(label5, "cell 8 0");

		//---- label6 ----
		label6.setIcon(new ImageIcon("assets/icons/affe_icon.png"));
		contentPane.add(label6, "cell 9 0");

		//---- label7 ----
		label7.setIcon(new ImageIcon("assets/icons/zeal_icon.png"));
		contentPane.add(label7, "cell 10 0");

		//---- label8 ----
		label8.setIcon(new ImageIcon("assets/icons/bagger_icon.png"));
		contentPane.add(label8, "cell 11 0");

		//---- labelTurn ----
		labelTurn.setText("Turn:");
		labelTurn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelTurn.setIcon(null);
		contentPane.add(labelTurn, "cell 41 0");

		//---- labelTurnValue ----
		labelTurnValue.setText("0");
		labelTurnValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelTurnValue, "cell 42 0");

		//---- radioButton1 ----
		radioButton1.setText("Party schmeissen");
		radioButton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton1.setToolTipText("Versuche die eifrigen Affen zu verkatern.");
		contentPane.add(radioButton1, "cell 1 1");

		//---- label9 ----
		label9.setText("0");
		label9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label9.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label9, "cell 5 1");

		//---- label10 ----
		label10.setText("0");
		label10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label10.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label10, "cell 6 1");

		//---- label11 ----
		label11.setText("0");
		label11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label11.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label11, "cell 7 1");

		//---- label12 ----
		label12.setText("0");
		label12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label12.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label12, "cell 8 1");

		//---- label13 ----
		label13.setText("0");
		label13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label13.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label13, "cell 9 1");

		//---- label14 ----
		label14.setText("0");
		label14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label14.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label14, "cell 10 1");

		//---- label15 ----
		label15.setText("0");
		label15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label15.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label15, "cell 11 1");

		//---- labelAP ----
		labelAP.setText("Aktionspunkte:");
		labelAP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelAP.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\kacka_icon.png"));
		contentPane.add(labelAP, "cell 41 1");

		//---- labelAPValue ----
		labelAPValue.setText("0");
		labelAPValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelAPValue, "cell 42 1");

		//---- radioButton2 ----
		radioButton2.setText("Sabotiere Baustelle");
		radioButton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton2.setToolTipText("Sabotiere die Baustelle mit etwas Explosiven.");
		contentPane.add(radioButton2, "cell 1 2");

		//---- label16 ----
		label16.setText("0");
		label16.setHorizontalAlignment(SwingConstants.CENTER);
		label16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label16, "cell 5 2");

		//---- label17 ----
		label17.setText("0");
		label17.setHorizontalAlignment(SwingConstants.CENTER);
		label17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label17, "cell 6 2");

		//---- label18 ----
		label18.setText("0");
		label18.setHorizontalAlignment(SwingConstants.CENTER);
		label18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label18, "cell 7 2");

		//---- label19 ----
		label19.setText("0");
		label19.setHorizontalAlignment(SwingConstants.CENTER);
		label19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label19, "cell 8 2");

		//---- label20 ----
		label20.setText("0");
		label20.setHorizontalAlignment(SwingConstants.CENTER);
		label20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label20, "cell 9 2");

		//---- label21 ----
		label21.setText("0");
		label21.setHorizontalAlignment(SwingConstants.CENTER);
		label21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label21, "cell 10 2");

		//---- label22 ----
		label22.setText("0");
		label22.setHorizontalAlignment(SwingConstants.CENTER);
		label22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label22, "cell 11 2");

		//---- labelDynamite ----
		labelDynamite.setText("Dynamite:");
		labelDynamite.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelDynamite.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\dynamit_icon.png"));
		contentPane.add(labelDynamite, "cell 41 2");

		//---- labelDynamiteValue ----
		labelDynamiteValue.setText("0");
		labelDynamiteValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelDynamiteValue, "cell 42 2");

		//---- radioButton3 ----
		radioButton3.setText("Bun Alert!");
		radioButton3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton3.setToolTipText("Du lenkst alle Affen ab, in dem du flauschige Kaninchen auf der Baustelle losl\u00e4sst");
		contentPane.add(radioButton3, "cell 1 3");

		//---- label23 ----
		label23.setText("0");
		label23.setHorizontalAlignment(SwingConstants.CENTER);
		label23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label23, "cell 5 3");

		//---- label24 ----
		label24.setText("0");
		label24.setHorizontalAlignment(SwingConstants.CENTER);
		label24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label24, "cell 6 3");

		//---- label25 ----
		label25.setText("0");
		label25.setHorizontalAlignment(SwingConstants.CENTER);
		label25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label25, "cell 7 3");

		//---- label26 ----
		label26.setText("0");
		label26.setHorizontalAlignment(SwingConstants.CENTER);
		label26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label26, "cell 8 3");

		//---- label27 ----
		label27.setText("0");
		label27.setHorizontalAlignment(SwingConstants.CENTER);
		label27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label27, "cell 9 3");

		//---- label28 ----
		label28.setText("0");
		label28.setHorizontalAlignment(SwingConstants.CENTER);
		label28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label28, "cell 10 3");

		//---- label29 ----
		label29.setText("0");
		label29.setHorizontalAlignment(SwingConstants.CENTER);
		label29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label29, "cell 11 3");

		//---- labelBeer ----
		labelBeer.setText("Bier:");
		labelBeer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelBeer.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\flasche_icon.png"));
		contentPane.add(labelBeer, "cell 41 3");

		//---- labelBeerValue ----
		labelBeerValue.setText("0");
		labelBeerValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelBeerValue, "cell 42 3");

		//---- radioButton4 ----
		radioButton4.setText("Lebensmittelvergiftung!");
		radioButton4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton4.setToolTipText("Du verkaufst den hungrigen Bauarbeiter-Affen ranzige Pommes.");
		contentPane.add(radioButton4, "cell 1 4");

		//---- label30 ----
		label30.setText("0");
		label30.setHorizontalAlignment(SwingConstants.CENTER);
		label30.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label30, "cell 5 4");

		//---- label31 ----
		label31.setText("0");
		label31.setHorizontalAlignment(SwingConstants.CENTER);
		label31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label31, "cell 6 4");

		//---- label32 ----
		label32.setText("0");
		label32.setHorizontalAlignment(SwingConstants.CENTER);
		label32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label32, "cell 7 4");

		//---- label33 ----
		label33.setText("0");
		label33.setHorizontalAlignment(SwingConstants.CENTER);
		label33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label33, "cell 8 4");

		//---- label34 ----
		label34.setText("0");
		label34.setHorizontalAlignment(SwingConstants.CENTER);
		label34.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label34, "cell 9 4");

		//---- label35 ----
		label35.setText("0");
		label35.setHorizontalAlignment(SwingConstants.CENTER);
		label35.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label35, "cell 10 4");

		//---- label36 ----
		label36.setText("0");
		label36.setHorizontalAlignment(SwingConstants.CENTER);
		label36.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label36, "cell 11 4");

		//---- labelMoney ----
		labelMoney.setText("Geld:");
		labelMoney.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelMoney.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\geld_icon.png"));
		contentPane.add(labelMoney, "cell 41 4");

		//---- labelMoneyValue ----
		labelMoneyValue.setText("0");
		labelMoneyValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelMoneyValue, "cell 42 4");

		//---- radioButton5 ----
		radioButton5.setText("Schnuersenkel-Chaos");
		radioButton5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton5.setToolTipText("Du bindest die Schnuersenkel aller Bauarbeiter-Affen aneinander.");
		contentPane.add(radioButton5, "cell 1 5");

		//---- label37 ----
		label37.setText("0");
		label37.setHorizontalAlignment(SwingConstants.CENTER);
		label37.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label37, "cell 5 5");

		//---- label38 ----
		label38.setText("0");
		label38.setHorizontalAlignment(SwingConstants.CENTER);
		label38.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label38, "cell 6 5");

		//---- label39 ----
		label39.setText("0");
		label39.setHorizontalAlignment(SwingConstants.CENTER);
		label39.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label39, "cell 7 5");

		//---- label40 ----
		label40.setText("0");
		label40.setHorizontalAlignment(SwingConstants.CENTER);
		label40.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label40, "cell 8 5");

		//---- label41 ----
		label41.setText("0");
		label41.setHorizontalAlignment(SwingConstants.CENTER);
		label41.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label41, "cell 9 5");

		//---- label42 ----
		label42.setText("0");
		label42.setHorizontalAlignment(SwingConstants.CENTER);
		label42.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label42, "cell 10 5");

		//---- label43 ----
		label43.setText("0");
		label43.setHorizontalAlignment(SwingConstants.CENTER);
		label43.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label43, "cell 11 5");

		//---- labelFollower ----
		labelFollower.setText("Follower:");
		labelFollower.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelFollower.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\affe_icon.png"));
		contentPane.add(labelFollower, "cell 41 5");

		//---- labelFollowerValue ----
		labelFollowerValue.setText("0");
		labelFollowerValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelFollowerValue, "cell 42 5");

		//---- radioButton6 ----
		radioButton6.setText("Bestechung");
		radioButton6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton6.setToolTipText("Der Busfahrer faehrt auf dem Weg zur Tempel-Baustelle 'aus Versehen' einen Umweg.");
		contentPane.add(radioButton6, "cell 1 6");

		//---- label44 ----
		label44.setText("0");
		label44.setHorizontalAlignment(SwingConstants.CENTER);
		label44.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label44, "cell 5 6");

		//---- label45 ----
		label45.setText("0");
		label45.setHorizontalAlignment(SwingConstants.CENTER);
		label45.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label45, "cell 6 6");

		//---- label46 ----
		label46.setText("0");
		label46.setHorizontalAlignment(SwingConstants.CENTER);
		label46.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label46, "cell 7 6");

		//---- label47 ----
		label47.setText("0");
		label47.setHorizontalAlignment(SwingConstants.CENTER);
		label47.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label47, "cell 8 6");

		//---- label48 ----
		label48.setText("0");
		label48.setHorizontalAlignment(SwingConstants.CENTER);
		label48.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label48, "cell 9 6");

		//---- label49 ----
		label49.setText("0");
		label49.setHorizontalAlignment(SwingConstants.CENTER);
		label49.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label49, "cell 10 6");

		//---- label50 ----
		label50.setText("0");
		label50.setHorizontalAlignment(SwingConstants.CENTER);
		label50.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label50, "cell 11 6");

		//---- radioButton7 ----
		radioButton7.setText("Dixis umschubsen");
		radioButton7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton7.setToolTipText("Das wird ein laaaanger Tag fuer alle Bauarbeiter-Affen. Und dieser Duft erst.");
		contentPane.add(radioButton7, "cell 1 7");

		//---- label51 ----
		label51.setText("0");
		label51.setHorizontalAlignment(SwingConstants.CENTER);
		label51.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label51, "cell 5 7");

		//---- label52 ----
		label52.setText("0");
		label52.setHorizontalAlignment(SwingConstants.CENTER);
		label52.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label52, "cell 6 7");

		//---- label53 ----
		label53.setText("0");
		label53.setHorizontalAlignment(SwingConstants.CENTER);
		label53.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label53, "cell 7 7");

		//---- label54 ----
		label54.setText("0");
		label54.setHorizontalAlignment(SwingConstants.CENTER);
		label54.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label54, "cell 8 7");

		//---- label55 ----
		label55.setText("0");
		label55.setHorizontalAlignment(SwingConstants.CENTER);
		label55.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label55, "cell 9 7");

		//---- label56 ----
		label56.setText("0");
		label56.setHorizontalAlignment(SwingConstants.CENTER);
		label56.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label56, "cell 10 7");

		//---- label57 ----
		label57.setText("0");
		label57.setHorizontalAlignment(SwingConstants.CENTER);
		label57.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label57, "cell 11 7");

		//---- labelZeal ----
		labelZeal.setText("Zeal:");
		labelZeal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelZeal.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\zeal_icon.png"));
		contentPane.add(labelZeal, "cell 41 9");

		//---- labelZealValue ----
		labelZealValue.setText("0");
		labelZealValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelZealValue, "cell 42 9");

		//---- labelProgress ----
		labelProgress.setText("Progress:");
		labelProgress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelProgress.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\bagger_icon.png"));
		contentPane.add(labelProgress, "cell 41 10");

		//---- labelProgressValue ----
		labelProgressValue.setText("0");
		labelProgressValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelProgressValue, "cell 42 10");

		//---- btNextTurn ----
		btNextTurn.setText("Next Turn");
		btNextTurn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btNextTurn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btNextTurnMouseClicked(e);
			}
		});
		contentPane.add(btNextTurn, "cell 42 14 1 2");
		pack();
		setLocationRelativeTo(getOwner());

		//---- buttonGroup1 ----
		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(radioButton1);
		buttonGroup1.add(radioButton2);
		buttonGroup1.add(radioButton3);
		buttonGroup1.add(radioButton4);
		buttonGroup1.add(radioButton5);
		buttonGroup1.add(radioButton6);
		buttonGroup1.add(radioButton7);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Bob Monkey
	private JLabel labelNextAction;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel labelTurn;
	private JLabel labelTurnValue;
	private JRadioButton radioButton1;
	private JLabel label9;
	private JLabel label10;
	private JLabel label11;
	private JLabel label12;
	private JLabel label13;
	private JLabel label14;
	private JLabel label15;
	private JLabel labelAP;
	private JLabel labelAPValue;
	private JRadioButton radioButton2;
	private JLabel label16;
	private JLabel label17;
	private JLabel label18;
	private JLabel label19;
	private JLabel label20;
	private JLabel label21;
	private JLabel label22;
	private JLabel labelDynamite;
	private JLabel labelDynamiteValue;
	private JRadioButton radioButton3;
	private JLabel label23;
	private JLabel label24;
	private JLabel label25;
	private JLabel label26;
	private JLabel label27;
	private JLabel label28;
	private JLabel label29;
	private JLabel labelBeer;
	private JLabel labelBeerValue;
	private JRadioButton radioButton4;
	private JLabel label30;
	private JLabel label31;
	private JLabel label32;
	private JLabel label33;
	private JLabel label34;
	private JLabel label35;
	private JLabel label36;
	private JLabel labelMoney;
	private JLabel labelMoneyValue;
	private JRadioButton radioButton5;
	private JLabel label37;
	private JLabel label38;
	private JLabel label39;
	private JLabel label40;
	private JLabel label41;
	private JLabel label42;
	private JLabel label43;
	private JLabel labelFollower;
	private JLabel labelFollowerValue;
	private JRadioButton radioButton6;
	private JLabel label44;
	private JLabel label45;
	private JLabel label46;
	private JLabel label47;
	private JLabel label48;
	private JLabel label49;
	private JLabel label50;
	private JRadioButton radioButton7;
	private JLabel label51;
	private JLabel label52;
	private JLabel label53;
	private JLabel label54;
	private JLabel label55;
	private JLabel label56;
	private JLabel label57;
	private JLabel labelZeal;
	private JLabel labelZealValue;
	private JLabel labelProgress;
	private JLabel labelProgressValue;
	private JButton btNextTurn;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
/*
 * Created by JFormDesigner on Sun Nov 19 14:17:25 CET 2017
 */

package com.gj2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Bob Monkey
 */
public class myGui extends JFrame {
	Gamesim gamesim;
	Dialog dialog;
	
	public myGui(Gamesim gamesim) {
		this.gamesim = gamesim;
		initComponents();
	}

	private void btNextTurnMouseClicked(MouseEvent e) {
		// TODO add your code here
		if (radioButton1.isSelected()) {
			gamesim.tempAP = ActionCreator.clickBeerButton();
		}
		else if (radioButton2.isSelected()) {
			gamesim.tempAP = ActionCreator.clickDynamiteButton();
		}
		else if (radioButton3.isSelected()) {
			gamesim.tempAP = ActionCreator.clickBunButton();
		}
		else if (radioButton4.isSelected()) {
			gamesim.tempAP = ActionCreator.clickPommesButton();
		}
		else if (radioButton5.isSelected()) {
			gamesim.tempAP = ActionCreator.clickShoesButton();
		}
		else if (radioButton6.isSelected()) {
			gamesim.tempAP = ActionCreator.clickBusButton();
		}
		else if (radioButton7.isSelected()) {
			gamesim.tempAP = ActionCreator.clickDixiButton();
		}
		
		
		gamesim.update();

		//Label Update
		labelTurnValue.setText(Integer.toString(gamesim.turn));
		labelAPValue.setText(Integer.toString(gamesim.player.ap));
		labelDynamiteValue.setText(Integer.toString(gamesim.player.dynamite));
		labelBeerValue.setText(Integer.toString(gamesim.player.beer));
		labelMoneyValue.setText(Integer.toString(gamesim.player.money));
		labelFollowerValue.setText(Integer.toString(gamesim.player.follower));
		

		
		
		
		
		radioButton1.setSelected(false);
		radioButton2.setSelected(false);
		radioButton3.setSelected(false);
		radioButton4.setSelected(false);
		radioButton5.setSelected(false);
		radioButton6.setSelected(false);
		radioButton7.setSelected(false);
		
		
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
        		dialog = new Dialog();
        		//Updates
        		dialog.setTitle(gamesim.tempEvent.name);
        		dialog.labelEventMessage.setText(gamesim.tempEvent.description);
        		dialog.label1.setText(Integer.toString(gamesim.tempEvent.ap));
        		dialog.label2.setText(Integer.toString(gamesim.tempEvent.dynamite));
        		dialog.label3.setText(Integer.toString(gamesim.tempEvent.beer));
        		dialog.label4.setText(Integer.toString(gamesim.tempEvent.money));
        		dialog.label5.setText(Integer.toString(gamesim.tempEvent.follower));
        		dialog.label6.setText(Double.toString(gamesim.tempEvent.zeal));
        		dialog.label7.setText(Double.toString(gamesim.tempEvent.progress));
        		
        		dialog.setVisible(true);
            }
        });
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Bob Monkey
		labelNextAction = new JLabel();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();
		label6 = new JLabel();
		label7 = new JLabel();
		label8 = new JLabel();
		labelTurn = new JLabel();
		labelTurnValue = new JLabel();
		radioButton1 = new JRadioButton();
		label9 = new JLabel();
		label10 = new JLabel();
		label11 = new JLabel();
		label12 = new JLabel();
		label13 = new JLabel();
		label14 = new JLabel();
		label15 = new JLabel();
		labelAP = new JLabel();
		labelAPValue = new JLabel();
		radioButton2 = new JRadioButton();
		label16 = new JLabel();
		label17 = new JLabel();
		label18 = new JLabel();
		label19 = new JLabel();
		label20 = new JLabel();
		label21 = new JLabel();
		label22 = new JLabel();
		labelDynamite = new JLabel();
		labelDynamiteValue = new JLabel();
		radioButton3 = new JRadioButton();
		label23 = new JLabel();
		label24 = new JLabel();
		label25 = new JLabel();
		label26 = new JLabel();
		label27 = new JLabel();
		label28 = new JLabel();
		label29 = new JLabel();
		labelBeer = new JLabel();
		labelBeerValue = new JLabel();
		radioButton4 = new JRadioButton();
		label30 = new JLabel();
		label31 = new JLabel();
		label32 = new JLabel();
		label33 = new JLabel();
		label34 = new JLabel();
		label35 = new JLabel();
		label36 = new JLabel();
		labelMoney = new JLabel();
		labelMoneyValue = new JLabel();
		radioButton5 = new JRadioButton();
		label37 = new JLabel();
		label38 = new JLabel();
		label39 = new JLabel();
		label40 = new JLabel();
		label41 = new JLabel();
		label42 = new JLabel();
		label43 = new JLabel();
		labelFollower = new JLabel();
		labelFollowerValue = new JLabel();
		radioButton6 = new JRadioButton();
		label44 = new JLabel();
		label45 = new JLabel();
		label46 = new JLabel();
		label47 = new JLabel();
		label48 = new JLabel();
		label49 = new JLabel();
		label50 = new JLabel();
		radioButton7 = new JRadioButton();
		label51 = new JLabel();
		label52 = new JLabel();
		label53 = new JLabel();
		label54 = new JLabel();
		label55 = new JLabel();
		label56 = new JLabel();
		label57 = new JLabel();
		labelZeal = new JLabel();
		labelZealValue = new JLabel();
		labelProgress = new JLabel();
		labelProgressValue = new JLabel();
		btNextTurn = new JButton();

		//======== this ========
		setTitle("MONKEY TEMPLE THINGYS");
		Container contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[81,fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- labelNextAction ----
		labelNextAction.setText("W\u00e4hle die n\u00e4chste Aktion:");
		labelNextAction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelNextAction, "cell 1 0");

		//---- label1 ----
		label1.setText("Kosten:");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label1, "cell 3 0");

		//---- label2 ----
		label2.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\kacka_icon.png"));
		contentPane.add(label2, "cell 5 0");

		//---- label3 ----
		label3.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\dynamit_icon.png"));
		contentPane.add(label3, "cell 6 0");

		//---- label4 ----
		label4.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\flasche_icon.png"));
		contentPane.add(label4, "cell 7 0");

		//---- label5 ----
		label5.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\geld_icon.png"));
		contentPane.add(label5, "cell 8 0");

		//---- label6 ----
		label6.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\affe_icon.png"));
		contentPane.add(label6, "cell 9 0");

		//---- label7 ----
		label7.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\zeal_icon.png"));
		contentPane.add(label7, "cell 10 0");

		//---- label8 ----
		label8.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\bagger_icon.png"));
		contentPane.add(label8, "cell 11 0");

		//---- labelTurn ----
		labelTurn.setText("Turn:");
		labelTurn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelTurn.setIcon(null);
		contentPane.add(labelTurn, "cell 41 0");

		//---- labelTurnValue ----
		labelTurnValue.setText("0");
		labelTurnValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelTurnValue, "cell 42 0");

		//---- radioButton1 ----
		radioButton1.setText("Party schmeissen");
		radioButton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton1.setToolTipText("Versuche die eifrigen Affen zu verkatern.");
		contentPane.add(radioButton1, "cell 1 1");

		//---- label9 ----
		label9.setText("1");
		label9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label9.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label9, "cell 5 1");

		//---- label10 ----
		label10.setText(" 0");
		label10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label10.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label10, "cell 6 1");

		//---- label11 ----
		label11.setText("10");
		label11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label11.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label11, "cell 7 1");

		//---- label12 ----
		label12.setText(" 0");
		label12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label12.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label12, "cell 8 1");

		//---- label13 ----
		label13.setText(" 0");
		label13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label13.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label13, "cell 9 1");

		//---- label14 ----
		label14.setText(" 0");
		label14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label14.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label14, "cell 10 1");

		//---- label15 ----
		label15.setText(" 0");
		label15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label15.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label15, "cell 11 1");

		//---- labelAP ----
		labelAP.setText("Aktionspunkte:");
		labelAP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelAP.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\kacka_icon.png"));
		contentPane.add(labelAP, "cell 41 1");

		//---- labelAPValue ----
		labelAPValue.setText("0");
		labelAPValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelAPValue, "cell 42 1");

		//---- radioButton2 ----
		radioButton2.setText("Sabotiere Baustelle");
		radioButton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton2.setToolTipText("Sabotiere die Baustelle mit etwas Explosiven.");
		contentPane.add(radioButton2, "cell 1 2");

		//---- label16 ----
		label16.setText("2");
		label16.setHorizontalAlignment(SwingConstants.CENTER);
		label16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label16, "cell 5 2");

		//---- label17 ----
		label17.setText(" 1");
		label17.setHorizontalAlignment(SwingConstants.CENTER);
		label17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label17, "cell 6 2");

		//---- label18 ----
		label18.setText(" 0");
		label18.setHorizontalAlignment(SwingConstants.CENTER);
		label18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label18, "cell 7 2");

		//---- label19 ----
		label19.setText(" 0");
		label19.setHorizontalAlignment(SwingConstants.CENTER);
		label19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label19, "cell 8 2");

		//---- label20 ----
		label20.setText(" 0");
		label20.setHorizontalAlignment(SwingConstants.CENTER);
		label20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label20, "cell 9 2");

		//---- label21 ----
		label21.setText(" 0");
		label21.setHorizontalAlignment(SwingConstants.CENTER);
		label21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label21, "cell 10 2");

		//---- label22 ----
		label22.setText(" 0");
		label22.setHorizontalAlignment(SwingConstants.CENTER);
		label22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label22, "cell 11 2");

		//---- labelDynamite ----
		labelDynamite.setText("Dynamite:");
		labelDynamite.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelDynamite.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\dynamit_icon.png"));
		contentPane.add(labelDynamite, "cell 41 2");

		//---- labelDynamiteValue ----
		labelDynamiteValue.setText("0");
		labelDynamiteValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelDynamiteValue, "cell 42 2");

		//---- radioButton3 ----
		radioButton3.setText("Bun Alert!");
		radioButton3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton3.setToolTipText("Du lenkst alle Affen ab, in dem du flauschige Kaninchen auf der Baustelle losl\u00e4sst");
		contentPane.add(radioButton3, "cell 1 3");

		//---- label23 ----
		label23.setText("1");
		label23.setHorizontalAlignment(SwingConstants.CENTER);
		label23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label23, "cell 5 3");

		//---- label24 ----
		label24.setText(" 0");
		label24.setHorizontalAlignment(SwingConstants.CENTER);
		label24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label24, "cell 6 3");

		//---- label25 ----
		label25.setText(" 0");
		label25.setHorizontalAlignment(SwingConstants.CENTER);
		label25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label25, "cell 7 3");

		//---- label26 ----
		label26.setText(" 5");
		label26.setHorizontalAlignment(SwingConstants.CENTER);
		label26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label26, "cell 8 3");

		//---- label27 ----
		label27.setText(" 0");
		label27.setHorizontalAlignment(SwingConstants.CENTER);
		label27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label27, "cell 9 3");

		//---- label28 ----
		label28.setText(" 0");
		label28.setHorizontalAlignment(SwingConstants.CENTER);
		label28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label28, "cell 10 3");

		//---- label29 ----
		label29.setText(" 0");
		label29.setHorizontalAlignment(SwingConstants.CENTER);
		label29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label29, "cell 11 3");

		//---- labelBeer ----
		labelBeer.setText("Bier:");
		labelBeer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelBeer.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\flasche_icon.png"));
		contentPane.add(labelBeer, "cell 41 3");

		//---- labelBeerValue ----
		labelBeerValue.setText("0");
		labelBeerValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelBeerValue, "cell 42 3");

		//---- radioButton4 ----
		radioButton4.setText("Lebensmittelvergiftung!");
		radioButton4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton4.setToolTipText("Du verkaufst den hungrigen Bauarbeiter-Affen ranzige Pommes.");
		contentPane.add(radioButton4, "cell 1 4");

		//---- label30 ----
		label30.setText("5");
		label30.setHorizontalAlignment(SwingConstants.CENTER);
		label30.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label30, "cell 5 4");

		//---- label31 ----
		label31.setText(" 0");
		label31.setHorizontalAlignment(SwingConstants.CENTER);
		label31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label31, "cell 6 4");

		//---- label32 ----
		label32.setText(" 1");
		label32.setHorizontalAlignment(SwingConstants.CENTER);
		label32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label32, "cell 7 4");

		//---- label33 ----
		label33.setText(" 0");
		label33.setHorizontalAlignment(SwingConstants.CENTER);
		label33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label33, "cell 8 4");

		//---- label34 ----
		label34.setText(" 0");
		label34.setHorizontalAlignment(SwingConstants.CENTER);
		label34.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label34, "cell 9 4");

		//---- label35 ----
		label35.setText(" 0");
		label35.setHorizontalAlignment(SwingConstants.CENTER);
		label35.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label35, "cell 10 4");

		//---- label36 ----
		label36.setText(" 0");
		label36.setHorizontalAlignment(SwingConstants.CENTER);
		label36.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label36, "cell 11 4");

		//---- labelMoney ----
		labelMoney.setText("Geld:");
		labelMoney.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelMoney.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\geld_icon.png"));
		contentPane.add(labelMoney, "cell 41 4");

		//---- labelMoneyValue ----
		labelMoneyValue.setText("0");
		labelMoneyValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelMoneyValue, "cell 42 4");

		//---- radioButton5 ----
		radioButton5.setText("Schnuersenkel-Chaos");
		radioButton5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton5.setToolTipText("Du bindest die Schnuersenkel aller Bauarbeiter-Affen aneinander.");
		contentPane.add(radioButton5, "cell 1 5");

		//---- label37 ----
		label37.setText("3");
		label37.setHorizontalAlignment(SwingConstants.CENTER);
		label37.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label37, "cell 5 5");

		//---- label38 ----
		label38.setText(" 0");
		label38.setHorizontalAlignment(SwingConstants.CENTER);
		label38.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label38, "cell 6 5");

		//---- label39 ----
		label39.setText(" 0");
		label39.setHorizontalAlignment(SwingConstants.CENTER);
		label39.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label39, "cell 7 5");

		//---- label40 ----
		label40.setText(" 0");
		label40.setHorizontalAlignment(SwingConstants.CENTER);
		label40.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label40, "cell 8 5");

		//---- label41 ----
		label41.setText(" 0");
		label41.setHorizontalAlignment(SwingConstants.CENTER);
		label41.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label41, "cell 9 5");

		//---- label42 ----
		label42.setText(" 0");
		label42.setHorizontalAlignment(SwingConstants.CENTER);
		label42.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label42, "cell 10 5");

		//---- label43 ----
		label43.setText(" 0");
		label43.setHorizontalAlignment(SwingConstants.CENTER);
		label43.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label43, "cell 11 5");

		//---- labelFollower ----
		labelFollower.setText("Follower:");
		labelFollower.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelFollower.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\affe_icon.png"));
		contentPane.add(labelFollower, "cell 41 5");

		//---- labelFollowerValue ----
		labelFollowerValue.setText("0");
		labelFollowerValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelFollowerValue, "cell 42 5");

		//---- radioButton6 ----
		radioButton6.setText("Bestechung");
		radioButton6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton6.setToolTipText("Der Busfahrer faehrt auf dem Weg zur Tempel-Baustelle 'aus Versehen' einen Umweg.");
		contentPane.add(radioButton6, "cell 1 6");

		//---- label44 ----
		label44.setText("1");
		label44.setHorizontalAlignment(SwingConstants.CENTER);
		label44.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label44, "cell 5 6");

		//---- label45 ----
		label45.setText(" 0");
		label45.setHorizontalAlignment(SwingConstants.CENTER);
		label45.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label45, "cell 6 6");

		//---- label46 ----
		label46.setText(" 1");
		label46.setHorizontalAlignment(SwingConstants.CENTER);
		label46.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label46, "cell 7 6");

		//---- label47 ----
		label47.setText("15");
		label47.setHorizontalAlignment(SwingConstants.CENTER);
		label47.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label47, "cell 8 6");

		//---- label48 ----
		label48.setText(" 0");
		label48.setHorizontalAlignment(SwingConstants.CENTER);
		label48.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label48, "cell 9 6");

		//---- label49 ----
		label49.setText(" 0");
		label49.setHorizontalAlignment(SwingConstants.CENTER);
		label49.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label49, "cell 10 6");

		//---- label50 ----
		label50.setText(" 0");
		label50.setHorizontalAlignment(SwingConstants.CENTER);
		label50.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label50, "cell 11 6");

		//---- radioButton7 ----
		radioButton7.setText("Dixis umschubsen");
		radioButton7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton7.setToolTipText("Das wird ein laaaanger Tag fuer alle Bauarbeiter-Affen. Und dieser Duft erst.");
		contentPane.add(radioButton7, "cell 1 7");

		//---- label51 ----
		label51.setText("10");
		label51.setHorizontalAlignment(SwingConstants.CENTER);
		label51.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label51, "cell 5 7");

		//---- label52 ----
		label52.setText(" 0");
		label52.setHorizontalAlignment(SwingConstants.CENTER);
		label52.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label52, "cell 6 7");

		//---- label53 ----
		label53.setText(" 0");
		label53.setHorizontalAlignment(SwingConstants.CENTER);
		label53.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label53, "cell 7 7");

		//---- label54 ----
		label54.setText(" 0");
		label54.setHorizontalAlignment(SwingConstants.CENTER);
		label54.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label54, "cell 8 7");

		//---- label55 ----
		label55.setText(" 0");
		label55.setHorizontalAlignment(SwingConstants.CENTER);
		label55.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label55, "cell 9 7");

		//---- label56 ----
		label56.setText(" 0");
		label56.setHorizontalAlignment(SwingConstants.CENTER);
		label56.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label56, "cell 10 7");

		//---- label57 ----
		label57.setText(" 0");
		label57.setHorizontalAlignment(SwingConstants.CENTER);
		label57.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label57, "cell 11 7");

		//---- labelZeal ----
		labelZeal.setText("Zeal:");
		labelZeal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelZeal.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\zeal_icon.png"));
		contentPane.add(labelZeal, "cell 41 9");

		//---- labelZealValue ----
		labelZealValue.setText("0");
		labelZealValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelZealValue, "cell 42 9");

		//---- labelProgress ----
		labelProgress.setText("Progress:");
		labelProgress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelProgress.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\bagger_icon.png"));
		contentPane.add(labelProgress, "cell 41 10");

		//---- labelProgressValue ----
		labelProgressValue.setText("0");
		labelProgressValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelProgressValue, "cell 42 10");

		//---- btNextTurn ----
		btNextTurn.setText("Next Turn");
		btNextTurn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btNextTurn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btNextTurnMouseClicked(e);
			}
		});
		contentPane.add(btNextTurn, "cell 42 14 1 2");
		pack();
		setLocationRelativeTo(getOwner());

		//---- buttonGroup1 ----
		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(radioButton1);
		buttonGroup1.add(radioButton2);
		buttonGroup1.add(radioButton3);
		buttonGroup1.add(radioButton4);
		buttonGroup1.add(radioButton5);
		buttonGroup1.add(radioButton6);
		buttonGroup1.add(radioButton7);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Bob Monkey
	private JLabel labelNextAction;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel labelTurn;
	private JLabel labelTurnValue;
	private JRadioButton radioButton1;
	private JLabel label9;
	private JLabel label10;
	private JLabel label11;
	private JLabel label12;
	private JLabel label13;
	private JLabel label14;
	private JLabel label15;
	private JLabel labelAP;
	private JLabel labelAPValue;
	private JRadioButton radioButton2;
	private JLabel label16;
	private JLabel label17;
	private JLabel label18;
	private JLabel label19;
	private JLabel label20;
	private JLabel label21;
	private JLabel label22;
	private JLabel labelDynamite;
	private JLabel labelDynamiteValue;
	private JRadioButton radioButton3;
	private JLabel label23;
	private JLabel label24;
	private JLabel label25;
	private JLabel label26;
	private JLabel label27;
	private JLabel label28;
	private JLabel label29;
	private JLabel labelBeer;
	private JLabel labelBeerValue;
	private JRadioButton radioButton4;
	private JLabel label30;
	private JLabel label31;
	private JLabel label32;
	private JLabel label33;
	private JLabel label34;
	private JLabel label35;
	private JLabel label36;
	private JLabel labelMoney;
	private JLabel labelMoneyValue;
	private JRadioButton radioButton5;
	private JLabel label37;
	private JLabel label38;
	private JLabel label39;
	private JLabel label40;
	private JLabel label41;
	private JLabel label42;
	private JLabel label43;
	private JLabel labelFollower;
	private JLabel labelFollowerValue;
	private JRadioButton radioButton6;
	private JLabel label44;
	private JLabel label45;
	private JLabel label46;
	private JLabel label47;
	private JLabel label48;
	private JLabel label49;
	private JLabel label50;
	private JRadioButton radioButton7;
	private JLabel label51;
	private JLabel label52;
	private JLabel label53;
	private JLabel label54;
	private JLabel label55;
	private JLabel label56;
	private JLabel label57;
	private JLabel labelZeal;
	private JLabel labelZealValue;
	private JLabel labelProgress;
	private JLabel labelProgressValue;
	private JButton btNextTurn;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
=======
/*
 * Created by JFormDesigner on Sun Nov 19 14:17:25 CET 2017
 */

package com.gj2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Bob Monkey
 */
public class myGui extends JFrame {
	Gamesim gamesim;
	Dialog dialog;
	
	public myGui(Gamesim gamesim) {
		this.gamesim = gamesim;
		initComponents();
	}

	private void btNextTurnMouseClicked(MouseEvent e) {
		// TODO add your code here
		if (radioButton1.isSelected()) {
			gamesim.tempAP = ActionCreator.clickBeerButton();
		}
		else if (radioButton2.isSelected()) {
			gamesim.tempAP = ActionCreator.clickDynamiteButton();
		}
		else if (radioButton3.isSelected()) {
			gamesim.tempAP = ActionCreator.clickBunButton();
		}
		else if (radioButton4.isSelected()) {
			gamesim.tempAP = ActionCreator.clickPommesButton();
		}
		else if (radioButton5.isSelected()) {
			gamesim.tempAP = ActionCreator.clickShoesButton();
		}
		else if (radioButton6.isSelected()) {
			gamesim.tempAP = ActionCreator.clickBusButton();
		}
		else if (radioButton7.isSelected()) {
			gamesim.tempAP = ActionCreator.clickDixiButton();
		}
		
		
		gamesim.update();

		//Label Update
		labelTurnValue.setText(Integer.toString(gamesim.turn));
		labelAPValue.setText(Integer.toString(gamesim.player.ap));
		labelDynamiteValue.setText(Integer.toString(gamesim.player.dynamite));
		labelBeerValue.setText(Integer.toString(gamesim.player.beer));
		labelMoneyValue.setText(Integer.toString(gamesim.player.money));
		labelFollowerValue.setText(Integer.toString(gamesim.player.follower));
		

		
		
		
		
		radioButton1.setSelected(false);
		radioButton2.setSelected(false);
		radioButton3.setSelected(false);
		radioButton4.setSelected(false);
		radioButton5.setSelected(false);
		radioButton6.setSelected(false);
		radioButton7.setSelected(false);
		
		
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
        		dialog = new Dialog();
        		//Updates
        		dialog.setTitle(gamesim.tempEvent.name);
        		dialog.labelEventMessage.setText(gamesim.tempEvent.description);
        		dialog.label1.setText(Integer.toString(gamesim.tempEvent.ap));
        		dialog.label2.setText(Integer.toString(gamesim.tempEvent.dynamite));
        		dialog.label3.setText(Integer.toString(gamesim.tempEvent.beer));
        		dialog.label4.setText(Integer.toString(gamesim.tempEvent.money));
        		dialog.label5.setText(Integer.toString(gamesim.tempEvent.follower));
        		dialog.label6.setText(Double.toString(gamesim.tempEvent.zeal));
        		dialog.label7.setText(Double.toString(gamesim.tempEvent.progress));
        		
        		dialog.setVisible(true);
            }
        });
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Bob Monkey
		labelNextAction = new JLabel();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();
		label6 = new JLabel();
		label7 = new JLabel();
		label8 = new JLabel();
		labelTurn = new JLabel();
		labelTurnValue = new JLabel();
		radioButton1 = new JRadioButton();
		label9 = new JLabel();
		label10 = new JLabel();
		label11 = new JLabel();
		label12 = new JLabel();
		label13 = new JLabel();
		label14 = new JLabel();
		label15 = new JLabel();
		labelAP = new JLabel();
		labelAPValue = new JLabel();
		radioButton2 = new JRadioButton();
		label16 = new JLabel();
		label17 = new JLabel();
		label18 = new JLabel();
		label19 = new JLabel();
		label20 = new JLabel();
		label21 = new JLabel();
		label22 = new JLabel();
		labelDynamite = new JLabel();
		labelDynamiteValue = new JLabel();
		radioButton3 = new JRadioButton();
		label23 = new JLabel();
		label24 = new JLabel();
		label25 = new JLabel();
		label26 = new JLabel();
		label27 = new JLabel();
		label28 = new JLabel();
		label29 = new JLabel();
		labelBeer = new JLabel();
		labelBeerValue = new JLabel();
		radioButton4 = new JRadioButton();
		label30 = new JLabel();
		label31 = new JLabel();
		label32 = new JLabel();
		label33 = new JLabel();
		label34 = new JLabel();
		label35 = new JLabel();
		label36 = new JLabel();
		labelMoney = new JLabel();
		labelMoneyValue = new JLabel();
		radioButton5 = new JRadioButton();
		label37 = new JLabel();
		label38 = new JLabel();
		label39 = new JLabel();
		label40 = new JLabel();
		label41 = new JLabel();
		label42 = new JLabel();
		label43 = new JLabel();
		labelFollower = new JLabel();
		labelFollowerValue = new JLabel();
		radioButton6 = new JRadioButton();
		label44 = new JLabel();
		label45 = new JLabel();
		label46 = new JLabel();
		label47 = new JLabel();
		label48 = new JLabel();
		label49 = new JLabel();
		label50 = new JLabel();
		radioButton7 = new JRadioButton();
		label51 = new JLabel();
		label52 = new JLabel();
		label53 = new JLabel();
		label54 = new JLabel();
		label55 = new JLabel();
		label56 = new JLabel();
		label57 = new JLabel();
		labelZeal = new JLabel();
		labelZealValue = new JLabel();
		labelProgress = new JLabel();
		labelProgressValue = new JLabel();
		btNextTurn = new JButton();

		//======== this ========
		setTitle("MONKEY TEMPLE THINGYS");
		Container contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[81,fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- labelNextAction ----
		labelNextAction.setText("W\u00e4hle die n\u00e4chste Aktion:");
		labelNextAction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelNextAction, "cell 1 0");

		//---- label1 ----
		label1.setText("Kosten:");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label1, "cell 3 0");

		//---- label2 ----
		//Test Alex new ImageIcon(getClass().getResource("images\button.png"

		label2.setIcon(new ImageIcon("assets/icons/kacka_icon.png"));
		contentPane.add(label2, "cell 5 0");

		//---- label3 ----
		label3.setIcon(new ImageIcon("assets/icons/dynamit_icon.png"));
		contentPane.add(label3, "cell 6 0");

		//---- label4 ----
		label4.setIcon(new ImageIcon("assets\\icons\\flasche_icon.png"));
		contentPane.add(label4, "cell 7 0");

		//---- label5 ----
		label5.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\geld_icon.png"));
		contentPane.add(label5, "cell 8 0");

		//---- label6 ----
		label6.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\affe_icon.png"));
		contentPane.add(label6, "cell 9 0");

		//---- label7 ----
		label7.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\zeal_icon.png"));
		contentPane.add(label7, "cell 10 0");

		//---- label8 ----
		label8.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\bagger_icon.png"));
		contentPane.add(label8, "cell 11 0");

		//---- labelTurn ----
		labelTurn.setText("Turn:");
		labelTurn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelTurn.setIcon(null);
		contentPane.add(labelTurn, "cell 41 0");

		//---- labelTurnValue ----
		labelTurnValue.setText("0");
		labelTurnValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelTurnValue, "cell 42 0");

		//---- radioButton1 ----
		radioButton1.setText("Party schmeissen");
		radioButton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton1.setToolTipText("Versuche die eifrigen Affen zu verkatern.");
		contentPane.add(radioButton1, "cell 1 1");

		//---- label9 ----
		label9.setText("0");
		label9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label9.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label9, "cell 5 1");

		//---- label10 ----
		label10.setText("0");
		label10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label10.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label10, "cell 6 1");

		//---- label11 ----
		label11.setText("0");
		label11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label11.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label11, "cell 7 1");

		//---- label12 ----
		label12.setText("0");
		label12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label12.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label12, "cell 8 1");

		//---- label13 ----
		label13.setText("0");
		label13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label13.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label13, "cell 9 1");

		//---- label14 ----
		label14.setText("0");
		label14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label14.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label14, "cell 10 1");

		//---- label15 ----
		label15.setText("0");
		label15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label15.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label15, "cell 11 1");

		//---- labelAP ----
		labelAP.setText("Aktionspunkte:");
		labelAP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelAP.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\kacka_icon.png"));
		contentPane.add(labelAP, "cell 41 1");

		//---- labelAPValue ----
		labelAPValue.setText("0");
		labelAPValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelAPValue, "cell 42 1");

		//---- radioButton2 ----
		radioButton2.setText("Sabotiere Baustelle");
		radioButton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton2.setToolTipText("Sabotiere die Baustelle mit etwas Explosiven.");
		contentPane.add(radioButton2, "cell 1 2");

		//---- label16 ----
		label16.setText("0");
		label16.setHorizontalAlignment(SwingConstants.CENTER);
		label16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label16, "cell 5 2");

		//---- label17 ----
		label17.setText("0");
		label17.setHorizontalAlignment(SwingConstants.CENTER);
		label17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label17, "cell 6 2");

		//---- label18 ----
		label18.setText("0");
		label18.setHorizontalAlignment(SwingConstants.CENTER);
		label18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label18, "cell 7 2");

		//---- label19 ----
		label19.setText("0");
		label19.setHorizontalAlignment(SwingConstants.CENTER);
		label19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label19, "cell 8 2");

		//---- label20 ----
		label20.setText("0");
		label20.setHorizontalAlignment(SwingConstants.CENTER);
		label20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label20, "cell 9 2");

		//---- label21 ----
		label21.setText("0");
		label21.setHorizontalAlignment(SwingConstants.CENTER);
		label21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label21, "cell 10 2");

		//---- label22 ----
		label22.setText("0");
		label22.setHorizontalAlignment(SwingConstants.CENTER);
		label22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label22, "cell 11 2");

		//---- labelDynamite ----
		labelDynamite.setText("Dynamite:");
		labelDynamite.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelDynamite.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\dynamit_icon.png"));
		contentPane.add(labelDynamite, "cell 41 2");

		//---- labelDynamiteValue ----
		labelDynamiteValue.setText("0");
		labelDynamiteValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelDynamiteValue, "cell 42 2");

		//---- radioButton3 ----
		radioButton3.setText("Bun Alert!");
		radioButton3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton3.setToolTipText("Du lenkst alle Affen ab, in dem du flauschige Kaninchen auf der Baustelle losl\u00e4sst");
		contentPane.add(radioButton3, "cell 1 3");

		//---- label23 ----
		label23.setText("0");
		label23.setHorizontalAlignment(SwingConstants.CENTER);
		label23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label23, "cell 5 3");

		//---- label24 ----
		label24.setText("0");
		label24.setHorizontalAlignment(SwingConstants.CENTER);
		label24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label24, "cell 6 3");

		//---- label25 ----
		label25.setText("0");
		label25.setHorizontalAlignment(SwingConstants.CENTER);
		label25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label25, "cell 7 3");

		//---- label26 ----
		label26.setText("0");
		label26.setHorizontalAlignment(SwingConstants.CENTER);
		label26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label26, "cell 8 3");

		//---- label27 ----
		label27.setText("0");
		label27.setHorizontalAlignment(SwingConstants.CENTER);
		label27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label27, "cell 9 3");

		//---- label28 ----
		label28.setText("0");
		label28.setHorizontalAlignment(SwingConstants.CENTER);
		label28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label28, "cell 10 3");

		//---- label29 ----
		label29.setText("0");
		label29.setHorizontalAlignment(SwingConstants.CENTER);
		label29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label29, "cell 11 3");

		//---- labelBeer ----
		labelBeer.setText("Bier:");
		labelBeer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelBeer.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\flasche_icon.png"));
		contentPane.add(labelBeer, "cell 41 3");

		//---- labelBeerValue ----
		labelBeerValue.setText("0");
		labelBeerValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelBeerValue, "cell 42 3");

		//---- radioButton4 ----
		radioButton4.setText("Lebensmittelvergiftung!");
		radioButton4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton4.setToolTipText("Du verkaufst den hungrigen Bauarbeiter-Affen ranzige Pommes.");
		contentPane.add(radioButton4, "cell 1 4");

		//---- label30 ----
		label30.setText("0");
		label30.setHorizontalAlignment(SwingConstants.CENTER);
		label30.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label30, "cell 5 4");

		//---- label31 ----
		label31.setText("0");
		label31.setHorizontalAlignment(SwingConstants.CENTER);
		label31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label31, "cell 6 4");

		//---- label32 ----
		label32.setText("0");
		label32.setHorizontalAlignment(SwingConstants.CENTER);
		label32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label32, "cell 7 4");

		//---- label33 ----
		label33.setText("0");
		label33.setHorizontalAlignment(SwingConstants.CENTER);
		label33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label33, "cell 8 4");

		//---- label34 ----
		label34.setText("0");
		label34.setHorizontalAlignment(SwingConstants.CENTER);
		label34.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label34, "cell 9 4");

		//---- label35 ----
		label35.setText("0");
		label35.setHorizontalAlignment(SwingConstants.CENTER);
		label35.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label35, "cell 10 4");

		//---- label36 ----
		label36.setText("0");
		label36.setHorizontalAlignment(SwingConstants.CENTER);
		label36.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label36, "cell 11 4");

		//---- labelMoney ----
		labelMoney.setText("Geld:");
		labelMoney.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelMoney.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\geld_icon.png"));
		contentPane.add(labelMoney, "cell 41 4");

		//---- labelMoneyValue ----
		labelMoneyValue.setText("0");
		labelMoneyValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelMoneyValue, "cell 42 4");

		//---- radioButton5 ----
		radioButton5.setText("Schnuersenkel-Chaos");
		radioButton5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton5.setToolTipText("Du bindest die Schnuersenkel aller Bauarbeiter-Affen aneinander.");
		contentPane.add(radioButton5, "cell 1 5");

		//---- label37 ----
		label37.setText("0");
		label37.setHorizontalAlignment(SwingConstants.CENTER);
		label37.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label37, "cell 5 5");

		//---- label38 ----
		label38.setText("0");
		label38.setHorizontalAlignment(SwingConstants.CENTER);
		label38.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label38, "cell 6 5");

		//---- label39 ----
		label39.setText("0");
		label39.setHorizontalAlignment(SwingConstants.CENTER);
		label39.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label39, "cell 7 5");

		//---- label40 ----
		label40.setText("0");
		label40.setHorizontalAlignment(SwingConstants.CENTER);
		label40.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label40, "cell 8 5");

		//---- label41 ----
		label41.setText("0");
		label41.setHorizontalAlignment(SwingConstants.CENTER);
		label41.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label41, "cell 9 5");

		//---- label42 ----
		label42.setText("0");
		label42.setHorizontalAlignment(SwingConstants.CENTER);
		label42.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label42, "cell 10 5");

		//---- label43 ----
		label43.setText("0");
		label43.setHorizontalAlignment(SwingConstants.CENTER);
		label43.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label43, "cell 11 5");

		//---- labelFollower ----
		labelFollower.setText("Follower:");
		labelFollower.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelFollower.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\affe_icon.png"));
		contentPane.add(labelFollower, "cell 41 5");

		//---- labelFollowerValue ----
		labelFollowerValue.setText("0");
		labelFollowerValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelFollowerValue, "cell 42 5");

		//---- radioButton6 ----
		radioButton6.setText("Bestechung");
		radioButton6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton6.setToolTipText("Der Busfahrer faehrt auf dem Weg zur Tempel-Baustelle 'aus Versehen' einen Umweg.");
		contentPane.add(radioButton6, "cell 1 6");

		//---- label44 ----
		label44.setText("0");
		label44.setHorizontalAlignment(SwingConstants.CENTER);
		label44.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label44, "cell 5 6");

		//---- label45 ----
		label45.setText("0");
		label45.setHorizontalAlignment(SwingConstants.CENTER);
		label45.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label45, "cell 6 6");

		//---- label46 ----
		label46.setText("0");
		label46.setHorizontalAlignment(SwingConstants.CENTER);
		label46.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label46, "cell 7 6");

		//---- label47 ----
		label47.setText("0");
		label47.setHorizontalAlignment(SwingConstants.CENTER);
		label47.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label47, "cell 8 6");

		//---- label48 ----
		label48.setText("0");
		label48.setHorizontalAlignment(SwingConstants.CENTER);
		label48.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label48, "cell 9 6");

		//---- label49 ----
		label49.setText("0");
		label49.setHorizontalAlignment(SwingConstants.CENTER);
		label49.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label49, "cell 10 6");

		//---- label50 ----
		label50.setText("0");
		label50.setHorizontalAlignment(SwingConstants.CENTER);
		label50.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label50, "cell 11 6");

		//---- radioButton7 ----
		radioButton7.setText("Dixis umschubsen");
		radioButton7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		radioButton7.setToolTipText("Das wird ein laaaanger Tag fuer alle Bauarbeiter-Affen. Und dieser Duft erst.");
		contentPane.add(radioButton7, "cell 1 7");

		//---- label51 ----
		label51.setText("0");
		label51.setHorizontalAlignment(SwingConstants.CENTER);
		label51.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label51, "cell 5 7");

		//---- label52 ----
		label52.setText("0");
		label52.setHorizontalAlignment(SwingConstants.CENTER);
		label52.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label52, "cell 6 7");

		//---- label53 ----
		label53.setText("0");
		label53.setHorizontalAlignment(SwingConstants.CENTER);
		label53.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label53, "cell 7 7");

		//---- label54 ----
		label54.setText("0");
		label54.setHorizontalAlignment(SwingConstants.CENTER);
		label54.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label54, "cell 8 7");

		//---- label55 ----
		label55.setText("0");
		label55.setHorizontalAlignment(SwingConstants.CENTER);
		label55.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label55, "cell 9 7");

		//---- label56 ----
		label56.setText("0");
		label56.setHorizontalAlignment(SwingConstants.CENTER);
		label56.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label56, "cell 10 7");

		//---- label57 ----
		label57.setText("0");
		label57.setHorizontalAlignment(SwingConstants.CENTER);
		label57.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(label57, "cell 11 7");

		//---- labelZeal ----
		labelZeal.setText("Zeal:");
		labelZeal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelZeal.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\zeal_icon.png"));
		contentPane.add(labelZeal, "cell 41 9");

		//---- labelZealValue ----
		labelZealValue.setText("0");
		labelZealValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelZealValue, "cell 42 9");

		//---- labelProgress ----
		labelProgress.setText("Progress:");
		labelProgress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelProgress.setIcon(new ImageIcon("C:\\Users\\Xen\\git\\gjws17_2\\assets\\icons\\bagger_icon.png"));
		contentPane.add(labelProgress, "cell 41 10");

		//---- labelProgressValue ----
		labelProgressValue.setText("0");
		labelProgressValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelProgressValue, "cell 42 10");

		//---- btNextTurn ----
		btNextTurn.setText("Next Turn");
		btNextTurn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btNextTurn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btNextTurnMouseClicked(e);
			}
		});
		contentPane.add(btNextTurn, "cell 42 14 1 2");
		pack();
		setLocationRelativeTo(getOwner());

		//---- buttonGroup1 ----
		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(radioButton1);
		buttonGroup1.add(radioButton2);
		buttonGroup1.add(radioButton3);
		buttonGroup1.add(radioButton4);
		buttonGroup1.add(radioButton5);
		buttonGroup1.add(radioButton6);
		buttonGroup1.add(radioButton7);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Bob Monkey
	private JLabel labelNextAction;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel labelTurn;
	private JLabel labelTurnValue;
	private JRadioButton radioButton1;
	private JLabel label9;
	private JLabel label10;
	private JLabel label11;
	private JLabel label12;
	private JLabel label13;
	private JLabel label14;
	private JLabel label15;
	private JLabel labelAP;
	private JLabel labelAPValue;
	private JRadioButton radioButton2;
	private JLabel label16;
	private JLabel label17;
	private JLabel label18;
	private JLabel label19;
	private JLabel label20;
	private JLabel label21;
	private JLabel label22;
	private JLabel labelDynamite;
	private JLabel labelDynamiteValue;
	private JRadioButton radioButton3;
	private JLabel label23;
	private JLabel label24;
	private JLabel label25;
	private JLabel label26;
	private JLabel label27;
	private JLabel label28;
	private JLabel label29;
	private JLabel labelBeer;
	private JLabel labelBeerValue;
	private JRadioButton radioButton4;
	private JLabel label30;
	private JLabel label31;
	private JLabel label32;
	private JLabel label33;
	private JLabel label34;
	private JLabel label35;
	private JLabel label36;
	private JLabel labelMoney;
	private JLabel labelMoneyValue;
	private JRadioButton radioButton5;
	private JLabel label37;
	private JLabel label38;
	private JLabel label39;
	private JLabel label40;
	private JLabel label41;
	private JLabel label42;
	private JLabel label43;
	private JLabel labelFollower;
	private JLabel labelFollowerValue;
	private JRadioButton radioButton6;
	private JLabel label44;
	private JLabel label45;
	private JLabel label46;
	private JLabel label47;
	private JLabel label48;
	private JLabel label49;
	private JLabel label50;
	private JRadioButton radioButton7;
	private JLabel label51;
	private JLabel label52;
	private JLabel label53;
	private JLabel label54;
	private JLabel label55;
	private JLabel label56;
	private JLabel label57;
	private JLabel labelZeal;
	private JLabel labelZealValue;
	private JLabel labelProgress;
	private JLabel labelProgressValue;
	private JButton btNextTurn;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
>>>>>>> branch 'master' of https://github.com/danduriel/gjws17_2
>>>>>>> branch 'master' of https://github.com/Danduriel/gjws17_2.git
