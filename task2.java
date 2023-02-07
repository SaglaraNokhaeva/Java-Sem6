// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.

// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите 
// процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.

// Для вычисления процента используйте формулу:

// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = fillArray();
        System.out.println(percentUniq(arr));
    }

    public static ArrayList<Integer> fillArray() {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            nums.add(ThreadLocalRandom.current().nextInt(0, 25));
        }
        return nums;
    }

    public static Float percentUniq(ArrayList<Integer> nums) {
        Set<Integer> set = new HashSet<>(nums);
        return (set.size() * 100) / (float) nums.size();
    }
}
