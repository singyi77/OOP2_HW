import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class MyJFrame extends JFrame implements SwingConstants{
    private JPanel contentPane;
    ArrayList<Integer> numbers=new ArrayList<Integer>();
    ArrayList<String> operators=new ArrayList<String>();
    int number=0;
    int digits=1;
    MyJFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hello JFrame!");
        setBounds(550, 250, 340, 325);

        contentPane=new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JTextField calculatorInput=new JTextField();
        calculatorInput.setBounds(10,10,300,35);
        calculatorInput.setEditable(false);;
        contentPane.add(calculatorInput);

        JButton btn1=new JButton("1");
        btn1.setBounds(10, 55, 95, 35);
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatorInput.setText("1");
                if(digits>1){
                    number=number*10+Integer.parseInt(btn1.getText());
                }else{
                    number=Integer.parseInt(btn1.getText());
                }
                JOptionPane.showMessageDialog(null,"1");
            }
        });
        contentPane.add(btn1);

        JButton btn2=new JButton("2");
        btn2.setBounds(115, 55, 95, 35);
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatorInput.setText("2");
                if(digits>1){
                    number=number*10+Integer.parseInt(btn2.getText());
                }else{
                    number=Integer.parseInt(btn2.getText());
                }
                digits++;
                JOptionPane.showMessageDialog(null,"2");
            }
        });
        contentPane.add(btn2);

        JButton btn3=new JButton("3");
        btn3.setBounds(220, 55, 95, 35);
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatorInput.setText("3");
                if(digits>1){
                    number=number*10+Integer.parseInt(btn3.getText());
                }else{
                    number=Integer.parseInt(btn3.getText());
                }
                digits++;
                JOptionPane.showMessageDialog(null,"3");
            }
        });
        contentPane.add(btn3);

        JButton btn4=new JButton("4");
        btn4.setBounds(10, 100, 95, 35);
        btn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatorInput.setText("4");
                if(digits>1){
                    number=number*10+Integer.parseInt(btn4.getText());
                }else{
                    number=Integer.parseInt(btn4.getText());
                }
                digits++;
                JOptionPane.showMessageDialog(null,"4");
            }
        });
        contentPane.add(btn4);

        JButton btn5=new JButton("5");
        btn5.setBounds(115, 100, 95, 35);
        btn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatorInput.setText("5");
                if(digits>1){
                    number=number*10+Integer.parseInt(btn5.getText());
                }else{
                    number=Integer.parseInt(btn5.getText());
                }
                digits++;
                JOptionPane.showMessageDialog(null,"5");
            }
        });
        contentPane.add(btn5);

        JButton btn6=new JButton("6");
        btn6.setBounds(220, 100, 95, 35);
        btn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatorInput.setText("6");
                if(digits>1){
                    number=number*10+Integer.parseInt(btn6.getText());
                }else{
                    number=Integer.parseInt(btn6.getText());
                }
                digits++;
                JOptionPane.showMessageDialog(null,"6");
            }
        });
        contentPane.add(btn6);

        JButton btn7=new JButton("7");
        btn7.setBounds(10, 145, 95, 35);
        btn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatorInput.setText("7");
                if(digits>1){
                    number=number*10+Integer.parseInt(btn7.getText());
                }else{
                    number=Integer.parseInt(btn7.getText());
                }
                digits++;
                JOptionPane.showMessageDialog(null,"7");
            }
        });
        contentPane.add(btn7);

        JButton btn8=new JButton("8");
        btn8.setBounds(115, 145, 95, 35);
        btn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatorInput.setText("8");
                if(digits>1){
                    number=number*10+Integer.parseInt(btn8.getText());
                }else{
                    number=Integer.parseInt(btn8.getText());
                }
                digits++;
                JOptionPane.showMessageDialog(null,"8");
            }
        });
        contentPane.add(btn8);

        JButton btn9=new JButton("9");
        btn9.setBounds(220, 145, 95, 35);
        btn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatorInput.setText("9");
                if(digits>1){
                    number=number*10+Integer.parseInt(btn9.getText());
                }else{
                    number=Integer.parseInt(btn9.getText());
                }
                digits++;
                JOptionPane.showMessageDialog(null,"9");
            }
        });
        contentPane.add(btn9);

        JButton btn10=new JButton("+");
        btn10.setBounds(10, 190, 95, 35);
        btn10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatorInput.setText("+");
                digits=1;
                numbers.add(number);
                operators.add(btn10.getText());
                JOptionPane.showMessageDialog(null,"+");
            }
        });
        contentPane.add(btn10);

        JButton btn11=new JButton("0");
        btn11.setBounds(115, 190, 95, 35);
        btn11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatorInput.setText("0");
                if(digits>1){
                    number=number*10+Integer.parseInt(btn11.getText());
                }else{
                    number=Integer.parseInt(btn11.getText());
                }
                digits++;
                JOptionPane.showMessageDialog(null,"0");
            }
        });
        contentPane.add(btn11);

        JButton btn12=new JButton("-");
        btn12.setBounds(220, 190, 95, 35);
        btn12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatorInput.setText("-");
                digits=1;
                numbers.add(number);
                operators.add(btn12.getText());
                JOptionPane.showMessageDialog(null,"-");
            }
        });
        contentPane.add(btn12);

        JButton btn13=new JButton("×");
        btn13.setBounds(10, 235, 95, 35);
        btn13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatorInput.setText("×");
                digits=1;
                numbers.add(number);
                operators.add(btn13.getText());
                JOptionPane.showMessageDialog(null,"×");
            }
        });
        contentPane.add(btn13);

        JButton btn14=new JButton("=");
        btn14.setBounds(115, 235, 95, 35);
        btn14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                numbers.add(number);
                int result=0;
                while(operators.contains("×")){
                    result=numbers.get(operators.indexOf("×"))*numbers.get(operators.indexOf("×")+1);
                    numbers.set(operators.indexOf("×")+1, result);
                    numbers.remove(operators.indexOf("×"));
                    operators.remove("×");
                }
                while(operators.contains("÷")){
                    result=numbers.get(operators.indexOf("÷"))/numbers.get(operators.indexOf("÷")+1);
                    numbers.set(operators.indexOf("÷")+1, result);
                    numbers.remove(operators.indexOf("÷"));
                    operators.remove("÷");
                }
                while(operators.contains("+")){
                    result=numbers.get(operators.indexOf("+"))+numbers.get(operators.indexOf("+")+1);
                    numbers.set(operators.indexOf("+")+1, result);
                    numbers.remove(operators.indexOf("+"));
                    operators.remove("+");
                }
                while(operators.contains("-")){
                    result=numbers.get(operators.indexOf("-"))-numbers.get(operators.indexOf("-")+1);
                    numbers.set(operators.indexOf("-")+1, result);
                    numbers.remove(operators.indexOf("-"));
                    operators.remove("-");
                }
                calculatorInput.setText("="+result);
                JOptionPane.showMessageDialog(null,"="+result);
                digits=1;
                numbers.clear();
                operators.clear();
            }
        });
        contentPane.add(btn14);

        JButton btn15=new JButton("÷");
        btn15.setBounds(220, 235, 95, 35);
        btn15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                calculatorInput.setText("÷");
                digits=1;
                numbers.add(number);
                operators.add(btn15.getText());
                JOptionPane.showMessageDialog(null,"÷");
            }
        });
        contentPane.add(btn15);
        setVisible(true);
    }
}

public class week5_HW{
    public static void main(String[] args){
        MyJFrame f1=new MyJFrame();
    }
}