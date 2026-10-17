// Take coordinates (x, y) and determine which quadrant the point lies in.

public class Q6 {
  public static void main(String[] args) {
    int x = +20; 
    int y = -3; 

    if(x==0 && y==0){
      System.out.println("Origin");
    }else if(x==0 && y!=0){
      System.out.println("Y-Axis");
    }else if(y==0 && x!=0){
      System.out.println("X-Axis");
    }else if(x>0 && y>0){
      System.out.println("Q-1");
    }else if(x<0 && y>0){
      System.out.println("Q-2");
    }else if(x<0 && y<0){
      System.out.println("Q-3");
    }else if(x>0 && y<0){
      System.out.println("Q-4");
    }
  }
}
