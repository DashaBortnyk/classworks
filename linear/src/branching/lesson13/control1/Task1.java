package branching.lesson13.control1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите значение х: ");
        int x = s.nextInt();

        if (x<=2){
            System.out.println("y = " + x);
        }else if(x>2){
            System.out.println("y = 2");
        }
    }
}
