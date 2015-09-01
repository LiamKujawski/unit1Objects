import java.awt.Color;
import javax.swing.JFrame;
import java.util.Random;



public class Color2
{
    public static void main(String[] args)
    {
       JFrame frame = new JFrame();
       frame.setSize(1366, 768);
       Random generator = new Random();
       Color myColor;
       while(true){
           myColor = new Color(generator.nextInt(256), generator.nextInt(256), generator.nextInt(256));
           frame.getContentPane().setBackground(myColor);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setVisible(true);
        }
    }
}
    