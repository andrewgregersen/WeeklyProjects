public class WeekOfSept27 {

  public static void main(String[] args) {
    swapNumbers(1, 2);
  }

  public static void swapNumbers(int one, int two) {
    System.out.println("Before - One: " + one + " Two: " + two);
    one = one + two;
    two = one - two;
    one = one - two;
    System.out.println("After - One: " + one + " Two: " + two);
  }
}
