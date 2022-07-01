public class Main {
    public static void main(String[] args) {

        int[][] matrice1 = new int[][]{
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 7},
                {3, 4, 5, 6, 12},
                {4, 5, 6, 7, 13},
                {5, 6, 7, 8, 14}
        };
        System.out.println(sumDiag(matrice1));
    }

    public static int sumDiag(int[][] matrice) {
        int sumDiag1 = 0;
        int sumDiag2 = 0;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                if (i == j) {
                    sumDiag1 += matrice[i][j];
                }
                if (i + j == matrice.length - 1) {
                    sumDiag2 += matrice[i][j];
                }
            }
        }
        return sumDiag1 - sumDiag2;
    }
}
