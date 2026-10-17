// Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.

public class Q7 {
  public static void main(String[] args) {
    int a = 0;
    int b = 7;

    if (a % 2 == 0 && b % 2 == 0) {
      System.out.println("Both Even");
    } else if (a % 2 != 0 && b % 2 != 0) {
      System.out.println("Both Odd");
    } else {
      System.out.println("One Even and One Odd");
    }
  }
}
