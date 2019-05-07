package Task1;

import java.util.Scanner;

public class Exercise6 {

public static void main(String[] args) {

    //exampleOne();
    exampleTwo();
}

private static void exampleOne(){
    int num,revnum=0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter seven-digit number ");
    num=scanner.nextInt();

    for(int i=0;i<7;i++){
        revnum=revnum*10+num%10;
        num/=10;
    }
    System.out.println(revnum);
}

private static void exampleTwo(){

    int num,revnum=0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter seven-digit number ");
    num=scanner.nextInt();
    revnum=revnum+(num%10)*1000000;
    revnum=revnum+(num/10%10)*100000;
    revnum=revnum+(num/100%10)*10000;
    revnum=revnum+(num/1000%10)*1000;
    revnum=revnum+(num/10000%10)*100;
    revnum=revnum+(num%10)*10;
    revnum=revnum+(num/1000000%10);
    System.out.println(revnum);
}
}
