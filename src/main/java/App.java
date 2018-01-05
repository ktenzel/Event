import models.Event;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        Event smallParty = new Event(20, 30, 5,0,0,3 );
        Event mediumParty = new Event(50, 25, 5,0,0,3);
        Event largeParty = new Event(100, 20, 5,0,0,3);


        Event[] partySizes = {smallParty, mediumParty, largeParty};

//        try {
////            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println("Welcome, we would like to help you with the cost of your party.");
//            System.out.println("How many guest to you expect:");
//            String stringNumberGuest = bufferedReader.readline();
//            int numberGuest = Integer.parseInt(stringNumberGuest);
//
//            if (numberGuest <= 20) {
//
//            } else if ((numberGuest > 20) && (numberGuest <= 50)) {
//
//            } else if (numberGuest <= 20) {
//
//            } else {
//
//            }


//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
