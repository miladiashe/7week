import java.awt.*;
import java.awt.event.*;

public class PUPtest extends Frame implements ActionListener{
    PopupMenu pup;
    Frame f; 
    Button b;
    public PUPtest(){
        f = new Frame("PUP");
        b = new Button("P");

        b.addActionListener(this);

        pup = new PopupMenu("PUP");
        pup.add(new MenuItem("c"));
        pup.add(new MenuItem("v"));
        Menu col = new Menu("color");
        col.add(new MenuItem("w"));
        col.add(new MenuItem("b"));

        pup.add(col);
        b.add(pup);
        f.add("Center", b);
        f.setSize(300,200);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        pup.show(b, 10,10);
        
    }
}
