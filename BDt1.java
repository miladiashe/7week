import java.awt.*;
public class BDt1 {

    public BDt1(){

        Frame f = new Frame("Boarder Test One");
        f.setLayout(new BorderLayout(5, 5));
        f.add("North", new Button("North"));
        f.add("Center", new Button("Center"));
        f.add("South", new Button("South"));
        f.add("West", new Button("West"));
        f.add("East", new Button("East"));
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
    
