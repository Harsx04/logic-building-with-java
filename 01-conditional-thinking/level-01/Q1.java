// Take a number and print whether it’s positive, negative, or zero.


import java.util.Scanner; 

class Q1{
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Int Your Number : ");
    int num = sc.nextInt(); 

    if(num>0){
      System.out.println("Positive");
    }else if(num<0){
      System.out.println("Negative");
    }else{
      System.out.println("Zero");
    }
  }
}