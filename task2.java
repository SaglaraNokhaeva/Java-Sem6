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



//другой вариант решения
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Random;
// import java.util.Set;

// public class task2 {
//     public static void main(String[] args) {

//         // Integer [] array = new Integer[1000];
//         // array = fillArray ();

//         System.out.println(UnicPc(fillArray()));

//     }

//     public static Integer[] fillArray() {

//         Random rnd = new Random();
//         Integer[] array = new Integer[1000];

//         for (int i = 0; i < 1000; i++) {
//             array[i] = rnd.nextInt(0, 25);
//         }

//         return array;
//     }

//     public static float UnicPc(Integer[] array) {
//         float result = 0;

//         Set<Integer> setArray = new HashSet<Integer>(Arrays.asList(array));
//         result = setArray.size() * 100 / (float) 1000;

//         return result;
//     }

// }
