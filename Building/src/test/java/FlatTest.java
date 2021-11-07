import junit.framework.TestCase;
import org.junit.Assert;

public class FlatTest extends TestCase {

    public void testSetFlat() {
        Flat expected = new Flat();
        Flat actual = new Flat();
        expected.setFlat(2,250);
        actual.square=250;
        actual.members=2;
        Assert.assertEquals(expected,actual);
    }

    public void testCompareSquare() {
    }

    public void testCompareMembers() {
    }







}