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
	
	public myGui(Gamesim gamesim) {
		this.gamesim = gamesim;
		initComponents();
	}

	private void btNextTurnMouseClicked(MouseEvent e) {
		// TODO add your code here
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
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Bob Monkey
		labelNextAction = new JLabel();
		labelTurn = new JLabel();
		labelTurnValue = new JLabel();
		radioButton1 = new JRadioButton();
		labelAP = new JLabel();
		labelAPValue = new JLabel();
		radioButton2 = new JRadioButton();
		labelDynamite = new JLabel();
		labelDynamiteValue = new JLabel();
		radioButton3 = new JRadioButton();
		labelBeer = new JLabel();
		labelBeerValue = new JLabel();
		labelMoney = new JLabel();
		labelMoneyValue = new JLabel();
		labelFollower = new JLabel();
		labelFollowerValue = new JLabel();
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
			"[]"));

		//---- labelNextAction ----
		labelNextAction.setText("W\u00e4hle die n\u00e4chste Aktion:");
		labelNextAction.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelNextAction, "cell 1 0");

		//---- labelTurn ----
		labelTurn.setText("Turn:");
		labelTurn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelTurn, "cell 34 0");

		//---- labelTurnValue ----
		labelTurnValue.setText("0");
		labelTurnValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelTurnValue, "cell 35 0");

		//---- radioButton1 ----
		radioButton1.setText("Schmei\u00dfe eine Party");
		radioButton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(radioButton1, "cell 1 1");

		//---- labelAP ----
		labelAP.setText("Aktionspunkte:");
		labelAP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelAP, "cell 34 1");

		//---- labelAPValue ----
		labelAPValue.setText("0");
		labelAPValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelAPValue, "cell 35 1");

		//---- radioButton2 ----
		radioButton2.setText("Sprenge die Baustelle");
		radioButton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(radioButton2, "cell 1 2");

		//---- labelDynamite ----
		labelDynamite.setText("Dynamite:");
		labelDynamite.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelDynamite, "cell 34 2");

		//---- labelDynamiteValue ----
		labelDynamiteValue.setText("0");
		labelDynamiteValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelDynamiteValue, "cell 35 2");

		//---- radioButton3 ----
		radioButton3.setText("Sprenge die Baustelle");
		radioButton3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(radioButton3, "cell 1 3");

		//---- labelBeer ----
		labelBeer.setText("Bier:");
		labelBeer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelBeer, "cell 34 3");

		//---- labelBeerValue ----
		labelBeerValue.setText("0");
		labelBeerValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelBeerValue, "cell 35 3");

		//---- labelMoney ----
		labelMoney.setText("Geld:");
		labelMoney.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelMoney, "cell 34 4");

		//---- labelMoneyValue ----
		labelMoneyValue.setText("0");
		labelMoneyValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelMoneyValue, "cell 35 4");

		//---- labelFollower ----
		labelFollower.setText("Follower:");
		labelFollower.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelFollower, "cell 34 5");

		//---- labelFollowerValue ----
		labelFollowerValue.setText("0");
		labelFollowerValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelFollowerValue, "cell 35 5");

		//---- labelZeal ----
		labelZeal.setText("Zeal:");
		labelZeal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelZeal, "cell 34 7");

		//---- labelZealValue ----
		labelZealValue.setText("0");
		labelZealValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelZealValue, "cell 35 7");

		//---- labelProgress ----
		labelProgress.setText("Progress:");
		labelProgress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelProgress, "cell 34 8");

		//---- labelProgressValue ----
		labelProgressValue.setText("0");
		labelProgressValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(labelProgressValue, "cell 35 8");

		//---- btNextTurn ----
		btNextTurn.setText("Next Turn");
		btNextTurn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btNextTurn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btNextTurnMouseClicked(e);
			}
		});
		contentPane.add(btNextTurn, "cell 35 12 1 2");
		pack();
		setLocationRelativeTo(getOwner());

		//---- buttonGroup1 ----
		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(radioButton1);
		buttonGroup1.add(radioButton2);
		buttonGroup1.add(radioButton3);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Bob Monkey
	private JLabel labelNextAction;
	private JLabel labelTurn;
	private JLabel labelTurnValue;
	private JRadioButton radioButton1;
	private JLabel labelAP;
	private JLabel labelAPValue;
	private JRadioButton radioButton2;
	private JLabel labelDynamite;
	private JLabel labelDynamiteValue;
	private JRadioButton radioButton3;
	private JLabel labelBeer;
	private JLabel labelBeerValue;
	private JLabel labelMoney;
	private JLabel labelMoneyValue;
	private JLabel labelFollower;
	private JLabel labelFollowerValue;
	private JLabel labelZeal;
	private JLabel labelZealValue;
	private JLabel labelProgress;
	private JLabel labelProgressValue;
	private JButton btNextTurn;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
