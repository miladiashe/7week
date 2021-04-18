import java.awt.*;

public class LoginUiB {
    Frame f;
    public LoginUiB() {
        f = new Frame("HW");
        f.setLayout(new BorderLayout());
        Panel uno = new Panel();
        Panel dos = new Panel();
        Panel tri = new Panel();
        uno.setBackground(Color.red);
        dos.setBackground(Color.orange);
        tri.setBackground(Color.yellow);

        TextField ID = new TextField(30);
        Label li = new Label("id");
        uno.add(li);
        uno.add(ID);
        char c = '*';
        TextField PW = new TextField(30);
        PW.setEchoChar(c);
        Label lp = new Label("pw");
        dos.add(lp);
        dos.add(PW);
        
        Label l = new Label("press");
        Button b = new Button("ok");
        
        tri.add(l);
        tri.add(b);

        f.add(uno, "North");    
        f.add(dos, "Center");
        f.add(tri, "South");
        f.setSize(300, 200);
        f.setVisible(true);
    }
}