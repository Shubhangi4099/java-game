import java.util.*;  
 import java.applet.*;  
 import java.awt.*;  
 import java.awt.event.*;  
 //Package Declarations   
 public class balls extends Applet implements Runnable  
 {  
 Random r = new Random(); // Random number generation for Different Colours   
 int x = 10, y = 10,sang1 = 0, sang2 = 0, he = 500 , wi = 500;  
 public void init()  
 {  
 Thread t = new Thread(this); // Thread creation for animation   
 t.start();  
 }  
 public void run()  
 {  
 while(true)  
 {  
 try  
 {  
 repaint();  
 Thread.sleep(100);   // Thread time interval set to 100 mil seconds   
 if( x < wi - 100)   // Playing with position of balls on the applet screen   
 x += 5;  
 if( y < he - 100)  
 y += 5;  
 if( x > wi - 100)  
 x = wi - 100;  
 if( y > he - 100)  
 y = he - 100;  
 sang1 += 10;  
 sang2 += 10;  
 }  
 catch(Exception e)  
 { }  
 }  
 }  
 public void paint(Graphics g)  
 {  
 Dimension d = getSize();  
 he = d.height;  
 wi = d.width;  
 g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255))); // Balls random colors sets  
 g.fillArc(x,20,100,100,sang1,90);  
 g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 g.fillArc(x,20,100,100,sang1 + 90,90);  
 g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 g.fillArc(x,20,100,100,sang1 + 180,90);  
 g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 g.fillArc(x,20,100,100,sang1 + 270,90);  
 g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 g.fillArc(10, y, 100, 100, sang2 ,90);  
 g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 g.fillArc(10,y,100,100, sang2 + 90,90);  
 g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 g.fillArc(10,y,100,100,sang2 + 180,90);  
 g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));  
 g.fillArc(10,y,100,100,sang2 + 270,90);  
 }  
 }