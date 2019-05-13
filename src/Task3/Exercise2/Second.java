package Task3.Exercise2;

import java.util.Scanner;

public class Second {

public static void main(String[] args) {
    int number;

    System.out.println("Enter palindrome number...");
    Scanner scanner = new Scanner(System.in);
    number=scanner.nextInt();

    if(isPal(number)){
        System.out.println("This number is palindrome");
    }else {
        System.out.println("This number isn't palindrome");
    }
}

private static boolean isPal(int number){
    int invertedNumber=0;
    int originNumber=number;

    while(number/1!=0){
        invertedNumber*=10;
        invertedNumber+=number%10;
        number/=10;
    }

    return invertedNumber==originNumber;
}
}
