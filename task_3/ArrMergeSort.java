package task_3;
//     Доп задача
// Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class ArrMergeSort {
    public static void main(String[] args) {
        int[] ar = { -2, 44, 0, 3, 65, 1, 99, 32 };
        int[] result = MergeSort(ar);
        
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(result));
    }

    public static int[] MergeSort(int[] ar) {
        int[] buffer1 = Arrays.copyOf(ar, ar.length);
        int[] buffer2 = new int[ar.length];
        int[] result = MergeSortInner(buffer1, buffer2, 0, ar.length);
        return result;
    }

    public static int[] MergeSortInner(int[] buffer1, int[] buffer2,
            int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = MergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = MergeSortInner(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}