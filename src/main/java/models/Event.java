package models;

public class Event {
    private int guest;
    private String food;
    private String drink;
    private String entertainment;
    private String coupon;
    private Integer baseCost;
    private int plate;
    Integer cost;

    public Event(int guest, String food, String drink, String entertainment, String coupon, ) {
        this.guest = guest;
        this.food = food;
        this.drink = drink;
        this.entertainment = entertainment;
        this.coupon = coupon;
    }

    public int getGuest() {
        return guest;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public String getEntertainment() {
        return entertainment;
    }

    public String getCoupon() {
        return coupon;
    }

    public Integer getBaseCost() {
        return baseCost;
    }

    public int getPlate() {
        return plate;
    }

    public int calculateGuestCost(String numberOfGuest) {
        int guest = Integer.parseInt(numberOfGuest);
        Integer plate = 30;
        Integer cost = guest * plate;
        String guestCost = Integer.toString(cost);
        return guestCost;
    }
    public static String calculateFood(String foodChoice) {
        if (foodChoice.equals("Chicken")) {
            return "32";
        } else if (foodChoice.equals("Chicken")) {
            return "30";
        } else {
            return "Please choose Chicken or Vegetarian.";
        }
    }
}