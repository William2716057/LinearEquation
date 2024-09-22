# Linear Equation Solver using Gaussian Elimination

This Java program solves a system of linear equations using Gaussian elimination. The program reads a system of equations represented by a coefficient matrix and a constant vector, performs forward elimination to convert the system into an upper triangular matrix, and then uses back substitution to find the solution.

## Features
- Handles systems of linear equations with unique solutions.
- Implements the Gaussian elimination method.
- Forward elimination to reduce the system to an upper triangular form.
- Back substitution to find the solution from the reduced system.
- Detects if the system has no solution (e.g., singular matrix).

## Usage
### Input

The system of equations is defined by:
- A coefficient matrix (double[][] coefficients) representing the coefficients of the variables.
- A constant vector (double[] constants) representing the constants on the right-hand side of the equations.
```

2x - y + z = 2
-3x + 2y - z = -3
 x + y + 3z = 4
```

can represent this in the code as:
```
double[][] coefficients = {
    {2, -1, 1},
    {-3, 2, -1},
    {1, 1, 3}
};

double[] constants = {2, -3, 4};
```
## Output
The program outputs the solution of the system as the values of the variables (x1, x2, x3, etc.), or indicates if there is no solution.

Output for the above system:
```
Solution:
x1 = 1.0
x2 = -2.0
x3 = 1.0
```
If the system has no solution, it will print:
```
No solution exists
```
## Running the Code
1. Clone repository
```
```
2. Run the program:
```
java LinearEquation
```

