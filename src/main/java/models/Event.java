package models;

public class Event {
    private int guestCount;

    public Event(int guest) {
        guestCount = guest;
    }

    public int getGuestCount() {
        return guestCount;
    }


    public static String calculateGuestCost(String numberOfGuest) {
        int guest = Integer.parseInt(numberOfGuest);
        Integer plate = 30;
        Integer cost = guest * plate;
        String guestCost = Integer.toString(cost);
        return guestCost;
    }
}