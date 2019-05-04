package Task1;

import java.util.Scanner;

public class Exercise2 {


public static void main(String[] args) {

    double weightKG;

    System.out.println("Введите массу динозавра в КГ: " );

    Scanner scanner = new Scanner(System.in);

    weightKG=scanner.nextDouble();

    transfer(weightKG);


}

public static void transfer(double weightKG){

    System.out.println("Вес динозавра в миллиграммах равен "+ weightKG*Math.pow(10,6));

    System.out.println("Вес динозавра в тоннах равен "+ weightKG/Math.pow(10,3));

    System.out.println("Вес динозавра в граммах равен "+ weightKG*Math.pow(10,3));

}

}
