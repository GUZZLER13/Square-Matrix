public class Main {
    public static void main(String[] args) {


        int[][] matrice = new int[][]{
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 7},
                {3, 4, 5, 6, 12},
                {4, 5, 6, 7, 13},
                {5, 6, 7, 8, 14}
        };

        int diag1 = 0;
        int diag2 = 0;

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {

                //On cherche la somme de la diagonale 1
                if (i == j) {
                    diag1 += matrice[i][j];
                }

                //On cherche la somme de la diagonale 2
                if (i + j == matrice.length - 1) {
                    diag2 += matrice[i][j];
                }
            }
        }
        System.out.println("diag1 = " + diag1);
        System.out.println("diag2 = " + diag2);
        System.out.println("difference des diag = " + (diag1 - diag2));
    }
}
