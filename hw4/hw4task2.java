package javahw.hw4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class hw4task2 {
    public static void main(String[] args) {
        // Реализуйте очередь с помощью LinkedList со следующими методами:
        // • enqueue() — помещает элемент в конец очереди

        Queue<Integer> list1 = new LinkedList<>();
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            list1.add(rd.nextInt(10));
        }
        System.out.println(list1);
        Scanner iScanner = new Scanner(System.in);
        System.out.println("какое число Вы хотите поставить в конец очереди ? ");
        int num = iScanner.nextInt();
        list1.add(num);
        System.out.println(list1);
        iScanner.close();

        // dequeue() — возвращает первый элемент из очереди и удаляет его

        int frontdelete = list1.remove();
        System.out.println("Удаляемый элемент: " + frontdelete);
        System.out.println("Оставшийся список без первого элемента: ");
        System.out.println(list1);
        System.out.println();

        // first() — возвращает первый элемент из очереди, не удаляя.
        int front = list1.peek();
        System.out.println("Первый элемент теперь: " + front);
        System.out.println("Неизмененный после список: ");
        System.out.println(list1);

    }
}
