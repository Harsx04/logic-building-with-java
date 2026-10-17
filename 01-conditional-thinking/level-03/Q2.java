// Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither

public class Q2 {
  public static void main(String[] args) {
    int num = 558; 

    int lastDigit = num%10; 
    int middleDIgit = (num/10)%10;
    int firstDigit = num/100;

    if(middleDIgit>lastDigit && middleDIgit>firstDigit){
      System.out.println("Largest");
    }else if(middleDIgit<lastDigit && middleDIgit<firstDigit){
      System.out.println("Smallest");
    }else{
      System.out.println("Neither");
    }
  }
}
