package Task3;

import java.util.Scanner;

public class Exercise1 {
public static void main(String[] args) {

    int range;

    Matrix matrix = new Matrix(5,5);

    Scanner scanner = new Scanner(System.in);

    System.out.println("ENTER THE RANGE OF VALUES...");

    range = scanner.nextInt();

    matrix.generateArray(matrix.getArray(),range);

    matrix.showArray(matrix.getArray());

    findMaxMin(matrix.getArray());
}

private static void findMaxMin(int[][] array){

    int tmp = array.length;
    int max = array[0][0];
    int min = array[0][0];

    for(int i = 0; i < tmp; i++){

        for (int j = 0; j < tmp; j++){

            if(array[i][j] > max) {
                max = array[i][j];
            }
            if(array[i][j] < min){
                min=array[i][j];
            }
        }
    }
    showMaxMinValues(max, min);
}

private static void showMaxMinValues(int max, int min){

    System.out.println("Maximum array element is " + max);
    System.out.println("Minimum array element is " + min);
}
}
