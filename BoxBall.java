import java.awt.Color;

/**
 * Class BoxBall - a short animation with random balls presented
 * with the Canvas class. 
 *
 * @author Bill Crosbie
 * @version 2015-March-BB
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 * 
 * @author Jack Henry Protopapa
 * @version 2017.October.17
 */

public class BoxBall   
{
    private Canvas myCanvas;

    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
    public BoxBall()
    {
        myCanvas = new Canvas("Box Ball", 600, 500);
    }

    /**
     * Simulate two bouncing balls
     */
    public void bounce()
    {
        int ground = 400;   // position of the ground line
        int ceiling = 0;    // position of ceiling line
        // position of left line
        // position of right line

        myCanvas.setVisible(true);

        // draw the ground
        myCanvas.drawLine(50, ground, 550, ground); //bottom
        myCanvas.drawLine(50, 0, 550, 0); //top
        myCanvas.drawLine(50, 0, 50, ground); //left
        myCanvas.drawLine(550, 0, 550, ground);//right
        
        
        // crate and show the balls
        BouncingBall ball = new BouncingBall(250, 250, 20, Color.BLUE, ground, 0, myCanvas);
        ball.draw();

        // make them bounce
        boolean finished =  false;
        while(!finished) {
            myCanvas.wait(50);           // small delay
            ball.move();
        }
    }
}
