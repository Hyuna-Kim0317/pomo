package org.sp.tproject.member.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class test extends JFrame{
	JPanel p_center;
	JLabel yourid;
	
	

	
	public test() {
		p_center = new JPanel();
		yourid = new JLabel("아이디는 000 입니다.");
		yourid.setPreferredSize(new Dimension(1000,100));
		add(yourid);
		

		
		//스타일
		
		Dimension la_d = new Dimension(800,100);
		p_center.setPreferredSize(new Dimension(1000,100));
		p_center.setLocation(500, 500);
		yourid.setPreferredSize(la_d);
//		p_center.setBackground(Color.RED);

		//폰트
		Font la_font = new Font("goyang", Font.PLAIN, 30);
		yourid.setFont(la_font);
		
		setLayout(new GridBagLayout());
		add(p_center);
		p_center.add(yourid);

		
		
		
		
		setSize(1100,700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new test();
	}
}
