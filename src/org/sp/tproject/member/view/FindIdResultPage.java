package org.sp.tproject.member.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.sp.tproject.calendar.model.ClientDAO;

import util.DBManager;

public class FindIdResultPage extends FindPage{
	FindMainPage findMainPage;
	FindFrame findFrame;
	ClientDAO clientDAO;
	DBManager dbManager;
	JPanel p_center;
	JLabel yourid;
	JPanel p_south;
	JButton bt_findid_login;
	
	
	public FindIdResultPage(FindMainPage findMainPage) {
		dbManager = new DBManager();
		clientDAO = new  ClientDAO(dbManager);
		p_center = new JPanel();
		System.out.println(findFrame.find_id_name);
		yourid = new JLabel("");
		p_south = new JPanel();
		bt_findid_login = new JButton("로그인 하기");
		

		//스타일
		
		Dimension la_d = new Dimension(800,100);
		Dimension find_bt = new Dimension(400,50);
		
		yourid.setPreferredSize(new Dimension(1000,100));
		p_center.setPreferredSize(new Dimension(1000,300));
		yourid.setPreferredSize(la_d);
		bt_findid_login.setPreferredSize(new Dimension(find_bt));

		bt_findid_login.setHorizontalAlignment(JButton.CENTER);
		yourid.setHorizontalAlignment(JLabel.CENTER);
		p_center.setLocation(800, 500);
		p_south.setLocation(900, 600);

		//폰트
		Font la_font = new Font("goyang", Font.PLAIN, 30);
		yourid.setFont(la_font);
		bt_findid_login.setFont(la_font);

		//부착

		add(p_center);
		add(p_south,new BorderLayout().SOUTH);
		p_south.add(bt_findid_login);
//		add(bt_findid_login);
		
		
//		setLayout(new GridBagLayout());
		p_center.add(yourid);

	}
	//아이디 대입 
	public void setId(String name) {
		clientDAO.findId(name);
		yourid.setText(findFrame.find_id_name+"님의 아이디는"+"입니다");
	}
}
