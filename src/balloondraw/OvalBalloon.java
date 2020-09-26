/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balloondraw;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author dlwin
 */
public class OvalBalloon extends Balloon {
    
    public OvalBalloon()
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
  public OvalBalloon(int x, int y, int r, Color c)
  {
    super(x,y,r,c);
  }
  
  @Override
  public double distance(int x, int y)
  {
    double dx = x - getX();
    double dy = y - getY();
    return Math.sqrt(4*dx*dx + dy*dy);
  }
  
  @Override
  public void draw(Graphics g, boolean makeItFilled)
  {
    int r = getRadius();
    int x = getX();
    int y = getY();
    g.setColor(getColor());
    
 
    if (makeItFilled)
      g.fillOval(x - r/2,
                 y - r, r, 2*r);
    else
      g.drawOval(x - r/2,
                 y - r, r, 2*r);
  }
    
}
