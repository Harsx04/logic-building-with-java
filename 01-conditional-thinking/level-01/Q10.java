
// 10. Take a character and check whether it’s uppercase, lowercase, a digit, or a special
// character.
import java.util.Scanner;

public class Q10 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the character : ");
    char ch = sc.nextLine().charAt(0);

    if (ch >= 'A' && ch <= 'Z') {
      System.out.println(ch + " is a UpperCase Letter");
    } else if (ch >= 'a' && ch <= 'z') {
      System.out.println(ch + " is a LowerCase Letter");
    } else if (ch >= '0' && ch <= '9') {
      System.out.println(ch + " is a Digit");
    } else {
      System.out.println(ch + " is a Special Character");
    }
  }

}
