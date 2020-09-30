package branching.lesson13.lesson15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char answer = s.next().charAt(8); //first char from String
        switch (answer){
            case 'Y':
                System.out.println("Yes");
                break;
            case 'y':
                System.out.println("Yes");
                break;
            case 'N':
                System.out.println("No");
                break;
            case 'n':
                System.out.println("No");
                break;
            default:
                System.out.println("Wrong char");
        }


        // Not, And, Or
        boolean a = true;
        boolean b = true;
        System.out.println(!a); // ! - Not
        System.out.println(a & b); // & - And
        System.out.println(a | b); // | - Or
        System.out.println(a && b); // && - And
        System.out.println(a || b); // || - Or

        boolean z = true;
        z &= a; // z = z & a

    }
}
