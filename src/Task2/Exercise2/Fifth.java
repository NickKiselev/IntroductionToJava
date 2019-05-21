package Task2.Exercise2;

import java.util.Scanner;

public class Fifth {

public static void main(String[] args) {

    int a,b;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Inter number a = ");
    a=scanner.nextInt();
    System.out.print("Inter number b = ");
    b=scanner.nextInt();

    System.out.println("The greatest common divisor a and b is " + searchingGcd(a,b));
    System.out.println("The least common multiple a and b is " + searchingLcm(a,b));
}

private static int searchingLcm(int a, int b){
    return a*b/searchingGcd(a,b);
}

private static int searchingGcd(int a, int b){
    while(a!=0 && b!=0){
        if(a>=b){
            a%=b;
        }else {
            b%=a;
        }
    }

    if(a==0){
        return b;
    }else {
        return a;
    }
}
}
