package cok_sayi_ebob_ekok;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Veri_girisi extends JFrame {

	private JPanel contentPane;
	protected int gx=40;
	protected int gy=40;
	protected int cx=300;
	protected int cy=40;
	protected JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12;
	protected JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	protected JButton btn;
	protected long deger1;
	protected long deger2;
	protected long deger3;
	protected long deger4;
	protected long deger5;
	protected long deger6;
	protected long deger7;
	protected long deger8;
	protected String s1;
	protected String s2;
	protected String s3;
	protected String s4;
	protected String s5;
	protected String s6;
	protected String s7;
	protected String s8;
	protected String str1;
	protected String str2;
	protected String str3;
	protected String str4;
	protected String str5;
	protected String str6;
	protected String str7;
	protected String str8;
	protected Robot robot;
	
	ArrayList<Long> ardizi=new ArrayList<Long>();
	int baseCount=0;
	long ebob;
	long ekok;
	
	public static boolean isSpacedEnded(String s)
	{
		return s!=null && Character.isWhitespace(s.charAt(s.length()-1));
	}
	
	public boolean isFractional(String s) {  
	    return s != null && (s.matches("[-+]?\\d+\\.+") || s.matches("[-+]?\\d+[^0-9.]") || s.matches("[-+]?\\d+\\.+0*[1-9]*+[^0-9]+"));  
	}  
	
	public boolean isFractionalNumeric(String s) {  
	    return s != null && (s.matches("[-+]?\\d+\\.+0*[1-9]+"));  
	}  
	
	public boolean isPositiveExactNumeric(String s) {  
	    return s != null && s.matches("[+]?\\d*\\.?0*");  
	}  
	
	public boolean isNegativeExactNumeric(String s) {  
	    return s != null && s.matches("[-]\\d*\\.?0*");  
	}  
	
	public boolean isExactNumeric(String s) {  
	    return s != null && s.matches("[-+]?\\d*\\.?0*");  
	}  
	
	public boolean isNegativeNumeric(String s) {  
	    return s != null && s.matches("[-]\\d*\\.?\\d+");  
	} 
	
	public boolean isNumeric(String s) {  
	    return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
	}  
	
	public long ikiSayiEbobBul(long deger, long deger2)
	{
		long num1,num2,ebob = 0;
		int count1=0;
		if(deger>=deger2) {num2=deger; num1=deger2;}
		else 			  {num1=deger; num2=deger2;}
		
		
		int i=1;
		while (i<=num1) 
		{
			if(num1%i==0) count1++;
			i++;
		}
		
		
		
		long[] dizi1=new long [count1];
		
		i=1;
		int k=0;
		while (i<=num1) 
		{
			if(num1%i==0) 
				{dizi1[k]=i; k++;}
			i++;
		}
			
		i=count1-1;
		k=0;
		while (i<=num2) 
		{
			if(num2%dizi1[i]==0) 
				{
					ebob=dizi1[i];
					break;
				 
				}
			i--;
		}
		return ebob;
	}
	
	
	
	public void ebobEkokHesapla()
	{
		ArrayList<String> arstrdizi=new ArrayList<String>();
		ardizi.clear();
		
		
		try {
			
			if(!tf1.getText().equals("") && !tf1.getText().equals("+") && !tf1.getText().equals("-"))
			{
				s1=tf1.getText();
				while(isSpacedEnded(s1)) s1=s1.substring(0,s1.length()-1);
				str1=s1;
				arstrdizi.add(s1);
				if(s1.contains(".")) s1=s1.split("[.]")[0];         
				if(isExactNumeric(s1))
				{
					deger1= Long.valueOf(s1);
					 ardizi.add(deger1);
					 baseCount++;
				} 
			} 
		} catch (NumberFormatException f) {
			
		}
		try {
			
			if(!tf2.getText().equals("") && !tf2.getText().equals("+") && !tf2.getText().equals("-"))
			{
				s2=tf2.getText();
				while(isSpacedEnded(s2)) s2=s2.substring(0,s2.length()-1);
				str2=s2;
				arstrdizi.add(s2);
				if(s2.contains(".")) s2=s2.split("[.]")[0];
				if(isExactNumeric(s2))
				{
					deger2= Long.valueOf(s2);
					 ardizi.add(deger2);
					 baseCount++;
				} 
			} 
		} catch (NumberFormatException f) {
			
		}
		try {
			
			if(!tf3.getText().equals("") && !tf3.getText().equals("+") && !tf3.getText().equals("-"))
			{
				s3=tf3.getText();
				while(isSpacedEnded(s3)) s3=s3.substring(0,s3.length()-1);
				str3=s3;
				arstrdizi.add(s3);
				if(s3.contains(".")) s3=s3.split("[.]")[0];
				if(isExactNumeric(s3))
				{
					deger3= Long.valueOf(s3);
					 ardizi.add(deger3);
					 baseCount++;
				} 
			} 
		} catch (NumberFormatException f) {
			
		}
		try {
			
			if(!tf4.getText().equals("") && !tf4.getText().equals("+") && !tf4.getText().equals("-"))
			{
				s4=tf4.getText();
				while(isSpacedEnded(s4)) s4=s4.substring(0,s4.length()-1);
				str4=s4;
				arstrdizi.add(s4);
				if(s4.contains(".")) s4=s4.split("[.]")[0];
				if(isExactNumeric(s4))
				{
					deger4= Long.valueOf(s4);
					 ardizi.add(deger4);
					 baseCount++;
				} 
			} 
		} catch (NumberFormatException f) {
			
		}
		try {
			
			if(!tf5.getText().equals("") && !tf5.getText().equals("+") && !tf5.getText().equals("-"))
			{
				s5=tf5.getText();
				while(isSpacedEnded(s5)) s5=s5.substring(0,s5.length()-1);
				str5=s5;
				arstrdizi.add(s5);
				if(s5.contains(".")) s5=s5.split("[.]")[0];
				if(isExactNumeric(s5))
				{
					deger5= Long.valueOf(s5);
					 ardizi.add(deger5);
					 baseCount++;
				} 
			} 
		} catch (NumberFormatException f) {
			
		}
		
		
		
			Collections.sort(ardizi);
		
			long num1;
			long num2;
			
			
			try 
			{
				
					num1 = ardizi.get(0);
					num2 = ardizi.get(1);
				
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				
				num1=2;
				num2=num1;
			}
			
				
			
			
			int i=1;
			int count1=0;
			while (i<=num1) 
			{
				if(num1%i==0) count1++;
				i++;
			}
			
			
			
			long[] dizi1=new long [count1];
			
			i=1;
			int k=0;
			while (i<=num1) 
			{
				if(num1%i==0) 
					{dizi1[k]=i; k++;}
				i++;
			}
				
			i=count1-1;
			k=0;
			int count2=0;
			
			while (i>=0 && i<=num2) 
			{
				count2=0;
				try {
					for(int j=2;j<ardizi.size();j++) 
					{
						if(ardizi.get(j)%dizi1[i]!=0)
						count2++;
					}
				} catch (Exception e) {
					
				}
				
				if(num2%dizi1[i]==0 && count2==0) 
					{
						
						
						ebob=dizi1[i];
						break;
						
					 
					}
				i--;
			}
			
			tf9.setText(ebob+"");
			
			
			for(i=1;i<ardizi.size();i++)
			{
				long ret=ikiSayiEbobBul(ardizi.get(0),ardizi.get(i));
				ekok=(ardizi.get(0)*ardizi.get(i))/ret;
				ardizi.remove(0);
				ardizi.add(0, ekok);
		
			}
	
			
			tf10.setText(ekok+"");
			
			for(i=0;i<arstrdizi.size();i++)
			{
				String str= String.valueOf(arstrdizi.get(i));
				if(!isExactNumeric(str) || isFractional(str))
				{
					tf9.setText("Hatalı Değer");
					tf10.setText("Hatalı Değer");
				}
			}
			
		
			
			
			
			if(ebob==num1 && ebob==num2 && ekok==0) 
			{
				tf9.setText("");
				tf10.setText("");
			}
		
			for(i=0;i<ardizi.size();i++)
			{
				ardizi.remove(i);
			}
			ebob=0;
			ekok=0;
			s1="";
			s2="";
			s3="";
			s4="";
			s5="";
			s6="";
			s7="";
			s8="";
			str1="";
			str2="";
			str3="";
			str4="";
			str5="";
			str6="";
			str7="";
			str8="";
			
			
			
           
		
	}
	
//	DocumentListener dl=new DocumentListener() 
//	{
//
//		public void insertUpdate(DocumentEvent e) {
//			tf9.setText("");
//			tf10.setText("");
//
//			
//		}
//
//		public void removeUpdate(DocumentEvent e) {
//			tf9.setText("");
//			tf10.setText("");
//
//			
//		}
//
//		public void changedUpdate(DocumentEvent e) {
//			tf9.setText("");
//			tf10.setText("");
//
//		}
//	};
	
	DocumentListener dl1=new DocumentListener() 
	{

		public void insertUpdate(DocumentEvent e) {
				
			if(!Pattern.matches("^[1-9]||([1-9][0-9]{0,})$",tf1.getText())) 
				{
		
					tf1.requestFocus();
					tf1.setCaretPosition(tf1.getText().length()); 
					try {
						robot=new Robot();
					} catch (AWTException e1) {
						// TODO Auto-generated catch block
						
					}
					robot.keyPress(KeyEvent.VK_BACK_SPACE);
					robot.keyRelease(KeyEvent.VK_BACK_SPACE);
					
				}
				if(tf1.getText().startsWith(" ")) tf1.setText("");
				if(!tf1.getText().equals("") && (!tf2.getText().equals("") || !tf3.getText().equals("")
						|| !tf4.getText().equals("") || !tf5.getText().equals("") /* || !tf6.getText().equals("")
						|| !tf7.getText().equals("") || !tf8.getText().equals("")*/)) {ebobEkokHesapla();}
			
			
				if(tf2.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf3.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf4.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				
			

			
		}

		public void removeUpdate(DocumentEvent e) {
			
			if(!Pattern.matches("^[1-9]||([1-9][0-9]{0,})$",tf1.getText())) 
			{
	
				tf1.requestFocus();
				tf1.setCaretPosition(tf1.getText().length()); 
				try {
					robot=new Robot();
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					
				}
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				
			}
			if(tf1.getText().startsWith(" ")) tf1.setText("");
				if(!tf1.getText().equals("") && (!tf2.getText().equals("") || !tf3.getText().equals("")
						|| !tf4.getText().equals("") || !tf5.getText().equals("") /* || !tf6.getText().equals("")
						|| !tf7.getText().equals("") || !tf8.getText().equals("")*/)) {ebobEkokHesapla();}
		
				if(tf2.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf3.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf4.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}

			
		}

		public void changedUpdate(DocumentEvent e) {
			
			if(!Pattern.matches("^[1-9]||([1-9][0-9]{0,})$",tf1.getText())) 
			{
	
				tf1.requestFocus();
				tf1.setCaretPosition(tf1.getText().length()); 
				try {
					robot=new Robot();
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					
				}
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				
			}
			if(tf1.getText().startsWith(" ")) tf1.setText("");
				if(!tf1.getText().equals("") && (!tf2.getText().equals("") || !tf3.getText().equals("")
						|| !tf4.getText().equals("") || !tf5.getText().equals("") /* || !tf6.getText().equals("")
						|| !tf7.getText().equals("") || !tf8.getText().equals("")*/)) {ebobEkokHesapla();}
			
				if(tf2.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf3.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf4.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}

		}
	};
	
	DocumentListener dl2=new DocumentListener() 
	{

		public void insertUpdate(DocumentEvent e) {
				
			if(!Pattern.matches("^[1-9]||([1-9][0-9]{0,})$",tf2.getText())) 
			{
	
				tf2.requestFocus();
				tf2.setCaretPosition(tf2.getText().length()); 
				try {
					robot=new Robot();
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					
				}
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				
			}
				if(tf2.getText().startsWith(" ")) tf2.setText("");
				if(!tf2.getText().equals("") && (!tf1.getText().equals("") || !tf3.getText().equals("")
						|| !tf4.getText().equals("") || !tf5.getText().equals("") /* || !tf6.getText().equals("")
						|| !tf7.getText().equals("") || !tf8.getText().equals("")*/)) {ebobEkokHesapla();}
		
				if(tf2.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf3.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf4.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
			

			
		}

		public void removeUpdate(DocumentEvent e) {
			
			if(!Pattern.matches("^[1-9]||([1-9][0-9]{0,})$",tf2.getText())) 
			{
	
				tf2.requestFocus();
				tf2.setCaretPosition(tf2.getText().length()); 
				try {
					robot=new Robot();
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					
				}
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				
			}
			if(tf2.getText().startsWith(" ")) tf2.setText("");
				if(!tf2.getText().equals("") && (!tf1.getText().equals("") || !tf3.getText().equals("")
						|| !tf4.getText().equals("") || !tf5.getText().equals("") /* || !tf6.getText().equals("")
						|| !tf7.getText().equals("") || !tf8.getText().equals("")*/)) {ebobEkokHesapla();}
			
				if(tf2.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf3.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf4.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}

			
		}

		public void changedUpdate(DocumentEvent e) {
			
			if(!Pattern.matches("^[1-9]||([1-9][0-9]{0,})$",tf2.getText())) 
			{
	
				tf2.requestFocus();
				tf2.setCaretPosition(tf2.getText().length()); 
				try {
					robot=new Robot();
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					
				}
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				
			}
			if(tf2.getText().startsWith(" ")) tf2.setText("");
				if(!tf2.getText().equals("") && (!tf1.getText().equals("") || !tf3.getText().equals("")
						|| !tf4.getText().equals("") || !tf5.getText().equals("") /* || !tf6.getText().equals("")
						|| !tf7.getText().equals("") || !tf8.getText().equals("")*/)) {ebobEkokHesapla();}
			
				if(tf2.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf3.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf4.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
		}
	};
	
	DocumentListener dl3=new DocumentListener() 
	{

		public void insertUpdate(DocumentEvent e) {
		
			if(!Pattern.matches("^[1-9]||([1-9][0-9]{0,})$",tf3.getText())) 
			{
	
				tf3.requestFocus();
				tf3.setCaretPosition(tf3.getText().length()); 
				try {
					robot=new Robot();
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					
				}
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				
			}
				if(tf3.getText().startsWith(" ")) tf3.setText("");
				if(!tf3.getText().equals("") && (!tf2.getText().equals("") || !tf1.getText().equals("")
						|| !tf4.getText().equals("") || !tf5.getText().equals("") /* || !tf6.getText().equals("")
						|| !tf7.getText().equals("") || !tf8.getText().equals("")*/ )) {ebobEkokHesapla();}
			
				if(tf2.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf3.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf4.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
			

			
		}

		public void removeUpdate(DocumentEvent e) {
			
			if(!Pattern.matches("^[1-9]||([1-9][0-9]{0,})$",tf3.getText())) 
			{
	
				tf3.requestFocus();
				tf3.setCaretPosition(tf3.getText().length()); 
				try {
					robot=new Robot();
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					
				}
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				
			}
			if(tf3.getText().startsWith(" ")) tf3.setText("");
				if(!tf3.getText().equals("") && (!tf2.getText().equals("") || !tf1.getText().equals("")
						|| !tf4.getText().equals("") || !tf5.getText().equals("") /* || !tf6.getText().equals("")
						|| !tf7.getText().equals("") || !tf8.getText().equals("")*/ )) {ebobEkokHesapla();}
			
				if(tf2.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf3.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf4.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
			

			
		}

		public void changedUpdate(DocumentEvent e) {
			
			if(!Pattern.matches("^[1-9]||([1-9][0-9]{0,})$",tf3.getText())) 
			{
	
				tf3.requestFocus();
				tf3.setCaretPosition(tf3.getText().length()); 
				try {
					robot=new Robot();
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					
				}
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				
			}
			if(tf3.getText().startsWith(" ")) tf3.setText("");
				if(!tf3.getText().equals("") && (!tf2.getText().equals("") || !tf1.getText().equals("")
						|| !tf4.getText().equals("") || !tf5.getText().equals("") /* || !tf6.getText().equals("")
						|| !tf7.getText().equals("") || !tf8.getText().equals("")*/ )) {ebobEkokHesapla();}
		
				if(tf2.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf3.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf4.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}

		}
	};
	
	DocumentListener dl4=new DocumentListener() 
	{

		public void insertUpdate(DocumentEvent e) {
		
			if(!Pattern.matches("^[1-9]||([1-9][0-9]{0,})$",tf4.getText())) 
			{
	
				tf4.requestFocus();
				tf4.setCaretPosition(tf4.getText().length()); 
				try {
					robot=new Robot();
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					
				}
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				
			}
				if(tf4.getText().startsWith(" ")) tf4.setText("");
				if(!tf4.getText().equals("") && (!tf2.getText().equals("") || !tf3.getText().equals("")
						|| !tf1.getText().equals("") || !tf5.getText().equals("") /* || !tf6.getText().equals("")
						|| !tf7.getText().equals("") || !tf8.getText().equals("")*/)) {ebobEkokHesapla();}
			
				if(tf2.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf3.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf4.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
			

			
		}

		public void removeUpdate(DocumentEvent e) {
			
			if(!Pattern.matches("^[1-9]||([1-9][0-9]{0,})$",tf4.getText())) 
			{
	
				tf4.requestFocus();
				tf4.setCaretPosition(tf4.getText().length()); 
				try {
					robot=new Robot();
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					
				}
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				
			}
			if(tf4.getText().startsWith(" ")) tf4.setText("");
				if(!tf4.getText().equals("") && (!tf2.getText().equals("") || !tf3.getText().equals("")
						|| !tf1.getText().equals("") || !tf5.getText().equals("") /* || !tf6.getText().equals("")
						|| !tf7.getText().equals("") || !tf8.getText().equals("")*/)) {ebobEkokHesapla();}
				if(tf2.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf3.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf4.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
			

			
		}

		public void changedUpdate(DocumentEvent e) {
			
			if(!Pattern.matches("^[1-9]||([1-9][0-9]{0,})$",tf4.getText())) 
			{
	
				tf4.requestFocus();
				tf4.setCaretPosition(tf4.getText().length()); 
				try {
					robot=new Robot();
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					
				}
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				
			}
			if(tf4.getText().startsWith(" ")) tf4.setText("");
				if(!tf4.getText().equals("") && (!tf2.getText().equals("") || !tf3.getText().equals("")
						|| !tf1.getText().equals("") || !tf5.getText().equals("") /* || !tf6.getText().equals("")
						|| !tf7.getText().equals("") || !tf8.getText().equals("")*/)) {ebobEkokHesapla();}
			
				if(tf2.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf3.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf4.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
			

		}
	};
	
	DocumentListener dl5=new DocumentListener() 
	{

		public void insertUpdate(DocumentEvent e) {
			
			if(!Pattern.matches("^[1-9]||([1-9][0-9]{0,})$",tf5.getText())) 
			{
	
				tf5.requestFocus();
				tf5.setCaretPosition(tf5.getText().length()); 
				try {
					robot=new Robot();
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					
				}
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				
			}
				if(tf5.getText().startsWith(" ")) tf5.setText("");
				if(!tf5.getText().equals("") && (!tf2.getText().equals("") || !tf3.getText().equals("")
						|| !tf4.getText().equals("") || !tf1.getText().equals("") /* || !tf6.getText().equals("")
						|| !tf7.getText().equals("") || !tf8.getText().equals("")*/)) {ebobEkokHesapla();}
			
				if(tf2.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf3.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf4.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
			

			
		}

		public void removeUpdate(DocumentEvent e) {
			
			
			if(!Pattern.matches("^[1-9]||([1-9][0-9]{0,})$",tf5.getText())) 
			{
	
				tf5.requestFocus();
				tf5.setCaretPosition(tf5.getText().length()); 
				try {
					robot=new Robot();
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					
				}
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				
			}
			if(tf5.getText().startsWith(" ")) tf5.setText("");
				if(!tf5.getText().equals("") && (!tf2.getText().equals("") || !tf3.getText().equals("")
						|| !tf4.getText().equals("") || !tf1.getText().equals("") /* || !tf6.getText().equals("")
						|| !tf7.getText().equals("") || !tf8.getText().equals("")*/)) {ebobEkokHesapla();}
			
				if(tf2.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf3.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf4.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
			

			
		}

		public void changedUpdate(DocumentEvent e) {
			
			if(!Pattern.matches("^[1-9]||([1-9][0-9]{0,})$",tf5.getText())) 
			{
	
				tf5.requestFocus();
				tf5.setCaretPosition(tf5.getText().length()); 
				try {
					robot=new Robot();
				} catch (AWTException e1) {
					// TODO Auto-generated catch block
					
				}
				robot.keyPress(KeyEvent.VK_BACK_SPACE);
				robot.keyRelease(KeyEvent.VK_BACK_SPACE);
				
			}
			if(tf5.getText().startsWith(" ")) tf5.setText("");
				if(!tf5.getText().equals("") && (!tf2.getText().equals("") || !tf3.getText().equals("")
						|| !tf4.getText().equals("") || !tf1.getText().equals("") /* || !tf6.getText().equals("")
						|| !tf7.getText().equals("") || !tf8.getText().equals("")*/)) {ebobEkokHesapla();}
			
				if(tf2.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf3.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf3.getText().equals("")&& tf5.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
				if(tf1.getText().equals("") && tf2.getText().equals("")
						&& tf4.getText().equals("")&& tf4.getText().equals("") /*&& tf6.getText().equals("")
						&& tf7.getText().equals("")&& tf8.getText().equals("")*/) {tf9.setText(""); tf10.setText("");}
			

		}
	};
	

	ActionListener al=new ActionListener() 
	{

		public void actionPerformed(ActionEvent e) 
		{
			ebobEkokHesapla();
			
		}
		
	};
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Veri_girisi frame = new Veri_girisi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public Veri_girisi() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		l1=new JLabel("Birinci sayıyı giriniz");
		l1.setSize(200,20);
		l1.setLocation(gx,gy);
		contentPane.add(l1);
		
		tf1=new JTextField();
		tf1.setSize(200,20);
		tf1.setLocation(gx,gy+20);
		contentPane.add(tf1);
		tf1.getDocument().addDocumentListener(dl1);
		
		l2=new JLabel("İkinci sayıyı giriniz");
		l2.setSize(200,20);
		l2.setLocation(gx,gy+60);
		contentPane.add(l2);
		
		tf2=new JTextField();
		tf2.setSize(200,20);
		tf2.setLocation(gx,gy+80);
		contentPane.add(tf2);
		tf2.getDocument().addDocumentListener(dl2);
		
		l3=new JLabel("Üçüncü sayıyı giriniz");
		l3.setSize(200,20);
		l3.setLocation(gx,gy+120);
		contentPane.add(l3);
		
		tf3=new JTextField();
		tf3.setSize(200,20);
		tf3.setLocation(gx,gy+140);
		contentPane.add(tf3);
		tf3.getDocument().addDocumentListener(dl3);
		
		l4=new JLabel("Dördüncü sayıyı giriniz");
		l4.setSize(200,20);
		l4.setLocation(gx,gy+180);
		contentPane.add(l4);
		
		tf4=new JTextField();
		tf4.setSize(200,20);
		tf4.setLocation(gx,gy+200);
		contentPane.add(tf4);
		tf4.getDocument().addDocumentListener(dl4);
		
		l5=new JLabel("Beşinci sayıyı giriniz");
		l5.setSize(200,20);
		l5.setLocation(gx,gy+240);
		contentPane.add(l5);
		
		tf5=new JTextField();
		tf5.setSize(200,20);
		tf5.setLocation(gx,gy+260);
		contentPane.add(tf5);
		tf5.getDocument().addDocumentListener(dl5);
		

		
		l9=new JLabel("Girdiğiniz sayıların EBOB değeri");
		l9.setSize(350,20);
		l9.setLocation(cx,cy);
		contentPane.add(l9);
		
		tf9=new JTextField();
		tf9.setSize(350,20);
		tf9.setLocation(cx,cy+20);
		contentPane.add(tf9);
		
		l10=new JLabel("Girdiğiniz sayıların EKOK değeri");
		l10.setSize(350,20);
		l10.setLocation(cx,cy+60);
		contentPane.add(l10);
		
		tf10=new JTextField();
		tf10.setSize(350,20);
		tf10.setLocation(cx,cy+80);
		contentPane.add(tf10);
		
//		btn=new JButton("HESAPLA");
//		btn.setSize(350,20);
//		btn.setLocation(cx,cy+130);
//		contentPane.add(btn);
//		btn.addActionListener(al);
		
		
		
		
		
		
		
		
		
		
	}

}
