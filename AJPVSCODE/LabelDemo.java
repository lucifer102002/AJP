import java.awt.*;
class LabelDemo extends Frame {
    LabelDemo() {
        Label L1 = new Label("PHP");
        Label L2 = new Label("JavaScript");
        Label L3 = new Label("CSS");
        Label L4 = new Label("OSY");

        L1.setBounds(40, 100, 100, 30);
        L2.setBounds(40, 140, 100,30 );
        L3.setBounds(40,220,100,30);
        L4.setBounds(40,220,100,30);

        add(L1);
        add(L2);
        add(L3);
        add(L4);
    }

    public static void main(String args[]) {
        LabelDemo L1 = new LabelDemo();

        L1.setSize(500,400);
        L1.setTitle("Label Demo");
        L1.setVisible(true);
    }
}


