import java.awt.*;

public class GBt extends Frame{
    public GBt(){
        super("GB");

        GridBagLayout Gr = new GridBagLayout();
        GridBagConstraints con = new GridBagConstraints();
        setLayout(Gr);

        con.fill = GridBagConstraints.BOTH;

        con.weightx = 0.0;

        Button b1 = new Button("B1");
        Gr.setConstraints(b1, con);
        add(b1);
        Button b2 = new Button("B2");
        Gr.setConstraints(b2, con);
        add(b2);
        Button b3 = new Button("B3");
        Gr.setConstraints(b3, con);
        add(b3);

        con.gridwidth = 2;
        con.gridheight = 3;
        Button b4 = new Button("B4");
        Gr.setConstraints(b4, con);
        add(b4);

        con.gridwidth = GridBagConstraints.REMAINDER;
        con.gridheight = 1;
        con.weighty = 0.0;

        Button b5 = new Button("B5");
        Gr.setConstraints(b5, con);
        add(b5);

        Button b6 = new Button("B6");
        Gr.setConstraints(b6, con);
        add(b6);

        Button b7 = new Button("B7");
        Gr.setConstraints(b7, con);
        add(b7);

        pack();
        setVisible(true);
    
    }
}
