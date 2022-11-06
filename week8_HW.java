import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class MyJFrame extends JFrame implements ListSelectionListener{
    private JTextArea ta = new JTextArea("可選取月份...");
    private String[] month = {"1月", "2月", "3月", "4月", "5月", "6月", "7月", "8月", "9月", "10月", "11月", "12月"};
    private JList<String> jl1 = new JList<>(month);
    MyJFrame(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("2023年台灣國定假日查詢");
        setBounds(550, 250, 300, 280);
        setLayout(null);
        
        JLabel lb1 = new JLabel("找各月份國定假日：");
        lb1.setBounds(30, 30, 150, 100);
        add(lb1);

        jl1.setVisibleRowCount(5);
        jl1.addListSelectionListener(this);

        JScrollPane jsp = new JScrollPane(jl1, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp.setBounds(150, 30, 100, 100);
        add(jsp);
        
        ta.setBounds(30, 150, 220, 70);
        ta.setLineWrap(true);
        add(ta);

        JScrollPane jsp2 = new JScrollPane(ta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jsp2.setBounds(30, 150, 220, 70);
        add(jsp2);
        
        setVisible(true);

    }
    
    @Override
    public void valueChanged(ListSelectionEvent e){
        int a=1;
        String show = "";
        String[] holiday = {"1/1, 1/2, 1/20～1/27", "2/27, 2/28", "無國定假日", "4/3, 4/4, 4/5", "5/1", "6/22, 6/23", "無國定假日", "無國定假日", "9/29", "10/9, 10/10", "無國定假日", "無國定假日"};
        if (jl1.getSelectedValuesList().size()>0){
            ArrayList<String> selected = new ArrayList<>();
            selected.addAll(jl1.getSelectedValuesList());
            for(String  month : selected){
                switch (month) {
                    case "1月":
                        show += month+"的國定假日有："+holiday[0];
                        break;
                    case "2月":
                        show += month+"的國定假日有："+holiday[1];
                        break;
                    case "3月":
                        show += month+holiday[2];
                        break;
                    case "4月":
                        show += month+"的國定假日有："+holiday[3];
                        break;
                    case "5月":
                        show += month+"的國定假日有："+holiday[4];
                        break;
                    case "6月":
                        show += month+"的國定假日有："+holiday[5];
                        break;
                    case "7月":
                        show += month+holiday[6];
                        break;
                    case "8月":
                        show += month+holiday[7];
                        break;
                    case "9月":
                        show += month+"的國定假日有："+holiday[8];
                        break;
                    case "10月":
                        show += month+"的國定假日有："+holiday[9];
                        break;
                    case "11月":
                        show += month+holiday[10];
                        break;
                    case "12月":
                        show += month+holiday[11];
                        break;
                    default:
                        break;
                }
                if (a<selected.size()){
                    show += "\n";
                    a++;
                }
            }
        }else{
            show = "可選取月份...";
        }
        ta.setText(show);
    }
}

public class week8_HW{
    public static void main(String[] args){
        MyJFrame f1=new MyJFrame();
    }
}