# 🚀 Java Basics – Placement Oriented Training Notes

## 🎯 Topics Covered

* Programming Syntax
* Variables
* Data Types
* Input / Output

---

# ⏱️ 1. Programming Syntax (Core Understanding)

## ✅ Key Points

* `main()` → Entry point of execution
* `{}` → Defines blocks (scope)
* `;` → Statement terminator
* Java is **case-sensitive**

## 🔥 Example

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

## ❗ Common Errors (Must Practice)

```java
System.out.println("Hello World")  // Missing semicolon
system.out.println("Hi");         // Wrong case
public static void main(String args) // Wrong signature
```

---

# ⏱️ 2. Variables & Data Types

## ✅ Variable

* A container to store data
* Must have a type

```java
int age = 20;
```

## ✅ Data Types

| Type    | Example | Description      |
| ------- | ------- | ---------------- |
| int     | 10      | Integer values   |
| double  | 10.5    | Decimal numbers  |
| char    | 'A'     | Single character |
| String  | "Akash" | Text             |
| boolean | true    | True/False       |

---

## 🔥 Important Concepts

### 1. Type Conversion

```java
int a = 10;
double b = a;   // Implicit

double x = 10.5;
int y = (int)x; // Explicit (data loss)
```

### 2. Overflow

```java
byte b = 127;
b++;
System.out.println(b); // -128
```

### 3. Expression Behavior

```java
char c = 'A';
System.out.println(c + 1); // 66
```

---

# ⏱️ 3. Input / Output

## ✅ Output

```java
System.out.println("Hello");
System.out.print("Hi");
```

## ✅ Input

```java
import java.util.Scanner;
Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
String name = sc.next();
```

## ⚠️ nextLine() Trap

```java
int a = sc.nextInt();
String name = sc.nextLine(); // Issue
```

### ✔ Fix

```java
int a = sc.nextInt();
sc.nextLine();
String name = sc.nextLine();
```

---

# ⏱️ 4. Placement-Level Problems

## Swap Numbers

```java
int a = 5, b = 10;
```

## Even or Odd

```java
int n = sc.nextInt();
System.out.println(n % 2 == 0 ? "Even" : "Odd");
```

## Tricky Increment

```java
int a = 10;
System.out.println(a++ + ++a);
```

---

# 🎯 Teaching Strategy

## ✅ DO

* Predict output before execution
* Debug incorrect code
* Focus on logic

## ❌ DON'T

* Avoid long theory
* Avoid passive lectures

---

# 🔥 100 Tricky Questions (Placement Level)

## 🧠 Output Based

1. `System.out.println(5 + 10 + "Hello");`

2. `System.out.println("Hello" + 5 + 10);`

3. `System.out.println(10 / 3);`

4. `System.out.println(10 / 3.0);`

5. `System.out.println('A' + 2);`

6. `System.out.println("A" + 2);`

7. `System.out.println(true + "Hello");`

8. `System.out.println(10 + 20 + "Java" + 30);`

9. `System.out.println("Java" + 10 + 20 + 30);`

10. `System.out.println(10 * 20 + "Java");`

11. `int a=5; System.out.println(a++);`

12. `int a=5; System.out.println(++a);`

13. `int a=5; System.out.println(a++ + ++a);`

14. `int a=5; System.out.println(++a + a++);`

15. `int a=5; System.out.println(a++ + a++);`

16. `byte b=127; b++; System.out.println(b);`

17. `byte b=-128; b--; System.out.println(b);`

18. `char c='A'; System.out.println(c++);`

19. `char c='A'; System.out.println(++c);`

20. `System.out.println('A' + 'B');`

21. `int a=10; double b=3; System.out.println(a/b);`

22. `System.out.println(10 + 20 * 30);`

23. `System.out.println((10 + 20) * 30);`

24. `System.out.println(10 + 20 + "30");`

25. `System.out.println("10" + 20 + 30);`

26. `int x=10; System.out.println(x += 5);`

27. `int x=10; System.out.println(x -= 5);`

28. `int x=10; System.out.println(x *= 5);`

29. `int x=10; System.out.println(x /= 5);`

30. `int x=10; System.out.println(x %= 3);`

31. `System.out.println(10 > 5);`

32. `System.out.println(10 < 5);`

33. `System.out.println(10 == 10);`

34. `System.out.println(10 != 10);`

35. `System.out.println(5 > 3 && 2 < 1);`

36. `System.out.println(5 > 3 || 2 < 1);`

37. `System.out.println(!(5 > 3));`

38. `System.out.println(true && false || true);`

39. `System.out.println((true && false) || true);`

40. `System.out.println(true && (false || true));`

## 🧠 Concept Based

41. What is implicit casting?
42. What is explicit casting?
43. Why data loss happens?
44. What is overflow?
45. Difference between int and double?

## 🧠 Debugging

46. Find error: `System.out.println("Hi")`
47. Find error: `system.out.println("Hi")`
48. Fix input issue with nextLine()
49. Why char + int gives int?
50. Why String + int concatenates?

## 🧠 Practice Problems

51–100: (Advanced variations combining all above concepts including nested expressions, multiple increments, casting chains, and input edge cases.)

51. `int a=5; System.out.println(a+++a);` // parse and output?

52. `int a=5; System.out.println(a++ + a + ++a);`

53. `int a=1; int b=a++ + ++a + a++; System.out.println(a + "," + b);`

54. `int a=10; System.out.println(a++ + a++ + ++a);`

55. `int a=3; System.out.println(++a * a++ + a);`

56. `int a=3; System.out.println(a++ * ++a + a);`

57. `int a=3; System.out.println(a++ * ++a + a++);`

58. `int a=3; System.out.println(++a * a++ + ++a);`

59. `int a=2; System.out.println(a++ + a++ + a++);`

60. `int a=2; System.out.println(++a + ++a + ++a);`

61. `double d=10/3; System.out.println(d);`

62. `double d=10/3.0; System.out.println((int)d);`

63. `int x=(int)10.9 + (int)5.1; System.out.println(x);`

64. `int x=(int)(10.9 + 5.1); System.out.println(x);`

65. `System.out.println((int)"123"); // compile or not? why?`

66. `System.out.println((char)65 + 1);`

67. `System.out.println((char)(65 + 1));`

68. `char c=65535; c++; System.out.println((int)c);`

69. `byte b=100; b = b * 2; // compile or not? why?`

70. `byte b=100; b *= 2; System.out.println(b);`

71. `String s=null; System.out.println(s + "Hello");`

72. `String s="null"; System.out.println(s + null);`

73. `System.out.println(null + "Hello"); // compile or runtime?`

74. `System.out.println("Hello" + null);`

75. `System.out.println("A" + 'B' + 1);`

76. `System.out.println('A' + 'B' + "C");`

77. `System.out.println("A" + ('B' + 1));`

78. `System.out.println('A' + 1 + "B");`

79. `System.out.println("A" + 1 + 'B');`

80. `System.out.println(1 + 2 + "3" + 4 + 5);`

81. `int a=5; a = a++ + ++a; System.out.println(a);`

82. `int a=5; int b=a++ + ++a; System.out.println(a + "," + b);`

83. `int a=5; int b=++a + a++ + a; System.out.println(a + "," + b);`

84. `int a=1; int b=1; int c=a++ + ++b + a++ + ++b; System.out.println(c);`

85. `int a=2; int b=3; System.out.println(a+++b);`

86. `Scanner sc=new Scanner(System.in); int x=sc.nextInt(); String y=sc.nextLine(); System.out.println(y.length()); // behavior?`

87. `Scanner sc=new Scanner(System.in); String s1=sc.next(); String s2=sc.nextLine(); System.out.println(s2);`

88. `Scanner sc=new Scanner(System.in); String s=sc.nextLine(); int x=Integer.parseInt(s); System.out.println(x+1);`

89. `Scanner sc=new Scanner(System.in); int x=Integer.parseInt(sc.next()); System.out.println(x*2);`

90. `Scanner sc=new Scanner(System.in); double d=Double.parseDouble(sc.next()); System.out.println((int)d);`

91. `int a=10; System.out.println(a++ + ++a + a++ + ++a);`

92. `int a=0; System.out.println(a++ + a++ + ++a + ++a);`

93. `int a=1; System.out.println(a++ + ++a + ++a + a++);`

94. `int a=2; System.out.println(++a + a++ + ++a + a++);`

95. `int a=3; System.out.println(a++ + a++ + a++ + a++);`

96. `System.out.println(10 + 20 + "30" + 40 * 2);`

97. `System.out.println("10" + 20 + 30 + 40 * 2);`

98. `System.out.println(("10" + 20 + 30) + 40 * 2);`

99. `System.out.println("10" + (20 + 30 + 40) * 2);`

100. `System.out.println("Result: " + 10 > 5); // compile or not? why?`

---

# 🎁 Homework

1. Celsius to Fahrenheit
2. Largest of 3 numbers
3. Leap year check
4. String length
5. Reverse number

---

# 🚀 Java Error Debugging Challenges + MCQ Test

---

# 🔥 Part 1: 50 Error Debugging Challenges (Increasing Difficulty)

## 🟢 Level 1 (Basic Syntax Errors)

1. `System.out.println("Hello")`
2. `system.out.println("Hi");`
3. `int a = 10.5;`
4. `char c = "A";`
5. `boolean b = 1;`
6. `int a; System.out.println(a);`
7. `final int x = 10; x = 20;`
8. `byte b = 130;`
9. `int x = (int)"123";`
10. `System.out.println("Hello" + );`

---

## 🟡 Level 2 (Type & Casting Errors)

11. `byte b = 100; b = b * 2;`
12. `int a = 10/0;`
13. `double d = 10/0;`
14. `int x = (int)10.9 + 5.1;`
15. `char c = 65536;`
16. `int x = (int)("123");`
17. `boolean b = "true";`
18. `int x = true;`
19. `String s = 10;`
20. `double d = 10/3;`

---

## 🟠 Level 3 (Runtime Errors)

21. `int a = 10, b = 0; System.out.println(a/b);`
22. `String s = null; System.out.println(s.length());`
23. `int[] arr = new int[3]; System.out.println(arr[5]);`
24. `String s = "Java"; System.out.println(s.charAt(10));`
25. `Integer.parseInt("abc");`
26. `int x = Integer.parseInt(null);`
27. `String s = null; System.out.println(s.toUpperCase());`
28. `int[] a = null; System.out.println(a.length);`
29. `Scanner sc = new Scanner(System.in); int x = sc.nextInt();`
30. `int[] arr = new int[-5];`

---

## 🔴 Level 4 (Logical + Tricky Errors)

31. `System.out.println(10/3);`
32. `System.out.println(10/3.0);`
33. `System.out.println("10" + 20 + 30);`
34. `System.out.println(10 + 20 + "30");`
35. `int a=5; System.out.println(a++ + ++a);`
36. `int a=5; System.out.println(++a + a++);`
37. `System.out.println('A' + 1);`
38. `System.out.println("A" + 1);`
39. `System.out.println(true && false || true);`
40. `System.out.println((true && false) || true);`

---

## ⚫ Level 5 (Advanced Edge Cases)

41. `int a=5; a = a++ + ++a;`
42. `int a=1; int b=a++ + ++a + a++;`
43. `int a=10; System.out.println(a++ + ++a + a++);`
44. `System.out.println("Result: " + 10 > 5);`
45. `System.out.println(null + "Hello");`
46. `System.out.println("Hello" + null);`
47. `Scanner sc=new Scanner(System.in); int x=sc.nextInt(); String y=sc.nextLine();`
48. `byte b=100; b *= 2;`
49. `char c=65535; c++;`
50. `System.out.println('A' + 'B');`

---

# 🧠 Part 2: MCQ Test (TCS / Infosys Style)

## 1.

What is the output?
`System.out.println(10 + 20 + "30");`
A) 3030
B) 102030
C) 3030
D) 30 30

---

## 2.

`int a = 5; System.out.println(a++ + ++a);`
A) 11
B) 12
C) 13
D) 14

---

## 3.

`System.out.println('A' + 1);`
A) A1
B) 66
C) Error
D) 65

---

## 4.

`System.out.println("A" + 1);`
A) 66
B) A1
C) Error
D) 65

---

## 5.

`System.out.println(10/3);`
A) 3
B) 3.33
C) Error
D) 3.0

---

## 6.

`System.out.println(10/3.0);`
A) 3
B) 3.33
C) Error
D) 3.0

---

## 7.

`byte b = 127; b++;`
A) 128
B) -128
C) Error
D) 0

---

## 8.

`String s = null; System.out.println(s);`
A) null
B) Error
C) Exception
D) blank

---

## 9.

`System.out.println(true && false || true);`
A) true
B) false
C) Error
D) null

---

## 10.

`int a=10; System.out.println("Value: " + a + 10 > 15);`
A) true
B) false
C) Error
D) Value: 1010

---

## 11.

`System.out.println('A' + 'B');`
A) AB
B) 131
C) Error
D) A+B

---

## 12.

`System.out.println("Hello" + null);`
A) Hellonull
B) Error
C) nullHello
D) Exception

---

## 13.

`int a=5; System.out.println(a+++a);`
A) 10
B) 11
C) Error
D) 12

---

## 14.

`System.out.println(1 + 2 + "3" + 4 + 5);`
A) 3345
B) 12345
C) 3345
D) Error

---

## 15.

`int a=5; int b=a++ + ++a;`
A) 11
B) 12
C) 13
D) 14

---

---

# 🎯 End Note

Practice these = strong command over basics + placement readiness.


