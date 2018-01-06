package models;

public class Event {
    private int guestCount;

    public Event(int guest) {
        guestCount = guest;
    }

    public int getGuestCount() {
        return guestCount;
    }


    public static String calculateEvent(String numberOfGuest) {
        int guest = Integer.parseInt(numberOfGuest);
        Integer plate = 30;
        Integer cost = guest * plate;
        String partyCost = Integer.toString(cost);
        return partyCost;
    }
}