package com.test02;

import java.awt.Frame;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class UFrame extends Frame {
	Button bt;
	TextArea ta;
	String str;

	public UFrame() {
		super("UFrame");
		bt = new Button("click");
		ta = new TextArea(10, 30);
	}

	public UFrame(String str) {
		this();
		this.str = str;
	}

	public void go() {

		ta.setText(str);
		add(ta, BorderLayout.NORTH);

		add(bt, BorderLayout.CENTER);

		bt.addActionListener(new MyEvent());
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		}); // addWindowListener(WinodwListener __)

		setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		setSize(800, 400);
		setVisible(true);

	}

	class MyEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}

	public static void main(String[] args) {
		new UFrame().go();

	}

}
