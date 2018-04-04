package ThucHanh;
import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class bai2  { 
public static void main(String args[]) 
{ 
Frame f = new Frame("Bai1 AWT");
f.setBounds(450,150, 640, 480);
       f.setLayout(new FlowLayout());
       lbla = new Label("a");
       f.add(lbla);
         txta = new TextField(40);
       f.add(txtb);
        lblb=new Label("b");
        f.add(lblb);
        txtb = new TextField(40);
       f.add(txtb);
        bt1 = new Button("+");
        f.add(bt1);
         bt2 = new Button("-");
        f.add(bt2);
       bt3 = new Button("*");
        f.add(bt3);
        bt4 = new Button("/");
        f.add(bt4);
         lblkq=new Label("b");
        f.add(lblkq);
        txtkq = new TextField(40);
        f.add(txtkq);
        f.setVisible(true);
}

  
class langnghecong implements ActionListener{
      public void actionPerformed(ActionEvent e) {
           // Lấy A
           a = Integer.parseInt(txta.getText());
           // Lấy B
           b = Integer.parseInt(txtb.getText());
           //Tính tổng
          kq = a+b;
           // Xuất
           txtkq.setText(String.valueOf(kq));
}}
class langnghetru implements ActionListener{
      public void actionPerformed(ActionEvent e) {
           // Lấy A
           a = Integer.parseInt(txta.getText());
           // Lấy B
           b = Integer.parseInt(txtb.getText());
           //Tính tổng
           kq = a-b;
           // Xuất
           txtkq.setText(String.valueOf(kq));
}}
class langnghenhan implements ActionListener{
      public void actionPerformed(ActionEvent e) {
           // Lấy A
          a = Integer.parseInt(txta.getText());
           // Lấy B
           b = Integer.parseInt(txtb.getText());
           //Tính tổng
          kq = a*b;
           // Xuất
           txtkq.setText(String.valueOf(kq));
}}
class langnghechia implements ActionListener{
      public void actionPerformed(ActionEvent e) {
           // Lấy A
         a = Integer.parseInt(txta.getText());
           // Lấy B
         b = Integer.parseInt(txtb.getText());
           //Tính tổng
         kq = a/b;
           // Xuất
         txtkq.setText(String.valueOf(kq));
}}

static Label lbla, lblb, lblkq ;
static TextField txta,txtb,txtkq;
static int a,b,kq;
static Button bt1,bt2,bt3,bt4 ;

}