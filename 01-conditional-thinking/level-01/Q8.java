// Take a temperature value and print "Cold", "Warm", or "Hot" using range conditions
// Below 15     → Cold
// 15 to 29     → Warm
// 30 or above  → Hot

public class Q8 {
  public static void main(String[] args) {
    int Temp_value = 35; 

    if(Temp_value<15){
      System.out.println("Cold");
    }else if(Temp_value>=15 && Temp_value<=29){
      System.out.println("Warm");
    }else{
      System.out.println("Hot");
    }
  }
}
