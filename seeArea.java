public class seeArea {

    public static char open(char[][] matrix, int line, int row) {
        int x = 0;
        for (int i = line; i < line + 3; i++) {
            for (int j = row; j < row + 3; j++) {
                if (matrix[i][j] == '*') {
                    x += 1;
                }
            }
        }
        return Character.forDigit(x, 10);
    }

    public static boolean win(char[][] matrix) {
        boolean t = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '-') {
                    t=false;
                    break;
                }

            }
        }
        return t;
    }

}
