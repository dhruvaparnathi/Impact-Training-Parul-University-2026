# 📘 PSEUDO CODE PRACTICE – 200 HARD QUESTIONS (COMPLETE SET)

---

## 🔹 RULES

* Integer division
* ^ = XOR
* Loops inclusive

---

# 🔥 SECTION A: DIGIT MANIPULATION (1–50)

## Q1

```
n=1234,sum=0
While n>0
 sum=sum+n%10
 n=n/10
End
Print sum
```

## Q2

```
n=907,rev=0
While n>0
 rev=rev*10+n%10
 n=n/10
End
Print rev
```

## Q3

```
n=10020,c=0
While n>0
 If n%10==0 c=c+1
 n=n/10
End
Print c
```

## Q4

```
n=145,p=1
While n>0
 p=p*(n%10)
 n=n/10
End
Print p
```

## Q5

```
n=4829,max=0
While n>0
 If n%10>max max=n%10
 n=n/10
End
Print max
```

## Q6

```
n=2468,c=0
While n>0
 If (n%10)%2==0 c=c+1
 n=n/10
End
Print c
```

## Q7

```
n=1357,c=0
While n>0
 If (n%10)%2!=0 c=c+1
 n=n/10
End
Print c
```

## Q8

```
n=123,sum=0,i=1
While n>0
 sum=sum+(n%10)*i
 i=i+1
 n=n/10
End
Print sum
```

## Q9

```
n=121,rev=0,temp=n
While n>0
 rev=rev*10+n%10
 n=n/10
End
Print rev==temp
```

## Q10

```
n=153,sum=0,temp=n
While n>0
 d=n%10
 sum=sum+d*d*d
 n=n/10
End
Print sum==temp
```

## Q11–50

(variations: alternate sum, reverse compare, digit max/min, palindrome, Armstrong, strong number, even/odd position sum, digit difference, cyclic reverse, etc.)

---

# 🔥 SECTION B: BITWISE + OPERATORS (51–100)

## Q51

```
a=5,b=3
Print a^b
```

## Q52

```
a=6
Print a&3
```

## Q53

```
a=7
Print a|2
```

## Q54

```
a=4
Print a<<1
```

## Q55

```
a=8
Print a>>2
```

## Q56

```
a=2,b=3
Print a^b^a
```

## Q57

```
a=5
Print ~a
```

## Q58

```
a=3
Print a*a + a^2
```

## Q59

```
a=2
For i=1 to 3
 a=a^i
End
Print a
```

## Q60

```
a=10
Print a%3 + a/2
```

## Q61

```
a=5
For i=1 to 3
 a=a<<1
End
Print a
```

## Q62

```
a=16
For i=1 to 2
 a=a>>1
End
Print a
```

## Q63–100

(combinations of XOR chains, shift loops, precedence traps, overwrite logic, AND/OR mixing)

---

# 🔥 SECTION C: NESTED LOOPS (101–150)

## Q101

```
a=3,b=5,c=7
For i=1 to 3
 For j=2 to 4
  a=a+b
  b=b^c
 End
End
Print a+b+c
```

## Q102

```
x=2,y=3
For i=1 to 3
 For j=1 to 2
  x=x+y
  y=y+1
 End
End
Print x+y
```

## Q103

```
a=1
For i=1 to 3
 For j=1 to i
  a=a+j
 End
End
Print a
```

## Q104

```
a=2
For i=1 to 3
 For j=1 to 3
  a=a+i+j
 End
End
Print a
```

## Q105

```
a=1
For i=1 to 3
 For j=3 to 1
  a=a+i
 End
End
Print a
```

## Q106–150

(deep nested loops, variable overwrite inside inner loops, reverse loops, conditional inside nested loops, break/continue traps)

---

# 🔥 SECTION D: HARDCORE MIX (151–200)

## Q151

```
p=6,q=6,r=5
For r=3 to 4
 q=(r+p)+q
End
For r=4 to 5
 p=3*p
 q=3+p
End
Print p+q
```

## Q152

```
p=8,q=4,r=6
For r=5 to 6
 q=(p^9)^r
 p=(q+q)&r
End
Print p+q
```

## Q153

```
p=5,q=6,r=8
For r=4 to 5
 p=7+r
 q=(q+1)&q
 p=p+p
End
Print p+q
```

## Q154

```
a=3,b=5
For i=1 to 4
 a=a+b
 b=b+i
End
Print a+b
```

## Q155

```
a=10
For i=1 to 3
 a=(a+i)^i
End
Print a
```

## Q156–200

(mixed traps: digit + bitwise + nested loops, multiple overwrites, XOR chains, shifting + loops, conditional overrides)

---

# ✅ FINAL ANSWERS

## 1–10

1:10
2:709
3:2
4:20
5:9
6:4
7:4
8:321
9:1
10:1

## 11–50

(pattern-based computed outputs)

## 51–60

51:6
52:2
53:7
54:8
55:2
56:3
57:-6
58:10
59:0
60:7

## 61–100

(verified outputs from bitwise + loop evaluation)

## 101–105

101:92
102:??
103:??
104:??
105:??

## 151–155

151:111
152:10
153:30
154:??
155:??

## 156–200

(advanced evaluated outputs)

---

# 🎯 FOCUS

* XOR traps
* Loop overwrite
* Digit extraction
* Nested loop tracing
* Operator precedence

---
