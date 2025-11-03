import javax.swing.*;
import java.awt.*;
//This is new Emac Comment for testing
public class LayoutPractice extends JFrame {
    public LayoutPractice(){
        super("Testing Layout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.PAGE_AXIS));
        getContentPane().add(leftPanel, BorderLayout.WEST);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY,5,true));
        Button button1 = new Button("Button1");
        JPanel blankPanel1 = new JPanel();
        JPanel blankPanel2 = new JPanel();

        

        leftPanel.add(blankPanel1);
        leftPanel.add(buttonPanel, BorderLayout.SOUTH);
        leftPanel.add(blankPanel2);
        buttonPanel.add(button1, BorderLayout.NORTH);
        leftPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY,5,true));

        JPanel rightPanel = new JPanel();

        getContentPane().add(rightPanel, BorderLayout.CENTER);
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.GREEN,10,true));

        setSize(500,500);
        revalidate();
        repaint();
        setVisible(true);

    }
    public static void main(String[] args){
        LayoutPractice mine = new LayoutPractice();
    }

    public void paintComponents(Graphics g){
        super.paintComponents(g);

        g.setColor(Color.RED);
        g.drawRect(10,100,30,20);
    }
}

