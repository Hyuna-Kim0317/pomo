package org.sp.tproject.member.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.sp.tproject.calendar.model.ClientDAO;

import util.DBManager;

public class FindIdInfoPage extends FindPage{
	FindFrame findFrame;
	ClientDAO clientDAO;
	DBManager dbManager;
	JPanel p_center;
	JLabel yourid;
	
	public FindIdInfoPage(String name) {
		dbManager = new DBManager();
		clientDAO = new  ClientDAO(dbManager);
		p_center = new JPanel();
		System.out.println(findFrame.find_id_name);
		yourid = new JLabel(findFrame.find_id_name+"님의 아이디는 000 입니다.");

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
