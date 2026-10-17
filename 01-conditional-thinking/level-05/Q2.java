// Take a day and month and check whether they form a valid calendar date. Ignore leap years.

public class Q2 {
  public static void main(String[] args) {
    int day = 283; 
    int month = 12; 

    // 1. Valid Basic Month and Date
    if(month<1||month>12||day<1){
      System.out.println("N"); 
    }
    // 2.Feb
    else if(month==2){
      if(day<=28){
        System.out.println("Y");
      }else{
        System.out.println("N");
      }
    }
    // 3.4,5,9,11 --> 30
    else if(month==4||month==6||month==9||month==11){
      if(day<=30){
        System.out.println("Y");
      }else{
        System.out.println("N");
      }
    }
    // Rest -->31
    else{
      if(day<=31){
        System.out.println("Y");
      }else{
        System.out.println("N");
      }
    }
  }
}
