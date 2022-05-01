package ASimulatorSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JLabel l1, l2;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    JTextField t1;
    String pin;

    FastCash(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 1080);
        add(l3);

        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));

        b1 = new JButton("Rs 100");
        b2 = new JButton("Rs 500");
        b3 = new JButton("Rs 1000");
        b4 = new JButton("Rs 2000");
        b5 = new JButton("Rs 5000");
        b6 = new JButton("Rs 10000");
        b7 = new JButton("BACK");

        setLayout(null);

        l1.setBounds(235, 400, 700, 35);
        l3.add(l1);

        b1.setBounds(170, 499, 150, 35);
        l3.add(b1);

        b2.setBounds(390, 499, 150, 35);
        l3.add(b2);

        b3.setBounds(170, 543, 150, 35);
        l3.add(b3);

        b4.setBounds(390, 543, 150, 35);
        l3.add(b4);

        b5.setBounds(170, 588, 150, 35);
        l3.add(b5);

        b6.setBounds(390, 588, 150, 35);
        l3.add(b6);

        b7.setBounds(390, 633, 150, 35);
        l3.add(b7);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setSize(960, 1080);
        setLocation(500, 0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String amount = ((JButton)ae.getSource()).getText().substring(3); //k
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pin+"'");
            int balance = 0;
            while (rs.next()) {
                if (!rs.getString("mode").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                    
                    
                }
            } String num = "17";
            
            
            if(ae.getSource()==b1){
                
                    Conn c1 = new Conn();
                    
                    //ResultSet rs = c1.s.executeQuery(" select * from bank where pin = '"+a+"' ");
                    
                    
                    if(rs.next()){
                        //String pin = rs.getString("pin");
                        
                       // balance = rs.getDouble("balance");
                     
                        balance-=100;
                        String q1= "insert into bank values('"+pin+"',null,100,'"+balance+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
                    
                    
                    
                    JOptionPane.showMessageDialog(null, "100"+" Debited Successfully");
                    
                    new Transactions(pin).setVisible(true);
                    setVisible(false);
                    
                    
                    
            }
            
            else if(ae.getSource()==b2){
                
                    Conn c1 = new Conn();
                    
                    
                    
                    
                    if(rs.next()){
                     
                        balance-=500;
                        String q1= "insert into bank values('"+pin+"',null,500,'"+balance+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
                    
                    JOptionPane.showMessageDialog(null, "500"+" Debited Successfully");
                    
                    new Transactions(pin).setVisible(true);
                    setVisible(false);
                    
                    
                    
                }
            
            else if(ae.getSource()==b3){
                
                    Conn c1 = new Conn();
                    
                    
                    
                    
                    if(rs.next()){
                        
                     
                        balance-=1000;
                        String q1= "insert into bank values('"+pin+"',null,1000,'"+balance+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
                    
                    
                    
                    JOptionPane.showMessageDialog(null,  "1000"+" Debited Successfully");
                    
                    new Transactions(pin).setVisible(true);
                    setVisible(false);
                    
                    
                    
                }
            
            else if(ae.getSource()==b4){
                
                    Conn c1 = new Conn();
                    
                    
                    
                    
                    if(rs.next()){
                        
                        balance-=2000;
                        String q1= "insert into bank values('"+pin+"',null,2000,'"+balance+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
                    
                    
                    
                    JOptionPane.showMessageDialog(null, "2000"+" Debited Successfully");
                    
                    new Transactions(pin).setVisible(true);
                    setVisible(false);
                    
                    
                    
                }
            
            
            
            
            
            
        else if(ae.getSource()==b5){
                
                    Conn c1 = new Conn();
                    
                    
                    
                    
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        
                        
                        balance-=5000;
                        String q1= "insert into bank values('"+pin+"',null,5000,'"+balance+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
                    
                    
                    
                    JOptionPane.showMessageDialog(null, "5000"+" Debited Successfully");
                    
                    new Transactions(pin).setVisible(true);
                    setVisible(false);
                    
                    
                    
                }
            else if(ae.getSource()==b6){
                
                    Conn c1 = new Conn();
                    
                    
                    
                    
                    if(rs.next()){
                        String pin = rs.getString("pin");
                        
                        
                     
                        balance-=10000;
                        String q1= "insert into bank values('"+pin+"',null,10000,'"+balance+"')";
                    
                        c1.s.executeUpdate(q1);
                    }
                    
                    
                    
                    JOptionPane.showMessageDialog(null, "10000"+" Debited Successfully");
                    
                    new Transactions(pin).setVisible(true);
                    setVisible(false);
                    
                    
                    
                }
            else if (ae.getSource() != b7 && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
            }
            if (ae.getSource() == b7) {
                this.setVisible(false);
                new Transactions(pin).setVisible(true);
            }else{
                Date date = new Date();
                c.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                    
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new FastCash("").setVisible(true);
    }
}
