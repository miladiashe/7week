import java.awt.*;
import java.awt.event.*;

public class CDf {
    CardLayout card;
    Frame f;
    Panel p1, p2, p3, p4, p5;
    Label l1, l2, l3, l4, l5;

    public CDf(){
        f = new Frame("CDF");
        card = new CardLayout();
        f.setLayout(card);

        p1= new Panel();
        p2= new Panel();
        p3= new Panel();
        p4= new Panel();
        p5= new Panel();
        l1= new Label("1");
        l2= new Label("2");
        l3= new Label("3");
        l4= new Label("4");
        l5= new Label("5");
        p1.setBackground(Color.yellow);
        p2.setBackground(Color.green);
        p1.setBackground(Color.magenta);
        p1.setBackground(Color.white);
        p1.setBackground(Color.cyan);

        MouseHandler h = new MouseHandler();


        p1.add(l1);
        p2.add(l2);
        p3.add(l3);
        p4.add(l4);
        p5.add(l5);
        p1.addMouseListener(h);
        p2.addMouseListener(h);
        p3.addMouseListener(h);
        p4.addMouseListener(h);
        p5.addMouseListener(h);

        f.add("First", p1);
        f.add("Second", p2);
        f.add("third", p3);
        f.add("Fourth", p4);
        f.add("Fifth", p5);

    }

    public class MouseHandler extends MouseAdapter{
        public void MouseClicked(MouseEvent e){
            card.next(f);
        }
    }
    
}
