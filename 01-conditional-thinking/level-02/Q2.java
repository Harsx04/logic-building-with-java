// If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.
// // Logic
// Equilateral → a == b && b == c

// Isosceles   → any TWO sides are equal

// Scalene     → all three sides are different

public class Q2 {
  public static void main(String[] args) {
    int a = 3;
    int b = 4;
    int c = 5;

    if (a > 0 && b > 0 && c > 0 && a+b>c && b+c>a && a+c>b) {
      if (a == b && b == c) {
        System.out.println("Equilateral");
      } else if (a == b || b == c || a == c) {
        System.out.println("Iscosceles");
      } else {
        System.out.println("Scalene");
      } 
    } else {
      System.out.println("Its Not a Triangle");
    }

  }
}
