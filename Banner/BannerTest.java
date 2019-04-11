import java.awt.*;
import java.applet.*;

/* <APPLET code = "BannerTest.class" width=500 height=500></APPLET> */

public class BannerTest extends Applet implements Runnable {
  private String output;
  private int x,y,flag;
  Thread t;
  public  void init(){
    output = "Moving Text";
    x = 100;
    y = 100;
    flag = 1;
    t = new Thread(this, "MyThread");
    t.start();
  }
  public void update(){
    x = x + 10*flag;
    if(x>300)
      flag = -1;
    else if(x<100)
      flag = 1;
  }
  public void run(){
    while(true){
      repaint();
      update();
      try{
        Thread.sleep(500);
      }
      catch(InterruptedException ie){
        System.out.println(ie);
      }
    }
  }
  public void paint(Graphics g){
    g.drawString(output, x, y);
  }
}
