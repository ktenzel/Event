package models;

import java.net.Inet4Address;

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
//    }
//    public static String calculateFood(String foodChoice) {
//        if (foodChoice.equals("Chicken")){
//            Integer plate = 32;
//            String foodCost = Integer.toString(plate);
//            return foodCost;
//        } else if (foodChoice.equals("Vegetarian")){
//            Integer plate = 30;
//            String foodCost = Integer.toString(plate);
//            return foodCost;
//        } else {
//            return "Please select Chicken or Vegetarian.";
//        }
    }
}