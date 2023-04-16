//Вывести все простые числа от 1 до 1000
package javahw1.hw1;

public class javahw1task2 {
    public static void main(String[] args) {
        getArrayOfPrimeNumbers(1000);
    }

    public static void getArrayOfPrimeNumbers(int n) {

        for (int i = 1; i <= n; i++) {
            boolean isPrime = true;// флаг
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++) {

                if ((i % j) == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime && i != 1) {
                System.out.print(i + " ");
            }
        }

    }
}
