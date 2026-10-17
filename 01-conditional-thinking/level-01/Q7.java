// 7. Take three numbers and print the largest.

public class Q7 {
  public static void main(String[] args) {
    int a=1;
    int b=2;
    int c=3;
    
    if(a>=b && a>=c){
      System.out.println(a+ " is bigger");
    }else if(b>=a && b>=c){
      System.out.println(b+ "is bigger");
    }else{
      System.out.println(c + "is bigger");
    }
  }
}
