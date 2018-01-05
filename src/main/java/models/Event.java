package models;

public class Event {
    public Integer numberGuest;
    public Integer pricePerGuest;
    public Integer initialGuestCost;
//    public String foodChicken;
//    public String foodVegetarian;
//    public String drinkSoda;
//    public String drinkSpirits;

    public Event(int guest, int price){
        //, String chicken, String vegetarian, String soda, String spirits
        numberGuest = guest;
        pricePerGuest = price;
//        foodChicken = chicken;
//        foodVegetarian = vegetarian;
//        drinkSoda = soda;
//        drinkSpirits = spirits;
    }
    public int getGuestCount() {
        return numberGuest;
    }
    public int getPricePerGuest() {
        return pricePerGuest;
    }
//    public int getDrinkPricePerGuestSoda() {
//    }
    public int getGuestTotalCost(){
        initialGuestCost = numberGuest * pricePerGuest;
        return initialGuestCost;
    }
}