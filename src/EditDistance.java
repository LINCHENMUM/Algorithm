
public class EditDistance {
	public static void main(String[] args) {
		String A = "DUCK";
		String B = "TUG";
		System.out.println("The edit distance between " + A + " and " + B + " is:" + editDistance(A, B));

	}

	public static int editDistance(String A, String B) {
		int lenA = A.length();
		int lenB = B.length();
		int[][] D = new int[lenA + 1][lenB + 1];
		D[0][0] = 0;
		for (int i = 1; i <= lenA; i++) {
			D[i][0] = i;
		}
		for (int j = 1; j <= lenB; j++) {
			D[0][j] = j;
		}
		for (int m = 1; m <= lenA; m++) {
			for (int n = 1; n <= lenB; n++) {
				if (String.valueOf(A.charAt(m - 1)).equals(String.valueOf(B.charAt(n - 1)))) {
					D[m][n] = D[m - 1][n - 1];
				} else {
					D[m][n] = Math.min(Math.min(D[m - 1][n] + 1, D[m][n - 1] + 1), D[m - 1][n - 1] + 1);
				}
			}
		}

		return D[lenA][lenB];
	}

}
