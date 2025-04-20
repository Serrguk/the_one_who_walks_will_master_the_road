package com.walking.lesson7_MethodsOverloadingAndRecursion.task_7_1_MethodsVarArgs;

public class Main {
    public static void main(String[] args) {
        StringConcatenation stringConcatenation = new StringConcatenation();

        String name = "Ivan";
        String surname = "Ivanov";
        String patronymic = "Ivanovich";

        System.out.println(stringConcatenation.toMerge(surname, name, patronymic));
    }
}
