package Task1pt2;

import java.util.Scanner;

public class Exercise3 {
public static void main(String[] args) {
    sampleOne();
    //sampleTwo();
    //sampleThree();
    //sampleFour();
}

private static void sampleOne(){
    char letter;
    System.out.println("Enter a letter ");
    Scanner scanner = new Scanner(System.in);
    letter = scanner.nextLine().toLowerCase().charAt(0);

    switch (letter){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println( letter + " the vowel letter");
            break;
    }
}

private static void sampleTwo(){

    char letter;
    char[] vowelLetters = {'a','e','i','o','u'};
    System.out.println("Enter a letter ");
    Scanner scanner = new Scanner(System.in);
    letter=scanner.nextLine().toLowerCase().charAt(0);
    for(char c:vowelLetters){
        if(c==letter){
            System.out.println(letter + " the vowel letter");
        }else {
            System.out.println(letter+ " not vowel letter");
        }
    }
}

private static void sampleThree(){
    char letter;
    System.out.println("Enter a letter ");
    Scanner scanner = new Scanner(System.in);
    letter=scanner.nextLine().toLowerCase().charAt(0);

    if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
        System.out.println(letter+ " the vowel letter");
    }else{
        System.out.println(letter+ " not vowel letter");
    }
}

private static void sampleFour(){
    char letter;
    System.out.println("Enter a letter ");
    Scanner scanner = new Scanner(System.in);
    letter=scanner.nextLine().toLowerCase().charAt(0);

    if(letter==97 || letter==101 || letter==105 || letter==111 || letter==117){
        System.out.println(letter + " the vowel letter");
    }else {
        System.out.println(letter+ " not vowel letter");
    }
}
}
