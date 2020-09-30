package branching.lesson13.lesson17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int xA, xB, xC, xD, yA, yB, yC, yD;
        System.out.println("Input coordinates A: ");
        xA = s.nextInt();
        yA = s.nextInt();

        System.out.println("Input coordinates B: ");
        xB = s.nextInt();
        yB = s.nextInt();

        System.out.println("Input coordinates C: ");
        xC = s.nextInt();
        yC = s.nextInt();

        System.out.println("Input coordinates D: ");
        xD = s.nextInt();
        yD = s.nextInt();

        if(xB<xC | yB<yC | xD<xA | yD<yA){
            System.out.println("Пересечения нет");
        }
        if((xB==xC & yB==yC) | (xC==xB & yA==yD) | (yA==yD & xA==xD) | (xA==xD & yC==yB)){
            System.out.println("Пересечение в точке");
        }
    }
}
