import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class Calculator implements ActionListener
{
    JFrame frame;
    JTextField answer;
    JButton one, two, three, four, five, six, seven, eight, nine , zero, divide,
            multiply, subtract, add, equals, clear;
 
    static double a=0,b=0,result=0;
    static int operator=0;
 
    Calculator()
    {
        frame = new JFrame("Rob's Simple Calculator");
        frame.getContentPane().setBackground(Color.DARK_GRAY);
        answer = new JTextField();
        answer.setBounds(30,40,280,30);
        frame.add(answer);
        
        one = new JButton("1");
        one.setBackground(Color.WHITE);
        two = new JButton("2");
        two.setBackground(Color.WHITE);
        three = new JButton("3");
        three.setBackground(Color.WHITE);
        four=new JButton("4");
        four.setBackground(Color.WHITE);
        five=new JButton("5");
        five.setBackground(Color.WHITE);
        six=new JButton("6");
        six.setBackground(Color.WHITE);
        seven=new JButton("7");
        seven.setBackground(Color.WHITE);
        eight=new JButton("8");
        eight.setBackground(Color.WHITE);
        nine=new JButton("9");
        nine.setBackground(Color.WHITE);
        zero=new JButton("0");
        zero.setBackground(Color.WHITE);
        divide=new JButton("/");
        divide.setBackground(Color.WHITE);
        multiply=new JButton("*");
        multiply.setBackground(Color.WHITE);
        subtract=new JButton("-");
        subtract.setBackground(Color.WHITE);
        add=new JButton("+");
        add.setBackground(Color.WHITE);
        clear=new JButton("C");
        clear.setBackground(Color.WHITE);
        equals=new JButton("=");
        equals.setBackground(Color.WHITE);


        
        
        seven.setBounds(40,100,50,40);
        eight.setBounds(110,100,50,40);
        nine.setBounds(180,100,50,40);
        divide.setBounds(250,100,50,40);
        
        four.setBounds(40,170,50,40);
        five.setBounds(110,170,50,40);
        six.setBounds(180,170,50,40);
        multiply.setBounds(250,170,50,40);
        
        one.setBounds(40,240,50,40);
        two.setBounds(110,240,50,40);
        three.setBounds(180,240,50,40);
        subtract.setBounds(250,240,50,40);
        
        clear.setBounds(40,310,50,40);
        zero.setBounds(110,310,50,40);
        equals.setBounds(180,310,50,40);
        add.setBounds(250,310,50,40);
        

        
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(divide);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(multiply);
        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(subtract);
        frame.add(zero);
        frame.add(equals);
        frame.add(add);
        frame.add(clear);
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(350,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        add.addActionListener(this);
        divide.addActionListener(this);
        multiply.addActionListener(this);
        subtract.addActionListener(this);
        equals.addActionListener(this);
        clear.addActionListener(this);
    }
 
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==one)
            answer.setText(answer.getText().concat("1"));
        
        if(e.getSource()==two)
            answer.setText(answer.getText().concat("2"));
        
        if(e.getSource()==three)
            answer.setText(answer.getText().concat("3"));
        
        if(e.getSource()==four)
            answer.setText(answer.getText().concat("4"));
        
        if(e.getSource()==five)
            answer.setText(answer.getText().concat("5"));
        
        if(e.getSource()==six)
            answer.setText(answer.getText().concat("6"));
        
        if(e.getSource()==seven)
            answer.setText(answer.getText().concat("7"));
        
        if(e.getSource()==eight)
            answer.setText(answer.getText().concat("8"));
        
        if(e.getSource()==nine)
            answer.setText(answer.getText().concat("9"));
        
        if(e.getSource()==zero)
            answer.setText(answer.getText().concat("0"));
        
        
        if(e.getSource()==add)
        {
            a=Double.parseDouble(answer.getText());
            operator=1;
            answer.setText("");
        } 
        
        if(e.getSource()==subtract)
        {
            a=Double.parseDouble(answer.getText());
            operator = 2;
            answer.setText("");
        }
        
        if(e.getSource()==multiply)
        {
            a=Double.parseDouble(answer.getText());
            operator=3;
            answer.setText("");
        }
        
        if(e.getSource()==divide)
        {
            a=Double.parseDouble(answer.getText());
            operator=4;
            answer.setText("");
        }
        
        if(e.getSource()==equals)
        {
            b=Double.parseDouble(answer.getText());
        
            switch(operator)
            {
                case 1: result=a+b;
                    break;
        
                case 2: result=a-b;
                    break;
        
                case 3: result=a*b;
                    break;
        
                case 4: result=a/b;
                    break;
        
                default: result=0;
            }
        
            answer.setText(""+result);
        }
        
        if(e.getSource()==clear)
            answer.setText("");
             
    }
 
    public static void main(String...s)
    {
        new Calculator();
    }
}