package javahw.hw2;

import java.lang.System.Logger.*;

import java.util.Arrays;
import java.util.logging.*;
import java.util.logging.SimpleFormatter;
import java.util.Scanner;

public class hw2task4 {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger(hw2task4.class.getName());

        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);

        logger.warning("ВЫ ИСПОЛЬЗУЕТЕ КАЛЬКУЛЯТОР");
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
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите 1 число : ");
        int a = iScanner.nextInt();

        System.out.print("Введите 2 число : ");
        int b = iScanner.nextInt();

        Scanner lineScanner = new Scanner(System.in);
        System.out.print("Введите символ : ");
        String c = lineScanner.nextLine();

        iScanner.close();
        lineScanner.close();
        CalcPrint(a, b, c);

    }

}
