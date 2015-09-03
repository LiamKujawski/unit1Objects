import java.awt.Color;
import java.util.Random;

public class TurtleWorld
{
    public static void main(String args[])
    {
        // Establishes World and objects
        World turtleWorld = new World(3000,1000);
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle.setShellColor(Color.BLUE);
        turtle2.setPenColor(Color.RED);
        turtle3.setPenColor(Color.GREEN);
        Random generator = new Random();
        Color myColor;
        while(true)
        {
            
            
            // Makes random Colors to import into setPenColor
            myColor = new Color(generator.nextInt(256), generator.nextInt(256), generator.nextInt(256));
            turtle.setPenColor(myColor);
            turtle2.setPenColor(myColor);
            turtle3.setPenColor(myColor);
            // Makes random Numbers to import into the int
            int random_num = generator.nextInt(25);
            int random_num2 = generator.nextInt(25);
            int random_num3 = generator.nextInt(25);
            // Makes Turtle go in several circles
            turtle.forward(random_num);
            turtle2.forward(random_num2);
            turtle3.forward(random_num3);
            turtle3.turn(random_num3);
            turtle2.turn(random_num2);
            turtle.turn(random_num);
            turtle.forward(random_num);
            turtle2.forward(random_num2);
            turtle3.forward(random_num3);
            turtle3.turn(random_num3);
            turtle2.turn(random_num2);
            turtle.turn(random_num);
            turtle.forward(random_num);
            turtle2.forward(random_num2);
            turtle3.forward(random_num3);
            turtle3.turn(random_num3);
            turtle2.turn(random_num2);
            turtle.turn(random_num);
            turtle.forward(random_num);
            turtle2.forward(random_num2);
            turtle3.forward(random_num3);
            turtle3.turn(random_num3);
            turtle2.turn(random_num2);
            turtle.turn(random_num);
            turtle.forward(random_num);
            turtle2.forward(random_num2);
            turtle3.forward(random_num3);
            turtle3.turn(random_num3);
            turtle2.turn(random_num2);
            turtle.turn(random_num);
            turtle.forward(random_num);
            turtle2.forward(random_num2);
            turtle3.forward(random_num3);
          
      
        
        
        

        
    }
}
}
