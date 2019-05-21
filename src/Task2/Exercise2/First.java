package Task2.Exercise2;

import java.util.Scanner;

public class First {

public static void main(String[] args) {
    int number;
    System.out.println("Enter four-digit number...");
    Scanner scanner = new Scanner(System.in);
    number=scanner.nextInt();

    compare(number);
}

private static void compare(int number){
    int num1,num2,num3,num4;

    num1=(number/1000);
    num2=(number/100)%10;
    num3=(number/10)%10;
    num4=number%10;

    if(num1>num2 && num1>num3 && num1>num4){
        System.out.println("The biggest number is " + num1);
    }else if(num2>num1 && num2>num3 && num2>num4){
        System.out.println("The biggest number is " + num2);
    }else if(num3>num1 && num3>num2 && num3>num4){
        System.out.println("The biggest number is " + num3);
    }else if(num4>num1 && num4>num2 && num4>num3){
        System.out.println("The biggest number is " + num4);
    }else if(num1==num2 && num1>num3){
        System.out.println("The biggest number is " + num1);
    }else if(num1==num2 && num1<num3){
        System.out.println("The biggest number is " + num3);
    }

}
}
