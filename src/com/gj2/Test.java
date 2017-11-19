/*
 * Created by JFormDesigner on Sun Nov 19 03:17:13 CET 2017
 */

package com.gj2;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Bob Monkey
 */
public class Test extends JPanel {
	public Test() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Bob Monkey
		label1 = new JLabel();
		label2 = new JLabel();
		radioButton1 = new JRadioButton();

		//======== this ========

		// JFormDesigner evaluation mark
		setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

		setLayout(new MigLayout(
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
			"[]"));

		//---- label1 ----
		label1.setText("text");
		add(label1, "cell 7 0");

		//---- label2 ----
		label2.setText("text");
		add(label2, "cell 10 3");

		//---- radioButton1 ----
		radioButton1.setText("text");
		add(radioButton1, "cell 2 6");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Bob Monkey
	private JLabel label1;
	private JLabel label2;
	private JRadioButton radioButton1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
