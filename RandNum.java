import java.util.Random;
import java.util.Scanner;

/**
* The RandNum program implements an application that
* outputs a random number that is less than the User input.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-01-22
*/
public class RandNum {
  /**
  * The RollDie method outputs a random number that is less 
  * than the User input.
  */
  public static void rollDie(int maxValue) {
    Random rand = new Random();
    int randomNumber = rand.nextInt(maxValue);
    System.out.printf("The random number is %d.", randomNumber);
  }

  /**
  * The Main method receives input and checks viability.
  */
  public static void main(String[] args) {
    int maxValue = 0;

    while (true) {
      try {
        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a max value: ");
        maxValue = input.nextInt();
        if (maxValue > 0) {
          break;
        } else {
          System.out.printf("That is not a valid input! \n");
        }
      } catch (Exception e) {
        System.out.printf("That is not a number, please input a number! \n");
      }
    }

    RollDie(maxValue);
  }
}
