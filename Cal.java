import java.awt.*;

public class Cal extends Frame{
    Panel p1, p2;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;

    TextField num;

    public Cal(){
        super("Calculator");
        Font font = new Font("Serif", Font.BOLD, 30);
        setFont(font);



        p2 = new Panel();

        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        
        b10 = new Button("+");
        b11 = new Button("x");
        b12 = new Button("-");
        b13 = new Button("/");
        b14 = new Button("AC");
        b15 = new Button("+/-");
        b16 = new Button("%");
        b17 = new Button(".");
        b18 = new Button("=");

        num = new TextField();

        GridBagLayout lay = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        p2.setLayout(lay);

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 4;
        c.gridheight = 1;
        lay.setConstraints(num, c);
        p2.add(num);
        

        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b14, c);
        p2.add(b14);
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b15, c);
        p2.add(b15);
        c.gridx = 2;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b16, c);
        p2.add(b16);
        c.gridx = 3;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b13, c);
        p2.add(b13);



        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b7, c);
        p2.add(b7);
        c.gridx = 1;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b8, c);
        p2.add(b8);
        c.gridx = 2;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b9, c);
        p2.add(b9);
        c.gridx = 3;
        c.gridy = 2;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b11, c);
        p2.add(b11);




       
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b4, c);
        p2.add(b4);
        c.gridx = 1;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b5, c);
        p2.add(b5);
        c.gridx = 2;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b6, c);
        p2.add(b6);
        c.gridx = 3;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b12, c);
        p2.add(b12);



        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b1, c);
        p2.add(b1);
        c.gridx = 1;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b2, c);
        p2.add(b2);
        c.gridx = 2;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b3, c);
        p2.add(b3);
        c.gridx = 3;
        c.gridy = 4;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b10, c);
        p2.add(b10);




        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b0, c);
        p2.add(b0);

        c.gridx = 1;
        c.gridy = 5;
        c.gridwidth = 1;
        c.gridheight = 1;
        lay.setConstraints(b17, c);
        p2.add(b17);

        c.gridx = 2;
        c.gridy = 5;
        c.gridwidth = 2;
        c.gridheight = 1;
        lay.setConstraints(b18, c);
        p2.add(b18);

        add(p2);

        setVisible(true);

        setSize(800, 1000);

    }

    
}
