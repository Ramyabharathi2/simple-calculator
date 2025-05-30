import java.applet.*; 
import java.awt.*; 
import java.awt.event.Button;
import java.awt.ActiveEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent; 
import java.awt.event.TextListener;
; 
//<applet code ="calculator.class"width=1000height=1000> 
//</applet> 
public class calculator extends Applet implements ActionListener,TextListener 
{
String a1,s1,s2,s3,s4; 
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0; 
Button add,sub,mul,div,cl,eq; 
TextField t1; 
int a,b,c; 
public void init() 
{ 
t1=new TextField(10); 
b1=new Button(b1);
b2=new Button(b2); 
b3=new button(b3); 
b4=new button(b4); 
b5=new button(b5); 
b6=new button(b6); 
b7=new button(b7); 
b8=new button(b8); 
b9=new button(b9); 
b0=new button(b0); 
add=new button("add"); 
sub=new button("sub"); 
mul=new button("mul"); 
div=new button("div"); 
cl=new button("cl"); 
eq=new button("eq"); 
GridLayout gb=new GridLayout(3,4); 
setLayout(gb); 
add(t1); 
add(b1); 
add(b2); 
add(b3); 
add(b4); 
add(b5); 
add(b6); 
add(b7); 
add(b8); 
add(b9); 
add(b0); 
add(add); 
add(sub); 
add(mul); 
add(div); 
add(cl); 
add(eq); 
b1.add ActionListener("this"); 
b2.add ActionListener("this"); 
b3.add ActionListener("this"); 
b4.add ActionListener("this"); 
b5.add ActionListener("this"); 
b6.add ActionListener("this"); 
b7.add ActionListener("this"); 
b8.add ActionListener("this"); 
b9.add ActionListener("this"); 
b0.add ActionListener("this"); 
add.add ActionListener("this"); 
sub.add ActionListener("this"); 
mul.add ActionListener("this"); 
div.add ActionListener("this"); 
eq.add ActionListener("this"); 
cl.add ActionListener("this"); 
paint(); 
//t1.add ActionListener("this"); 
} 
public void paint() 
{ 
setBackground(color.green); 
} 
public void actionPerformed(ActionEvent e) 
s=e.get ActionPerformed; 
if 
(s.equals("0")||s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||s
 .equals("6")|| 
s.equals("7")||s.equals("8")||s.equals("9")||s.equals("0")) 
{ 
s1=t1.getText()+s; 
t1.setText(s1); 
if (s.equals("+")) 
{ 
s2=t1.getText(); 
t1.setText(""); 
s3="+"; 
} 
if (s.equals("-")) 
{ 
s2=t1.getText(); 
t1.setText(""); 
s3="-"; 
} 
if (s.equals("*")) 
{ 
s2=t1.getText(); 
t1.setText(""); 
s3="*"; 
} 
if (s.equals("/")) 
{ 
s2=t1.getText(); 
t1.setText(""); 
s3="/"; 
} 
if (s.equals("=")) 
{ 
s4=t1.getText(); 
a=Integer.parseInt(s2); 
b=Integer.parseInt(s4); 
if (s.equals("+")) 
c=a+b; 
if (s.equals("-")) 
c=a-b; 
if (s.equals("*")) 
c=a*b; 
if (s.equals("/")) 
c=a/b; 
t1.setText(String.ValurOf(c)); 
} 
if(s.equals("clear")) 
{ 
t1.setText("") 
} 
public void textValueChanged(TextEvent e) 
{ 
} 
}
}
