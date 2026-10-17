// Take a character and check if it's a vowel or consonant.

public class Q9 {
  public static void main(String[] args) {
    char ch = 'y'; 

    if((ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')||(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')){
      System.out.println(ch+" is a vowel.");
    }else{
      System.out.println(ch+ " is a consonant.");
    }
  }
}
