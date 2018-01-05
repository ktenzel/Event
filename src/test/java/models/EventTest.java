package models;
import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void runEvent_initiatesEvent() {
        Event testEvent = new Event(1);
        assertEquals(true,testEvent instanceof Event);
    }
    @Test
    public void runEvent_getGuestCount(){
        Event testEvent = new Event(20);
        assertEquals(20, testEvent.getGuestCount());
    }
    @Test
    public void runEvent_getInitialPlateCost(){
        Event testEvent = new Event(20);
        assertEquals(600, testEvent.calculateEvent());

}