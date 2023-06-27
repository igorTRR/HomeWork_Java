package task_1;

 
import java.util.Scanner;

public class Triangular_Num {
    static int Sum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i + 1;
        }
        return sum;
    }

    static int Fact(int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= i + 1;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 0;
        System.out.printf("Введите число n: ");
        if (!scn.hasNextInt()) {
            System.out.println("ошибка ввода!");
        } else {
            n = scn.nextInt();
            if (n < 1)
                System.out.println("Это отрицательное число!");
        
            else {
                System.out.printf("Сумма числа %d => %d%n ", n, Sum(n));
                System.out.println();
                System.out.printf("Факториал %d => %d%n ", n, Fact(n));
            }
        }
        scn.close();
    }
}    

