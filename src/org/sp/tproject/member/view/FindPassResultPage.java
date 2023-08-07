package org.sp.tproject.member.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FindPassResultPage extends FindPage{
	FindMainPage findMainPage;
	JPanel p_center;
	JLabel yourid;
	
	public FindPassResultPage(FindMainPage findMainPage) {
		p_center = new JPanel();
		yourid = new JLabel("님의 비밀번호는 000 입니다.");

		//스타일
		
		Dimension la_d = new Dimension(800,100);
		
		yourid.setPreferredSize(new Dimension(1000,100));
		p_center.setPreferredSize(new Dimension(1000,300));
		yourid.setPreferredSize(la_d);

		yourid.setHorizontalAlignment(JLabel.CENTER);
		p_center.setLocation(800, 500);

		//폰트
		Font la_font = new Font("goyang", Font.PLAIN, 30);
		yourid.setFont(la_font);

		//부착
		add(yourid);
		
		
		setLayout(new GridBagLayout());
		add(p_center);
		p_center.add(yourid);

	}
}
