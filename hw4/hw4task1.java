package javahw.hw4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class hw4task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            list1.add(rd.nextInt(10));
        }
        System.out.println(list1 + "Созданный список");
        System.out.println();
        // Легкий вариант%
        // Collections.reverse(list1);
        // System.out.println(list1);

        // Реализованный метод

        for (int i = 0; i < list1.size() / 2; i++) {
            Integer temp = list1.get(i);
            list1.set(i, list1.get(list1.size() - i - 1));
            list1.set(list1.size() - i - 1, temp);
        }

        System.out.println(list1 + "Развернутый список");
    }

}
