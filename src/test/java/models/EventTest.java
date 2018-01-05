package models;
import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void runEvent_initiatesEvent() {
        Event testEvent = new Event(20, 30);
        assertEquals(true,testEvent instanceof Event);
    }
    @Test
    public void runEvent_getGuestCount(){
        Event testEvent = new Event(20, 30);
        assertEquals(20, testEvent.getGuestCount());
    }
    @Test
    public void runEvent_getPricePerGuest() {
        Event testEvent = new Event(20, 30);
        assertEquals(30, testEvent.getPricePerGuest());
    }
    @Test
    public void getGuestTotalCost_getPartyGuestCost() {
        Event testEvent = new Event(20, 30);
        assertEquals(600, testEvent.getGuestTotalCost());
    }
}