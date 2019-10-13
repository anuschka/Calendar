package test;
import model.Time;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TimeTest {

    private Time time;

    @Before
    public void setup() {

        time = new Time();

    }

    @Test
    public void testIsValid() {
        assertFalse(time.isValid(2019, 12));
        assertTrue(time.isValid(20, 50));
        assertFalse(time.isValid(24, 12));
    }

    @Test
    public void testToAmPm() {
        Time now = new Time(10, 22);
        assertEquals("10:22 AM", now.toAmPm());
        Time now1 = new Time(22, 22);
        assertEquals("10:22 PM", now1.toAmPm());

    }
}
