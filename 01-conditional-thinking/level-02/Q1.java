// Take three sides and check if they form a valid triangle.

// a + b > c
// AND
// a + c > b
// AND
// b + c > a

public class Q1 {

  public static void main(String[] args) {
    int a = 3;
    int b = 4;
    int c = 5;

    if (a>0 && b>0 && c>0 && (a + b > c) && (a + c > b) && (b + c > a)) {
      System.out.println("Triangle");
    } else {
      System.out.println("Not a Triangle");
    }
  }

}
