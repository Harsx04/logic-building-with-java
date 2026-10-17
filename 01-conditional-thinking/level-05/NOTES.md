# Level 5 — Creative / Tricky Logical Scenarios

## Q1. Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin.

### Logic
- If both x and y are zero, print "At the origin".
- Otherwise, if y is zero, print "On the X-axis".
- Otherwise, if x is zero, print "On the Y-axis".
- Otherwise, print "Neither axis".

Check the origin first because it lies on both axes.

### Example
- Input: (0, 0) → Output: At the origin
- Input: (5, 0) → Output: On the X-axis
- Input: (0, -3) → Output: On the Y-axis
- Input: (2, 4) → Output: Neither axis

## Q2. Take three numbers and check if they can form a Pythagorean triplet.

### Logic
A Pythagorean triplet consists of three positive integers where the square of the largest equals the sum of the squares of the other two.

- First reject zero or negative values.
- Check all three possible positions of the largest value.

Condition:
`a² + b² == c² || a² + c² == b² || b² + c² == a²`

In Java, use `(long) a * a` to calculate each square for int inputs. This avoids int multiplication overflow.

### Example
- Input: 3, 4, 5 → Output: Pythagorean triplet
- Input: 13, 5, 12 → Output: Pythagorean triplet
- Input: 2, 3, 4 → Output: Not a Pythagorean triplet
- Input: 0, 4, 4 → Output: Invalid input

## Q3. Take day and month and check if it forms a valid calendar date (ignoring leap years).

### Logic
- The month must be between 1 and 12.
- The day must be at least 1.
- Determine the maximum number of days in the month:
  - February → 28
  - April, June, September, November → 30
  - All other valid months → 31
- The date is valid if the day does not exceed that maximum.

### Example
- Input: Day 28, month 2 → Output: Valid date
- Input: Day 29, month 2 → Output: Invalid date
- Input: Day 31, month 4 → Output: Invalid date
- Input: Day 31, month 12 → Output: Valid date
- Input: Day 0, month 5 → Output: Invalid date

## Q4. Take time (hours and minutes) and print the smaller angle between the hour and minute hands.

### Logic
For these examples, accept whole-number hours from 0–23 and minutes from 0–59.

- Reject values outside those ranges.
- Convert the hour to a 12-hour clock using `hour % 12`.
- The minute hand moves 6 degrees per minute:
  `minuteAngle = minutes * 6`
- The hour hand moves 30 degrees per hour and 0.5 degrees per minute:
  `hourAngle = (hour % 12) * 30 + minutes * 0.5`
- Calculate the absolute difference between the angles.
- If the difference is greater than 180, subtract it from 360.

Use double values to preserve fractional angles.

### Example
- Input: 03:00 → Output: 90 degrees
- Input: 06:00 → Output: 180 degrees
- Input: 12:30 → Output: 165 degrees
- Input: 09:00 → Output: 90 degrees
- Input: 24:00 → Output: Invalid time

## Q5. Take three numbers and check if they are in arithmetic progression.

### Logic
For these examples, check the numbers in the given order.

An arithmetic progression has the same difference between consecutive terms.

- Calculate `b - a`.
- Calculate `c - b`.
- If the differences are equal, the numbers are in arithmetic progression.

Condition:
`(long) b - a == (long) c - b`

For Java int inputs, casting before subtraction prevents int overflow.

### Example
- Input: 2, 5, 8 → Output: In arithmetic progression
- Input: 9, 6, 3 → Output: In arithmetic progression
- Input: 4, 4, 4 → Output: In arithmetic progression
- Input: 2, 8, 5 → Output: Not in arithmetic progression

## Q6. Take three numbers and check if they are in geometric progression.

### Logic
For these examples, check integer inputs in the given order.

The numbers form a geometric progression if there is one ratio r such that:
`b = a × r` and `c = b × r`

Handle zero carefully:
- If a is zero, both b and c must also be zero.
- If a is nonzero, check whether `b² == a × c`.

This accepts a ratio of zero, such as in 5, 0, 0.

For Java int inputs, use:
`(long) b * b == (long) a * c`

Casting before multiplication prevents int overflow.

### Example
- Input: 2, 6, 18 → Output: In geometric progression
- Input: 16, 8, 4 → Output: In geometric progression
- Input: 2, -4, 8 → Output: In geometric progression
- Input: 5, 0, 0 → Output: In geometric progression
- Input: 0, 0, 5 → Output: Not in geometric progression
- Input: 2, 6, 12 → Output: Not in geometric progression

## Q7. Take a 3-digit number and check if the sum of the first and last digit equals the middle digit.

### Logic
For these examples, accept positive 3-digit numbers from 100 to 999.

Extract:
- First digit: `number / 100`
- Middle digit: `(number / 10) % 10`
- Last digit: `number % 10`

Check:
`first + last == middle`

### Example
- Input: 132 → Output: Condition satisfied (1 + 2 = 3)
- Input: 253 → Output: Condition satisfied (2 + 3 = 5)
- Input: 123 → Output: Condition not satisfied
- Input: 99 → Output: Invalid input

## Q8. Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits.

### Logic
- First reject numbers outside 1–9999.
- Set `sum = 0` and `product = 1`.
- Use a working copy of the number.
- Extract each digit using `working % 10`.
- Add the digit to sum and multiply product by the digit.
- Remove the digit using `working / 10`.
- Repeat until the working number becomes zero.
- Compare whether `sum > product`.

This approach uses a loop. If any digit is zero, the product becomes zero.

### Example
- Input: 123 → Output: No (sum = 6, product = 6)
- Input: 112 → Output: Yes (sum = 4, product = 2)
- Input: 105 → Output: Yes (sum = 6, product = 0)
- Input: 234 → Output: No (sum = 9, product = 24)
- Input: 10000 → Output: Invalid input

## Q9. Take two dates (day and month) and determine which one comes first in the calendar.

### Logic
For these examples, compare dates within the same year and ignore leap years.

- First validate both dates using the rules from Q3.
- Compare their months.
- The date with the smaller month comes first.
- If the months are equal, compare their days.
- The date with the smaller day comes first.
- If both month and day match, the dates are the same.

### Example
- Input: 15 March, 10 April → Output: 15 March comes first
- Input: 20 June, 5 June → Output: 5 June comes first
- Input: 10 May, 10 May → Output: Same date
- Input: 31 April, 1 May → Output: Invalid date

## Q10. Take a year and print the corresponding century (e.g., “19th century”, “20th century”).

### Logic
For these examples, accept positive years only.

Calculate the century:
`century = (year - 1) / 100 + 1`

This puts years 1–100 in the 1st century, 101–200 in the 2nd century, and so on.

Choose the suffix:
- If `century % 100` is 11, 12, or 13, use "th".
- Otherwise, check `century % 10`:
  - 1 → "st"
  - 2 → "nd"
  - 3 → "rd"
  - Anything else → "th"

### Example
- Input: 1801 → Output: 19th century
- Input: 1900 → Output: 19th century
- Input: 1901 → Output: 20th century
- Input: 2000 → Output: 20th century
- Input: 2001 → Output: 21st century
- Input: 0 → Output: Invalid year
