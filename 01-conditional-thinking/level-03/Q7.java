// // Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.
// Currency Note Logic:

// Available → ₹2000, ₹500, ₹100

// Smallest denomination = ₹100

// If:
// amount % 100 == 0
// → Can be formed exactly.

public class Q7 {
  public static void main(String[] args) {
    
    int amount = 2500; 

    if(amount%100==0){
      System.out.println("Can be Formed");
    }else{
      System.out.println("Can not be Formed");
    }
  }
}
