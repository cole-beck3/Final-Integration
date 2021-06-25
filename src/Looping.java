// Cole Beck
/**
 * A class that demonstartes 3 different types of loops that counts from 1 to 15.
 * 
 * @author Cole Beck
 *
 */
public class Looping {

  public static void main(String[] args) {
    int counter = 0;
    while (counter < 5) {
      System.out.println(counter);
      counter++;

    }
    for (int a = 5; a < 10; a++) {
      System.out.println(a);

    }
    int goI;
    goI = 10;
    do {
      System.out.println(goI);
      goI++;
    } while (goI <= 15);

    while (counter <= 15);
    System.out.println(counter);
  }
}
// Break statement will stop the loop
// Continue statement jumps the loop to the updated statement
