import javax.swing.*;
import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;

import java.awt.*;
import java.awt.event.*;

class MyJFrame extends JFrame{
    private JPanel contentPane;
    int whichImage=0;
    MyJFrame(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Photo Player");
        setBounds(450, 200, 725, 500);

        contentPane=new JPanel();
        contentPane.setLayout(new FlowLayout());
        setContentPane(contentPane);

        JLabel lab1=new JLabel("圖片0",JLabel.CENTER);
        contentPane.add(lab1);

        ImageIcon image = new ImageIcon("C:\\Users\\user\\Downloads\\圖1.jpg");
        JLabel lab2=new JLabel(image);
        contentPane.add(lab2);


        JButton btn1=new JButton("上一張");
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                whichImage--;
                if(whichImage==0){
                    lab1.setText("圖片"+whichImage);
                    lab2.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\圖1.jpg"));
                }else if(whichImage==1){
                    lab1.setText("圖片"+whichImage);
                    lab2.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\圖2.jpg"));
                }else if(whichImage==2){
                    lab1.setText("圖片"+whichImage);
                    lab2.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\圖3.jpg"));
                }else{
                    whichImage++;
                    JOptionPane.showMessageDialog(null, "沒有圖了", "error",JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        contentPane.add(btn1);

        JButton btn2=new JButton("下一張");
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                whichImage++;
                if(whichImage==0){
                    lab1.setText("圖片"+whichImage);
                    lab2.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\圖1.jpg"));
                }else if(whichImage==1){
                    lab1.setText("圖片"+whichImage);
                    lab2.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\圖2.jpg"));
                }else if(whichImage==2){
                    lab1.setText("圖片"+whichImage);
                    lab2.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\圖3.jpg"));
                }else{
                    whichImage--;
                    JOptionPane.showMessageDialog(null, "沒有圖了", "Error",JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        contentPane.add(btn2);

        setVisible(true);
    }

}

public class week6_HW{
    public static void main(String[] args){
        MyJFrame f1=new MyJFrame();
    }
}