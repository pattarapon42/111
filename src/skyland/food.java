
package skyland;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import static skyland.player.x;
import static skyland.player.y;

/**
 *
 * @author ภัทรพล
 */
public class food extends JPanel{
    Image char1;
    //JLabel mainmenuBackground  = new JLabel (new ImageIcon("C:\\Users\\ภัทรพล\\Desktop\\โฟลเดอร์ใหม่ (6)\\game\\src\\FallBall\\apple.jpg"));
    public static int x;
    public static int y;
    public static int R,rx=60,ry=60;
    //กำหนดความเร็วในการเคลื่อที่ของเกนx,y
    public static double speedy = 0;
   //public static int speedx =5 ;
    
   // LinkedList<ai> ee = controllenemy2.getenemyBounds1();
    public food(int x, int y) {
        char1 = new ImageIcon("./image/apple.png").getImage();
        //mainmenuBackground.setBounds(x,y,60,60);
        this.x = x;
        this.y = y;
        
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
         g.drawImage(char1, x, y, 60, 60, this);
         
    }
    public void draw(Graphics2D g2d){
        g2d.drawImage(char1, x, y, 60, 60, this);
        //g2d.add(mainmenuBackground);   
        //g2d.setColor(Color.YELLOW);
        //g2d.fillOval(x, y, 40, 40);
        //g2d.draw(getBounds());
        
    }
    public Rectangle getBounds() {
        
        return new Rectangle(x, y, rx, ry);
    }
    public void update(){
        y+=speedy;
        //x+=speedx;
        
        Random ran = new Random();
        
           
        if(rx==0&&ry==0){
            char1 = new ImageIcon("./image/wab.png").getImage();
        }
        if (y < -400) {
             R = ran.nextInt(4);
             rx=60;
                ry=60;
                char1 = new ImageIcon("./image/apple.png").getImage();
            if (R == 1) {
                x = 150;
                y = 1000;
            } else if (R == 2) {
                x = 450;
                y = 1000;
            } else if (R == 3) {
                x = 700;
                y = 1000;
            } else if (R == 4) {
                x = 500;
                y = 1000;
            } else {
                x = 900;
                y = 1000;
            }
            
        }
        /*if(x>Skyland.WIDTH-60){
            speedx=-5;
        }
        if(x<0){
            speedx=5;
        }*/
    }
    
}

