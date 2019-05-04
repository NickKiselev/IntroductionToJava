package Task1;

import java.util.Scanner;

public class Exercise4 {

public static void main(String[] args) {

    int num;
    int[] array = new int[4];

    boolean increasing = false,decreasing=false;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите четырехзначное число ");
    num=scanner.nextInt();

    for(int i=3;i>=0;i--){
        array[i]=num%10;
        num/=10;
    }

    for(int i=1;i<array.length;i++){
        if(array[i]>array[i-1]){
            increasing=true;
        }else if(array[i]<=array[i-1]){
            increasing=false;
            break;
        }
    }

    for(int i=1;i<array.length;i++){
        if(array[i]<array[i-1]){
            decreasing=true;
        }else if(array[i]>=array[i-1]){
            decreasing=false;
            break;
        }
    }

    if(increasing){
        System.out.println("Цифры числа образуют возрастающую последовательность");
    }else if(decreasing){
        System.out.println("Цифры числа образуют убывающую последовательность");
    }else {
        System.out.println("Цифры числа не образуют никакой последовательности");
    }
}
}
