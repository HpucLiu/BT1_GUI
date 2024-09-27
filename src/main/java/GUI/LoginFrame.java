/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class LoginFrame extends JFrame{

    private JLabel lbluser,lblpass;
    private JTextField txtuser;
    private JPasswordField txtPass;
    private JButton btnLogin,btnReset;
    
    public static void main(String[] args) {
        // TODO code application logic here
        LoginFrame frm=new LoginFrame("Login System");
        frm.setVisible(true);
    }
    
    public LoginFrame (String title){
        super(title);
        taoGiaoDien();
        processEvent();
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void taoGiaoDien() {
        JPanel p=new JPanel();
        p.setLayout(new GridLayout(3,2,10,10));
        p.add(lbluser=new JLabel("User name"));
        p.add(txtuser=new JTextField());
        p.add(lblpass=new JLabel("PassWord"));
        p.add(txtPass=new JPasswordField(10));
        p.add(btnLogin=new JButton("Login"));
        p.add(btnReset=new JButton("Reset"));
        
        add(p);
    }

    private void processEvent() {
        btnLogin.addActionListener((e) -> {
           String user =txtuser.getText();
           String pass=txtPass.getText();
           if(user.equals("admin")||pass.equals("admin")){
               JOptionPane.showMessageDialog(null, "Dang nhap thanh cong");
           }else{
               JOptionPane.showMessageDialog(null, "Dang nhap that bai","Thong bao loi0",JOptionPane.ERROR_MESSAGE);
           }
        });
        btnReset.addActionListener((e) -> {
           txtuser.setText("");
           txtPass.setText("");
           txtuser.requestFocus();
        });
    }
    
}
