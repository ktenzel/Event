package models;

public class Event {
    public Integer numberGuest;
    public Integer pricePerGuest;

    public Event(int numberGuest, int pricePerGuest);
        this.numberGuest = numberGuest;
        this.pricePerGuest = pricePerGuest;

    public Integer getNumberGuest() {
        return numberGuest;
    }
}