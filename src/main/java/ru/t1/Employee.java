package ru.t1;

public class Employee {
    String name;
    Integer age;
    String position;

    public Employee(String name, Integer age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return name + "(" + age + ", " + position + ")";
    }
}
