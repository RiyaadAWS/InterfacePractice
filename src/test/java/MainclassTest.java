import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class MainclassTest {


    Set<Integer> digits = new HashSet<>();
    Map<String, String> map = new HashMap<String, String>();
    Collection value = new ArrayList();
    List<Integer> values = new ArrayList<Integer>();

    @Before
    public void setUp() throws Exception {

   }

    @Test
    public void value()throws Exception {
        Collection values = new ArrayList();

        values.add(6);
        values.add(22.5);
        values.add("Ryklief");
        values.add(32);
        values.add("Riyaad");

        Mainclass valueTest = new Mainclass();
        assertTrue(values.size()==5);
        assertTrue(valueTest.value().contains("Riyaad"));
        assertEquals("22.5", ((ArrayList) values).get(1));
        assertEquals("Ryklief", ((ArrayList) values).get(3));

    }


    @Test (timeout = 100000)
     public void digits() throws Exception {
        //set interface
        Set<Integer> digits = new HashSet<>();

        digits.add(31);
        digits.add(16);
        digits.add(15);
        digits.add(11);
        digits.add(11);
        digits.add(31);

        Mainclass digitTest = new Mainclass();

        assertTrue(digits.size()==100);
        assertFalse(digitTest.equals(1580));
        assertEquals("100","100");

    }

    @Test
    public void values() throws Exception {

        //List interface
        List<Integer> values = new ArrayList<Integer>();

        values.add(6);
        values.add(22);
        values.add(100);
        values.add(32);

        Mainclass valuesTest = new Mainclass();
        assertTrue(valuesTest.values().contains(100));
        assertEquals("6", values.get(0));
        assertEquals("22", values.get(1));
        assertNotEquals("30", values.get(2));
        assertTrue(values.size()==4);
    }

    @Ignore
    @Test
    public void main() {
    }

    @Test
    public void FailTest() throws Exception{
        Assert.fail("This is a fail test");

    }
}