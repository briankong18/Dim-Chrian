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
    con.fillRect(650,690,50,50);
    con.fillRect(700,690,50,50);
    con.fillOval(650,728,100,25);
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
    con.drawRect(650,690,50,50);
    con.drawRect(700,690,50,50);
    con.drawRect(650,690,40,50);
    con.drawRect(650,690,30,50);
    con.drawRect(650,690,20,50);
    con.drawRect(650,690,10,50);
    con.drawRect(700,690,40,50);
    con.drawRect(700,690,30,50);
    con.drawRect(700,690,20,50);
    con.drawRect(700,690,10,50);
    con.setColor(new Color(252,194,74));
    //left door
    con.fillRect(365,378,12,24);
    //forward door
    con.fillRect(688,55,24,12);
    //right door
    con.fillRect(1023,378,12,24);
    //back door
    con.fillRect(688,715,24,12);
    con.setColor(new Color(0,0,0));
    con.fillOval(368,387,6,6);
    con.fillOval(697,58,6,6);
    con.fillOval(1026,387,6,6);
    con.fillOval(697,718,6,6);
    
    con.fillRect(372,389,4,2);
    con.fillRect(699,62,2,4);
    con.fillRect(1024,389,4,2);
    con.fillRect(699,716,2,4);
    
    con.drawLine(310,0,9310,9000);
    con.drawLine(310,780,1090,0);
    con.drawLine(310,0,310,780);
    con.drawLine(1090,0,1090,780);
    
    //inventory
    con.setColor(new Color(252,194,74));
    con.fillRect(120,130,20,20);
    con.fillRect(210,130,20,20);
    con.setColor(new Color(191,121,76));
    con.fillRoundRect(75,180,200,300,20,20);
    con.setColor(new Color(153,83,48));
    con.fillRoundRect(75,280,200,300,50,50);;
    con.fillRect(275,440,20,100);
    con.fillRect(55,440,20,100);
    con.fillRect(125,80,10,100);
    con.fillRect(215,80,10,100);
    con.setColor(new Color(252,194,74));
    con.fillRect(120,130,20,5);
    con.fillRect(210,130,20,5);
    con.fillRect(120,145,20,5);
    con.fillRect(210,145,20,5);
    con.setColor(new Color(184,184,184));
    con.fillRect(100,330,150,200);
    con.setColor(new Color(0,0,0));
    con.drawRect(100,330,150,200);
    con.drawRect(100,330,150,50);
    con.drawRect(100,330,150,100);
    con.drawRect(100,330,150,150);
    con.drawRect(100,330,50,200);
    con.drawRect(100,330,100,200);
    
    //hp and mp bar
    con.setColor(new Color(240,240,240));
    con.fillRect(0,0,250,60);
    con.setColor(new Color(0,0,0));
    con.fillRect(25,15,200,5);
    con.fillRect(25,35,200,5);
    con.setColor(new Color(192,11,11));
    con.fillRect(25,15,200,5);
    con.setColor(new Color(18,143,239));
    con.fillRect(25,35,200,5);
    
    //torches
    con.setColor(new Color(58,24,20));
    
    con.setColor(new Color(244,124,28));
    
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