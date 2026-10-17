// Check if a given year is a leap Year

public class Q5 {
  public static void main(String[] args) {
    int Year = 2024; 
    if((Year % 400==0) || (Year%4==0 && Year%100!=0)){
      System.out.println("Leap Year");
    }else{
      System.out.println("Not a Leap Year");
    }
  }
}
