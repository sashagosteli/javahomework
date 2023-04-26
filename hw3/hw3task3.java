package javahw.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class hw3task3 {
    public static void main(String[] args) {
        // Задан целочисленный список ArrayList.
        // Найти минимальное, максимальное и среднее
        // из этого списка.
        Random rd = new Random();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(rd.nextInt(10));
        }
        System.out.println(arr);
        System.out.print("Минимальное число из списка = ");
        System.out.println(Collections.min(arr));
        System.out.print("Максимальное число из списка = ");
        System.out.println(Collections.max(arr));
        System.out.print("Среднее число списка = ");
        System.out.println(getAverage(arr));

    }

    private static double getAverage(List<Integer> list) {
        return list.stream()
                .mapToInt(a -> a)
                .average().orElse(0);
    }
}
