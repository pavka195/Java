package main.java.synergy.block01.lesson05;

public class Matrix {
    //возврат единичной матрицы (через статичное поле и метод)
    private static final int[][] matrixUnit;

    static {
        matrixUnit = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
    }

    public static Matrix getMatrixUnit() {
        Matrix mNew = new Matrix(matrixUnit.length, matrixUnit[0].length);
        for (int x = 0; x < mNew.getUserMatrix().length; x++) {
            for (int y = 0; y < mNew.getUserMatrix()[0].length; y++) {
                mNew.getUserMatrix()[x][y] = matrixUnit[x][y];
            }
        }
        return mNew;
    }

    //параметры матрицы произвольной размерности m x n
    private final int m;
    private final int n;
    //двумерный массив, хранящий элементы матрицы
    private final int[][] userMatrix;

    // конструктор массив 2 x 2 (квадратная матрица)
    public Matrix() {
        this.m = 2;
        this.n = 2;
        this.userMatrix = new int[this.m][this.n];
    }
    //конструктор перегруженный произвольная матрица m x n
    public Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        this.userMatrix = new int[this.m][this.n];
    }

    //Сложение матриц
    public Matrix matrixAdd(Matrix m) {
        Matrix mNew = new Matrix(m.getM(), m.getN());
        for (int i = 0; i < mNew.getUserMatrix().length; i++) {
            for (int j = 0; j < mNew.getUserMatrix()[i].length; j++) {
                mNew.getUserMatrix()[i][j] = userMatrix[i][j] + m.getUserMatrix()[i][j];
            }
        }
        return mNew;
    }

    //Разность матриц
    public Matrix matrixDelete(Matrix m) {
        Matrix mNew = new Matrix(m.getM(), m.getN());
        for (int i = 0; i < mNew.getUserMatrix().length; i++) {
            for (int j = 0; j < mNew.getUserMatrix()[i].length; j++) {
                mNew.getUserMatrix()[i][j] = userMatrix[i][j] - m.getUserMatrix()[i][j];
            }
        }
        return mNew;
    }

    //Умножение матриц на число
    public Matrix matrixMultiplicationNumber(int number) {
        Matrix mNew = new Matrix(this.m, this.n);
        for (int i = 0; i < mNew.getUserMatrix().length; i++) {
            for (int j = 0; j < mNew.getUserMatrix()[i].length; j++) {
                mNew.getUserMatrix()[i][j] = userMatrix[i][j] * number;
            }
        }
        return mNew;
    }

    //Умножение матриц только если число столбцов матрицы A равно числу строк B
    public Matrix matrixMultiplication(Matrix m) {
        Matrix mNew = new Matrix(m.getM(), m.getN());
        for (int i = 0; i < userMatrix.length; i++) {
            for (int j = 0; j < m.getUserMatrix()[0].length; j++) {
                for (int n = 0; n < m.getUserMatrix().length; n++) {
                    mNew.getUserMatrix()[i][j] += userMatrix[i][n] * m.getUserMatrix()[n][j];
                }
            }
        }
        return mNew;
    }

    //Возведение матрицы в степень
    public Matrix matrixSquaring(int step) {
        int[][] m1 = new int[this.m][this.n];
        int[][] m2 = new int[this.m][this.n];
        Matrix mNew = new Matrix(this.m, this.n);
        for (int x = 0; x < userMatrix.length; x++) {
            for (int y = 0; y < userMatrix[0].length; y++) {
                m1[x][y] = userMatrix[x][y];
                m2[x][y] = userMatrix[x][y];
            }
        }
        for (int k = 2; k <= step; k++) {
            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m2[0].length; j++) {
                    for (int n = 0; n < m2.length; n++) {
                        mNew.getUserMatrix()[i][j] += m1[i][n] * m2[n][j];
                    }
                }
            }
            // копирование массива
            if (k != step) {
                for (int x = 0; x < m1.length; x++) {
                    for (int y = 0; y < m1[0].length; y++) {
                        m1[x][y] = mNew.getUserMatrix()[x][y];
                        mNew.getUserMatrix()[x][y] = 0;
                    }
                }
            }
        }
        return mNew;
    }

    //Вычисление определителя 2x2 или 3х3 ограничимся двумя размерностями
    public int matrixDeterminant() {
        int result;
        if (getM() == 2 & getN() == 2) {

            result = userMatrix[0][0] * userMatrix[1][1] - userMatrix[0][1] * userMatrix[1][0];

        } else if (getM() == 3 & getN() == 3) {
            result = userMatrix[0][0] * userMatrix[1][1] * userMatrix[2][2] +
                    userMatrix[0][1] * userMatrix[1][2] * userMatrix[2][0] +
                    userMatrix[0][2] * userMatrix[1][0] * userMatrix[2][1] -
                    (userMatrix[2][0] * userMatrix[1][1] * userMatrix[0][2] +
                            userMatrix[2][1] * userMatrix[1][2] * userMatrix[0][0] +
                            userMatrix[2][2] * userMatrix[1][0] * userMatrix[0][1]);
        } else {
            return 0;
        }
        return result;
    }

    //9. метод возврата размерностей матриц (геттеры размерности)
    public int getM() {
        return m;
    }
    //9. метод возврата размерностей матриц (геттеры размерности)
    public int getN() {
        return n;
    }

    public int[][] getUserMatrix() {
        return userMatrix;
    }

    //8. Печать элементов матриц в консоль (форматированный вывод)
    public void matrixPrint() {
        for (int[] matrix : userMatrix) {
            for (int i : matrix) {
                System.out.printf("%6d ", i);
            }
            System.out.println();
        }
    }
}