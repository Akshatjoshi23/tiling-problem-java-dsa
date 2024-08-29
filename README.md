# tiling-problem-java-dsa
 in this code we find the number of ways in which we can tile a 2xn floors by tile of size 2x1 using recursion either horizontally or vertically.

Algorithm: Tiling Problem (Recursive)

Input: N (size of grid)

1. If N == 1, return 1
2. If N == 2, return 2
3. Otherwise, return tilingProblem(N-1) + tilingProblem(N-2)
```