package models;

public class Event {
    public Integer numberGuest;
    public Integer pricePerGuest;
    public Integer initialGuestCost;

    public Event(int guest, int price){
        numberGuest = guest;
        pricePerGuest = price;
    }

    public int getGuestCount() {
        return numberGuest;
    }

    public int getPricePerGuest() {
        return pricePerGuest;
    }
    public int getGuestTotalCost(){
        initialGuestCost = numberGuest * pricePerGuest;
        return initialGuestCost;
    }
}