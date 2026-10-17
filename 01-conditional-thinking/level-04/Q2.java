// // Take a number and print:

// "Fizz" if divisible by 3
// "Buzz" if divisible by 5
// "FizzBuzz" if divisible by both

public class Q2{
  public static void main(String[] args){
    int num = 15; 

    if((num%3==0)&&(num%5==0)){
      System.out.println("FizzBuzz");
    }else if(num%3==0){
      System.out.println("Fizz");
    }else if(num%5==0){
      System.out.println("Buzz");
    }
  }
}