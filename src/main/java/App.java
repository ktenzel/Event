import models.Event;
import models.Event;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
      boolean calculatingEvent = true;
      while(calculatingEvent) {
          try {
              BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
              System.out.println("We would like to help you calculate the cost of your party?");
              System.out.println("How many people will be attending?");
              String stringOfGuest = bufferedReader.readLine();
              int numberOfGuest = Integer.parseInt(stringOfGuest);
//              String partyCost = Event.calculateEvent(numberOfGuest);

//              System.out.println(partyCost);
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
    }
}