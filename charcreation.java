import hsa.*;
import java.awt.*;
public class charcreation{
  public static void main(String [] arg){
    Console con = new Console(38,174);
    
    //gamebackground
    con.setColor(new Color(99,99,99));
    con.fillRect(0,0,10000,10000);
    con.setColor(new Color(58,24,20));
    //left door
    con.fillRect(350,390,50,50);
    con.fillRect(350,340,50,50);
    con.fillOval(338,340,25,100);
    //forward door
    con.fillRect(650,40,50,50);
    con.fillRect(700,40,50,50);
    con.fillOval(650,28,100,25);
    //right door
    con.fillRect(1000,390,50,50);
    con.fillRect(1000,340,50,50);
    con.fillOval(1038,340,25,100);
    //back door
    
    con.setColor(new Color(0,0,0));
    //left door
    con.drawRect(350,390,50,50);
    con.drawRect(350,340,50,50);
    con.drawRect(350,390,50,40);
    con.drawRect(350,390,50,30);
    con.drawRect(350,390,50,20);
    con.drawRect(350,390,50,10);
    con.drawRect(350,340,50,40);
    con.drawRect(350,340,50,30);
    con.drawRect(350,340,50,20);
    con.drawRect(350,340,50,10);
    //forward door
    con.drawRect(650,40,50,50);
    con.drawRect(700,40,50,50);
    con.drawRect(650,40,40,50);
    con.drawRect(650,40,30,50);
    con.drawRect(650,40,20,50);
    con.drawRect(650,40,10,50);
    con.drawRect(700,40,40,50);
    con.drawRect(700,40,30,50);
    con.drawRect(700,40,20,50);
    con.drawRect(700,40,10,50);
    //right door
    con.drawRect(1000,390,50,50);
    con.drawRect(1000,340,50,50);
    con.drawRect(1000,390,50,40);
    con.drawRect(1000,390,50,30);
    con.drawRect(1000,390,50,20);
    con.drawRect(1000,390,50,10);
    con.drawRect(1000,340,50,40);
    con.drawRect(1000,340,50,30);
    con.drawRect(1000,340,50,20);
    con.drawRect(1000,340,50,10);
    //back door
    
    
    //game boarder
    con.setColor(new Color(125,118,113));
    con.fillRect(400,90,600,600);
    con.setColor(new Color(213,213,213));
    con.drawRect(400,90,600,600);
    con.drawRect(400,90,550,600);
    con.drawRect(400,90,500,600);
    con.drawRect(400,90,450,600);
    con.drawRect(400,90,400,600);
    con.drawRect(400,90,350,600);
    con.drawRect(400,90,300,600);
    con.drawRect(400,90,250,600);
    con.drawRect(400,90,200,600);
    con.drawRect(400,90,150,600);
    con.drawRect(400,90,100,600);
    con.drawRect(400,90,50,600);
    con.drawRect(400,90,600,550);
    con.drawRect(400,90,600,500);
    con.drawRect(400,90,600,450);
    con.drawRect(400,90,600,400);
    con.drawRect(400,90,600,350);
    con.drawRect(400,90,600,300);
    con.drawRect(400,90,600,250);
    con.drawRect(400,90,600,200);
    con.drawRect(400,90,600,150);
    con.drawRect(400,90,600,100);
    con.drawRect(400,90,600,50);
    
    //character border
    con.setColor(new Color(0,0,0));
    con.drawRect(700,390,50,50);
    
    //forward
    con.setColor(new Color(93,55,28));
    con.fillOval(710,392,8,8);
    con.fillOval(732,392,8,8);
    con.setColor(new Color(249,207,178));
    con.fillOval(705,395,40,40);
    con.setColor(new Color(0,0,0));
    con.fillOval(715,405,6,6);
    con.fillOval(728,405,6,6);
  }
}