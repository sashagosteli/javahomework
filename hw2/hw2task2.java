package javahw.hw2;

import java.lang.System.Logger.*;

import java.util.Arrays;
import java.util.logging.*;
import java.util.logging.SimpleFormatter;

public class hw2task2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Реализуйте алгоритм сортировки пузырьком числового массива,
        // результат после каждой итерации запишите в лог-файл

        int[] mas = { 11, 3, 1, 16, 7 };

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
            Logger logger = Logger.getLogger(hw2task2.class.getName());
            // logger.setLevel(Level.INFO);
            ConsoleHandler ch = new ConsoleHandler();
            logger.addHandler(ch);
            SimpleFormatter sFormat = new SimpleFormatter();
            ch.setFormatter(sFormat);

            logger.info(Arrays.toString(mas));

            // /// запись в файл не получилось правильно написать путь к файлу на маке в
            // vscode, делала как и у вас на семинаре вроде бы

            // Logger logger = Logger.getLogger(hw2task2.class.getName());
            // // logger.setLevel(Level.INFO);
            // FileHandler fh = new FileHandler("hw2/logger.log");
            // logger.addHandler(fh);
            // SimpleFormatter sFormat = new SimpleFormatter();
            // fh.setFormatter(sFormat);

            // logger.info(Arrays.toString(mas));
        }
    }

}
