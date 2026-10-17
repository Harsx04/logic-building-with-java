// Take a character and check whether it is:

// a letter
// a digit
// or neither.

public class Q1 {
  public static void main(String[] args) {
    char ch = 'a'; 
    if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ){
      System.out.println("Letter");
    }else if(ch>='0' && ch<='9'){
      System.out.println("Digit");
    }else{
      System.out.println("Neither");
    }
  }
}
