/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balloondraw;

/**
 *
 * @author dlwin
 */
import java.awt.Color;
import java.awt.Graphics;

public class RoundBalloon extends Balloon
{
  

  /**
   * Constructs a balloon with the center at (0, 0),
   * radius 50, and blue color
   */
  public RoundBalloon()
  {
   super();
  }

  /**
   * Constructs a balloon with a given center, radius and color
   * @param x x-coordinate of the center
   * @param y y-coordinate of the center
   * @param r radius of the balloon
   * @param c color of the balloon
   */
  public RoundBalloon(int x, int y, int r, Color c)
  {
    super(x,y,r,c);
  }

  @Override
  public double distance(int x, int y)
  {
    double dx = x - getX();
    double dy = y - getY();
    return Math.sqrt(dx*dx + dy*dy);
  }
  
  
  /**
   * Draws a solid circle if makeItFilled is true and
   * outline only if makeItFilled is false
   * @param g graphics context
   * @param makeItFilled draws a solid circle if true
   */
  public void draw(Graphics g, boolean makeItFilled)
  {
    int r = getRadius();
    int x = getX();
    int y = getY();  
      
    g.setColor(getColor());
    if (makeItFilled)
      g.fillOval(x - r,
                 y - r, 2*r, 2*r);
    else
      g.drawOval(x - r,
                 y - r, 2*r, 2*r);
  }
}
