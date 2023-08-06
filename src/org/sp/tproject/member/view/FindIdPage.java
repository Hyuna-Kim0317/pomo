package org.sp.tproject.member.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.sp.tproject.calendar.model.ClientDAO;

public class FindIdPage extends FindPage{
	FindFrame findFrame;
	JPanel p_center;
	JPanel p_name;
	JTextField t_name;
	JPanel p_email;
	JTextField t_email;
	JPanel p_auth;
	JTextField t_auth;
	
	JButton bt_email;
	JButton bt_auth;
	JPanel p_check;
	JButton bt_check;
	
	
	public FindIdPage(FindFrame findFrame) {
		
		p_center = new JPanel();
		p_name = new JPanel();
		t_name = new JTextField("이름을 입력하세요");
		p_email = new JPanel();
		t_email = new JTextField("이메일을 입력하세요");
		bt_email = new JButton("전송하기");
		p_auth = new JPanel();
		t_auth = new JTextField("인증번호를 입력하세요");
		bt_auth = new JButton("인증하기");
		p_check = new JPanel();
		bt_check = new JButton("아이디 찾기");

		//폰트
		Font regist_text_font = new Font("goyang", Font.PLAIN, 30);
		Font find_bt_font = new Font("goyang", Font.BOLD, 20);
		
		t_name.setFont(regist_text_font);
		t_email.setFont(regist_text_font);
		t_auth.setFont(regist_text_font);
		bt_email.setFont(find_bt_font);
		bt_auth.setFont(find_bt_font);
		bt_check.setFont(find_bt_font);
		
		//스타일
		Dimension find_panel_d = new Dimension(850,120);
		Dimension find_text_d = new Dimension(600,80);
		Dimension find_bt_d = new Dimension(150,60);
		p_center.setPreferredSize(new Dimension(1000,600));
		p_name.setPreferredSize(find_panel_d);
		t_name.setPreferredSize(find_text_d);
		p_email.setPreferredSize(find_panel_d);
		t_email.setPreferredSize(find_text_d);
		bt_email.setPreferredSize(find_bt_d);
		p_auth.setPreferredSize(find_panel_d);
		t_auth.setPreferredSize(find_text_d);
		bt_auth.setPreferredSize(find_bt_d);
		p_check.setPreferredSize(find_panel_d);
		bt_check.setPreferredSize(new Dimension(250,60));
		
		setLayout(new FlowLayout());
		
		
		//부착
		add(p_center, BorderLayout.CENTER);
		p_name.setLayout(new FlowLayout(FlowLayout.LEFT));
		p_email.setLayout(new FlowLayout(FlowLayout.LEFT));
		p_auth.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		p_center.add(p_name);
		p_name.add(t_name);
		p_center.add(p_email);
		p_email.add(t_email);
		p_email.add(bt_email);
		p_center.add(p_auth);
		p_auth.add(t_auth);
		p_auth.add(bt_auth);
		p_center.add(p_check);
		p_check.add(bt_check);
		
		bt_check.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("아이디 찾기 클릭");
				findFrame.find_id_name = t_name.getText();
				System.out.println(findFrame.find_id_name);
				findFrame.showFindPage(2);
			}
			
		});
	}
}
