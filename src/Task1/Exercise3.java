package Task1;

import java.util.Scanner;

public class Exercise3 {
public static void main(String[] args) {

    double R1,R2;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите радиус R1 ");

    while (scanner.hasNext()){

        R1=scanner.nextDouble();
        System.out.println("Введите радиус R2 ");
        R2=scanner.nextDouble();

        if(R2>R1){
            System.out.println("Ошибка. R2 должен быть меньше R1");
            break;
        }else{
            System.out.println("Площадь кольца равна " + ringSquare(R1,R2));
            break;
        }

    }
}

private static double ringSquare(double R1, double R2){
    double S=Math.PI*(Math.pow(R1,2)-Math.pow(R2,2));

return S;
}
}
