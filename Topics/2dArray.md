# Complete 2D Array Notes in Java ⭐⭐⭐

# What is a 2D Array?

A 2D array is a collection of rows and columns.

It looks like a table or matrix.

Example:

```java
int[][] arr = {
    {1,2,3},
    {4,5,6},
    {7,8,9}
};
```

Visualization:

```text
1 2 3
4 5 6
7 8 9
```

Rows = 3
Columns = 3

---

# Declaration of 2D Array

```java
int[][] arr = new int[3][3];
```

Meaning:

```text
3 rows
3 columns
```

---

# Access Elements

```java
System.out.println(arr[0][0]);
```

Output:

```text
First element
```

---

# Update Elements

```java
arr[1][2] = 50;
```

---

# Traversing 2D Array ⭐⭐⭐

```java
for(int i = 0; i < arr.length; i++){

    for(int j = 0; j < arr[i].length; j++){

        System.out.print(arr[i][j] + " ");
    }

    System.out.println();
}
```

Explanation:

```text
i = row
j = column
```

---

# Row-wise Traversal

Input:

```text
1 2 3
4 5 6
7 8 9
```

Output:

```text
1 2 3 4 5 6 7 8 9
```

Code:

```java
for(int i = 0; i < arr.length; i++){

    for(int j = 0; j < arr[i].length; j++){

        System.out.print(arr[i][j] + " ");
    }
}
```

---

# Column-wise Traversal ⭐⭐⭐

Output:

```text
1 4 7 2 5 8 3 6 9
```

Code:

```java
for(int j = 0; j < arr[0].length; j++){

    for(int i = 0; i < arr.length; i++){

        System.out.print(arr[i][j] + " ");
    }
}
```

---

# Diagonal Traversal ⭐⭐⭐

# Main Diagonal

Output:

```text
1 5 9
```

Condition:

```java
if(i == j)
```

Code:

```java
for(int i = 0; i < arr.length; i++){

    for(int j = 0; j < arr[0].length; j++){

        if(i == j){
            System.out.print(arr[i][j] + " ");
        }
    }
}
```

---

# Secondary Diagonal

Output:

```text
3 5 7
```

Condition:

```java
if(i + j == n - 1)
```

Code:

```java
int n = arr.length;

for(int i = 0; i < n; i++){

    for(int j = 0; j < n; j++){

        if(i + j == n - 1){
            System.out.print(arr[i][j] + " ");
        }
    }
}
```

---

# Sum of All Elements

```java
int sum = 0;

for(int i = 0; i < arr.length; i++){

    for(int j = 0; j < arr[0].length; j++){

        sum += arr[i][j];
    }
}

System.out.println(sum);
```

---

# Maximum Element

```java
int max = arr[0][0];

for(int i = 0; i < arr.length; i++){

    for(int j = 0; j < arr[0].length; j++){

        if(arr[i][j] > max){
            max = arr[i][j];
        }
    }
}

System.out.println(max);
```

---

# Search in 2D Array

```java
int target = 5;
boolean found = false;

for(int i = 0; i < arr.length; i++){

    for(int j = 0; j < arr[0].length; j++){

        if(arr[i][j] == target){

            found = true;
            break;
        }
    }
}

System.out.println(found);
```

---

# Matrix Transpose ⭐⭐⭐

Rows become columns.

Example:

```text
1 2 3
4 5 6
```

Becomes:

```text
1 4
2 5
3 6
```

Main Logic:

```text
arr[i][j] -> transpose[j][i]
```

Code:

```java
int[][] arr = {
    {1,2,3},
    {4,5,6}
};

int rows = arr.length;
int cols = arr[0].length;

int[][] transpose = new int[cols][rows];

for(int i = 0; i < rows; i++){

    for(int j = 0; j < cols; j++){

        transpose[j][i] = arr[i][j];
    }
}

for(int i = 0; i < cols; i++){

    for(int j = 0; j < rows; j++){

        System.out.print(transpose[i][j] + " ");
    }

    System.out.println();
}
```

---

# In-place Transpose ⭐⭐⭐

Only for square matrix.

Code:

```java
for(int i = 0; i < n; i++){

    for(int j = i + 1; j < n; j++){

        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}
```

---

# Rotate Matrix 90 Degree Clockwise ⭐⭐⭐

Example:

```text
1 2 3
4 5 6
7 8 9
```

Output:

```text
7 4 1
8 5 2
9 6 3
```

Main Logic:

```text
Transpose
+
Reverse every row
```

Code:

```java
int n = arr.length;

// transpose
for(int i = 0; i < n; i++){

    for(int j = i + 1; j < n; j++){

        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}

// reverse rows
for(int i = 0; i < n; i++){

    int start = 0;
    int end = n - 1;

    while(start < end){

        int temp = arr[i][start];
        arr[i][start] = arr[i][end];
        arr[i][end] = temp;

        start++;
        end--;
    }
}
```

---

# Spiral Traversal ⭐⭐⭐

Input:

```text
1 2 3
4 5 6
7 8 9
```

Output:

```text
1 2 3 6 9 8 7 4 5
```

Main Idea:

```text
Top Row
Right Column
Bottom Row
Left Column
```

Code:

```java
int top = 0;
int bottom = arr.length - 1;

int left = 0;
int right = arr[0].length - 1;

while(top <= bottom && left <= right){

    // top row
    for(int i = left; i <= right; i++){
        System.out.print(arr[top][i] + " ");
    }
    top++;

    // right column
    for(int i = top; i <= bottom; i++){
        System.out.print(arr[i][right] + " ");
    }
    right--;

    // bottom row
    if(top <= bottom){

        for(int i = right; i >= left; i--){
            System.out.print(arr[bottom][i] + " ");
        }
        bottom--;
    }

    // left column
    if(left <= right){

        for(int i = bottom; i >= top; i--){
            System.out.print(arr[i][left] + " ");
        }
        left++;
    }
}
```

---

# Wave Traversal ⭐⭐⭐

Output:

```text
1 4 7 8 5 2 3 6 9
```

Pattern:

```text
Down
Up
Down
Up
```

Code:

```java
int rows = arr.length;
int cols = arr[0].length;

for(int j = 0; j < cols; j++){

    if(j % 2 == 0){

        for(int i = 0; i < rows; i++){
            System.out.print(arr[i][j] + " ");
        }
    }

    else{

        for(int i = rows - 1; i >= 0; i--){
            System.out.print(arr[i][j] + " ");
        }
    }
}
```

---

# Boundary Traversal ⭐⭐⭐

Output:

```text
1 2 3 6 9 8 7 4
```

Code:

```java
int rows = arr.length;
int cols = arr[0].length;

// top row
for(int j = 0; j < cols; j++){
    System.out.print(arr[0][j] + " ");
}

// right column
for(int i = 1; i < rows; i++){
    System.out.print(arr[i][cols - 1] + " ");
}

// bottom row
for(int j = cols - 2; j >= 0; j--){
    System.out.print(arr[rows - 1][j] + " ");
}

// left column
for(int i = rows - 2; i > 0; i--){
    System.out.print(arr[i][0] + " ");
}
```

---

# Saddle Point ⭐⭐⭐

Definition:

```text
Smallest in row
AND
Largest in column
```

Code:

```java
boolean found = false;

for(int i = 0; i < rows; i++){

    int minCol = 0;

    // smallest in row
    for(int j = 1; j < cols; j++){

        if(arr[i][j] < arr[i][minCol]){
            minCol = j;
        }
    }

    boolean largest = true;

    // largest in column
    for(int k = 0; k < rows; k++){

        if(arr[k][minCol] > arr[i][minCol]){
            largest = false;
            break;
        }
    }

    if(largest){
        System.out.println(arr[i][minCol]);
        found = true;
    }
}

if(!found){
    System.out.println("No Saddle Point");
}
```

---

# Jagged Array

Rows with different column sizes.

```java
int[][] arr = {
    {1,2},
    {3,4,5},
    {6}
};
```

---

# Time Complexities ⭐⭐⭐

| Operation        | Complexity |
| ---------------- | ---------- |
| Traversal        | O(n*m)     |
| Search           | O(n*m)     |
| Transpose        | O(n*m)     |
| Rotation         | O(n²)      |
| Spiral Traversal | O(n*m)     |
| Wave Traversal   | O(n*m)     |

---

# Important Interview Topics ⭐⭐⭐

Focus extra on:

1. Transpose
2. Rotation
3. Spiral Traversal
4. Wave Traversal
5. Boundary Traversal
6. Search in Matrix
7. Saddle Point
8. Diagonal Traversal

---

# Most Asked LeetCode Problems ⭐⭐⭐

Practice on LeetCode:

1. Two Dimensional Array Traversal
2. Matrix Diagonal Sum
3. Transpose Matrix
4. Spiral Matrix
5. Rotate Image
6. Set Matrix Zeroes
7. Search a 2D Matrix
8. Pascal Triangle
9. Spiral Matrix II
10. Toeplitz Matrix
11. Reshape the Matrix
12. Valid Sudoku
13. Game of Life
14. Matrix Block Sum
15. Count Negative Numbers in a Sorted Matrix

---

# Best Learning Order ⭐⭐⭐

```text
Basics
→ Traversal
→ Row/Column Sum
→ Search
→ Diagonal
→ Transpose
→ Rotation
→ Spiral Traversal
→ Wave Traversal
→ Boundary Traversal
→ Advanced Matrix Problems
```

---

# Important Visualization Trick ⭐⭐⭐

Always draw indexes:

```text
(0,0) (0,1) (0,2)
(1,0) (1,1) (1,2)
(2,0) (2,1) (2,2)
```

This makes matrix problems much easier.

---

# Final Interview Tips ⭐⭐⭐

1. Practice dry run on paper.
2. Understand row and column movement.
3. Learn index manipulation.
4. Master transpose and rotation.
5. Spiral traversal is very important.
6. Learn both square and rectangular matrix handling.
7. Focus more on logic than memorizing code.
