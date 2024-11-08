import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class KeyBoardEvents extends JFrame implements KeyListener
{
    Container c;
    JTextArea ta;
    String str="";
    KeyBoardEvents()
    {
    c=getContentPane();
    ta=new JTextArea("Press a Key");
    ta.setFont(new Font("Arial",Font.BOLD,30));
    c.add(ta);
    ta.addKeyListener(this);
    }
    public void keyPressed(KeyEvent ke){
        int keycode=ke.getKeyCode();
        if(keycode==KeyEvent.VK_F1)str+="F1 key";
        if(keycode==KeyEvent.VK_F2)str+="F2 key";
        if(keycode==KeyEvent.VK_F3)str+="F3 key";
        if(keycode==KeyEvent.VK_PAGE_UP)str+="Page Up";
        if(keycode==KeyEvent.VK_PAGE_DOWN)str+="Page Down";
        if(keycode==KeyEvent.VK_ALT)str+="Alter";
        if(keycode==KeyEvent.VK_HOME)str+="Home";
        if(keycode==KeyEvent.VK_END)str+="End";
    }
    public void keyReleased(KeyEvent ke){}
    public void keytyped(KeyEvent ke){}
    public static void main(String[] args) {
        KeyBoardEvents kbe=new KeyBoardEvents();
        kbe.setTitle("Key Board Events");
        kbe.setSize(400,400);
        kbe.setVisible(true);
        kbe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}