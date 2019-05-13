package Task3.Exercise2;

import java.util.Scanner;

public class Sixth {

public static void main(String[] args) {

    int number;
    System.out.println("Enter the number...");
    Scanner scanner = new Scanner(System.in);

    number=scanner.nextInt();

    searching(number);
}

private static void searching(int number){
     int count= 0;
     int[] digits = new int[10];

     while(number!=0){
         digits[number%10]++;
         number/=10;
     }

     for(int i=0;i<10;i++){
         if(digits[i]>0){
             count++;
         }
     }
     System.out.println(count);
    }
}

