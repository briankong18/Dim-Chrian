import hsa.*;
import java.awt.*;
public class fudgestick{
  public static void main (String[] args){
    Console con = new Console(38,174);
    int xpoints1[] = {500, 570, 500,570};
    int ypoints1[] = {150, 200, 650,620};
    int npoints1 = 4;
    int xpoints2[] = {450, 700, 500};
    int ypoints2[] = {150, 250, 200};
    int npoints2 = 3;
    int xpoints3[] = {500, 700, 400};
    int ypoints3[] = {325, 300, 400};
    int npoints3 = 3;
    int xpoints4[] = {470, 700, 430};
    int ypoints4[] = {375, 440, 410};
    int npoints4 = 3;
    int xpoints5[] = {510, 700, 470};
    int ypoints5[] = {630, 500, 600};
    int npoints5 = 3;
    int xpoints6[] = {780, 870, 760, 830};
    int ypoints6[] = {150, 240, 670, 590};
    int npoints6 = 4;
    int xpoints7[] = {850, 880, 1000};
    int ypoints7[] = {420, 390, 150};
    int npoints7 = 3;
    int xpoints8[] = {820, 790, 1000};
    int ypoints8[] = {430, 480, 650};
    int npoints8 = 3;
    int xpoints9[] = {680,720, 680, 720};
    int ypoints9[] = {300,300, 250, 250};
    int npoints9 = 4;
    int xpoints10[] = {500, 500, 450};
    int ypoints10[] = {150, 350, 650};
    int npoints10 = 3;
    int xpoints11[] = {680, 700, 700};
    int ypoints11[] = {430, 400, 530};
    int npoints11 = 3;
    
    con.setColor(new Color(143,143,143));
    con.fillRect(350,150,700,500);
    con.setColor(new Color(3,131,221));
    con.fillPolygon(xpoints1, ypoints1, npoints1);
    con.setColor(new Color(255,255,255));
    con.fillPolygon(xpoints2, ypoints2, npoints2);
    con.setColor(new Color(255,255,255));
    con.fillPolygon(xpoints3, ypoints3, npoints3);
    con.setColor(new Color(255,255,255));
    con.fillPolygon(xpoints4, ypoints4, npoints4);
    con.setColor(new Color(255,255,255));
    con.fillPolygon(xpoints5, ypoints5, npoints5);
    con.setColor(new Color(255,255,255));
    con.fillPolygon(xpoints5, ypoints5, npoints5);
    con.setColor(new Color(255,255,255));
    con.fillPolygon(xpoints6, ypoints6, npoints6);
    con.setColor(new Color(3,131,221));
    con.fillPolygon(xpoints7, ypoints7, npoints7);
    con.setColor(new Color(252,124,34));
    con.fillPolygon(xpoints8, ypoints8, npoints8);
    con.setColor(new Color(3,131,221));
    con.fillPolygon(xpoints9, ypoints9, npoints9);
    con.setColor(new Color(252,124,34));
    con.fillPolygon(xpoints10, ypoints10, npoints10);
    con.setColor(new Color(252,124,34));
    con.fillPolygon(xpoints11, ypoints11, npoints11);
  }
  public static void pause (int intMS){
    try{
      Thread.sleep (intMS);
    }catch(InterruptedException e){
    }
  }
  
}