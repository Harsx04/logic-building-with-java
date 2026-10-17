// Check whether a given integer is single-digit, double-digit, or multi-digit.

public class Q4 {
  public static void main(String[] args) {
    int num = 23; 

    int n = Math.abs(num);

    if(n>=100){
      System.out.println("Multiple");
    }else if(n>=10){
      System.out.println("Double Digit");
    }else{
      System.out.println("Single DIgit");
    }

  }
}
