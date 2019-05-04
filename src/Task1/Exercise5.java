package Task1;

import java.util.Scanner;

public class Exercise5 {

public static void main(String[] args) {
    double num;
    double[] array = new double[6];

    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите шестизначное число ");

    num = scanner.nextDouble();

    for(int i=5;i>=0;i--){
        array[i]=num%10;
        num/=10;
    }

    average(array);
    geometric(array);
}

private static void average(double[] array){
    double sum=0;
    for (double i:array){
        sum+=i;
    }
    System.out.println("Среднее арифметическое цифр числа равняется " + (int)(sum/array.length));
}

private static void geometric(double[] array){
    double composite=1;
    for(int i=0;i<array.length;i++){
        composite*=array[i];
    }

    System.out.println("Среднее геометрическое цифр числа равняется " + Math.pow(Math.E,Math.log(composite)/6.0));
}
}
