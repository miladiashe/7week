import java.awt.*;
public class GRDt2 extends Frame{
    public GRDt2(){
        super("grd...");
        setLayout(new GridLayout(3,2));

        add(new Button("111111111"));

        add(new TextField("2", 10));

        add(new TextArea("333", 5, 10));

        List l = new List(5, false);
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");
        l.add("5");
        l.add("6");
        l.add("7");
        l.add("8");
        add(l);

        Panel p = new Panel();
        p.setLayout(new BorderLayout());
        p.add("North", new Button("n"));
        p.add("East", new Button("E"));
        add(p);
        add(new Label("6"));
        setSize(500, 400);
        setVisible(true);
    }
    
}
