public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        matrix1.setM(3);
        matrix1.setN(3);
        int[][] matrica1 = {{4, 5, 6}, {2, 4, 1}, {7, 4, 9}};
        matrix1.setMatrix(matrica1);

        Matrix matrix2 = new Matrix();
        matrix2.setM(3);
        matrix2.setN(3);
        int[][] matrica2 = {{6, 3, 7}, {9, 7, 2}, {4, 8, 3}};
        matrix2.setMatrix(matrica2);

        System.out.println("Вывод на экран матрицы:");
        matrix1.printMatrix();

        System.out.println("Умножение матрицы на число:");
        matrix1.multiplication(4);

        System.out.println("Сложение двух матриц:");
        matrix1.sumMatrix(matrix1, matrix2);

        System.out.println("Умножение двух матриц:");
        matrix1.multiMatrix(matrix1, matrix2);



        Shape[] shape = new Shape[2];
        shape[0] = new Circle();
        shape[1] = new Rectangle();

        shape[0].draw();
        shape[1].draw();
        //Написали Гусев и Шмаков
    }
}