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
              System.out.println("Scrabble word?");
              String stringScrabbleWord = bufferedReader.readLine();
              String letterValueResult = Event.calculatePoint(stringScrabbleWord);

              System.out.println(letterValueResult);
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
    }
}