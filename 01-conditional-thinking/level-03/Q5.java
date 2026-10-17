// Check if a number is a multiple of 7 OR ends with 7.

public class Q5 {
  public static void main(String[] args) {
    int num = 49;

    boolean lastDigit = num%10==7; 
    boolean multipleOfSeven = num%7==0;

    if(lastDigit){
      System.out.println("Ends With Seven");
    }else if(multipleOfSeven){
      System.out.println("Multiple Of Seven");
    }else{
      System.out.println("Enter Valid Number");
    }
  }
}
