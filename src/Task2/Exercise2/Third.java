package Task2.Exercise2;

import java.util.Scanner;

public class Third {
public static void main(String[] args) {

    int number;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Inter number...");
    number=scanner.nextInt();
    isPrimeNumber(number);
}

private static void isPrimeNumber(int number){
    if(number>1){
        if(number%2!=0 || number==2){
            System.out.println("This number is prime");
        }else {
            System.out.println("This number isn't prime");
        }
    }
}
}
