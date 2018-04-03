package labd2;

import java.util.*;

public class Polygon {
	public static void main(String args[]) {

       LinkedList<Point> polygon = new LinkedList<Point>();

       System.out.println("Empty: " + polygon.toString().replace("[]", "Empty polygon"));
       
       polygon.add(new Point(1, 2));
       polygon.add(new Point(3, 10));
       polygon.add(new Point(5, 4));
       System.out.println("Triangle: " + polygon.toString().replaceAll("(\\[|\\])", "").replace("),", ")"));

       polygon.remove(0);
       System.out.println("Segment: " + polygon.toString().replaceAll("(\\[|\\])", "").replace("),", ")"));
       
       System.out.println("First vertex: " + polygon.get(0).toString());
       
       System.out.println("Get missing vertex");
       polygon.get(5);
     }
}