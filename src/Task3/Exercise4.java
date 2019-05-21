package Task3;

import java.util.Scanner;

public class Exercise4 {
public static void main(String[] args) {

    int range;

    Matrix matrix = new Matrix(5,5);

    Scanner scanner = new Scanner(System.in);

    System.out.println("ENTER THE RANGE OF VALUES...");

    range = scanner.nextInt();

    matrix.generateArray(matrix.getArray(),range);

    matrix.showArray(matrix.getArray());

    transposition(matrix.getArray(),matrix);
}

private static void transposition(int[][] array, Matrix matrix){
    int length = array.length;
    int tmp;

    for(int i = 0; i < length; i++){
        for (int j = i+1; j < length; j++){
            tmp = array[i][j];
            array[i][j] = array[j][i];
            array[j][i] = tmp;
        }
    }

    matrix.showArray(array);
}


}
