package javahw.hw3;

import java.util.Random;

public class hw3task2 {
    public static void main(String[] args) {
        System.out.println("Дан список рандомных чисел : ");
        Random rd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Он без четных чисел: ");
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0) {
                System.out.print(arr[j] + " ");
            }
        }
    }
}
