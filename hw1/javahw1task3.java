//Реализовать простой калькулятор
package javahw.hw1;

import java.util.Scanner;

public class javahw1task3 {
    public static void main(String[] args) {
        Calc();
    }

    public static void CalcPrint(int a, int b, String c) {

        if (c.equals("*")) {
            int res = a * b;
            System.out.println(a + " * " + b + " = " + res);
        } else if (c.equals("+")) {
            int res = a + b;
            System.out.println(a + " + " + b + " = " + res);
        } else if (c.equals("-")) {
            int res = a - b;
            System.out.println(a + " - " + b + " = " + res);
        } else if (c.equals("/")) {
            int res = a / b;
            System.out.println(a + " / " + b + " = " + res);
        } else {
            System.out.println("Наш калькулятор умеет только делить, умножать, вычитать и складывать(/, *, -, +)");
        }

    }

    public static void Calc() {
        Scanner calcScannerA = new Scanner(System.in);
        System.out.print("Введите 1 num : ");
        int a = calcScannerA.nextInt();

        Scanner calcScannerB = new Scanner(System.in);
        System.out.print("Введите 2 num : ");
        int b = calcScannerB.nextInt();

        Scanner calcScannerC = new Scanner(System.in);
        System.out.print("Введите symbol : ");
        String c = calcScannerC.nextLine();
        calcScannerA.close();
        calcScannerB.close();
        calcScannerC.close();
        CalcPrint(a, b, c);

    }

}
