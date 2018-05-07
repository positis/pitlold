import java.util.*;

public class Polygon {

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
    }

    public Point remove(int i) {
    	Point tmp = head;
    	if (i == 0) {
    		head = tmp.getNext();
    		tmp.setNext(null);
    	}else { 
    		//i don't know why, but the following didn't work with i=0
    		int idx = 1;
    		while (idx < i) {
    			tmp = tmp.getNext();
    			idx++;
    		}
    		tmp.setNext(tmp.getNext().getNext());
    	}
    	count--;
    	return tmp;
    }

    public Point get(int i) {

        int idx = 0;
        Point tmp = head;
        if (count <= i){
          throw new IndexOutOfBoundsException();
        }
        while (idx < i ) {
            tmp = head.getNext();
        }
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
    }
}