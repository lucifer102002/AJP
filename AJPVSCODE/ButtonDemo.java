import java.awt.*;

class ButtonDemo extends Frame {

    ButtonDemo(){
        setLayout(null);

        Button b1 = new Button("Click Me");
        Button b2 = new Button("Do not click me");

        b1.setBounds(100,100,100,50);
        b2.setBounds(100,200,100,50);

        add(b1);
        add(b2);

    }

    public static void main (String args[]) {

        ButtonDemo b1 = new ButtonDemo();
         b1.setSize(500,400);
         b1.setVisible(true);
    }
}