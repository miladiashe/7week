import java.awt.*;
public class ScrollPaneTest {
    ScrollPane sp;
    Panel mainPan, subPan;
    TextArea ta;
    Button ok, no;

    public ScrollPaneTest() {
        Frame f = new Frame("SPT");
        sp = new ScrollPane();
        sp.setSize(150,100);

        mainPan = new Panel();
        mainPan.setSize(500,450);
        mainPan.setLayout(new BorderLayout());

        ta = new TextArea();
        mainPan.add("Center", ta);

        subPan = new Panel();
        ok = new Button("OK");
        no = new Button("NO");
        subPan.add(ok);
        subPan.add(no);
        mainPan.add("South", subPan);

        sp.add(mainPan);
        f.add("Center", sp);
        f.setSize(200, 200);
        f.setVisible(true);

        
    }
    
}
