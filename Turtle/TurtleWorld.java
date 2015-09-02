import java.awt.Color;
import java.util.Random;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        Turtle turtle2 = new Turtle(turtleWorld);
        Turtle turtle3 = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle.setShellColor(Color.BLUE);
        turtle2.setPenColor(Color.RED);
        turtle2.setPenColor(Color.GREEN);
        Random generator = new Random();
        while(true)
        {
            
            int random_num = generator.nextInt(16);
            int random_num2 = generator.nextInt(16);
            int random_num3 = generator.nextInt(16);
            turtle.forward(random_num);
            turtle2.forward(random_num2);
            turtle3.forward(random_num3);
            turtle3.turnLeft();
            turtle2.turnLeft();
            turtle.turnLeft();
            turtle.forward(random_num);
            turtle2.forward(random_num2);
            turtle3.forward(random_num3);
            turtle3.turnLeft();
            turtle2.turnLeft();
            turtle.turnLeft();
            turtle.forward(random_num);
            turtle2.forward(random_num2);
            turtle3.forward(random_num3);
            turtle3.turnLeft();
            turtle2.turnLeft();
            turtle.turnLeft();
            turtle.forward(random_num);
            turtle2.forward(random_num2);
            turtle3.forward(random_num3);
            turtle3.turnLeft();
            turtle2.turnLeft();
            turtle.turnLeft();
            turtle.forward(random_num);
            turtle2.forward(random_num2);
            turtle3.forward(random_num3);
            turtle3.turnLeft();
            turtle2.turnLeft();
            turtle.turnLeft();
            turtle.forward(random_num);
            turtle2.forward(random_num2);
            turtle3.forward(random_num3);
          
      
        
        
        

        
    }
}
}
