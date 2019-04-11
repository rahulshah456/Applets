import java.applet.Applet;
import java.awt.Graphics;

/*<applet code = "FirstApplet.class" width = "500" height = "150">
</applet>*/

 
//every applet must extend from java.applet.Applet class
public class FirstApplet extends Applet{
 
	
	public void paint(Graphics g){
		
		g.drawString("First Applet Class", 50, 50);
	}
}