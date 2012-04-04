package Shapes;


/**
 * eine Linie
 * 
 * @author (Martin petzold) 
 * @version (2.1)
 */
public class Line extends Polygon
{
   /**
    * Konstruktor fuer Objekte der Klasse Line
    * @param start - Startpunkt
    * @param end - Endpunkt
    */
    public Line(Point start, Point end)
    {
       points.add(start);
       points.add(end);
    }
    }
    

