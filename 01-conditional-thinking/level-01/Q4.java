// Check if a number is divisible by both 3 and 5.

public class Q4 {
  public static void main(String[] args) {
    int num = 10; 
    if(num%3==0 && num%5==0){
      System.out.println(num+ " is Divisible By Both 3 and 5");
    }else{
      System.out.println(num+" is not Divisible");
    }
  }
}
