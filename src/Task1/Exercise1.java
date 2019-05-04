package Task1;

import java.util.Scanner;

public class Exercise1 {

public static void main(String[] args) {

    int a,b,c;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите число a");
    a=scanner.nextInt();
    System.out.println("Введите число b");
    b=scanner.nextInt();
    System.out.println("Введите число c");
    c=scanner.nextInt();

    if(a==b & a==c & c==b){
        System.out.println("все числа a  b с одинаковы");
    }else if(a==c){
        System.out.println("числа a и c одинаковы");
    }else if(c==b){
        System.out.println("числа c и b одинаковы");
    }else if(a==b){
        System.out.println("числа a и b одинаковы");
    }
}


}
