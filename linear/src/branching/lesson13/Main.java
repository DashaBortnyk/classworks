package branching.lesson13;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x=8);  // приравнение
        System.out.println(x==8); // сравнение

        int y = 20;
        boolean c = x < y;
        System.out.println(c);

        int cash = -6;
            if (cash < 0){
                System.out.println("cash is negative");
            }
        if (cash < 0){
            System.out.println("cash is negative");
        }
        else{
            System.out.println("cash is positive");
        }


        int price = 100;
        int money = 1000;
        boolean isOpen = true;
        if(isOpen){
            if(price <= money){
                System.out.println("Can buy");
            }
            else{
                System.out.println("Can't buy");
            }
        }
        else{
            System.out.println("Shop is closed");
        }

        int m = 4;
        System.out.println("Value is");
    }
}
