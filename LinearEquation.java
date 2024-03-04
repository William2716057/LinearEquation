public class LinearEquation {
	public static void main(String[] args) {
		double[][] coefficients = {
			{2, -1, 1},
			{-3, 2, -1},
			{1, 1, 3}
		};

		double[] constants = {2, -3, 4};

		double[] solution = solveEquation(coefficients, constants);
		if (solution != null) {
			System.out.println("solution: ");
			for (int i = 0; 1 < solution.length; i++) {
				System.out.println("x" + (i+1) + " = " + solution[i]);
			}
		} else {
			System.out.println("No solution exists");
		}

	}

	public static double[] solveEquation(double[][] coefficients, double[] constants) {
		int n = constants.length;
		double[] solution = new double[n];

		for (int i = 0; i < n; i++) {
			if (coefficients[i][i] == 0) {
				return null; // no solution
			}

			//forward elimination
			for (int j = i + 1; j < n; j++) {
				double ratio = coefficients[j][i] / coefficients[i][i];
				for (int k = i; k < n; k++) {
					coefficients[j][k] -= ratio * coefficients[i][k];
				}
				constants[j] -= ratio * constants[i];
			}

		}

		for (int i = n - 1; i >= 0; i--) {
			double sum = 0.0;
			for (int j = i + 1; j < n; j++) {
				sum += coefficients[i][j] * solution[j];
			}
			solution[i] = (constants[i] - sum) / coefficients[i][i];
		}

		return solution;
		}
	}


