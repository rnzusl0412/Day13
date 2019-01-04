package com.test02;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MyAddress extends Frame {
	Panel p1, p2, p3;
	Label lbName, lbAddr, lbPhone;
	TextField txtName, txtAddr, txtPhone, txtProfile;
	Button btok, btcn;
	TextArea taview;

	public MyAddress() { // 积己磊
		super("林家废");
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();

		lbName = new Label("Name");
		lbAddr = new Label("Address");
		lbPhone = new Label("Phone");

		txtName = new TextField("", 30);
		txtAddr = new TextField("", 30);
		txtPhone = new TextField("", 30);

		btok = new Button("Okay");
		btcn = new Button("Cancel");

		taview = new TextArea("", 5, 50);

	}

	public void go() {
		p1.setLayout(new GridLayout(3, 2));
		p1.add(lbName);
		p1.add(txtName);
		p1.add(lbAddr);
		p1.add(txtAddr);
		p1.add(lbPhone);
		p1.add(txtPhone);

		p2.add(btok);
		p2.add(btcn);

		p3.add(taview);

		add(p1);
		add(p2);
		add(p3);

		setFont(new Font("讣篮绊雕", Font.BOLD, 20));
		setLayout(new GridLayout(3, 1));
		setSize(500, 500);
		setVisible(true);

		addWindowListener(new myevent());
		btok.addActionListener(new myevent());
		btcn.addActionListener(new myevent());
		txtName.addKeyListener(new myevent());
		txtAddr.addKeyListener(new myevent());
		txtPhone.addKeyListener(new myevent());
	}

	class myevent extends WindowAdapter implements ActionListener, KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				txtAddr.requestFocus();
			}

		}

		@Override
		public void keyReleased(KeyEvent e) {
		}

		@Override
		public void keyTyped(KeyEvent e) {
		}

		public void View_ok() {
			String name = txtName.getText();
			String addr = txtAddr.getText();
			String phone = txtPhone.getText();
			String str = String.format("%10s %10s %10s\n", name, addr, phone);
			taview.append(str);
		}

		public void View_cn() {
			txtName.setText("");
			txtAddr.setText("");
			txtPhone.setText("");
			taview.setText("");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Okay")) {
				View_ok();
			}
			if (e.getActionCommand().trim().equals("Cancel")) {
				View_cn();
			}

		}
	}

	public static void main(String[] args) {
		new MyAddress().go();

	}
}
