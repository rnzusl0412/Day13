package com.test01;

import java.awt.Frame;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MyFrame extends Frame {
	Button bt;
	TextArea ta;

	public MyFrame() {
		super("MyFrame");
		bt = new Button("click");
		ta = new TextArea(10, 30);
	}

	public void go() {
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
			String str = ta.getText();
			UFrame u = new UFrame(str);
			u.go();
		}

	}

	public static void main(String[] args) {
		new MyFrame().go();
	}

}
