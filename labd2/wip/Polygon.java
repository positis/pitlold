
import java.util.*;

public class Polygon {

    //private LinkedList<Point> list = new LinkedList<>();

    Point head;
    Point tail;
    int count;

    public void add(Point point) {
        if (head == null) {
            head = point;
            tail = point;
        } else {
            tail.setNext(point);
            tail = point;
        }

        count++;
//        list.add(point);
    }

    public void remove(int i) {
        //list.remove(i);
    }

    public Point get(int i) {

        int idx = 0;
        Point tmp = head;
//        if //
        //  metem kludu
        while (idx < i ) {
            tmp = head.getNext();
        }
//        return list.get(i);
        return tmp;

    }

    @Override
    public String   toString() {
        if (count == 0) {
            return "Empty: Empty polygon";
        }

        String name;
        if (count == 2) {
            name = "Segment";
        } else {
            name = "Triangle";

        }

        StringBuilder sb = new StringBuilder();
        Point tmp = head;
        while (tmp != null) {
            sb.append(tmp);
            sb.append(" ");
            tmp = tmp.getNext();
        }

        return name + ": " + sb.toString().trim();
                //list.toString().replaceAll("(\\[|\\])", "").replace("),", ")");
    }
}