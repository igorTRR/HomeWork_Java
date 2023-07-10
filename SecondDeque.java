// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SecondDeque {

    static int multD(Deque<String> arr) {
        int result = 0;
        String s;

        while (arr.size() != 0) {
            s = arr.pollFirst();
            if (!s.equals("-")) {
                result = result + 1 * (Integer.parseInt(s));

            } else {
                result *= -1;
            }
        }
        return result;
    }

    static public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result = new ArrayDeque<>();
        int carry = 0;
        while (!d1.isEmpty() || !d2.isEmpty()) {
            int sum = carry;
            if (!d1.isEmpty()) {
                sum += d1.removeFirst();
            }
            if (!d2.isEmpty()) {
                sum += d2.removeFirst();
            }
            result.addLast(sum % 10);
            carry = sum / 10;
        }
        if (carry != 0) {
            result.addLast(carry);
        }
        return result;
    }

    public static void main(String[] args) {

        // Создаем очереди
        Deque<String> d1 = new LinkedList<>(Arrays.asList("3", "1"));
        Deque<String> d2 = new LinkedList<>(Arrays.asList("5", "2"));
        Deque<String> d3 = new LinkedList<>(Arrays.asList("8", "7"));
        Deque<String> d4 = new LinkedList<>(Arrays.asList("4", "-2"));
        System.out.println();

        // Выводим исходные данные

        System.out.println("Deque Fest: " + d1 + ", " + d2);
        System.out.println("Deque Second : " + d3 + ", " + d4);
        System.out.println();

        // Преобразуем очереди в числа типа int и перемножаем числа:

        // Первая пара чисел
        int num_1 = multD(d1);
        int num_2 = multD(d2);
        int resalt = num_1 * num_2;
        System.out.printf("Multiply: %d * %d = %d\n ", num_1, num_2, resalt);
        System.out.println("--------------------------------------------------------------");
        int num_3 = multD(d3);
        int num_4 = multD(d4);
        int resalt_2 = num_3 + num_4;
        System.out.printf("Sum : %d + %d = %d\n ", num_3, num_4, resalt_2);

        // Запаковываем результаты в списки:
        System.out.println();

    }

}