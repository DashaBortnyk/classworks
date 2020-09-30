package branching.lesson13.control1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите двухзначное число: ");
        int number = s.nextInt();

        int number1 = number/10;
        int number2 = number%10;
        int a = (number1 + number2)/3;
        if ( a != 0){
            System.out.println(number+" не кратное 3");
        }else{
            System.out.println(number+" кратное 3");
        }

    }
}
