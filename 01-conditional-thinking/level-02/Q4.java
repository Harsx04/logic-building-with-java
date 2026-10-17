// Check if one of two given numbers is a multiple of the other.
// a = 20
// b = 5

// 20 is a multiple of 5
// because:
// 20 % 5 == 0

public class Q4 {
  public static void main(String[] args) {
    int a=20;
    int b=5; 

      if(b!=0 && a%b==0){
        System.out.println(a + "is a multiple of " + b);
      }else if(a!=0 && b%a==0){
        System.out.println(b + "is a multiple of " + a);
      }else{
        System.out.println("No Multiple");
      }
    }
  }

