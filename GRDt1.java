import java.awt.*;


public class GRDt1 extends Frame{
    public GRDt1(){
        super("gred1");
        setLayout(new GridLayout(2,3));
        add(new Button("1"));
        add(new Button("2"));
        add(new Button("3"));
        add(new Button("4"));
        add(new Button("5"));
        add(new Button("6"));
        setSize(300, 200);
        setVisible(true);

    }
    
}
