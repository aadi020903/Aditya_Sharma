import java.awt.*;

import java.awt.event.*;

import javax.lang.model.util.ElementScanner6;

class calculate implements ActionListener
{
    Frame f;
    TextField t1;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bp,bs,bm,be,bd;
    int a,b,c;
    String opt;
    calculate()
    {
        f = new Frame("Calculate");
        t1 = new TextField();
        b0 = new Button("0");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b1 = new Button("1");
        bp = new Button("+");
        bs = new Button("-");
        bm = new Button("*");
        bd = new Button("/");
        be = new Button("=");

        f.setLayout(null);
    
        t1.setBounds(30,50,150,30);
        b1.setBounds(30,100,30,30);
        b2.setBounds(70,100,30,30);
        b3.setBounds(110,100,30,30);
        bp.setBounds(150,100,30,30);
        b4.setBounds(30,140,30,30);
        b5.setBounds(70,140,30,30);
        b6.setBounds(110,140,30,30);
        bs.setBounds(150,140,30,30);
        b7.setBounds(30,180,30,30);
        b8.setBounds(70,180,30,30);
        b9.setBounds(110,180,30,30);
        bm.setBounds(150,180,30,30);
        bd.setBounds(30,220,30,30);
        b0.setBounds(70,220,30,30);
        be.setBounds(110,220,70,30);

        f.add(t1);
        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bp);
        f.add(bs);
        f.add(bm);
        f.add(bd);
        f.add(be);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bp.addActionListener(this);
        bm.addActionListener(this);
        bs.addActionListener(this);
        bd.addActionListener(this);
        be.addActionListener(this);

        f.setSize(215, 300);
        f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        String S = e.getActionCommand();

        if(S.equals("+"))
        {
            a = Integer.parseInt(t1.getText());
            t1.setText("");
            opt ="+";
        }
        else if(S.equals("-"))
        {
            a = Integer.parseInt(t1.getText());
            t1.setText("");
            opt ="-";
        }
        else if(S.equals("*"))
        {
            a = Integer.parseInt(t1.getText());
            t1.setText("");
            opt ="*";
        }
        else if(S.equals("/"))
        {
            a = Integer.parseInt(t1.getText());
            t1.setText("");
            opt ="/";
        }
        else if(S.equals("="))
        {
            b = Integer.parseInt(t1.getText());
            if(opt.equals("+"))
            c=a+b;
            else if(opt.equals("-"))
            c=a-b;
            else if(opt.equals("*"))
            c=a*b;
            else if(opt.equals("/"))
            c=a/b;
            t1.setText(Integer.toString(c));
        }    
        else
        
        t1.setText(t1.getText()+S);
    }    
    public static void main(String[] args) {
    calculate c= new calculate();
    }
}