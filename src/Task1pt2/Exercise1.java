package Task1pt2;

import java.util.Scanner;

public class Exercise1 {
public static void main(String[] args) {

    int xA,yA,xB,yB,xC,yC;

    double ab,ac,bc,abSq,acSq,bcSq;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter coordinates x1,y1, x2,y2, x3,y3");

    xA=scanner.nextInt();
    yA=scanner.nextInt();

    xB=scanner.nextInt();
    yB=scanner.nextInt();

    xC=scanner.nextInt();
    yC=scanner.nextInt();

    ab=Math.pow(((xB-xA)*(xB-xA))+((yB-yA)*(yB-yA)),1.0/2);
    ac=Math.pow(((xC-xA)*(xC-xA))+((yC-yA)*(yC-yA)),1.0/2);
    bc=Math.pow(((xC-xB)*(xC-xB))+((yC-yB)*(yC-yB)),1.0/2);

    abSq=ab*ab;
    acSq=ac*ac;
    bcSq=bc*bc;

    if(((acSq+bcSq)==abSq) || ((abSq+acSq)==bcSq)||((abSq+bcSq)==acSq)){
        System.out.println("Triangle is rectangular ");
    }else{
        System.out.print("Triangle isn't rectangular");
    }

}



}
