package org.sp.tproject.member.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.sp.tproject.calendar.model.ClientDAO;

import util.DBManager;

public class FindFrame extends JFrame{
	ClientDAO clientDAO;
	DBManager dbManager;
	JPanel p_north;
	JPanel p_center;
	JButton bt_find_id;
	JButton bt_find_pass;
	public static String find_id_name=new String();;
	
	//컨텐츠 페이지
	FindPage[] findPages;
	

	public FindFrame() {
		p_north = new JPanel();
		p_center = new JPanel();
		bt_find_id = new JButton("아이디 찾기");
		bt_find_pass = new JButton("비밀번호 찾기");
		findPages = new FindPage[4];
		dbManager = new DBManager();
		clientDAO = new ClientDAO(dbManager);
		

		//페이지 생성
		findPages[0] = new FindIdPage(this);
		findPages[1] = new FindPassPage(this);
		findPages[2] = new FindIdInfoPage(find_id_name);
		findPages[3] = new FindPassInfoPage();
		
		//스타일
		Dimension bt_d = new Dimension(200,60);
		p_north.setPreferredSize(new Dimension(1100,70));
		p_north.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY,1),""));
		bt_find_id.setPreferredSize(bt_d);
		bt_find_id.setBackground(Color.WHITE);
		bt_find_pass.setPreferredSize(bt_d);
		bt_find_pass.setBackground(Color.WHITE);
		
		setLayout(new BorderLayout());
		
		//폰트

		Font find_bt_font = new Font("goyang",Font.BOLD, 20);
		bt_find_id.setFont(find_bt_font);
		bt_find_pass.setFont(find_bt_font);
		
		//조립
		add(p_north, BorderLayout.NORTH);
		for(int i=0; i<findPages.length;i++) {
			p_center.add(findPages[i]);
		}
		add(p_center);
		p_north.setLayout(new FlowLayout(FlowLayout.LEFT));
		p_north.add(bt_find_id);
		p_north.add(bt_find_pass);
		
		
		//나중에 삭제
		setSize(1100,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		//최초로 아이디 찾기 페이지는 보여지게..
		bt_find_id.setBackground(Color.DARK_GRAY);
		bt_find_id.setForeground(Color.WHITE);
		showFindPage(0);
		
		//찾기 버튼에 대한 이벤트 연결
		bt_find_id.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				bt_find_id.setBackground(Color.DARK_GRAY);
				bt_find_id.setForeground(Color.WHITE);
				bt_find_pass.setBackground(Color.WHITE);
				bt_find_pass.setForeground(Color.BLACK);
				showFindPage(0);
			}
		});
		bt_find_pass.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				bt_find_id.setBackground(Color.WHITE);
				bt_find_id.setForeground(Color.BLACK);
				bt_find_pass.setBackground(Color.DARK_GRAY);
				bt_find_pass.setForeground(Color.WHITE);
				showFindPage(1);
			}
		});

	}
	
	//페이지 전환처리
	public void showFindPage(int n) {
		for(int i=0; i<findPages.length; i++) {
			if(i == n) {	//넘겨받은 매개변수와 i가 일치 = 사용자가 n을 누르면..
				findPages[i].setVisible(true);	//보이게 처리
			}else {
				
				findPages[i].setVisible(false);	//안 보이게 처리
			}
		}
	}
	public static void main(String[] args) {
		new FindFrame();
	}
}
