package Shapes;

import java.util.Iterator;
import java.util.ArrayList;
import java.awt.Color;

/**
 * Eine Figur, die aus mehreren Elementen (Formen) besteht
 * 
 * @author (Martin Petzold) 
 * @version (2.1)
 */
public class Figure extends Drawable
{
    private static ArrayList<Drawable> shapes = new ArrayList<Drawable>();
    public Figure()
    {
    	
    }
    /**
     * Füge weiteres Shape zur Figur hinzu
     * @param aDrawable - das Hinzuzufügende shape
     * @return die Figur
     */
    public Figure addShape(Drawable aDrawable)
    {
        shapes.add(aDrawable);
        
        return this;
    }
    /**
    * zeichnet ein Objekt auf der Zeichenfläche
    */
    public void draw()
    {
        Iterator<Drawable> it = shapes.iterator();
        while(it.hasNext())
        {
            it.next().draw();
            }
    }
    /**
     * bewegt die Figur um dx, dy
     * @param dx - distanz in x
     * @param dy - distanz in y 
     * @return das Polygon
     */
    public Drawable move (int dx, int dy)
    {
       Iterator<Drawable> it = shapes.iterator();
        while(it.hasNext())
        {
            it.next().move(dx,dy);  
        }
       return this; 
    }
    public Drawable rotate (Point center, double phi)
    {
       Iterator<Drawable> it = shapes.iterator();
        while(it.hasNext())
        {
            it.next().rotate(center, phi);  
        }
       return this; 
    }
    /**
     * zeichnet einen Schneemann auf das Whiteboard
     * @return Die Figur Schneemann.
     */ 
    public static Figure snowMan()
    {
        
        
       Figure snowMan = new Figure();
       
       //---------------Grundfigur---------------
       snowMan.addShape(new Circle ((40), new Point (0,0)));
       snowMan.addShape(new Circle ((60), new Point (0,-100)));
       snowMan.addShape(new Circle ((80), new Point (0,-240)));
       //---------------Hut---------------
       Rectangle hut = new Rectangle ( new Point (-30,30),60,60);
       hut.setSolid(true);
       hut.setColor(Color.BLACK);
       snowMan.addShape(hut);
       //---------------HutKrempe---------------
       Rectangle hutk = new Rectangle ( new Point (-40,30),80,10);
       hutk.setSolid(true);
       hutk.setColor(Color.BLACK);
       snowMan.addShape(hutk);
       
       Circle hutab = new Circle(5, new Point(40, 35));
        hutab.setSolid(true);
        hutab.setColor(Color.BLACK);
       snowMan.addShape(hutab);
       
        Circle hutab2 = new Circle(5, new Point(-40, 35));
        hutab2.setSolid(true);
        hutab2.setColor(Color.BLACK);
       snowMan.addShape(hutab2);
       //---------------Nase---------------
       Circle nase = new Circle(5, new Point(0, 0));
        nase.setSolid(true);
        nase.setColor(Color.ORANGE);
       snowMan.addShape(nase);
       //---------------Augen---------------
       int eyec =17;
       Circle auge1 = new Circle(5, new Point(eyec, eyec-5));
        auge1.setSolid(true);
       snowMan.addShape(auge1);
       
       Circle auge2 = new Circle(5, new Point(-eyec, eyec-5));
        auge2.setSolid(true);
       snowMan.addShape(auge2);
       //---------------Mund---------------
       int a = 4;
       Circle[] circle = new Circle[a];
       Circle[] circle2 = new Circle[a];
       for(int i=0;i<a;i++)
       {
       circle[i]= new Circle ((5), new Point (0+7*i,-20+i*i));
       circle[i].setSolid(true);
       snowMan.addShape(circle[i]);
       circle2[i]= new Circle ((5), new Point (0-7*i,-20+i*i));
       circle2[i].setSolid(true);
       snowMan.addShape(circle2[i]);
       
      }
      
      //---------------Knöpfe---------------
      int b = 7;
       Circle[] circle3 = new Circle[b];
       for(int i=0;i<b;i++)
       {
       circle3[i]= new Circle ((5), new Point (0,-60-i*40));
       circle3[i].setSolid(true);
       snowMan.addShape(circle3[i]);
       }

       //---------------Schal---------------
       Rectangle schalKorpus = new Rectangle ( new Point (-20,-45),40,10);
       schalKorpus.setSolid(true);
       schalKorpus.setColor(Color.RED.darker());
       snowMan.addShape(schalKorpus);
       
       Circle schalz1 = new Circle(5, new Point(-20, -40));
       schalz1.setSolid(true);
       schalz1.setColor(Color.RED.darker());
       snowMan.addShape(schalz1);
       
       Polygon schalz2= new Polygon();
       ArrayList<Point> schalz2A = new ArrayList<Point>();
       schalz2A.add(new Point (20,-35));
       schalz2A.add(new Point (20,-45));
       schalz2A.add(new Point (40,-30));
       schalz2A.add(new Point (40,-20));
       schalz2.setPoints(schalz2A);
       schalz2.setSolid(true);
       schalz2.setColor(Color.RED);
       snowMan.addShape(schalz2);
       
       Polygon schalz3= new Polygon();
       ArrayList<Point> schalz3A = new ArrayList<Point>();
       schalz3A.add(new Point (20,-45));
       schalz3A.add(new Point (20,-35));
       schalz3A.add(new Point (40,-50));
       schalz3A.add(new Point (40,-60));
       schalz3.setPoints(schalz3A);
       schalz3.setSolid(true);
       schalz3.setColor(Color.RED.darker().darker().darker());
       snowMan.addShape(schalz3);
       
       Circle schalz4 = new Circle(9, new Point(20, -40));
       schalz4.setSolid(true);
       schalz4.setColor(Color.RED.darker().darker());
       snowMan.addShape(schalz4);
       
       //---------------Arme---------------
       snowMan.addShape(new Circle ((20), new Point (80,-100)));
       snowMan.addShape(new Circle ((20), new Point (-80,-100)));
       
       //---------------besen---------------
       int c = 100;
       Polygon besenS = new Polygon();
       ArrayList<Point> besenSA = new ArrayList<Point>();
       besenSA.add(new Point (80,-100));
       besenSA.add(new Point (70,-100));
       besenSA.add(new Point (70+c/4,-100+c));
       besenSA.add(new Point (80+c/4,-100+c));
       besenS.setPoints(besenSA);
       besenS.setSolid(true);
       besenS.setColor(Color.ORANGE.darker().darker());
       snowMan.addShape(besenS);
       
       int d = -200;
       Polygon besenS2 = new Polygon();
       ArrayList<Point> besenS2A = new ArrayList<Point>();
       besenS2A.add(new Point (80,-100));
       besenS2A.add(new Point (70,-100));
       besenS2A.add(new Point (70+d/4,-100+d));
       besenS2A.add(new Point (80+d/4,-100+d));
       besenS2.setPoints(besenS2A);
       besenS2.setSolid(true);
       besenS2.setColor(Color.ORANGE.darker().darker());
       snowMan.addShape(besenS2);
       
       Circle besenB = new Circle(5, new Point(25, -300));
       besenB.setSolid(true);
       besenB.setColor(Color.ORANGE.darker().darker());
       snowMan.addShape(besenB);
       
       int e = 40;
       Polygon besenSO = new Polygon();
       ArrayList<Point> besenSOA = new ArrayList<Point>();
       besenSOA.add(new Point (80+c/4+e,-100+c+e/2));
       besenSOA.add(new Point (70+c/4-e/2,-100+c+e));
       besenSOA.add(new Point (70+c/4,-100+c));
       besenSOA.add(new Point (80+c/4,-100+c));
       besenSO.setPoints(besenSOA);
       besenSO.setSolid(true);
       besenSO.setColor(Color.ORANGE.darker().darker().darker());
       snowMan.addShape(besenSO);
       
       int f =20;
       Polygon besenSO2 = new Polygon();
       ArrayList<Point> besenSO2A = new ArrayList<Point>();
       besenSO2A.add(new Point (80+c/4+e,-100+c+e/2));
       besenSO2A.add(new Point (70+c/4-e/2,-100+c+e));
       besenSO2A.add(new Point (70+c/4-e/2+f/4,-100+c+e+f));
       besenSO2A.add(new Point (80+c/4+e+f/4,-100+c+e/2+f));
       besenSO2.setPoints(besenSO2A);
       besenSO2.setSolid(true);
       besenSO2.setColor(Color.ORANGE.darker().darker().darker().darker());
       snowMan.addShape(besenSO2);
       
       return snowMan;
    }
   
   }



    

