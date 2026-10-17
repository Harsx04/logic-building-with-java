// Take an alphabet character and check if it lies between 'a'–'m' or 'n'–'z'.
// 'g' → Between a and m
// 'p' → Between n and z

public class Q8 {
  public static void main(String[] args) {
    char ch = 'g';

    if (ch >= 'a' && ch <= 'm') {
      System.out.println(ch + " is between a and m");

    } else if (ch >= 'n' && ch <= 'z') {
      System.out.println(ch + " is between n and z");

    } else {
      System.out.println("Not a lowercase alphabet");
    }

  }
}
