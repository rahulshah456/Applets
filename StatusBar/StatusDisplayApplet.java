import java.awt.Graphics;
import java.applet.Applet;

/* <APPLET code = "StatusDisplayApplet.class" width = 500 height = 500></APPLET> */

public class StatusDisplayApplet extends Applet{
  public void paint(Graphics g){
    g.drawString("Applet With StatusBar", 100, 50);
    showStatus("Showing Status text");
  }
}
