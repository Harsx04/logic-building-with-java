// Take three numbers and check whether they can form a Pythagorean triplet.

public class Q1 {
  public static void main(String args[]) {
    int a = 3;
    int b = 4;
    int c = 5;

    if ((a * a == b * b + c * c) ||
        (b * b == a * a + c * c) ||
        (c * c == a * a + b * b)) {

      System.out.println("Pythagorean Triplet");
    } else {
      System.out.println("Not a Pythagorean Triplet");
    }

  }
}
