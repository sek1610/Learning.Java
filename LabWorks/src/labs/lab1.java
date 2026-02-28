package labs;
import java.util.Scanner;

public class lab1 {
   public static void main(String[] args) {

        System.out.println("Задание 1");
        text();
        System.out.println("===================");
        System.out.println("Задание 2");
        num();
        System.out.println("===================");
        System.out.println("Задание 3");
        result();
        System.out.println("===================");
        System.out.println("Задание 4");
        result2();
        System.out.println("===================");
        System.out.println("Задание 5");
        out();
        System.out.println("===================");
        System.out.println("Задание 6");
        func();
        System.out.println("===================");

    }

    public static void text() {

        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

    }

    public static void num() {

        System.out.println("(46+10)*(10/3)=" + (46+10)*(10/3));
        System.out.println("(29)*(4)*(-15)=" + (29)*(4)*(-15));

    }

    public static void result() {

        double result, number=10500;
        result=(number/10)/10;
        System.out.println("result=" + result);

    }

    public static void result2() {

        double result;
        result=3.6*4.1*5.9;
        System.out.println("result=" + result);

    }

    public static void out() {

        System.out.println("Введите числа");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }

    public static void func() {

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (b > 100){
            System.out.println("Выход за пределы диапазона");
        }else {
            if (b % 2 == 0) {
                System.out.println("Число четное");

            } else {
                System.out.println("Число нечетное");

            }

        }

    }
}
