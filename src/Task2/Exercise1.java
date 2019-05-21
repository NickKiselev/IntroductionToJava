package Task2;

import java.util.Random;

public class Exercise1 {

public static void main(String[] args) {

    System.out.println("throws up a coin 1000 times...");
    trowCoin();
}

private static void trowCoin(){
    int headsCount=0;
    int tailsCount=0;
    Random random = new Random();
    int randomNumber;
    for(int i=1;i<=1000;i++){
        randomNumber= random.nextInt(2);

        if(randomNumber==0){
            headsCount++;
        }else if(randomNumber==1){
            tailsCount++;
        }
    }
    System.out.println("heads fell " + headsCount + " times \ntails fell " + tailsCount + " times");
}
}
