# Level 4 — Logical Operators & Compound Statements

## Q1. Take a character and check if it is a letter, a digit, or neither.

### Logic
For this exercise, use English letters and digits 0–9.

- If the character is between 'A' and 'Z' or between 'a' and 'z', print "Letter".
- Otherwise, if it is between '0' and '9', print "Digit".
- Otherwise, print "Neither".

Letter condition:
`(ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')`

### Example
- Input: A → Output: Letter
- Input: m → Output: Letter
- Input: 7 → Output: Digit
- Input: @ → Output: Neither

## Q2. Take a number and print “Fizz” if divisible by 3, “Buzz” if divisible by 5, and “FizzBuzz” if divisible by both.

### Logic
- First check whether the number is divisible by both 3 and 5.
- If true, print "FizzBuzz".
- Otherwise, if divisible by 3, print "Fizz".
- Otherwise, if divisible by 5, print "Buzz".
- If neither condition is true, print the number.

Check divisibility by both first because numbers divisible by both also satisfy each individual condition.

### Example
- Input: 9 → Output: Fizz
- Input: 10 → Output: Buzz
- Input: 15 → Output: FizzBuzz
- Input: 7 → Output: 7

## Q3. Take three numbers and print the median value (neither maximum nor minimum).

### Logic
The median is the middle value when the three numbers are arranged in order.

- If `a` lies between `b` and `c`, print `a`.
- Otherwise, if `b` lies between `a` and `c`, print `b`.
- Otherwise, print `c`.
- Include equality so repeated values are handled.

Condition for a:
`(a >= b && a <= c) || (a >= c && a <= b)`

Condition for b:
`(b >= a && b <= c) || (b >= c && b <= a)`

### Example
- Input: 3, 8, 5 → Output: 5
- Input: 9, 2, 6 → Output: 6
- Input: 4, 4, 9 → Output: 4
- Input: 7, 7, 7 → Output: 7

## Q4. Take 24-hour time (hours and minutes) and print whether it is AM or PM.

### Logic
- Valid hours are 0–23.
- Valid minutes are 0–59.
- If either value is outside its range, print "Invalid time".
- Otherwise, if the hour is less than 12, print "AM".
- Otherwise, print "PM".

Midnight, 00:00, is AM.
Noon, 12:00, is PM.

### Example
- Input: 00:00 → Output: AM
- Input: 09:30 → Output: AM
- Input: 12:00 → Output: PM
- Input: 23:59 → Output: PM
- Input: 24:10 → Output: Invalid time
- Input: 10:60 → Output: Invalid time

## Q5. Take income and age, and check if eligible for tax (age > 18 and income > 5 L).

### Logic
Use the exercise's specified rule:
- Age must be strictly greater than 18.
- Income must be strictly greater than 5 lakh, which is 500000.
- Both conditions must be true.

Condition:
`age > 18 && income > 500000`

Reject negative age or income as invalid input.

### Example
- Input: Age 25, income 600000 → Output: Eligible under the exercise rule
- Input: Age 18, income 600000 → Output: Not eligible under the exercise rule
- Input: Age 25, income 500000 → Output: Not eligible under the exercise rule
- Input: Age -2, income 600000 → Output: Invalid input

## Q6. Take two numbers and check if both are positive and their sum is less than 100.

### Logic
Check all three conditions:
- The first number is greater than zero.
- The second number is greater than zero.
- Their sum is strictly less than 100.

Condition:
`a > 0 && b > 0 && (long) a + b < 100`

For Java int inputs, casting before addition prevents integer overflow in the sum.

### Example
- Input: 20, 30 → Output: Condition satisfied
- Input: 40, 60 → Output: Condition not satisfied
- Input: -5, 20 → Output: Condition not satisfied
- Input: 0, 10 → Output: Condition not satisfied

## Q7. Take a single digit (0–9) and print its word form (“Zero” to “Nine”).

### Logic
Use an if-else chain to match the digit:

- 0 → Zero
- 1 → One
- 2 → Two
- 3 → Three
- 4 → Four
- 5 → Five
- 6 → Six
- 7 → Seven
- 8 → Eight
- 9 → Nine

If the number is outside 0–9, print "Invalid digit".

### Example
- Input: 0 → Output: Zero
- Input: 5 → Output: Five
- Input: 9 → Output: Nine
- Input: 12 → Output: Invalid digit

## Q8. Take a weekday number (1–7) and determine if it is a weekday or weekend.

### Logic
For these examples, use Monday as day 1:

- 1–5 → Weekday
- 6–7 → Weekend

First reject numbers outside 1–7.
Then check whether the number is at most 5.

### Example
- Input: 1 → Output: Weekday
- Input: 5 → Output: Weekday
- Input: 6 → Output: Weekend
- Input: 7 → Output: Weekend
- Input: 8 → Output: Invalid day number

## Q9. Take electricity units consumed and calculate the bill as per slabs (using if-else).

### Logic
The question does not specify slab rates. For these examples, assume:

- First 100 units: 2 per unit
- Next 100 units: 3 per unit
- Units above 200: 5 per unit
- No fixed charges or additional fees

Apply each rate only to the units in that slab.

- If units are negative, print "Invalid units".
- If units are at most 100:
  `bill = units * 2`
- Otherwise, if units are at most 200:
  `bill = 100 * 2 + (units - 100) * 3`
- Otherwise:
  `bill = 100 * 2 + 100 * 3 + (units - 200) * 5`

### Example
- Input: 0 units → Output: Bill = 0
- Input: 80 units → Output: Bill = 160
- Input: 150 units → Output: Bill = 350
  Calculation: 100 × 2 + 50 × 3
- Input: 250 units → Output: Bill = 750
  Calculation: 100 × 2 + 100 × 3 + 50 × 5
- Input: -10 units → Output: Invalid units

## Q10. Take a password string and check basic rules (length ≥ 8 and contains at least one digit).

### Logic
- Check whether `password.length() >= 8`.
- Check each character for a digit between '0' and '9'.
- Use a Boolean variable such as `hasDigit`, initially false.
- If a digit is found, set `hasDigit = true` and stop searching.
- The password passes the exercise if both checks are true.

Condition:
`password.length() >= 8 && hasDigit`

### Example
- Input: abcdefg1 → Output: Valid
- Input: abcdefgh → Output: Invalid (no digit)
- Input: abc123 → Output: Invalid (too short)
- Input: 12345678 → Output: Valid under these basic rules
