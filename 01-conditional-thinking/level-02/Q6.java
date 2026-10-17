// Check voting eligibility for a given age (18+).
// age < 0 → Invalid age
// age >= 18 → Eligible
// otherwise → Not eligible


public class Q6 {
  public static void main(String[] args) {
    int age = -24; 

    if(age<0){
      System.out.println("Invalid Age");
    }else if(age>=18){
      System.out.println("Valid");
    }else{
      System.out.println("Not Eligible");
    }
  }
}
