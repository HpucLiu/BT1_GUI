/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class RadioButton extends JFrame {

    private JLabel lb1, lb2, lb3, lb4;
    private JTextField txtnumber1, txtnumber2, txtkq;
    private JButton btnTinh;
    private JRadioButton rdCong, rdTru, rdNhan, rdChia;

    public static void main(String[] args) {
        // TODO code application logic here
        RadioButton rd=new RadioButton();
        rd.setVisible(true);
    }

    public RadioButton() {
        setTitle("Tinh toan don gian");
        taoGiaoDien();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void taoGiaoDien() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 2, 5, 5));
        p1.add(lb1 = new JLabel("So 1"));
        p1.add(txtnumber1 = new JTextField());
        txtnumber1.setPreferredSize(new Dimension(100, 30));
        p1.add(lb2 = new JLabel("So 2"));
        p1.add(txtnumber2 = new JTextField());

        JPanel p2 = new JPanel();
        p2.add(rdCong = new JRadioButton("+"));
        p2.add(rdTru = new JRadioButton("-"));
        p2.add(rdNhan = new JRadioButton("x"));
        p2.add(rdChia = new JRadioButton("/"));

        p1.add(lb3 = new JLabel("Phep tinh"));
        p1.add(p2);
        p1.add(lb4 = new JLabel("Ket qua"));
        p1.add(txtkq = new JTextField());
        add(p1);
        add(btnTinh = new JButton("Tinh"), BorderLayout.SOUTH);

        ButtonGroup Pheptinh = new ButtonGroup();
        Pheptinh.add(rdCong);
        Pheptinh.add(rdTru);
        Pheptinh.add(rdNhan);
        Pheptinh.add(rdChia);

        btnTinh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double x=Double.parseDouble(txtnumber1.getText());
                    double y=Double.parseDouble(txtnumber2.getText());
                    double kq;
                    if(rdCong.isSelected())
                        kq=x+y;
                    else if(rdTru.isSelected())
                        kq=x-y;
                    else if(rdNhan.isSelected())
                        kq=x*y;
                    else
                        kq=x/y;
                    txtkq.setText(String.valueOf(kq));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Loi nhap lieu","Thong bao loi",JOptionPane.ERROR_MESSAGE);
                }
            }
        })
    ;
    }

}
