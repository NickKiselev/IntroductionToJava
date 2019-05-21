package Task1pt2;

import java.util.Scanner;

public class Exercise2 {
public static void main(String[] args) {

    int dragonAge;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Inter dragon age " );

    dragonAge=scanner.nextInt();

    check(dragonAge);

}

private static void check(int dragonAge){
    if(dragonAge<=200){
        System.out.println("Today dragon is " + dragonAge + " years and he has " + (3+(dragonAge*3)) + " heads and " + ((3+(dragonAge*3))*2) + " eyes");
    }else if(dragonAge<=300){
        System.out.println("Today dragon is " + dragonAge + " years and he has " + ((dragonAge-200)*2 + 603) + " heads and " + (((dragonAge-200)*2 + 603)*2) + " eyes");
    }else if(dragonAge>300){
        System.out.println("Today dragon is " + dragonAge + " years and he has " + ((dragonAge-300) + 803) + " heads and " + (((dragonAge-300) + 803)*2) + " eyes");
    }
}
}
