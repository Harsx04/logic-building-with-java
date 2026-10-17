// Take a 3-digit number and check if all digits are distinct.

public class Q1 {
  public static void main(String[] args) {
    int num = 554; 

    if(num<100 || num>999){
      System.out.println("Invalid Number");
    }else {
      int lastDigit = num%10;
      int middleDIgit = (num/10)%10; 
      int firstDigit = num/100; 

      if((lastDigit!=middleDIgit) && (middleDIgit!=firstDigit) && (firstDigit!=lastDigit)){
        System.out.println("All digits are distinct");
      }else{
        System.out.println("Digits are not distinct");
      }

    }


  }
}
