# Level 1 — Simple Conditions: Notes

## What this level teaches

Making decisions using comparisons, if-else, and logical operators.

## Core ideas

- `if` checks a condition.
- `else if` checks another condition when earlier conditions are false.
- `else` handles the remaining cases.
- `%` gives the remainder: `n % 2 == 0` checks whether n is even.
- `&&` means both conditions must be true.
- `||` means at least one condition must be true.
- `==` compares values; `=` assigns a value.

## Q1. Take a number and print whether it’s positive, negative, or zero.

### Logic
- If the number is greater than 0, print "Positive".
- Otherwise, if it is less than 0, print "Negative".
- Otherwise, print "Zero".

### Example
- Input: 12 → Output: Positive
- Input: -5 → Output: Negative
- Input: 0 → Output: Zero

## Q2. Check if a number is even or odd.

### Logic
- Use `number % 2` to find the remainder after division by 2.
- If the remainder is 0, the number is even.
- Otherwise, it is odd.

### Example
- Input: 8 → Output: Even
- Input: 7 → Output: Odd
- Input: 0 → Output: Even

## Q3. Check if a number is divisible by 5.

### Logic
- Use `number % 5`.
- If the remainder is 0, the number is divisible by 5.
- Otherwise, it is not divisible by 5.

### Example
- Input: 25 → Output: Divisible by 5
- Input: 23 → Output: Not divisible by 5

## Q4. Check if a number is divisible by both 3 and 5.

### Logic
- Check whether `number % 3 == 0`.
- Also check whether `number % 5 == 0`.
- Combine the conditions using `&&`, because both must be true.

Condition: `number % 3 == 0 && number % 5 == 0`

### Example
- Input: 15 → Output: Divisible by both 3 and 5
- Input: 9 → Output: Not divisible by both 3 and 5
- Input: 10 → Output: Not divisible by both 3 and 5

## Q5. Check if a given year is a leap year.

### Logic
- If the year is divisible by 400, it is a leap year.
- Otherwise, if it is divisible by 100, it is not a leap year.
- Otherwise, if it is divisible by 4, it is a leap year.
- Otherwise, it is not a leap year.

Condition: `year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)`

### Example
- Input: 2024 → Output: Leap year
- Input: 1900 → Output: Not a leap year
- Input: 2000 → Output: Leap year
- Input: 2023 → Output: Not a leap year

## Q6. Take two numbers and print the larger one.

### Logic
- If the first number is greater than the second, print the first.
- Otherwise, if the second number is greater than the first, print the second.
- Otherwise, print "Both numbers are equal".

### Example
- Input: 12, 7 → Output: 12
- Input: 4, 9 → Output: 9
- Input: 5, 5 → Output: Both numbers are equal

## Q7. Take three numbers and print the largest.

### Logic
- If `a >= b && a >= c`, print `a`.
- Otherwise, if `b >= a && b >= c`, print `b`.
- Otherwise, print `c`.
- Using `>=` also handles cases where two or more numbers share the largest value.

### Example
- Input: 12, 7, 5 → Output: 12
- Input: 4, 15, 9 → Output: 15
- Input: 3, 8, 20 → Output: 20
- Input: 10, 10, 5 → Output: 10

## Q8. Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.

### Logic
The question does not specify temperature boundaries. For this example, assume the temperature is in degrees Celsius and use these ranges:

- Below 20 → Cold
- From 20 through 30 → Warm
- Above 30 → Hot

Check in this order:
- If `temperature < 20`, print "Cold".
- Otherwise, if `temperature <= 30`, print "Warm".
- Otherwise, print "Hot".

### Example
- Input: 15 → Output: Cold
- Input: 20 → Output: Warm
- Input: 30 → Output: Warm
- Input: 35 → Output: Hot

## Q9. Take a character and check if it’s a vowel or consonant.

### Logic
- First check whether the character is an English alphabet letter: `a–z` or `A–Z`.
- If it is not a letter, print "Not an alphabet letter".
- Otherwise, check whether it is `a`, `e`, `i`, `o`, or `u`, including their uppercase forms.
- If any vowel comparison is true, print "Vowel".
- Otherwise, print "Consonant".

Use `||` between vowel comparisons because matching any one vowel is enough.

### Example
- Input: a → Output: Vowel
- Input: E → Output: Vowel
- Input: b → Output: Consonant
- Input: 7 → Output: Not an alphabet letter

## Q10. Take a character and check whether it’s uppercase, lowercase, a digit, or a special character.

### Logic
For this exercise, use English letters and digits `0–9`:

- If `ch >= 'A' && ch <= 'Z'`, print "Uppercase".
- Otherwise, if `ch >= 'a' && ch <= 'z'`, print "Lowercase".
- Otherwise, if `ch >= '0' && ch <= '9'`, print "Digit".
- Otherwise, print "Special character".

Character comparisons use single quotes, such as `'A'` and `'0'`.

### Example
- Input: G → Output: Uppercase
- Input: m → Output: Lowercase
- Input: 5 → Output: Digit
- Input: @ → Output: Special character

For each question, add:
1. My reasoning.
2. An example or dry run.
3. Edge cases I checked.
4. A mistake, doubt, or lesson.
