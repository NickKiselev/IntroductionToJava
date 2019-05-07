package Task1;

import java.util.Scanner;

public class Exercise5 {

public static void main(String[] args) {

   //exampleOne();
    exampleTwo();
}

private static void exampleTwo(){

    int fullNum,num1,num2,num3,num4,num5,num6;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter six-digit number ");

    fullNum=scanner.nextInt();

    num1=fullNum/100000;
    num2=fullNum/10000%10;
    num3=fullNum/1000%10;
    num4=fullNum/100%10;
    num5=fullNum/10%10;
    num6=fullNum%10;

    double arithmeticalMean = (num1+num2+num3+num4+num5+num6)/6.0;
    double geometricAverage = Math.pow((num1*num2*num3*num4*num5*num6),1/6.0);
    System.out.println("Arithmetical mean " + arithmeticalMean);
    System.out.println("Geometric average " + geometricAverage);
}


private static void exampleOne(){

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
