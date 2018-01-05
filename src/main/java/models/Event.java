package models;

public class Event {
    public Integer numberGuest;
    public String foodChoice;
    public String drinkChoice;
    public String entertainmentChoice;
    public Integer initialGuestCost;
    public Event(int guest, String food, String drink, String entertainment){
        numberGuest = guest;
        foodChoice = food;
        drinkChoice = drink;
        entertainmentChoice = entertainment;
    }
    public int getGuestCount() {
        return numberGuest;
    }
    public Integer getPricePerGuest(Integer initialGuestCost){
        initialGuestCost = numberGuest * 30;
        return initialGuestCost;
    }
}