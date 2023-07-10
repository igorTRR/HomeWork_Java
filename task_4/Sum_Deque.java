package task_4;

// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Sum_Deque {
    public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
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
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(4, 2, 1));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 3, -1));

        // Выводим исходные данные
        System.out.println("Deque пара: " + d1 + ", " + d2);

        System.out.println();
        ListDeq ld = new ListDeq();
        Deque<Integer> result = ld.sum(d1, d2);
        System.out.println("Sum: " + result);
        System.out.println();

    }
}
