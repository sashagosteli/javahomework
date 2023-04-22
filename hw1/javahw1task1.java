// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)

package javahw.hw1;

public class javahw1task1 {
    public static void main(String[] args) {

        Factorial(9);
    }

    public static void Factorial(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = i * sum;

        }
        System.out.println("Произведение чисел от 1 до " + n + " равно >>> " + sum);
    }
}
