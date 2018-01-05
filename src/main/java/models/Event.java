package models;

public class Event {
    private int guestCount;

    public Event(int guest) {
        guestCount = guest;
    }

    public int getGuestCount() {
        return guestCount;
    }


    public static int calculateEvent(int numberOfGuest) {
        Integer plate = 30;
        Integer cost = numberOfGuest * plate;
//        String partyCost = Integer.toString(cost);
        return cost;
    }
}