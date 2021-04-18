import java.awt.*;
public class PanelTest{
public PanelTest(){
    Frame f = new Frame("PanelTest");
    f.setLayout(null);
    Panel p = new Panel();
    p.setSize(100, 300);
    p.setBackground(Color.orange);
    p.setLocation(1, 100);

    TextField here = new TextField(5);
    Button aaa = new Button("AA");

    f.add(p);
    p.add(here);
    p.add(aaa);
    f.setSize(400, 500);
    f.setVisible(true);
}}