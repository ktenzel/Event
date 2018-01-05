package models;
import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
    @Test
    public void runEvent_initiatesEvent() {
        Event testEvent = new Event(1, "Vegetarian", "Soda", "Music");
        assertEquals(true,testEvent instanceof Event);
    }
    @Test
    public void runEvent_getGuestCount(){
        Event testEvent = new Event(20, "Vegetarian", "Soda", "Music");
        assertEquals(20, testEvent.getGuestCount());
    }
    @Test
    public void runEvent_getPricePerGuest() {
        Event testEvent = new Event(1, "Vegetarian", "Soda", "Music");
        assertEquals(30, testEvent.getPricePerGuest());
    }
    @Test
    public void getGuestTotalCost_getPartyGuestCost() {
        Event testEvent = new Event(20, "Vegetarian", "Soda", "Music");
        assertEquals(600, testEvent.getGuestTotalCost());
    }

    @Test
    public void getCostWithSoda_smallParyWithSoda() {
        Event testEvent = new Event(20, "Soda");
        assertEquals(600, testEvent.getCostWithSoda());
    }
    @Test
    public void getCostWithSpirits_smallParyWithSoda() {
        Event testEvent = new Event(20, "Spirits");
        assertEquals(640, testEvent.getCostWithSpirits());
    }

}