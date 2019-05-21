package Task3;

import java.util.Scanner;

public class Exercise3 {
public static void main(String[] args) {

    int range;

    Matrix matrix = new Matrix(5,5);

    Scanner scanner = new Scanner(System.in);

    System.out.println("ENTER THE RANGE OF VALUES...");

    range = scanner.nextInt();

    matrix.generateArray(matrix.getArray(),range);

    matrix.showArray(matrix.getArray());

    outputMinimum(searchLocalMin(matrix));
    outputMaximum(searchLocalMax(matrix));
}

private static void outputMinimum(int[] arr){
    System.out.println("Local minimum is at index ["+ arr[0] + "][" + arr[1]+ "]");
}

private static void outputMaximum(int[] arr){
    System.out.println("Local maximum is at index ["+ arr[0] + "][" + arr[1]+ "]");
}

private static boolean isMinimum(Matrix array, int i, int j){
    boolean minimum = false;
    int length = array.getArray().length;

    if(i > 0 && i < length-1 && j > 0 && j < length-1){
        minimum = isUpperLeftMin(array, i, j) && isLowerLeftMin(array, i, j) && isUpperRightMin(array, i, j) && isLowerRightMin(array, i, j);
    }

    if(i == 0 && j == 0){
        minimum = isUpperLeftMin(array, i, j);
    }

    if(i == length-1 && j == 0){
        minimum = isLowerLeftMin(array, i, j);
    }

    if(i == length-1 && j == length-1){
        minimum = isLowerRightMin(array, i, j);
    }

    if(i == 0 && j == length-1){
        minimum = isUpperRightMin(array, i, j);
    }

    if(i == 0 && j > 0 && j < length-1){
        minimum = isUpperRightMin(array, i, j) && isUpperLeftMin(array, i, j);
    }

    if(i == length-1 && j > 0 && j < length-1){
        minimum = isLowerRightMin(array, i, j) && isLowerLeftMin(array, i, j);
    }

    if(j == 0 && i > 0 && i < length-1){
        minimum = isLowerLeftMin(array, i, j) && isUpperLeftMin(array, i, j);
    }

    if(j == length-1 && i > 0 && i < length-1){
        minimum = isUpperRightMin(array, i, j) && isLowerRightMin(array, i, j);
    }

    return minimum;
}

private static boolean isMaximum(Matrix array, int i, int j){
    boolean maximum = false;
    int length = array.getArray().length;

    if(i > 0 && i < length-1 && j > 0 && j < length-1){
        maximum = isUpperLeftMax(array, i, j) && isLowerLeftMax(array, i, j) && isUpperRightMax(array, i, j) && isLowerRightMax(array, i, j);
    }

    if(i == 0 && j == 0){
        maximum = isUpperLeftMax(array, i, j);
    }

    if(i == length-1 && j == 0){
        maximum = isLowerLeftMax(array, i, j);
    }

    if(i == length-1 && j == length-1){
        maximum = isLowerRightMax(array, i, j);
    }

    if(i == 0 && j == length-1){
        maximum = isUpperRightMax(array, i, j);
    }

    if(i == 0 && j > 0 && j < length-1){
        maximum = isUpperRightMax(array, i, j) && isUpperLeftMax(array, i, j);
    }

    if(i == length-1 && j > 0 && j < length-1){
        maximum = isLowerRightMax(array, i, j) && isLowerLeftMax(array, i, j);
    }

    if(j == 0 && i > 0 && i < length-1){
        maximum = isLowerLeftMax(array, i, j) && isUpperLeftMax(array, i, j);
    }

    if(j == length-1 && i > 0 && i < length-1){
        maximum = isUpperRightMax(array, i, j) && isLowerRightMax(array, i, j);
    }

    return maximum;
}

private static int[] searchLocalMax(Matrix array){
    int length = array.getArray().length;
    int[] index = {-1,-1};

    for(int i = 0; i < length; i++){
        for(int j = 0; j < length; j++){
            if(isMaximum(array, i, j)){
                index[0] = i;
                index[1] = j;
                return index;
            }
        }
    }
    return index;
}

private static int[] searchLocalMin(Matrix array){
    int length = array.getArray().length;
    int[] index = {-1,-1};

    for(int i = 0; i < length; i++){
        for(int j = 0; j < length; j++){
            if(isMinimum(array, i, j)){
                index[0] = i;
                index[1] = j;
                return index;
            }
        }
    }
    return index;
}

private static boolean isUpperLeftMin(Matrix array, int i, int j){
    boolean minimum = false;

    if(array.getArrayElement(i,j) < array.getArrayElement(i+1,j)
            && array.getArrayElement(i,j) < array.getArrayElement(i+1,j+1)
            && array.getArrayElement(i,j) < array.getArrayElement(i,j+1)){
        minimum = true;
    }
    return minimum;
}

private static boolean isLowerLeftMin(Matrix array, int i, int j){
    boolean minimum = false;

    if(array.getArrayElement(i,j) < array.getArrayElement(i-1,j)
            && array.getArrayElement(i,j) < array.getArrayElement(i,j+1)
            && array.getArrayElement(i,j) < array.getArrayElement(i-1,j+1)){
        minimum = true;
    }
    return minimum;
}

private static boolean isUpperRightMin(Matrix array, int i, int j){
    boolean minimum = false;

    if(array.getArrayElement(i,j) < array.getArrayElement(i+1,j)
            && array.getArrayElement(i,j) < array.getArrayElement(i,j-1)
            && array.getArrayElement(i,j) < array.getArrayElement(i+1,j-1)){
        minimum = true;
    }
    return minimum;
}

private static boolean isLowerRightMin(Matrix array, int i, int j){
    boolean minimum = false;

    if(array.getArrayElement(i,j) < array.getArrayElement(i,j-1)
            && array.getArrayElement(i,j) < array.getArrayElement(i-1,j)
            && array.getArrayElement(i,j) < array.getArrayElement(i-1,j-1)){
        minimum = true;
    }
    return minimum;
}



private static boolean isUpperLeftMax(Matrix array, int i, int j){
    boolean minimum = false;

    if(array.getArrayElement(i,j) > array.getArrayElement(i+1,j)
            && array.getArrayElement(i,j) > array.getArrayElement(i+1,j+1)
            && array.getArrayElement(i,j) > array.getArrayElement(i,j+1)){
        minimum = true;
    }
    return minimum;
}

private static boolean isLowerLeftMax(Matrix array, int i, int j){
    boolean minimum = false;

    if(array.getArrayElement(i,j) > array.getArrayElement(i-1,j)
            && array.getArrayElement(i,j) > array.getArrayElement(i,j+1)
            && array.getArrayElement(i,j) > array.getArrayElement(i-1,j+1)){
        minimum = true;
    }
    return minimum;
}

private static boolean isUpperRightMax(Matrix array, int i, int j){
    boolean minimum = false;

    if(array.getArrayElement(i,j) > array.getArrayElement(i+1,j)
            && array.getArrayElement(i,j) > array.getArrayElement(i,j-1)
            && array.getArrayElement(i,j) > array.getArrayElement(i+1,j-1)){
        minimum = true;
    }
    return minimum;
}

private static boolean isLowerRightMax(Matrix array, int i, int j){
    boolean minimum = false;

    if(array.getArrayElement(i,j) > array.getArrayElement(i,j-1)
            && array.getArrayElement(i,j) > array.getArrayElement(i-1,j)
            && array.getArrayElement(i,j) > array.getArrayElement(i-1,j-1)){
        minimum = true;
    }
    return minimum;
}
}
