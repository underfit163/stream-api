package ru.t1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Function {

    public static List<String> first(List<String> strings) {
        return strings.stream()
                .filter(s -> Objects.nonNull(s) && !s.isBlank())
                .distinct()
                .collect(Collectors.toList());
    }

    public static Long second(List<String> strings) {
        return strings.stream()
                .filter(Objects::nonNull)
                .flatMap(s -> s.chars().mapToObj(c -> (char) c))
                .distinct()
                .count();
    }

    public static String three(List<String> strings) {
        return strings.stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(String::length))
                .orElse("");
    }

    public static Integer four(List<Integer> numbers) {
        return numbers.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElse(0);
    }

    public static List<String> five(List<Employee> employees) {
        return employees.stream()
                .filter(Objects::nonNull)
                .filter(emp -> "Инженер".equals(emp.getPosition()))
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .map(Employee::getName)
                .limit(3)
                .collect(Collectors.toList());
    }

    public static Double six(List<Employee> employees) {
        return employees.stream()
                .filter(Objects::nonNull)
                .filter(emp -> "Инженер".equals(emp.getPosition()))
                .mapToInt(Employee::getAge)
                .average()
                .orElse(0.0);
    }

    public static Map<Integer, List<String>> seven(String string) {
        if (Objects.isNull(string)) return new HashMap<>();
        return Arrays.stream(string.split("[\\s\\p{Punct}]+"))
                .map(String::trim)
                .filter(word -> !word.isEmpty())
                .map(String::toLowerCase)
                .distinct()
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.toList()));
    }

    public static List<String> eight(List<String> strings) {
        return strings.stream()
                .filter(Objects::nonNull)
                .flatMap(sentence -> Arrays.stream(sentence.split("[\\s\\p{Punct}]+")))
                .map(String::trim)
                .filter(word -> !word.isEmpty())
                .map(String::toLowerCase)
                .distinct()
                .collect(Collectors.groupingBy(String::length))
                .entrySet().stream()
                .max(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue)
                .orElse(new ArrayList<>());
    }

}
