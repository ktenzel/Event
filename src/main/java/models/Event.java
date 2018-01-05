package models;

public class Event {
    public String numberOfGuest;

    public static String calculateEvent(String numberOfGuest){
        int guest = Integer.parseInt(numberOfGuest);
        Integer plate = 30;
        Integer cost = guest * plate;
        String partyCost = Integer.toString(cost);
        return partyCost;
    }
















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