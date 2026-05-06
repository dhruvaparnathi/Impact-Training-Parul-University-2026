# 🚀 Complete Pseudo Code Learning Guide (Basic → Intermediate)

---

# 📘 Pseudo Code Master Guide

---

## 🔹 What is Pseudo Code?

Pseudo code is a **human-readable representation of program logic** written in plain English-like statements.

It is **not tied to any programming language**, so it avoids syntax rules and focuses only on logic.

---

## 🔹 Why Use Pseudo Code?

* Helps in **planning before coding**
* Improves **problem-solving clarity**
* Used in **technical interviews (TCS, Infosys, etc.)**
* Makes logic **language-independent**
* Reduces coding errors

---

## 🔹 Key Characteristics

* Simple English statements
* Structured like code
* No strict syntax rules
* Easy to read and explain

---

# 🔥 Basic Building Blocks

## 1. Input / Output

```
Read a
Print a
```

## 2. Variables & Assignment

```
Set a = 10
Set name = "Akash"
```

## 3. Conditional Statements

```
If condition Then
   statement
Else
   statement
End If
```

## 4. Loops

### For Loop

```
For i from 1 to n
   statement
End For
```

### While Loop

```
While condition
   statement
End While
```

---

# 🔹 Operators Used

| Type       | Operators        |     |
| ---------- | ---------------- | --- |
| Arithmetic | +, -, *, /, %    |     |
| Relational | >, <, >=, <=, == |     |
| Logical    | AND, OR, NOT     |     |
| Bitwise    | &,               | , ^ |

---

# 🔥 Conventions (VERY IMPORTANT)

## ✅ Naming

* Use meaningful names: `totalSum`, `count`
* Avoid single letters unless in loops

## ✅ Indentation

* Maintain proper indentation for readability

## ✅ Keywords Style

* Use consistent keywords: `If`, `Else`, `End If`

## ✅ Capitalization

* Keywords → Capitalized
* Variables → lowercase or camelCase

## ✅ One Statement per Line

```
Correct:
Set a = 10
Set b = 20

Wrong:
Set a = 10, b = 20
```

## ✅ Avoid Language Syntax

❌ No semicolons
❌ No curly braces `{}`
❌ No data types required strictly

---

# 🔥 How to Convert Code → Pseudo Code

## Step-by-Step Approach

### Step 1: Understand the Logic

Ignore syntax, focus on what the code is doing.

### Step 2: Remove Language Syntax

* Remove `{}`, `;`, types

### Step 3: Replace with Simple Words

* `int a = 10;` → `Set a = 10`

### Step 4: Simplify Conditions

* `if (a > b)` → `If a > b Then`

### Step 5: Represent Loops Clearly

* `for(i=0;i<n;i++)` → `For i from 0 to n-1`

---

# 🔥 Example Conversion

## Java Code

```java
int sum = 0;
for(int i=1; i<=5; i++){
   sum += i;
}
System.out.println(sum);
```

## Pseudo Code

```
Set sum = 0
For i from 1 to 5
   sum = sum + i
End For
Print sum
```

---

# 🔥 Another Example (Condition)

## Code

```java
if(n % 2 == 0){
   System.out.println("Even");
}else{
   System.out.println("Odd");
}
```

## Pseudo Code

```
If n % 2 == 0 Then
   Print "Even"
Else
   Print "Odd"
End If
```

---

# 🔥 Common Mistakes to Avoid

❌ Mixing real code syntax
❌ Writing too detailed low-level steps
❌ Ignoring indentation
❌ Using unclear variable names

---

# 🚀 Pro Tips (Interview Level)

* Always write **step-by-step logic**
* Keep it **clean and readable**
* Think like explaining to a human, not a compiler
* Practice converting real code daily

---

# ✅ Final Summary

Pseudo code = **Logic + Clarity + Structure (No Syntax)**

If your pseudo code is clear, your coding will be **fast, accurate, and interview-ready**.

---


# 📘 Pseudo Code Problem List

---

# 🔥 SECTION 1: BASIC (1–30)

1. Swap two numbers
2. Check even/odd
3. Find max of 3 numbers
4. Sum of first N numbers
5. Factorial
6. Reverse number
7. Palindrome number
8. Count digits
9. Sum of digits
10. Armstrong number
11. Fibonacci series
12. Prime check
13. GCD of two numbers
14. LCM
15. Power calculation
16. Multiplication table
17. Sum of even numbers
18. Sum of odd numbers
19. Count vowels in string
20. Reverse string
21. Check palindrome string
22. ASCII value
23. Character type check
24. Simple interest
25. Compound interest
26. Temperature conversion
27. Area of circle
28. Largest among array
29. Smallest in array
30. Average of array

---

# 🔥 SECTION 2: INTERMEDIATE (31–80)

31. Second largest element
32. Remove duplicates
33. Bubble sort
34. Selection sort
35. Linear search
36. Binary search
37. Matrix addition
38. Matrix multiplication
39. Transpose matrix
40. Diagonal sum
41. Count frequency
42. Rotate array
43. Merge arrays
44. Intersection of arrays
45. Union of arrays
46. Check anagram
47. String compression
48. Longest word
49. Count words
50. Pattern printing (triangle)
51. Pyramid pattern
52. Diamond pattern
53. Hollow square
54. Pascal triangle
55. Number pyramid
56. Sum of series
57. Alternate sum
58. Check perfect number
59. Strong number
60. Happy number
61. Binary to decimal
62. Decimal to binary
63. Bit count
64. Toggle bits
65. XOR logic problems
66. Bitwise AND problems
67. Reverse array
68. Pair sum problem
69. Sliding window sum
70. Prefix sum
71. Kadane’s algorithm
72. Subarray sum
73. Missing number
74. Duplicate detection
75. Majority element
76. Two pointer logic
77. Merge sorted arrays
78. Remove element
79. Rotate string
80. Check rotation

---

## ✅ Usage

* Use this list as a **practice tracker**
* Mark problems as:

  * ✅ Completed
  * 🔁 Revision needed
  * ❌ Not understood

---

🚀 Next Step: Solve each using pseudo code + convert to Java



# 🔥 SECTION 1: BASIC (1–30) — COMPLETE

### 1. Swap Two Numbers

```
Read a, b
Set temp = a
Set a = b
Set b = temp
Print a, b
```

### 2. Check Even/Odd

```
Read n
If n % 2 == 0 Then
   Print "Even"
Else
   Print "Odd"
End If
```

### 3. Max of 3 Numbers

```
Read a, b, c
Set max = a
If b > max Then max = b
If c > max Then max = c
Print max
```

### 4. Sum of First N Numbers

```
Read n
Set sum = 0
For i from 1 to n
   sum = sum + i
End For
Print sum
```

### 5. Factorial

```
Read n
Set fact = 1
For i from 1 to n
   fact = fact * i
End For
Print fact
```

### 6. Reverse Number

```
Read n
Set rev = 0
While n > 0
   digit = n % 10
   rev = rev * 10 + digit
   n = n / 10
End While
Print rev
```

### 7. Palindrome Number

```
Read n
Set temp = n
Set rev = 0
While n > 0
   digit = n % 10
   rev = rev * 10 + digit
   n = n / 10
End While
If temp == rev Then
   Print "Palindrome"
Else
   Print "Not Palindrome"
End If
```

### 8. Count Digits

```
Read n
Set count = 0
While n > 0
   n = n / 10
   count = count + 1
End While
Print count
```

### 9. Sum of Digits

```
Read n
Set sum = 0
While n > 0
   sum = sum + (n % 10)
   n = n / 10
End While
Print sum
```

### 10. Armstrong Number

```
Read n
Set temp = n
Set sum = 0
Set digits = number of digits in n
While temp > 0
   digit = temp % 10
   sum = sum + (digit ^ digits)
   temp = temp / 10
End While
If sum == n Then
   Print "Armstrong"
Else
   Print "Not Armstrong"
End If
```

### 11. Fibonacci Series

```
Read n
Set a = 0, b = 1
For i from 1 to n
   Print a
   temp = a + b
   a = b
   b = temp
End For
```

### 12. Prime Check

```
Read n
If n <= 1 Then Print "Not Prime"
For i from 2 to n/2
   If n % i == 0 Then
      Print "Not Prime"
      Exit
End If
End For
Print "Prime"
```

### 13. GCD

```
Read a, b
While b != 0
   temp = b
   b = a % b
   a = temp
End While
Print a
```

### 14. LCM

```
Read a, b
Set gcd = GCD(a,b)
Set lcm = (a * b) / gcd
Print lcm
```

### 15. Power Calculation

```
Read base, exp
Set result = 1
For i from 1 to exp
   result = result * base
End For
Print result
```

### 16. Multiplication Table

```
Read n
For i from 1 to 10
   Print n * i
End For
```

### 17. Sum of Even Numbers

```
Read n
Set sum = 0
For i from 1 to n
   If i % 2 == 0 Then sum = sum + i
End For
Print sum
```

### 18. Sum of Odd Numbers

```
Read n
Set sum = 0
For i from 1 to n
   If i % 2 != 0 Then sum = sum + i
End For
Print sum
```

### 19. Count Vowels

```
Read str
Set count = 0
For each char in str
   If char in (a,e,i,o,u,A,E,I,O,U)
      count = count + 1
End For
Print count
```

### 20. Reverse String

```
Read str
Set rev = ""
For i from length(str)-1 to 0
   rev = rev + str[i]
End For
Print rev
```

### 21. Palindrome String

```
Read str
If str == reverse(str)
   Print "Palindrome"
Else
   Print "Not Palindrome"
End If
```

### 22. ASCII Value

```
Read char
Print ASCII(char)
```

### 23. Character Type Check

```
Read ch
If ch is alphabet Then Print "Alphabet"
Else If ch is digit Then Print "Digit"
Else Print "Special Character"
```

### 24. Simple Interest

```
Read p, r, t
SI = (p * r * t) / 100
Print SI
```

### 25. Compound Interest

```
Read p, r, t
CI = p * (1 + r/100)^t - p
Print CI
```

### 26. Temperature Conversion (C → F)

```
Read c
f = (c * 9/5) + 32
Print f
```

### 27. Area of Circle

```
Read r
area = 3.14 * r * r
Print area
```

### 28. Largest in Array

```
Read array
Set max = arr[0]
For each element x
   If x > max Then max = x
End For
Print max
```

### 29. Smallest in Array

```
Read array
Set min = arr[0]
For each element x
   If x < min Then min = x
End For
Print min
```

### 30. Average of Array

```
Read array
Set sum = 0
For each element x
   sum = sum + x
End For
avg = sum / n
Print avg
```

---

## ✅ Practice Tips

* Dry run every problem
* Convert each to Java
* Focus on edge cases (0, negative, empty input)

---

# 🔥 SECTION 2: INTERMEDIATE (31–80) — COMPLETE

### 31. Second Largest Element

```
Read array
Set first = -∞, second = -∞
For each x in array
   If x > first Then
      second = first
      first = x
   Else If x > second AND x != first Then
      second = x
End For
Print second
```

### 32. Remove Duplicates (Array)

```
Read array
Create empty set S
For each x in array
   If x not in S Then
      Add x to S
      Print x
End For
```

### 33. Bubble Sort

```
Read array
For i from 0 to n-1
   For j from 0 to n-i-2
      If arr[j] > arr[j+1]
         Swap arr[j], arr[j+1]
End For
Print array
```

### 34. Selection Sort

```
Read array
For i from 0 to n-1
   min = i
   For j from i+1 to n-1
      If arr[j] < arr[min]
         min = j
   Swap arr[i], arr[min]
End For
Print array
```

### 35. Linear Search

```
Read array, key
For i from 0 to n-1
   If arr[i] == key
      Print "Found at", i
      Exit
Print "Not Found"
```

### 36. Binary Search

```
Read sorted array, key
low = 0, high = n-1
While low <= high
   mid = (low + high) / 2
   If arr[mid] == key
      Print "Found"
      Exit
   Else If key < arr[mid]
      high = mid - 1
   Else
      low = mid + 1
Print "Not Found"
```

### 37. Matrix Addition

```
Read A, B
For i from 0 to n-1
   For j from 0 to m-1
      C[i][j] = A[i][j] + B[i][j]
Print C
```

### 38. Matrix Multiplication

```
Read A, B
For i from 0 to n-1
   For j from 0 to m-1
      C[i][j] = 0
      For k from 0 to p-1
         C[i][j] += A[i][k] * B[k][j]
Print C
```

### 39. Transpose Matrix

```
Read matrix
For i from 0 to n-1
   For j from 0 to m-1
      T[j][i] = A[i][j]
Print T
```

### 40. Diagonal Sum

```
Read matrix
sum = 0
For i from 0 to n-1
   sum += A[i][i]
Print sum
```

### 41. Count Frequency

```
Read array
Create map freq
For each x
   freq[x]++
Print freq
```

### 42. Rotate Array (Right by 1)

```
Read array
last = arr[n-1]
For i from n-1 to 1
   arr[i] = arr[i-1]
arr[0] = last
Print array
```

### 43. Merge Arrays

```
Read A, B
C = A + B
Print C
```

### 44. Intersection of Arrays

```
Read A, B
For each x in A
   If x exists in B
      Print x
```

### 45. Union of Arrays

```
Read A, B
Create set S
Add all elements of A and B to S
Print S
```

### 46. Check Anagram

```
Read s1, s2
Sort s1, s2
If s1 == s2 Then Print "Anagram"
Else Print "Not Anagram"
```

### 47. String Compression

```
Read str
count = 1
For i from 1 to length-1
   If str[i] == str[i-1]
      count++
   Else
      Print str[i-1], count
      count = 1
Print last char and count
```

### 48. Longest Word

```
Read sentence
Split into words
max = ""
For each word
   If length(word) > length(max)
      max = word
Print max
```

### 49. Count Words

```
Read sentence
count = number of spaces + 1
Print count
```

### 50. Triangle Pattern

```
Read n
For i from 1 to n
   Print '*' i times
```

### 51. Pyramid Pattern

```
Read n
For i from 1 to n
   Print spaces
   Print '*' (2*i-1)
```

### 52. Diamond Pattern

```
Combine pyramid + reverse pyramid
```

### 53. Hollow Square

```
Read n
For i from 1 to n
   For j from 1 to n
      If i==1 OR i==n OR j==1 OR j==n
         Print '*'
      Else Print ' '
```

### 54. Pascal Triangle

```
Read n
For i from 0 to n
   Set val = 1
   For j from 0 to i
      Print val
      val = val*(i-j)/(j+1)
```

### 55. Number Pyramid

```
Read n
For i from 1 to n
   For j from 1 to i
      Print j
```

### 56. Sum of Series

```
Read n
sum = 0
For i from 1 to n
   sum += i*i
Print sum
```

### 57. Alternate Sum

```
Read n
sum = 0
For i from 1 to n
   If i % 2 == 0 sum -= i
   Else sum += i
Print sum
```

### 58. Perfect Number

```
Read n
sum = 0
For i from 1 to n-1
   If n % i == 0 sum += i
If sum == n Print "Perfect"
Else Print "Not"
```

### 59. Strong Number

```
Read n
sum = 0
While n > 0
   digit = n % 10
   sum += factorial(digit)
   n = n / 10
Compare sum
```

### 60. Happy Number

```
Repeat sum of square of digits
If becomes 1 → Happy
Else loop detected → Not
```

### 61. Binary to Decimal

```
Read binary
sum = 0, base = 1
While binary > 0
   digit = binary % 10
   sum += digit * base
   base *= 2
   binary /= 10
Print sum
```

### 62. Decimal to Binary

```
Read n
While n > 0
   Print n % 2
   n = n / 2
```

### 63. Bit Count

```
Read n
count = 0
While n > 0
   If n % 2 == 1 count++
   n = n / 2
Print count
```

### 64. Toggle Bits

```
Read n
Print ~n
```

### 65. XOR Logic

```
Read a, b
Print a ^ b
```

### 66. Bitwise AND

```
Read a, b
Print a & b
```

### 67. Reverse Array

```
Same as earlier
```

### 68. Pair Sum

```
Read array, target
For i from 0 to n-1
   For j from i+1 to n-1
      If arr[i]+arr[j]==target
         Print pair
```

### 69. Sliding Window Sum

```
Read array, k
sum first k elements
Slide window and update sum
```

### 70. Prefix Sum

```
Read array
prefix[0] = arr[0]
For i from 1 to n-1
   prefix[i] = prefix[i-1] + arr[i]
```

### 71. Kadane’s Algorithm

```
Read array
max = -∞, curr = 0
For each x
   curr += x
   If curr > max max = curr
   If curr < 0 curr = 0
Print max
```

### 72. Subarray Sum

```
Check all subarrays
Compare sum with target
```

### 73. Missing Number

```
sum = n*(n+1)/2
Subtract array sum
```

### 74. Duplicate Detection

```
Use set
If element repeats → duplicate
```

### 75. Majority Element

```
Use Boyer-Moore Voting
```

### 76. Two Pointer

```
Use start and end
Move based on condition
```

### 77. Merge Sorted Arrays

```
Use two pointers
Compare and merge
```

### 78. Remove Element

```
Overwrite array skipping target
```

### 79. Rotate String

```
Check if s2 in s1+s1
```

### 80. Check Rotation

```
Same as above
```

---

## 🚀 Next: ADVANCED + TRAPS + INTERVIEW SET (81–150)
