package task_5;
// Задание 1.
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
//  что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook{
     // Вносим кортакты в лист(массив)
       public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    //  Список контактов (вывод)
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Иванов С.В.", 123, bookPhone);
        addNumber("Иванов Е.", 234, bookPhone);
        addNumber("Петров П.", 546, bookPhone);
        addNumber("Сидоров Н", 477, bookPhone);
        addNumber("Иванов С.В.", 233, bookPhone);
        addNumber("Петрова О.Л", 787, bookPhone);
        addNumber("Петрова О.Л", 788,bookPhone );
        printBook(bookPhone);
       }
}

