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
