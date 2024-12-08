We use the integers A, B, and N to create the following series:

### (A + 2^0 * B), (A + 2^0 * B + 2^1 * B), ..., (A + 2^0 * B + 2^1 * B + ... + 2^n-1 * B)

You are given Q queries in the form of A, B, and N. For each query, print the series corresponding to the given A, B, and N values as a single line of N space-separated integers.

### Input Format
The first line contains an integer, Q, denoting the number of queries.
Each line i of the Q subsequent lines contains three space-separated integers describing the respective Ai, Bi, and Ni values for that query.

### Constraints
0 <= Q <= 500  
0 <= A, B <= 50  
1 <= N <= 15  

### Output Format
For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of N space-separated integers.

### Sample Input
2  
0 2 10  
5 3 5  

### Sample Output
2 6 14 30 62 126 254 510 1022 2046  
8 14 26 50 98
