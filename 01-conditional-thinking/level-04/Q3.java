// Take three numbers and print the median value (neither maximum nor minimum).

public class Q3 {

  public static void main(String[] args) {
    int a = 20;
    int b = 30;
    int c = 40;

    if ((a >= b && a <= c) || (a <= b && a >= c)) {
      System.out.println(a);
    } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
      System.out.println(b);
    } else if ((c >= a && c <= b) || (c <= a && c >= b)) {
      System.out.println(c);
    }
  }

}
