package Task3.Exercise2;

import java.util.Scanner;

public class Fourth {

public static void main(String[] args) {

    int number;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Inter number...");
    number=scanner.nextInt();
    System.out.print("divisor of this number ");
    searchingDivisor(number);
}

private static void searchingDivisor(int number){
    for(int i=1;i<=number;i++){
        if(number%i==0){
           System.out.print(" "+i);
        }
    }
}
}
