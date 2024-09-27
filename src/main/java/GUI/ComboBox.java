/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;


/**
 *
 * @author Administrator
 */
public class ComboBox extends JFrame{
    private JLabel lb1,lb2,lb3,lb4;
    private JTextField txtnumber1, txtnumber2,txtnumber3;
    private JButton btnCount;
    private JComboBox<String> cbCount;
  
    public static void main(String[] args) {
        // TODO code application logic here
        ComboBox cb=new ComboBox();
        cb.setVisible(true);
    }
    public ComboBox(){
        setTitle("Tính toán đơn giản");
        taoGiaoDien();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void taoGiaoDien() {
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(4,2,5,5));
        p1.add(lb1=new JLabel("So 1"));
        p1.add(txtnumber1=new JTextField());
        txtnumber1.setPreferredSize(new Dimension(100,30));
        p1.add(lb2=new JLabel("So 2"));
        p1.add(txtnumber2=new JTextField());
        
        String[] Count={"+","-","x","/"};
        cbCount=new JComboBox(Count);
        p1.add(lb3= new JLabel("Phep tinh"));
        p1.add(cbCount);
        
        p1.add(lb4=new JLabel("Ket Qua"));
        p1.add(txtnumber3=new JTextField());
        
        add(p1);
        add(btnCount=new JButton("Tinh"),BorderLayout.SOUTH);
        
        btnCount.addActionListener((e) -> {            
            try{
                double x1= Double.parseDouble(txtnumber1.getText());
                double x2= Double.parseDouble(txtnumber2.getText());
                double kq=0;
                
                String Count1=(String) cbCount.getSelectedItem();
                switch (Count1){
                    case "+":
                        kq=x1+x2;
                        break;
                    case "-":
                        kq=x1-x2;
                        break;
                    case "x":
                        kq=x1*x2;
                        break;
                    case "/":
                        if(x2!=0){
                            kq=x1/x2;}
                        else{
                            JOptionPane.showMessageDialog(null, "Khong the chia het cho 0","Loi",JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        break;
                    default:
                        break;
                }
                txtnumber3.setText(String.valueOf(kq));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Loi Nhap Lieu","Thong Bao Loi",JOptionPane.ERROR_MESSAGE);
            }
        });
                
    }
    
}
