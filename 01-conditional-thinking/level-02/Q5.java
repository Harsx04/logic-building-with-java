// Take the hour of the day (0–23) and print Good Morning, Good Afternoon, Good Evening, or Good Night.
// 5–11  → Good Morning
// 12–16 → Good Afternoon
// 17–20 → Good Evening
// 21–23 → Good Night
// 0–4   → Good Night

// Anything < 0 or > 23 → Invalid Hour

public class Q5 {
  public static void main(String[] args) {
    int hour = 43;

    if (hour < 0 || hour > 23) {
      System.out.println("Invalid Hour");
    } else if (hour >= 5 && hour <= 11) {
      System.out.println("Good Morning");
    } else if (hour >= 12 && hour <= 16) {
      System.out.println("Good Afternoon");
    } else if (hour >= 17 && hour <= 20) {
      System.out.println("Good Evening");
    } else {
      System.out.println("Good Night");
    }
  }
}
