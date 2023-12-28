import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CurrencyConverter extends JFrame implements ActionListener
{
JLabel l1,l2,l3;
JTextField t1,t2;
JButton b;
Container c;
JComboBox j1,j2;
CurrencyConverter()
{
c=getContentPane();
c.setLayout(null);

l1=new JLabel("From");
l2=new JLabel("Enter Currency");
l3=new JLabel("To");

j1=new JComboBox();
j1.addItem("Indian Ruppee(INR)");
j1.addItem("United States Dollar(USD)");
j1.addItem("Canadian Dollar(CAD)");
j1.addItem("European Euro(EUR)");
j1.addItem("British Pound(GBP)");
j1.addItem("Swiss Franc(CHF)");
j1.addItem("New Zealand Dollar(NZD)");
j1.addItem("Australian Dollar(AUD)");
j1.addItem("Japanese Yen(JPY)");

j2=new JComboBox();
j2.addItem("Indian Ruppee(INR)");
j2.addItem("United States Dollar(USD)");
j2.addItem("Canadian Dollar(CAD)");
j2.addItem("European Euro(EUR)");
j2.addItem("British Pound(GBP)");
j2.addItem("Swiss Franc(CHF)");
j2.addItem("New Zealand Dollar(NZD)");
j2.addItem("Australian Dollar(AUD)");
j2.addItem("Japanese Yen(JPY)");

t1=new JTextField(15);
t2=new JTextField(15);
t2.setEditable(false);

b=new JButton("Convert");
c.add(l1);
l1.setBounds(680,50,200,30);
c.add(j1);
j1.setBounds(850,50,200,30);
c.add(l2);
l2.setBounds(680,100,200,30);
c.add(j2);
j2.setBounds(850,150,200,30);
c.add(l3);
l3.setBounds(680,150,200,30);
c.add(t1);
t1.setBounds(850,100,200,30);
c.add(b);
b.setBounds(820,200,100,30);
c.add(t2);
t2.setBounds(770,250,200,30);
b.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{
if(j1.getSelectedIndex()==0 && j2.getSelectedIndex()==0)
{
float a1=Float.parseFloat(t1.getText());
t2.setText(""+a1);
}
else if(j1.getSelectedIndex()==0 && j2.getSelectedIndex()==1)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.013;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==0 && j2.getSelectedIndex()==2)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.017;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==0 && j2.getSelectedIndex()==3)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.012;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==0 && j2.getSelectedIndex()==4)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.0099;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==0 && j2.getSelectedIndex()==5)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.012;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==0 && j2.getSelectedIndex()==6)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.020;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==0 && j2.getSelectedIndex()==7)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.019;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==0 && j2.getSelectedIndex()==8)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.53;
t2.setText(""+b2);
}

else if(j1.getSelectedIndex()==1 && j2.getSelectedIndex()==0)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*74.42;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==1 && j2.getSelectedIndex()==1)
{
float b1=Float.parseFloat(t1.getText());
t2.setText(""+b1);
}
else if(j1.getSelectedIndex()==1 && j2.getSelectedIndex()==2)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.26;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==1 && j2.getSelectedIndex()==3)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.88;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==1 && j2.getSelectedIndex()==4)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.74;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==1 && j2.getSelectedIndex()==5)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.91;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==1 && j2.getSelectedIndex()==6)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.49;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==1 && j2.getSelectedIndex()==7)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.39;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==1 && j2.getSelectedIndex()==8)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*113.67;
t2.setText(""+b2);
}

else if(j2.getSelectedIndex()==2 && j2.getSelectedIndex()==0)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*59.16;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==2 && j2.getSelectedIndex()==1)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.79;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==2 && j2.getSelectedIndex()==2)
{
float b1=Float.parseFloat(t1.getText());
t2.setText(""+b1);
}
else if(j1.getSelectedIndex()==2 && j2.getSelectedIndex()==3)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.70;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==2 && j2.getSelectedIndex()==4)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.59;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==2 && j2.getSelectedIndex()==5)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.72;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==2 && j2.getSelectedIndex()==6)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.18;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==2 && j2.getSelectedIndex()==7)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.11;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==2 && j2.getSelectedIndex()==8)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*90.36;
t2.setText(""+b2);
}

else if(j1.getSelectedIndex()==3 && j2.getSelectedIndex()==0)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*84.45;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==3 && j2.getSelectedIndex()==1)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.13;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==3 && j2.getSelectedIndex()==2)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.43;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==3 && j2.getSelectedIndex()==3)
{
float b1=Float.parseFloat(t1.getText());
t2.setText(""+b1);
}
else if(j1.getSelectedIndex()==3 && j2.getSelectedIndex()==4)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.84;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==3 && j2.getSelectedIndex()==5)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.03;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==3 && j2.getSelectedIndex()==6)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.69;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==3 && j2.getSelectedIndex()==7)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.58;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==3 && j2.getSelectedIndex()==8)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*128.98;
t2.setText(""+b2);
}

else if(j1.getSelectedIndex()==4 && j2.getSelectedIndex()==0)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*100.88;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==4 && j2.getSelectedIndex()==1)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.36;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==4 && j2.getSelectedIndex()==2)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.71;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==4 && j2.getSelectedIndex()==3)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.19;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==4 && j2.getSelectedIndex()==4)
{
float b1=Float.parseFloat(t1.getText());
t2.setText(""+b1);
}
else if(j1.getSelectedIndex()==4 && j2.getSelectedIndex()==5)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.24;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==4 && j2.getSelectedIndex()==6)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*2.02;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==4 && j2.getSelectedIndex()==7)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.89;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==4 && j2.getSelectedIndex()==8)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*154.14;
t2.setText(""+b2);
}

else if(j1.getSelectedIndex()==5 && j2.getSelectedIndex()==0)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*81.63;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==5 && j2.getSelectedIndex()==1)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.10;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==5 && j2.getSelectedIndex()==2)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.38;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==5 && j2.getSelectedIndex()==3)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.97;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==5 && j2.getSelectedIndex()==4)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.81;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==5 && j2.getSelectedIndex()==5)
{
float b1=Float.parseFloat(t1.getText());
t2.setText(""+b1);
}
else if(j1.getSelectedIndex()==5 && j2.getSelectedIndex()==6)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.63;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==5 && j2.getSelectedIndex()==7)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.53;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==5 && j2.getSelectedIndex()==8)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*124.77;
t2.setText(""+b2);
}

else if(j1.getSelectedIndex()==6 && j2.getSelectedIndex()==0)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*50.04;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==6 && j2.getSelectedIndex()==1)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.67;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==6 && j2.getSelectedIndex()==2)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.85;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==6 && j2.getSelectedIndex()==3)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.59;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==6 && j2.getSelectedIndex()==4)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.50;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==6 && j2.getSelectedIndex()==5)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.61;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==6 && j2.getSelectedIndex()==6)
{
float b1=Float.parseFloat(t1.getText());
t2.setText(""+b1);
}
else if(j1.getSelectedIndex()==6 && j2.getSelectedIndex()==7)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.94;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==6 && j2.getSelectedIndex()==8)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*76.41;
t2.setText(""+b2);
}

else if(j1.getSelectedIndex()==7 && j2.getSelectedIndex()==0)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*53.43;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==7 && j2.getSelectedIndex()==1)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.72;
t2.setText(""+b2);
}else if(j1.getSelectedIndex()==7 && j2.getSelectedIndex()==2)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.90;
t2.setText(""+b2);
}else if(j1.getSelectedIndex()==7 && j2.getSelectedIndex()==3)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.63;
t2.setText(""+b2);
}else if(j1.getSelectedIndex()==7 && j2.getSelectedIndex()==4)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.53;
t2.setText(""+b2);
}else if(j1.getSelectedIndex()==7 && j2.getSelectedIndex()==5)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.65;
t2.setText(""+b2);
}else if(j1.getSelectedIndex()==7 && j2.getSelectedIndex()==6)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*1.07;
t2.setText(""+b2);
}else if(j1.getSelectedIndex()==7 && j2.getSelectedIndex()==7)
{
float b1=Float.parseFloat(t1.getText());
t2.setText(""+b1);
}
else if(j1.getSelectedIndex()==7 && j2.getSelectedIndex()==8)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*81.68;
t2.setText(""+b2);
}

else if(j1.getSelectedIndex()==8 && j2.getSelectedIndex()==0)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.65;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==8 && j2.getSelectedIndex()==1)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.0088;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==8 && j2.getSelectedIndex()==2)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.011;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==8 && j2.getSelectedIndex()==3)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.0078;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==8 && j2.getSelectedIndex()==4)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.0065;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==8 && j2.getSelectedIndex()==5)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.0080;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==8 && j2.getSelectedIndex()==6)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.013;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==8 && j2.getSelectedIndex()==7)
{
float b1=Float.parseFloat(t1.getText());
double b2=b1*0.012;
t2.setText(""+b2);
}
else if(j1.getSelectedIndex()==8 && j2.getSelectedIndex()==8)
{
float b1=Float.parseFloat(t1.getText());
t2.setText(""+b1);
}
}
public static void main(String args[])
{
CurrencyConverter c1= new CurrencyConverter();
c1.setSize(300,300);
c1.setTitle("Currency Converter");
c1.setVisible(true);
}
}