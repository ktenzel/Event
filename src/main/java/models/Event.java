package models;

public class Event {
    public Integer numberGuest;
    public Integer pricePerGuest;

    public Event(int guest, int price){
        numberGuest = guest;
        pricePerGuest = price;
    }

    public int getGuestCount() {
        return numberGuest;
    }
}