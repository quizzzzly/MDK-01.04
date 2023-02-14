public class Matrix {
    private int m;
    private int n;
    private int matrix[][] = new int[m][n];

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    Matrix() {

    }

    public void printMatrix(){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multiplication(int num){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j]*num + " ");
            }
            System.out.println();
        }
    }

    public void sumMatrix(Matrix matrix1, Matrix matrix2){
        int m = matrix1.getM();
        int n = matrix1.getN();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix1.getMatrix()[i][j] + matrix2.getMatrix()[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multiMatrix(Matrix matrix1, Matrix matrix2){
        int m = matrix1.getMatrix().length;
        int n = matrix2.getMatrix()[0].length;
        int o = matrix2.getMatrix().length;
        int[][] multiMatrix = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < o; k++){
                    multiMatrix[i][j] += matrix1.getMatrix()[i][k] * matrix2.getMatrix()[k][j];
                }
            }
        }
        for (int i = 0; i < multiMatrix.length; i++){
            for (int j = 0; j < multiMatrix[0].length; j++){
                System.out.print(multiMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
