package ru.t1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // 1) Дан список строк. Сформируйте такую версию списка, где не будет null, пустых строк и дубликатов.
        System.out.println("=== Задание 1 ===");
        List<String> list1 = Arrays.asList(null, "", "ABC", "ABC", "QQ");
        List<String> result1 = Function.first(list1);
        System.out.println("Вход: " + list1);
        System.out.println("Результат: " + result1);
        System.out.println("Ожидается: [ABC, QQ]");
        System.out.println();

        // 2) Дан список строк. Посчитайте количество разных букв во всех строках.
        System.out.println("=== Задание 2 ===");
        List<String> list2 = Arrays.asList("ABC", "CDE", "EE");
        long result2 = Function.second(list2);
        System.out.println("Вход: " + list2);
        System.out.println("Результат: " + result2);
        System.out.println("Ожидается: 5");
        System.out.println();

        // 3) Дан список строк. Верните самое длинное слово из списка.
        System.out.println("=== Задание 3 ===");
        List<String> list3 = Arrays.asList("ABC", "CDEF", "EE");
        String result3 = Function.three(list3);
        System.out.println("Вход: " + list3);
        System.out.println("Результат: " + result3);
        System.out.println("Ожидается: CDEF");
        System.out.println();

        // 4) Дан список чисел. Найдите в списке 3-е наибольшее число
        System.out.println("=== Задание 4 ===");
        List<Integer> list4 = Arrays.asList(5, 2, 10, 9, 4, 3, 10, 1, 13);
        Integer result4 = Function.four(list4);
        System.out.println("Вход: " + list4);
        System.out.println("Результат: " + result4);
        System.out.println("Ожидается: 10");
        System.out.println();

        // 5) Дан список объектов типа Сотрудник, получить список имен 3 самых старших инженеров
        System.out.println("=== Задание 5 ===");
        List<Employee> employees5 = Arrays.asList(
                new Employee("Анна", 30, "Инженер"),
                new Employee("Иван", 25, "Инженер"),
                new Employee("Петр", 35, "Инженер"),
                new Employee("Мария", 40, "Менеджер"),
                new Employee("Сергей", 45, "Инженер")
        );
        List<String> result5 = Function.five(employees5);
        System.out.println("Сотрудники: " + employees5);
        System.out.println("Результат: " + result5);
        System.out.println("Ожидается: [Сергей, Петр, Анна]");
        System.out.println();

        // 6) Дан список объектов типа Сотрудник, посчитайте средний возраст инженеров
        System.out.println("=== Задание 6 ===");
        List<Employee> employees6 = Arrays.asList(
                new Employee("Анна", 30, "Инженер"),
                new Employee("Иван", 25, "Инженер"),
                new Employee("Петр", 35, "Инженер")
        );
        Double result6 = Function.six(employees6);
        System.out.println("Сотрудники: " + employees6);
        System.out.println("Результат: " + result6);
        System.out.println("Ожидается: 30.0");
        System.out.println();

        // 7) Дана строка, получить Map по длине слов
        System.out.println("=== Задание 7 ===");
        String string7 = "Мама мыла Окно, окно было довольно";
        Map<Integer, List<String>> result7 = Function.seven(string7);
        System.out.println("Вход: " + string7);
        System.out.println("Результат: " + result7);
        System.out.println("Ожидается: {4=[мама, мыла, окно, было], 8=[довольно]}");
        System.out.println();

        // 8) Дан список строк-предложений, вернуть список самых длинных слов
        System.out.println("=== Задание 8 ===");
        List<String> list8 = Arrays.asList("Мама мыла Окно, окно было довольно", "кровать");
        List<String> result8 = Function.eight(list8);
        System.out.println("Вход: " + list8);
        System.out.println("Результат: " + result8);
        System.out.println("Ожидается: [довольно]");
        System.out.println();
    }
}