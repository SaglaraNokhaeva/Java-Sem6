// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. 
// Распечатайте содержимое данного множества.

// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  
// Распечатайте содержимое данного множества.

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        // var nums = new HashSet<>(Arrays.asList(1, 200, 3, 2, 4000, 5, 6, 3));
        //ХэшСет хранит очередность в своем порядке
        Set <Integer> nums = new HashSet<>(Arrays.asList(1, 200, 3, 2, 4000, 5, 6, 3));
        System.out.println(nums);

        
        //ЛинкетСет сохраняет очередность ввода
        var LinkSet = new LinkedHashSet<>(Arrays.asList(1, 7, 200, 3, 6, 4, 5));
        System.out.println(LinkSet);
    }

}
