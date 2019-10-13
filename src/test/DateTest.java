package test;
import model.Date;
import model.Time;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class DateTest {

    private Date date;
    private Date today;

    @Before
    public void setup(){

        date = new Date();
        today = new Date(2019,10,11);

    }

    @Test
    public void testIsValid(){
        assertTrue(date.isValid(2019,12,11));
    }

    @Test
    public void testIsLeap(){
        assertFalse(date.isLeap(2019));
    }

    @Test
    public void testCompareToDate(){
        Date yesterday = new Date(2019,10,1);
        Date tomorrow = new Date(2019,10,30);
        assertFalse(today.compareTo(yesterday));
        assertTrue(today.compareTo(tomorrow));
    }

    @Test
    public void testToShort(){
        Date someday = new Date(2019,10,10);
        assertEquals("2019-10-10",someday.toShort());

    }

    @Test
    public void testToLong(){
        Date someday = new Date(2019,10,10);
        assertEquals("October 10th, 2019",someday.toLong());

    }

}