import java.awt.*;

public class BDt2 extends Frame{
    public BDt2(){
        super("BDT2");
        setLayout(new BorderLayout(5,5));
        add(new Label("Hi!!", Label.CENTER), BorderLayout.NORTH);
        add(new TextArea("Center", 5, 20), BorderLayout.CENTER);
        Panel p = new Panel();
        p.setLayout(new FlowLayout());
        p.add(new Button("O"));
        p.add(new Button("X"));
        add(p, BorderLayout.SOUTH);
        setSize(300,200);
        setVisible(true);
    }
    
}
