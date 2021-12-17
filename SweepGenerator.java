public class SweepGenerator {
    int line;
    int row;

    public SweepGenerator(int line, int row) {
        this.line = line;
        this.row = row;
    }

    public char[][] generate(int line, int row) {
        char[][] matrix = new char[line][row];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < row; j++) {
                int t = (int) Math.ceil(Math.random() * 5);
                if (t < 1.5) {
                    matrix[i][j] = '*';
                } else {
                    matrix[i][j] = '-';
                }
            }
        }
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < row; j++) {

            }
        }
        return matrix;
    }

    public static void printArray(char[][] matrix) {
        for (char[] chars : matrix) {
            for (int j = 0; j < matrix[1].length; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] copyLarger(char[][] matrix) {
        char[][] CopyMatrix = new char[matrix.length + 2][matrix[1].length + 2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                CopyMatrix[i + 1][j + 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < CopyMatrix.length; i++) {
            for (int j = 0; j < CopyMatrix[1].length; j++) {
                if (CopyMatrix[i][j] != '-' && CopyMatrix[i][j] != '*') {
                    CopyMatrix[i][j] = '-';
                }
            }
        }

        return CopyMatrix;
    }

    public static char[][] copy(char[][] matrix) {
        char[][] mat = new char[matrix.length][matrix[1].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                mat[i][j] = matrix[i][j];
            }
        }

        return mat;
    }

    public static int numberOfMines(char[][] matrix) {
        int x = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '*') {
                    x = +1;
                }

            }
        }
        return x;
    }

    public static char[][] fill(char[][] mat) {
        char[][] matrix = new char[mat.length][mat[1].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                matrix[i][j] = '-';
            }
        }
        return matrix;
    }


}
