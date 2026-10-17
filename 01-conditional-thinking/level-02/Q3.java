// Take marks (0–100) and print the corresponding grade (A/B/C/D/F).
// 90–100 → A
// 80–89  → B
// 70–79  → C
// 60–69  → D
// 0–59   → F

// < 0 or > 100 → Invalid marks

public class Q3 {
  public static void main(String[] args) {
    int marks = 89; 

    if(marks>=90 && marks<=100){
      System.out.println("A");
    }else if(marks>=80 && marks<=89 ){
      System.out.println("B");
    }else if(marks>=70 && marks<=79){
      System.out.println("C");
    }else if(marks>=60 && marks<=69){
      System.out.println("D");
    }else if(marks>=0 && marks<=59){
      System.out.println("F");
    }else{
      System.out.println("Invalid Marks");
    }
  }
}
