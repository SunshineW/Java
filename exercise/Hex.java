
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


@SuppressWarnings("serial")
public class Hex extends JFrame {
    public static JRadioButton[] jb1 = null;
    public static JRadioButton[] jb2 = null;
    public static JPanel panel1 = null;
    public static JPanel panel2 = null;
    public static TextField jt1 =null;
    public static TextField jt2 =null;
    public static int num1 ;	//存放进制
    public static int num2 ;
    public static String str1; //存放文本框没改变前字符串
    public static int value;  //存放文本框对应的十进制数字
    
    public Hex(Computer c)
    {
	
	super("进制转换工具");
	
	Font font = new Font("宋体",Font.PLAIN,12);
	num1 = 10;
	num2 = 2;
	str1 = "";
        jb1 =  new JRadioButton[]{
            new JRadioButton("二进制",false),
            new JRadioButton("八进制",false),
            new JRadioButton("十进制",true),
            new JRadioButton("十六进制",false),
        };
        
        
        jb2 =  new JRadioButton[]{
            new JRadioButton("二进制",true),
            new JRadioButton("八进制",false),
            new JRadioButton("十进制",false),
            new JRadioButton("十六进制",false),
        };
        
        
	panel1 = new JPanel();
	panel1.setLayout(new GridLayout(1,4));
	panel2 = new JPanel();
	panel2.setLayout(new GridLayout(1,4));
	ButtonGroup group1 = new ButtonGroup();
	ButtonGroup group2 = new ButtonGroup();
	for (int i=0; i<4; i++)
	{
	    jb1[i].addActionListener(c);
	    jb2[i].addActionListener(c);
	    jb1[i].setBackground(Color.white);
	    jb2[i].setBackground(Color.white);
	    jb1[i].setFont(font);
	    jb2[i].setFont(font);
            panel1.add(jb1[i]);
            panel2.add(jb2[i]);
            group1.add(jb1[i]);
            group2.add(jb2[i]);
	}
	jt1 = new TextField(50);
	jt1.addTextListener(c);
	jt2 = new TextField(50);
	jt2.setEditable(false);
	jt2.addTextListener(c);
	setLayout(new GridLayout(4,1));
	add(panel1);
	add(jt1);
	add(panel2);
	add(jt2);
	setBounds(100, 100, 300, 300);
	pack();
	setResizable(false);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    public static void main(String[] args)
    {
	new Hex(new Computer());
    }
}

class Computer implements ActionListener, TextListener{

    @Override
    public void textValueChanged(TextEvent e) {
	if (e.getSource() == Hex.jt1)
	{
	    String temp = Hex.str1;
	    if (Hex.jt1.getText().equals(""))
	    {
		Hex.value = -1;
		Hex.jt1.setText("");
		Hex.jt2.setText("");
        	return;
	    }
	    int flag = 0;
        	try {
        	    Hex.value = Integer.parseInt(Hex.jt1.getText(), Hex.num1);
        	}catch(NumberFormatException ex){
        	    flag = 1;
        	}
            if (flag == 0)
            {
        	Hex.str1 = Hex.jt1.getText();
        	Hex.jt2.setText(Integer.toString(Hex.value, Hex.num2).toUpperCase());
            }
            if (flag == 1)
            {
        	Hex.jt1.setText(temp);
        	Hex.jt1.setSelectionStart(temp.length());
            }
	}
    }

    public void change(int tag){
	if (tag == 1)
	{
	    if (Hex.value != -1)
	    {
		 Hex.jt1.setText(Integer.toString(Hex.value, Hex.num1).toUpperCase());
	    }
	   
	}
	if (tag == 2)
	{
	    if (Hex.value != -1)
	    {
		    Hex.jt2.setText(Integer.toString(Hex.value, Hex.num2).toUpperCase());
	    }
	}
    }
    @Override
    public void actionPerformed(ActionEvent e) {
	if (e.getSource() == Hex.jb1[0])
	{
	    Hex.num1 = 2;
	    change(1);
	}
	if (e.getSource() == Hex.jb1[1])
	{
	    Hex.num1 = 8;
	    change(1);
	}
	if (e.getSource() == Hex.jb1[2])
	{
	    Hex.num1 = 10;
	    change(1);
	}
	if (e.getSource() == Hex.jb1[3])
	{
	    Hex.num1 = 16;
	    change(1);
	}
	
	
	if (e.getSource() == Hex.jb2[0])
	{
	    Hex.num2 = 2;
	    change(2);
	}
	if (e.getSource() == Hex.jb2[1])
	{
	    Hex.num2 = 8;
	    change(2);
	}
	if (e.getSource() == Hex.jb2[2])
	{
	    Hex.num2 = 10;
	    change(2);
	}
	if (e.getSource() == Hex.jb2[3])
	{
	    Hex.num2 = 16;
	    change(2);
	}
    }
}
