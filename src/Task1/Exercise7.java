package Task1;

public class Exercise7 {

public static void main(String[] args) {

    int x=10,y=5;

    System.out.println("Начальное значение x="+x+"\nНачальное значение y="+y);
    System.out.println("Меняем местами...");
    swap(x,y);

}

private static void swap(int x,int y){
    x=x*y;
    y=x/y;
    x=x/y;
    System.out.println("Теперь x="+x+"\nТеперь y="+y);
}
}
