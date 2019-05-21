package Task2;

import java.util.Scanner;

public class Exercise4 {

public static void main(String[] args) {

    int x, y;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter interval x and y...");

    x = scanner.nextInt();
    y = scanner.nextInt();

    System.out.println("Friendly numbers in this interval is ");
    searchFriendlyNum(x,y);
}

private static int sum(int num){
    int sum=0;
    for(int i=1;i<=(num/2);i++){
        if(num%i==0){
            sum+=i;
        }
    }
    return sum;
}

private static void searchFriendlyNum(int x, int y){
    int count=0;
    int sumOfDevFirst,sumOfDevSecond;

    for(int i=x;i<y;i++){
        sumOfDevFirst = sum(i);
        sumOfDevSecond = sum(sumOfDevFirst);

        if(sumOfDevFirst<y && sumOfDevSecond==i){
            System.out.println(i);
            count++;
        }
    }
}
}

