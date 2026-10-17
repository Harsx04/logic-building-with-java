// Take a 4-digit number and check if the first and last digits are equal.

public class Q3 {
  public static void main(String[] args) {
    int num = 4324;

    int firstDigit = num / 1000;
    int lastDigit = num % 10;

    if (num < 1000 || num > 9999) {
      System.out.println("Invalid Number");
    } else {
      if (firstDigit == lastDigit) {
        System.out.println("Equal");
      } else {
        System.out.println("Not Equal");
      }
    }

  }
}
