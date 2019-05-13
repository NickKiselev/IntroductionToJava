package Task3;

import java.util.Scanner;

public class Exercise3 {
public static void main(String[] args) {

    int number;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number...");

    number=scanner.nextInt();

    System.out.println("Is this number perfect? "+checking(number));
}

private static boolean checking(int number){
    int sum=0;

    for(int i=1;i<number;i++){
            if(number%i==0){
            sum+=i;
        }
    }

        return number == sum;
}
}
