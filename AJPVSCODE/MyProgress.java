import java.awt.*;
import javax.swing.*;
public class MyProgress extends JFrame
{
    JProgressBar jb;
    int i=0,num=0;
    public MyProgress()
    {
        Container ct=getContentPane();
        jb=new JProgressBar(0,2000);
        jb.setBounds(40,40,200,30);
        jb.setStringPainted(true);
        ct.add(jb);
        this.setSize(400,400);
        ct.setLayout(new FlowLayout());
    }
    public void iterate()
    {
        while(i<=2000)
        {
            jb.setValue(i);
            i=i+20;
            try
            {
                Thread.sleep(150);

            }
            catch(Exception e){}

        }//end of while
    }
    public static void main(String[] args) {
        MyProgress m=new MyProgress();
        m.setTitle("Progress-bar Demo");
        m.setVisible(true);
        m.iterate();
    }
}