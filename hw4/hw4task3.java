package javahw.hw4;

import java.lang.System.Logger;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;

public class hw4task3 {

    public static void main(String[] args) {

        CalcPrint();

    }

    public static void CalcPrint() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите 1 число : ");
        int a = iScanner.nextInt();

        System.out.print("Введите 2 число : ");
        int b = iScanner.nextInt();

        Scanner lineScanner = new Scanner(System.in);
        System.out.print("Введите символ : ");
        String c = lineScanner.nextLine();

        int res = 0;
        if (c.equals("*")) {
            res = a * b;
            System.out.println(a + " * " + b + " = " + res);
        } else if (c.equals("+")) {
            res = a + b;
            System.out.println(a + " + " + b + " = " + res);
        } else if (c.equals("-")) {
            res = a - b;
            System.out.println(a + " - " + b + " = " + res);
        } else if (c.equals("/")) {
            res = a / b;
            System.out.println(a + " / " + b + " = " + res);
        } else {
            System.out.println("Наш калькулятор умеет только делить, умножать, вычитать и складывать(/, *, -, +)");
        }
        int newRes = 0;
        System.out.print("Введите символ : ");
        String nextc = lineScanner.nextLine();
        System.out.print("Введите 2 число : ");
        int d = iScanner.nextInt();

        if (nextc.equals("*")) {
            newRes = res * d;
            System.out.println(res + " * " + d + " = " + newRes);
        } else if (nextc.equals("+")) {
            newRes = res + d;
            System.out.println(res + " + " + d + " = " + newRes);
        } else if (nextc.equals("-")) {
            newRes = res - d;
            System.out.println(res + " - " + d + " = " + newRes);
        } else if (nextc.equals("/")) {
            newRes = res / d;
            System.out.println(res + " / " + d + " = " + newRes);
        } else {
            System.out.println("Наш калькулятор умеет только делить, умножать, вычитать и складывать(/, *, -, +)");
        }

        System.out.println("Введите символ или 'remove' чтобы отменить последнюю операцию: ");
        nextc = lineScanner.nextLine();
        if (nextc.equals("remove")) {
            newRes = res;
            System.out.println("Предидущий результат = " + newRes);
            System.out.print("Введите символ : ");
            nextc = lineScanner.nextLine();
        }
        System.out.print("Введите 2 число : ");
        d = iScanner.nextInt();

        if (nextc.equals("*")) {
            newRes = res * d;
            System.out.println(res + " * " + d + " = " + newRes);
        } else if (nextc.equals("+")) {
            newRes = res + d;
            System.out.println(res + " + " + d + " = " + newRes);
        } else if (nextc.equals("-")) {
            newRes = res - d;
            System.out.println(res + " - " + d + " = " + newRes);
        } else if (nextc.equals("/")) {
            newRes = res / d;
            System.out.println(res + " / " + d + " = " + newRes);
        } else

            iScanner.close();
        lineScanner.close();

    }

}
