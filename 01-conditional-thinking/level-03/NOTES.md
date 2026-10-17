# Level 3 — Math and Number Logic

## Q1. Take a 3-digit number and check if all digits are distinct.

### Logic
For these examples, accept positive 3-digit numbers from 100 to 999.

Extract the digits:
- First digit: `number / 100`
- Middle digit: `(number / 10) % 10`
- Last digit: `number % 10`

All digits are distinct if every pair is different.

Condition:
`first != middle && first != last && middle != last`

### Example
- Input: 123 → Output: All digits are distinct
- Input: 121 → Output: Digits are not all distinct
- Input: 555 → Output: Digits are not all distinct
- Input: 99 → Output: Invalid input

## Q2. Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.

### Logic
For these examples, accept positive 3-digit numbers from 100 to 999.

Extract the digits:
- First digit: `number / 100`
- Middle digit: `(number / 10) % 10`
- Last digit: `number % 10`

Compare the middle digit with both other digits:
- If it is strictly greater than both, print "Largest".
- If it is strictly smaller than both, print "Smallest".
- Otherwise, print "Neither".

Under this rule, a tie is classified as "Neither".

### Example
- Input: 192 → Output: Largest
- Input: 513 → Output: Smallest
- Input: 123 → Output: Neither
- Input:  zipper → Output: Invalid input
- Input: 122 → Output: Neither

## Q3. Take a 4-digit number and check if the first and last digits are equal.

### Logic
For these examples, accept positive 4-digit numbers from 1000 to 9999.

Extract:
- First digit: `number / 1000`
- Last digit: `number % 10`

Compare the two digits using `==`.

### Example
- Input: 1231 → Output: First and last digits are equal
- Input: 1234 → Output: First and last digits are not equal
- Input: 999 → Output: Invalid input

## Q4. Check whether a given integer is single-digit, double-digit, or multi-digit.

### Logic
The minus sign is not counted as a digit, and zero is a single-digit number.

- If the number is between -9 and 9, print "Single-digit".
- Otherwise, if it is between -99 and 99, print "Double-digit".
- Otherwise, print "Multi-digit".

Check the single-digit range first so those numbers are handled before the wider range.

### Example
- Input: 0 → Output: Single-digit
- Input: -7 → Output: Single-digit
- Input: 42 → Output: Double-digit
- Input: -85 → Output: Double-digit
- Input: 100 → Output: Multi-digit

## Q5. Check if a number is a multiple of 7 or ends with 7.

### Logic
- Check whether `number % 7 == 0`.
- Check whether the last digit is 7.
- Combine these conditions using `||` because either one is enough.

For negative integers, the remainder may be negative. Check both 7 and -7.

Condition:
`number % 7 == 0 || number % 10 == 7 || number % 10 == -7`

### Example
- Input: 14 → Output: Meets the condition
- Input: 27 → Output: Meets the condition
- Input: -27 → Output: Meets the condition
- Input: 25 → Output: Does not meet the condition

## Q6. Take coordinates (x, y) and determine which quadrant the point lies in.

### Logic
Check the signs of x and y:

- `x > 0 && y > 0` → First quadrant
- `x < 0 && y > 0` → Second quadrant
- `x < 0 && y < 0` → Third quadrant
- `x > 0 && y < 0` → Fourth quadrant

Also handle points outside the quadrants:
- If both coordinates are zero, the point is at the origin.
- If only y is zero, it lies on the X-axis.
- If only x is zero, it lies on the Y-axis.

### Example
- Input: (3, 4) → Output: First quadrant
- Input: (-3, 4) → Output: Second quadrant
- Input: (-3, -4) → Output: Third quadrant
- Input: (3, -4) → Output: Fourth quadrant
- Input: (5, 0) → Output: On the X-axis
- Input: (0, 5) → Output: On the Y-axis
- Input: (0, 0) → Output: At the origin

## Q7. Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.

### Logic
For these examples, interpret the question as forming an amount using any combination of these denominations, with an unlimited supply of notes.

- Accept nonnegative whole-number amounts.
- Every denomination is a multiple of 100.
- Since 100-value notes are available, every amount divisible by 100 can be formed.
- Check whether `amount % 100 == 0`.
- A zero amount requires zero notes.

### Example
- Input: 2600 → Output: Can be formed (2000 + 500 + 100)
- Input: 300 → Output: Can be formed (100 + 100 + 100)
- Input: 750 → Output: Cannot be formed
- Input: 0 → Output: Can be formed using zero notes
- Input: -100 → Output: Invalid amount

## Q8. Check if a number lies within the range [100, 999].

### Logic
Square brackets mean both boundaries are included.

Check that the number is:
- Greater than or equal to 100.
- Less than or equal to 999.

Condition:
`number >= 100 && number <= 999`

### Example
- Input: 100 → Output: Within the range
- Input: 567 → Output: Within the range
- Input: 999 → Output: Within the range
- Input: 99 → Output: Outside the range
- Input: 1000 → Output: Outside the range

## Q9. Take two angles of a triangle and compute the third angle.

### Logic
The interior angles of a triangle add up to 180 degrees.

First check:
- Both given angles must be greater than zero.
- Their sum must be less than 180.

If valid, calculate:
`thirdAngle = 180 - (firstAngle + secondAngle)`

Otherwise, print "Invalid triangle angles".

### Example
- Input: 60, 60 → Output: 60 degrees
- Input: 90, 30 → Output: 60 degrees
- Input: 100, 80 → Output: Invalid triangle angles
- Input: 0, 60 → Output: Invalid triangle angles

## Q10. Check whether a number is a perfect square (without using the square root function).

### Logic
A perfect square is an integer that equals another integer multiplied by itself.

- Negative integers are not perfect squares.
- Zero is a perfect square because `0 × 0 = 0`.
- For a positive number, try integer values starting from 1.
- If `i × i` equals the number, it is a perfect square.
- Stop once `i × i` becomes greater than the number.
- If no match is found, it is not a perfect square.

This approach uses a loop. In Java, for an `int` input, use `(long) i * i` when calculating the square to avoid multiplication overflow.

### Example
- Input: 25 → Output: Perfect square (5 × 5)
- Input: 1 → Output: Perfect square (1 × 1)
- Input: 0 → Output: Perfect square (0 × 0)
- Input: 26 → Output: Not a perfect square
- Input: -9 → Output: Not a perfect square
