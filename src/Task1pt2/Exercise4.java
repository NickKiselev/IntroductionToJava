package Task1pt2;

import java.util.Scanner;

public class Exercise4 {

public static void main(String[] args) {

    int day,month,year;
    String date;
    int[] monthsOfBasicYear = {31,28,31,30,31,30,31,31,30,31,30,31};
    int[] monthsOfLeapYear = {31,29,31,30,31,30,31,31,30,31,30,31};

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter in format day,month,year: ");

    date=scanner.nextLine();

    day = Integer.valueOf(date.split(" ")[0]);

    month = Integer.valueOf(date.split(" ")[1])-1;

    year = Integer.valueOf(date.split(" ")[2]);

    if(checkLeapYear(year)){
        if(monthsOfLeapYear[month]>=day+1){
            System.out.println((day+1) + " " + (month+1) + " " + year);
        }else if(month+1<12){
            System.out.println("01 " + (month+2) + " " + year);
        }else {
            System.out.println("01 01 " + (year+1));
        }
    }else{
        if(monthsOfBasicYear[month]>=day+1){
            System.out.println((day+1) + " " + (month+1) + " " + year);
        }else if(month+1<12){
            System.out.println("01 " + (month+2) + " " + year);
        }else System.out.println("01 01 " + (year + 1));
    }
}

private static boolean checkLeapYear(int year){

    if(((year%4==0) && (year%100!=0)) || (year%400==0)){
        return true;
    }
    return false;
}
}
