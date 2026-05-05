# 🔥 Bitwise Operators (Complete Notes + Hidden Traps)

## 📌 What are Bitwise Operators?

Bitwise operators work on numbers at the **binary (bit) level**.

Example:
5  = 0101
3  = 0011

---

## ✅ 1. AND (&)

Compares each bit → 1 only if both bits are 1

```
  0101 (5)
& 0011 (3)
-----------
  0001 = 1
```

Rule:

* 1 & 1 = 1
* Otherwise = 0

---

## ✅ 2. OR (|)

1 if at least one bit is 1

```
  0101
| 0011
-----------
  0111 = 7
```

---

## ✅ 3. XOR (^)

1 if bits are different

```
  0101
^ 0011
-----------
  0110 = 6
```

### 🔥 XOR Properties (VERY IMPORTANT)

* a ^ a = 0
* a ^ 0 = a
* a ^ b ^ a = b
* XOR is commutative & associative

---

## ✅ 4. NOT (~)

Flips all bits

```
5 = 00000101
~5 = 11111010
```

### 🔥 Key Formula:

```
~x = -(x + 1)
```

Example:

```
~5 = -6
~0 = -1
```

---

## ✅ 5. Left Shift (<<)

Shifts bits to left

```
5 << 1
0101 → 1010 = 10
```

### Formula:

```
x << n = x * (2^n)
```

---

## ✅ 6. Right Shift (>>)

Shifts bits to right

```
5 >> 1
0101 → 0010 = 2
```

### Formula:

```
x >> n = x / (2^n)
```

---

# ⚠️🔥 Hidden Edge Cases & Tricky Concepts

---

## ⚠️ 1. Signed Numbers & Two’s Complement

Most languages store integers using **two’s complement**

### Key Idea:

* MSB (leftmost bit) = sign bit
* 0 → positive
* 1 → negative

Example:

```
-5 representation:
5  = 00000101
~5 = 11111010
+1 = 11111011 = -5
```

---

## ⚠️ 2. Right Shift on Negative Numbers

```
-1 >> 1 = -1
```

👉 WHY?

* Sign bit (1) is preserved
* Called **Arithmetic Shift**

---

## ⚠️ 3. Logical vs Arithmetic Shift

| Type             | Operator   | Behavior       |
| ---------------- | ---------- | -------------- |
| Arithmetic Shift | >>         | Preserves sign |
| Logical Shift    | >>> (Java) | Fills with 0   |

Example (Java):

```
-1 >>> 1 = 2147483647
```

---

## ⚠️ 4. Overflow in Left Shift

```
int x = 1 << 31
```

👉 Result becomes **negative**

WHY?

* Sign bit changes

---

## ⚠️ 5. Shift Greater Than Bit Size

```
x << 35   (in Java int)
```

👉 Actually:

```
35 % 32 = 3
→ x << 3
```

---

## ⚠️ 6. ~ (NOT) Confusion Trap

Many think:

```
~5 = reverse(5)
```

❌ WRONG

Correct:

```
~x = -(x + 1)
```

---

## ⚠️ 7. Division Trap in Right Shift

```
-5 >> 1 = -3   (NOT -2)
```

👉 Because:

* It rounds towards negative infinity
* Not normal division

---

## ⚠️ 8. XOR Swap Trap

```
a = a ^ b
b = a ^ b
a = a ^ b
```

⚠️ Fails when:

```
a and b refer to same memory (aliasing case)
```

---

## ⚠️ 9. Checking Even/Odd

```
x & 1
```

* 0 → even
* 1 → odd

---

## ⚠️ 10. Clearing / Setting Bits

### Set ith bit:

```
x | (1 << i)
```

### Clear ith bit:

```
x & ~(1 << i)
```

### Toggle ith bit:

```
x ^ (1 << i)
```

---

## ⚠️ 11. Common Interview Questions

### 🔹 Find missing number (XOR trick)

```
a ^ a = 0
```

### 🔹 Find single number in array

```
All duplicates cancel using XOR
```

---

## ⚠️ 12. Operator Precedence Trap

```
x & 1 == 0
```

❌ WRONG

Actually evaluated as:

```
x & (1 == 0)
```

✔️ Correct:

```
(x & 1) == 0
```

---

## ⚠️ 13. Bit Masking Trap

```
int mask = 1 << i
```

👉 If i is large → overflow risk

---

## ⚠️ 14. Mixing Signed & Unsigned

In languages like C/C++:

* Results may differ due to type conversion

---

## 🚀 Summary (Must Remember)

* Bitwise works on binary
* XOR is most important for interviews
* ~x = -(x + 1)
* > > keeps sign, >>> removes sign (Java)
* Always use brackets in conditions

---

## 🎯 Pro Tip

If stuck:
👉 Convert numbers to binary → solve → convert back

---
