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

import org.apache.commons.lang3.StringUtils;

public class test extends JFrame{
	String str = "*/";
	String[] words = str.split("");
	boolean br3;
	
	public test() {
		specailChar();
		br3 = specailChar();
		for(int i=0; i<words.length; i++) {
//				boolean br =StringUtils.isAlpha(words[i]);
//				boolean br2=StringUtils.isNumeric(words[i]);
				
//				System.out.println(br|br2|br3);
//				if(!(br|br2)) break;
		}
//		boolean a=StringUtils.isAlpha(str);
//		boolean b = StringUtils.isNumeric(str);
//		System.out.println(a||b);
//		System.out.println(a);
//		System.out.println(b);
	}
	public boolean specailChar() {
		boolean result=false;
//		for(int i=0; i<words.length; i++) {
//			System.out.println("시작");
			System.out.println(words[0]);
			if(words[1] == "*") {
				result=true;
				System.out.println(result);
			}
			System.out.println(br3);
//		}
		
		return result;
	}
	
	public static void check(String args[]) {
		  String StringValue = "이@문자열에$특수@문자가^있다.";
		  String newStringValue = StringValue.replaceAll("[@$^]", " ");

		  System.out.println("[기존 문자열: StringValue]");
		  System.out.println(StringValue);
		  System.out.println("\n[변경된 문자열: newStringValue]");
		  System.out.println(newStringValue);
	}
	
	public static void main(String[] args) {
		new test();
	}
}

//https://developer-talk.tistory.com/663
