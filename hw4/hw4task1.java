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
        System.out.println(list1);
        System.out.println();

        Collections.reverse(list1);
        System.out.println(list1);

    }
}
