import java.awt.*;

public class LoginUig {
    Frame f;
    public LoginUig() {
        f = new Frame("HW");
        f.setLayout(new GridLayout(3,0));
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

        f.add(uno);    
        f.add(dos);
        f.add(tri);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}