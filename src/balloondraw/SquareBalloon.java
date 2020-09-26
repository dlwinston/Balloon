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
public class SquareBalloon extends Balloon
{
  

  /**
   * Constructs a balloon with the center at (0, 0),
   * radius 50, and blue color
   */
  public SquareBalloon()
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
  public SquareBalloon(int x, int y, int r, Color c)
  {
    super(x,y,r,c);
  }

 
  
  
  
  /**
   * Draws a solid circle if makeItFilled is true and
   * outline only if makeItFilled is false
   * @param g graphics context
   * @param makeItFilled draws a solid circle if true
   * 
   * 
   * 
   */
  @Override
  public double distance(int x, int y)
  {
     
    double dx = Math.abs(x - getX());
    double dy = Math.abs(y - getY());
    return Math.max(dx,dy);
  }
  
  @Override
  public void draw(Graphics g, boolean makeItFilled)
  {
    int r = getRadius();
    int x = getX();
    int y = getY();
    g.setColor(getColor());
 
    if (makeItFilled)
      g.fillRect(x - r,
                 y - r, 2*r, 2*r);
    else
      g.drawRect(x - r,
                 y - r, 2*r, 2*r);
  }
}
