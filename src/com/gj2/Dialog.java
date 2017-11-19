/*
 * Created by JFormDesigner on Sun Nov 19 16:48:36 CET 2017
 */

package com.gj2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Bob Monkey
 */
public class Dialog extends JFrame {
	public Dialog() {
		initComponents();
	}

	private void btOKMouseClicked(MouseEvent e) {
		// TODO add your code here
		this.dispose();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Bob Monkey
		labelEventMessage = new JLabel();
		label1 = new JLabel();
		label4 = new JLabel();
		label2 = new JLabel();
		label5 = new JLabel();
		label3 = new JLabel();
		label6 = new JLabel();
		label7 = new JLabel();
		btOK = new JButton();

		//======== this ========
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
			"[0,fill]",
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
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- labelEventMessage ----
		labelEventMessage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelEventMessage.setText("Laaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		contentPane.add(labelEventMessage, "cell 1 1");

		//---- label1 ----
		label1.setText("text");
		label1.setIcon(new ImageIcon("assets/icons/kacka_icon.png"));
		contentPane.add(label1, "cell 1 3");

		//---- label4 ----
		label4.setText("text");
		label4.setIcon(new ImageIcon("assets/icons/geld_icon.png"));
		contentPane.add(label4, "cell 4 3");

		//---- label2 ----
		label2.setText("text");
		label2.setIcon(new ImageIcon("assets/icons/dynamit_icon.png"));
		contentPane.add(label2, "cell 1 4");

		//---- label5 ----
		label5.setText("text");
		label5.setIcon(new ImageIcon("assets/icons/affe_icon.png"));
		contentPane.add(label5, "cell 4 4");

		//---- label3 ----
		label3.setText("text");
		label3.setIcon(new ImageIcon("assets/icons/flasche_icon.png"));
		contentPane.add(label3, "cell 1 5");

		//---- label6 ----
		label6.setText("text");
		label6.setIcon(new ImageIcon("assets/icons/zeal_icon.png"));
		contentPane.add(label6, "cell 4 5");

		//---- label7 ----
		label7.setText("text");
		label7.setIcon(new ImageIcon("assets/icons/bagger_icon.png"));
		contentPane.add(label7, "cell 1 6");

		//---- btOK ----
		btOK.setText("OK");
		btOK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btOK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btOKMouseClicked(e);
			}
		});
		contentPane.add(btOK, "cell 4 6 3 2");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Bob Monkey
	public JLabel labelEventMessage;
	public JLabel label1;
	public JLabel label4;
	public JLabel label2;
	public JLabel label5;
	public JLabel label3;
	public JLabel label6;
	public JLabel label7;
	public JButton btOK;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
