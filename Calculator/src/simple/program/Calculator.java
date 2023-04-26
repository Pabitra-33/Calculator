package simple.program;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
 
class Calculator extends JFrame implements ActionListener
{
JLabel l;
JTextField t;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr,bac;
JButton bon,boff,bmod;
 
static double a=0,b=0,result=0; //first no second no third no
static int operator=0; //to perform operation
 
Calculator()
{
setTitle("Calculator"); //setting the title
l = new JLabel(" DISPLAY "); // creating a Label to show
l.setBounds(150,5,80,35); 
l.setBackground(Color.YELLOW);//giving color to label
add(l);

t=new JTextField(); //creating a text field
t.setBounds(30,35,330,50);//setting size, height & width
t.setBackground(Color.GREEN);
boolean False = false;
t.setEditable(False);
t.setFont(new Font("Arial", Font.BOLD,20));
add(t);

JButton bon = new JButton("ON"); //creating a Radio button
bon.setBounds(30,105,60,35);
bon.setBackground(Color.GREEN);
bon.addActionListener(this);
add(bon);

JButton boff = new JButton("OFF");
boff.setBounds(105,105,60,35);
boff.setBackground(Color.RED);
boff.addActionListener(this);
add(boff);

bdel=new JButton("DEL");
bdel.setBounds(185,105,60,35);
bdel.setBackground(Color.ORANGE);
bdel.addActionListener(this);
add(bdel);

bclr=new JButton("AC");
bclr.setBounds(265,105,60,35);
bclr.setBackground(Color.ORANGE);
bclr.addActionListener(this);
add(bclr);

b1=new JButton("7");
b1.setBounds(30,160,60,35);
b1.setBackground(Color.LIGHT_GRAY);
b1.addActionListener(this);
add(b1);

b2=new JButton("8");
b2.setBounds(105,160,60,35);
b2.setBackground(Color.LIGHT_GRAY);
b2.addActionListener(this);
add(b2);

b3=new JButton("9");
b3.setBounds(180,160,60,35);
b3.setBackground(Color.LIGHT_GRAY);
b3.addActionListener(this);
add(b3);

b4=new JButton("4");
b4.setBounds(30,210,60,35);
b4.setBackground(Color.LIGHT_GRAY);
b4.addActionListener(this);
add(b4);

b5=new JButton("5");
b5.setBounds(105,210,60,35);
b5.setBackground(Color.LIGHT_GRAY);
b5.addActionListener(this);
add(b5);

b6=new JButton("6");
b6.setBounds(180,210,60,35);
b6.setBackground(Color.LIGHT_GRAY);
b6.addActionListener(this);
add(b6);

b7=new JButton("1");
b7.setBounds(30,260,60,35);
b7.setBackground(Color.LIGHT_GRAY);
b7.addActionListener(this);
add(b7);

b8=new JButton("2");
b8.setBounds(105,260,60,35);
b8.setBackground(Color.LIGHT_GRAY);
b8.addActionListener(this);
add(b8);

b9=new JButton("3");
b9.setBounds(180,260,60,35);
b9.setBackground(Color.LIGHT_GRAY);
b9.addActionListener(this);
add(b9);

b0=new JButton("0");
b0.setBounds(30,310,60,35);
b0.setBackground(Color.LIGHT_GRAY);
b0.addActionListener(this);
add(b0);

b00=new JButton("00");
b00.setBounds(105,310,60,35);
b00.setBackground(Color.LIGHT_GRAY);
b00.addActionListener(this);
add(b00);

bdec=new JButton(".");
bdec.setBounds(180,310,60,35);
bdec.setBackground(Color.LIGHT_GRAY);
bdec.addActionListener(this);
add(bdec);

bmod=new JButton("%");
bmod.setBounds(270,150,45,25);
bmod.setBackground(Color.YELLOW);
bmod.addActionListener(this);
add(bmod);

bdiv=new JButton("/");
bdiv.setBounds(270,185,45,25);
bdiv.setBackground(Color.YELLOW);
bdiv.addActionListener(this);
add(bdiv);

bmul=new JButton("*");
bmul.setBounds(270,220,45,25);
bmul.setBackground(Color.YELLOW);
bmul.addActionListener(this);
add(bmul);

bsub=new JButton("-");
bsub.setBounds(270,255,45,25);
bsub.setBackground(Color.YELLOW);
bsub.addActionListener(this);
add(bsub);

badd=new JButton("+");
badd.setBounds(270,290,45,25);
badd.setBackground(Color.GREEN);
badd.addActionListener(this);
add(badd);

beq=new JButton("=");
beq.setBounds(267,325,50,30);
beq.setBackground(Color.GREEN);
beq.addActionListener(this);
add(beq);

setLayout(null);
setVisible(true);
setBackground(Color.WHITE);
setSize(400,400);
addWindowListener(new WindowAdapter(){
	public void WindowClosing(WindowEvent e) {
	    System.exit(0);
	}
});
//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//another method for closing
setResizable(false);

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
t.setText(t.getText().concat("7"));
if(e.getSource()==b2)
t.setText(t.getText().concat("8"));
if(e.getSource()==b3)
t.setText(t.getText().concat("9"));
if(e.getSource()==b4)
t.setText(t.getText().concat("4"));
if(e.getSource()==b5)
t.setText(t.getText().concat("5"));
if(e.getSource()==b6)
t.setText(t.getText().concat("6"));
if(e.getSource()==b7)
t.setText(t.getText().concat("1"));
if(e.getSource()==b8)
t.setText(t.getText().concat("2"));
if(e.getSource()==b9)
t.setText(t.getText().concat("3"));
if(e.getSource()==b0)
t.setText(t.getText().concat("0"));
if(e.getSource()==b00)
t.setText(t.getText().concat("00"));
if(e.getSource()==bdec)
t.setText(t.getText().concat("."));
if(e.getSource()==badd)
{
a=Double.parseDouble(t.getText());
operator=1;
t.setText("");
}
if(e.getSource()==bsub)
{
a=Double.parseDouble(t.getText());
operator=2;
t.setText("");
}
if(e.getSource()==bmul)
{
a=Double.parseDouble(t.getText());
operator=3;
t.setText("");
}
if(e.getSource()==bdiv)
{
a=Double.parseDouble(t.getText());
operator=4;
t.setText("");
}
if(e.getSource()==beq)
{
b=Double.parseDouble(t.getText());
switch(operator) //using switch case for multiple choices available. 
{
case 1: result=a+b;
break;
case 2: result=a-b;
break;
case 3: result=a*b;
break;
case 4: result=a/b;
break;
default: result=0;
}
t.setText(""+result);
}
if(e.getSource()==bclr)
t.setText("");
if(e.getSource()==bon)
t.setText("");
if(e.getSource()==boff)
t.setText("");
if(e.getSource()==bdel)
{
String s=t.getText();
t.setText("");
for(int i=0;i<s.length()-1;i++)
t.setText(t.getText()+s.charAt(i));
}
}
 
public static void main(String...s)
{
new Calculator(); //creating object so that constructor get called.
}
}