package Task3;

import java.util.Random;

class Matrix {

private int[][] array;

Matrix(int m, int n) {

    array = new int[m][n];
}

void generateArray(int[][] array, int param) {

    Random random = new Random();

    int tmp = array.length;

    for (int i = 0; i < tmp; i++) {
        for (int j = 0; j < tmp; j++) {
            array[i][j] = random.nextInt(param) + 1;
        }
    }
}

void showArray(int[][] array) {

    int length = array.length;

    for (int i = 0; i < length; i++) {
        for (int j = 0; j < length; j++) {
            System.out.printf("%4d", array[i][j]);
        }
        System.out.println();
    }
    System.out.println();
}

int[][] getArray() {
    return array;
}

int getArrayElement(int i, int j) {
    return array[i][j];
}
}
