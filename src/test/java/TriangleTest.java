import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TriangleTest {

    @Before
    public void setUp() {
    }

    @Test
    public void test1() {
        Triangle triangle = new Triangle(
                new Point(1, 2), new Point(5, 6), new Point(11, 0));
        Assert.assertTrue(triangle.isRightTriangle());
    }

    @Test
    public void test2() {
        Triangle triangle = new Triangle(
                new Point(0, 0), new Point(0, 0), new Point(0, 0));
        Assert.assertFalse(triangle.isRightTriangle());
    }

    @Test
    public void test3() {
        Triangle triangle = new Triangle(
                new Point(0, 0), null, new Point(0, 0));
        Assert.assertFalse(triangle.isRightTriangle());
    }


    @After
    public void tearDown() {
    }
}
