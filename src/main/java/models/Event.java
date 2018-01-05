package models;

public class Event {
    public Integer numberGuest;
    public Integer pricePerGuest;
    public Integer initialGuestCost;
    public Integer foodChicken;
    public Integer foodVegetarian;
    public Integer drinkSoda;
    public Integer drinkSpirits;

    public Event(int guest, int price, int chicken, int vegetarian, int soda, int spirits){
        numberGuest = guest;
        pricePerGuest = price;
        foodChicken = chicken;
        foodVegetarian = vegetarian;
        drinkSoda = soda;
        drinkSpirits = spirits;
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