package Task1;

import java.util.Scanner;

public class Exercise6 {

public static void main(String[] args) {

    int num;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите семизачное число ");

    num=scanner.nextInt();

    String reverse = new StringBuffer(Integer.toString(num)).reverse().toString();
    System.out.println(reverse);
}
}
