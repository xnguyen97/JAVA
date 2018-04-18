
package ThucHanh;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import com.sun.java.accessibility.util.AWTEventMonitor;

public class bai1 {  
public static void main(String[] agrs){
    Frame f = new Frame("Bài 1");
    f.setBounds (0, 0, 500, 200);
    f.setLayout (new FlowLayout());
    lblA = new Label("a=");
    f.add(lblA);
    txtA = new TextField(40);
    f.add(txtA);
    lblB = new Label("b=");
    f.add(lblB);
    txtB = new TextField(40);
    f.add(txtB);
    Button bt1 = new Button("+");
    bt1.addActionListener(new langnghecong());
    f.add(bt1);
    Button bt2 = new Button("-");
    bt2.addActionListener(new langnghetru());
    f.add(bt2);
    Button bt3 = new Button("*");
    bt3.addActionListener(new langnghenhan());
    f.add(bt3);
    Button bt4 = new Button("/");
    bt4.addActionListener(new langnghechia());
    f.add(bt4);
    lblKQ = new Label("KQ");
    f.add(lblKQ);
    txtKQ = new TextField(40);
    f.add(txtKQ);
    f.setVisible(true);
}
  static class langnghecong  implements ActionListener 
   {
       public void actionPerformed(ActionEvent evt)
       {
           a =  Float.parseFloat(txtA.getText());
           b =  Float.parseFloat(txtB.getText());
           kq = a+b;
           txtKQ.setText(String.valueOf(kq));
       }
    }
 static class langnghetru  implements ActionListener 
   {
       public void actionPerformed(ActionEvent evt)
       {
           a =  Float.parseFloat(txtA.getText());
           b =  Float.parseFloat(txtB.getText());
           kq = a-b;
           txtKQ.setText(String.valueOf(kq));
       }
    }
 static class langnghenhan  implements ActionListener 
   {
       public void actionPerformed(ActionEvent evt)
       {
           a =  Float.parseFloat(txtA.getText());
           b =  Float.parseFloat(txtB.getText());
           kq = a*b;
           txtKQ.setText(String.valueOf(kq));
       }
    }
 static class langnghechia  implements ActionListener 
   {
       public void actionPerformed(ActionEvent evt)
       {
           a =  Float.parseFloat(txtA.getText());
           b =  Float.parseFloat(txtB.getText());
           kq = a/b;
           txtKQ.setText(String.valueOf(kq));
       }
    }
   static Label lblA, lblB,lblKQ;
   static TextField txtA, txtB, txtKQ;
   static Button bt1, bt2, bt3, bt4;
   static float a,b,kq;
}