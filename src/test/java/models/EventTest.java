package models;
import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void runEvent_initiatesEvent() {
        Event testEvent = new Event();
        assertEquals(true,testEvent instanceof Event);
    }
}