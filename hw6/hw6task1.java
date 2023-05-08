package javahw.hw6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class hw6task1 {
    // Подумать над структурой класса Ноутбук для магазина техники —
    // выделить поля и методы. Реализовать в Java.
    // Создать множество ноутбуков.
    // Написать метод, который будет запрашивать у пользователя
    // критерий (или критерии) фильтрации и выведет ноутбуки,
    // отвечающие фильтру. Критерии фильтрации можно хранить в Map.
    // Например:
    // “Введите цифру, соответствующую необходимому критерию:
    // 1 - ОЗУ
    // 2 - Объём ЖД
    // 3 - Операционная система
    // 4 - Цвет …
    // Далее нужно запросить минимальные и максимальные значения для указанных
    // критериев — сохранить параметры фильтрации можно также в Map.
    // Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
    // условиям.
    public static void main(String[] args) {
        Laptop MacbookPro = new Laptop();
        MacbookPro.setColor("black");
        MacbookPro.setName("Macbook Pro");
        MacbookPro.setRam(96);
        MacbookPro.setMemory(320);
        // System.out.println(MacbookPro.getMemory());
        Laptop MacbookAir = new Laptop();
        MacbookAir.setName("MacbookAir");
        MacbookAir.setColor("silver");
        MacbookAir.setRam(69);
        MacbookAir.setMemory(160);
        Laptop HP = new Laptop();
        HP.setName("HP");
        HP.setColor("black");
        HP.setRam(80);
        HP.setMemory(320);
        HashSet laptopHashSet = new HashSet<>(Arrays.asList(MacbookPro.getName(), MacbookAir.getName(), HP.getName()));
        System.out.println("Множество ноутбуков : " + laptopHashSet);
        // System.out.println(Macbook.getName() + " " + Macbook.getColor());
        Laptop.productSelection();
    }
}

class Laptop {
    String name;
    Integer ram;
    String color;
    Integer memory;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getRam() {
        System.out.print("ram in GB: ");
        return ram;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Integer getMemory() {
        System.out.print("unified memory in GB: ");
        return memory;
    }

    public static void productSelection() {
        System.out.println("Введите цифру, по какому критерию отсортировать ноутбуки: ");
        System.out.println("1 - RAM");
        System.out.println("2 - Color");
        System.out.println("3 - memory");
        Scanner iScanner = new Scanner(System.in);
        int parameter = iScanner.nextInt();
        if (parameter == 1) {
            System.out.println("Введите цифру сколько оперативной памяти вам необходимо? ");
            System.out.println("1 - 96 GB");
            System.out.println("2 - 69 GB");
            System.out.println("3 - 80 GB");
            int ramchoise = iScanner.nextInt();
            if (ramchoise == 1) {
                System.out.println("Для Вас у нас есть замечательный компьютер MacbookPro с RAM GB 96");
            }
            if (ramchoise == 2) {
                System.out.println("Для Вас у нас есть замечательный компьютер MacbookAir с RAM GB 69");
            }
            if (ramchoise == 3) {
                System.out.println("Для Вас у нас есть замечательный компьютер HP с RAM GB 80");
            }

        }
        if (parameter == 2) {
            System.out.println("Введите цифру какой цвет ноутбука Вам бы хотелось? ");
            System.out.println("1 - silver (серебряный)");
            System.out.println("2 - black (черный)");
            int colorchoise = iScanner.nextInt();
            if (colorchoise == 1) {
                System.out.println("Для Вас у нас есть компьютер MacbookAir серебряного цвета");
            }
            if (colorchoise == 2) {
                System.out.println("Для Вас у нас есть на выбор два черных компьютера MacbookPro и HP");
            }

        }
        if (parameter == 3) {
            System.out.println("Введите цифру сколько памяти должен иметь ноутбук? ");
            System.out.println("1 - 160 GB");
            System.out.println("2 - 320 GB");

            int memorychoise = iScanner.nextInt();
            if (memorychoise == 1) {
                System.out.println("Для Вас у нас есть замечательный компьютер MacbookAir 160 GB");
            }
            if (memorychoise == 2) {
                System.out.println("Для Вас у нас есть два замечательных компьютера MacbookPro и HP 320 GB");
            }

        }

        else {
            System.out.println("Такого номера нет.");
        }
        iScanner.close();
    }

}
