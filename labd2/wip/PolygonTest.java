import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Vladimir Kotov
 */
public class PolygonTest {

    Polygon subject;

    @Test
    public void triangeTest() {

        // given
        // when
        String result = subject.toString();

        // then
        assertThat(result, is("Triangle: (1, 2) (3, 10) (5, 4)"));

    }

    @Test
    public void segmentTest() {

        subject.remove(0);
        String result = subject.toString();
        assertThat(result, is("Segment: (3, 10) (5, 4)"));
//        System.out.println("Segment: " + result.replaceAll("(\\[|\\])", "").replace("),", ")"));
//
//        System.out.println("First vertex: " + subject.get(0).toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void negativeTest() {
        System.out.println("Get missing vertex");
        subject.get(5);
    }

    @Test
    public void emptyTest() {
        String result = new Polygon().toString();
        assertThat(result, is("Empty: Empty polygon"));
    }


    @Before
    public void init() {
        subject = new Polygon();

        System.out.println("Empty: " + subject.toString().replace("[]", "Empty subject"));

        subject.add(new Point(1, 2));
        subject.add(new Point(3, 10));
        subject.add(new Point(5, 4));
    }

}