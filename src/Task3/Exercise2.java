package Task3;

import java.util.Scanner;

public class Exercise2 {
public static void main(String[] args) {

    int range;

    Matrix matrix = new Matrix(2,2);

    Scanner scanner = new Scanner(System.in);

    System.out.println("ENTER THE RANGE OF VALUES...");

    range=scanner.nextInt();

    matrix.generateArray(matrix.getArray(), range);

    matrix.showArray(matrix.getArray());

    System.out.println("The arithmetic average of this array is " + average(matrix.getArray()));
    System.out.println("The geometric average of this array is " + geometric(matrix.getArray()));
}

private static int searchingSum(int[][] array){

    int sum = 0;
    int tmp = array.length;

    for(int i = 0; i < tmp; i++){
        for (int j = 0; j < tmp; j++){
            sum+=array[i][j];
        }
    }

    return sum;
}

private static double searchingMul(int[][] array){

    double mul = 1;
    int tmp = array.length;

    for(int i = 0; i < tmp; i++){
        for (int j = 0; j < tmp; j++){
            mul*=array[i][j];
        }
    }

    return mul;
}

private static int average(int[][] array){

    int amount = array.length*array.length;

    return searchingSum(array)/amount;
}

private static double geometric(int[][] array){
    double size = array.length*array.length;

    return (int)Math.pow(searchingMul(array), 1.0/size);
}
}
