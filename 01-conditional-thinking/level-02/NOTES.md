# Level 2 — Nested If & Multiple Conditions

## Q1. Take three sides and check if they form a valid triangle.

### Logic
- All three sides must be greater than zero.
- The sum of any two sides must be greater than the third side.
- All conditions must be true.

Condition:
`a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a`

### Example
- Input: 3, 4, 5 → Output: Valid triangle
- Input: 1, 2, 3 → Output: Invalid triangle
- Input: 0, 4, 4 → Output: Invalid triangle

## Q2. If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.

### Logic
- First check whether the sides form a valid triangle.
- If invalid, print "Invalid triangle".
- Otherwise:
  - If all three sides are equal, print "Equilateral".
  - Otherwise, if any two sides are equal, print "Isosceles".
  - Otherwise, print "Scalene".
- Check for equilateral first because it also has two equal sides.

### Example
- Input: 5, 5, 5 → Output: Equilateral
- Input: 5, 5, 8 → Output: Isosceles
- Input: 3, 4, 5 → Output: Scalene
- Input: 1, 2, 3 → Output: Invalid triangle

## Q3. Take marks (0–100) and print the corresponding grade (A/B/C/D/F).

### Logic
The question does not specify grade boundaries. For these examples, assume:

- 90–100 → A
- 80–89 → B
- 70–79 → C
- 60–69 → D
- Below 60 → F

First reject marks below 0 or above 100.
Then check the grade boundaries from highest to lowest using an if-else chain.

### Example
- Input: 95 → Output: A
- Input: 80 → Output: B
- Input: 72 → Output: C
- Input: 65 → Output: D
- Input: 45 → Output: F
- Input: 105 → Output: Invalid marks

## Q4. Check if one of two given numbers is a multiple of the other.

### Logic
- A number is a multiple of another nonzero number if division leaves a remainder of zero.
- Check both directions using `||`.
- Check that the divisor is nonzero before using `%`.

Condition:
`(b != 0 && a % b == 0) || (a != 0 && b % a == 0)`

For these examples, zero is a multiple of every nonzero integer.
If both inputs are zero, handle that case separately without using `%`.

### Example
- Input: 12, 4 → Output: One is a multiple of the other
- Input: 3, 15 → Output: One is a multiple of the other
- Input: 7, 4 → Output: Neither is a multiple of the other
- Input: 0, 5 → Output: One is a multiple of the other
- Input: 0, 0 → Output: Both numbers are zero; handled separately

## Q5. Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good Evening”, or “Good Night”.

### Logic
The question does not specify greeting boundaries. For these examples, assume:

- 5–11 → Good Morning
- 12–16 → Good Afternoon
- 17–20 → Good Evening
- 21–23 and 0–4 → Good Night

First reject hours outside 0–23.
Then check which range contains the hour.

### Example
- Input: 8 → Output: Good Morning
- Input: 14 → Output: Good Afternoon
- Input: 19 → Output: Good Evening
- Input: 23 → Output: Good Night
- Input: 2 → Output: Good Night
- Input: 24 → Output: Invalid hour

## Q6. Check voting eligibility for a given age (18+).

### Logic
- Use the exercise's rule: age 18 or above is eligible.
- If age is negative, print "Invalid age".
- Otherwise, if `age >= 18`, print "Eligible".
- Otherwise, print "Not eligible".

### Example
- Input: 18 → Output: Eligible
- Input: 25 → Output: Eligible
- Input: 16 → Output: Not eligible
- Input: -2 → Output: Invalid age

## Q7. Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.

### Logic
- A number is even if `number % 2 == 0`.
- If both numbers are even, print "Both even".
- Otherwise, if both have a nonzero remainder when divided by 2, print "Both odd".
- Otherwise, print "One even and one odd".

Use `% 2 != 0` to check for odd numbers so negative odd numbers are handled too.

### Example
- Input: 4, 8 → Output: Both even
- Input: 3, 7 → Output: Both odd
- Input: 4, 7 → Output: One even and one odd
- Input: -3, 5 → Output: Both odd

## Q8. Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.

### Logic
- Convert uppercase English letters to lowercase so both cases are accepted.
- If `ch >= 'a' && ch <= 'm'`, print "Between a and m".
- Otherwise, if `ch >= 'n' && ch <= 'z'`, print "Between n and z".
- Otherwise, print "Not an English alphabet letter".

### Example
- Input: b → Output: Between a and m
- Input: m → Output: Between a and m
- Input: n → Output: Between n and z
- Input: Z → Output: Between n and z
- Input: 5 → Output: Not an English alphabet letter

## Q9. Take a day number (1–7) and print the corresponding day name.

### Logic
The question does not specify the first day. For these examples, use:

- 1 → Monday
- 2 → Tuesday
- 3 → Wednesday
- 4 → Thursday
- 5 → Friday
- 6 → Saturday
- 7 → Sunday

Use an if-else chain to match the number.
If it is outside 1–7, print "Invalid day number".

### Example
- Input: 1 → Output: Monday
- Input: 5 → Output: Friday
- Input: 7 → Output: Sunday
- Input: 8 → Output: Invalid day number

## Q10. Take a month number (1–12) and print the number of days in that month (ignore leap years).

### Logic
- First reject month numbers outside 1–12.
- February, month 2, has 28 days because leap years are ignored.
- Months 4, 6, 9, and 11 have 30 days.
- All remaining valid months have 31 days.
- Use `||` to combine the checks for 30-day months.

### Example
- Input: 2 → Output: 28 days
- Input: 4 → Output: 30 days
- Input: 12 → Output: 31 days
- Input: 13 → Output: Invalid month number
